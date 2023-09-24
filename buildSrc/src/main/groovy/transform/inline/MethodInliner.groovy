package transform.inline

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class MethodInliner extends MethodVisitor {

    private final Map<String, Integer> resourceIds

    MethodInliner(MethodVisitor methodVisitor, Map<String, Integer> resourceIds) {
        super(Opcodes.ASM7, methodVisitor)
        this.resourceIds = resourceIds
    }

    @Override
    void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
        if (opcode == Opcodes.GETSTATIC) {
            // 检查是否引用了R资源
            if (owner.contains("/R\$")) {
                // 获取资源ID
                Integer resourceId = resourceIds.get(name)
                if (resourceId != null) {
                    // 将资源ID直接写入字节码
                    mv.visitLdcInsn(resourceId)
                    return
                }
            }
        }

        super.visitFieldInsn(opcode, owner, name, descriptor)
    }
}