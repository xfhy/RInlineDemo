package transform.inline

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class RFileMinifyClassVisitor extends ClassVisitor {

    // 解析R文件
    private static Map<String, Integer> resourceIds = null

    RFileMinifyClassVisitor(ClassVisitor classVisitor) {
        super(Opcodes.ASM7, classVisitor)
    }

    @Override
    MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        if (resourceIds == null) {
            resourceIds = RFileMinifier.parseRFile()
        }
        // 查找R资源引用
        MethodVisitor methodVisitor = cv.visitMethod(access, name, descriptor, signature, exceptions)
        methodVisitor = new MethodInliner(methodVisitor, resourceIds)
        return methodVisitor
    }

}