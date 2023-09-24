package transform.inline

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import transform.base.BaseTransform

class RFileMinifyTransform extends BaseTransform {

    @Override
    ClassVisitor getClassVisitor(ClassWriter classWriter) {
        return new RFileMinifyClassVisitor(classWriter)
    }

    @Override
    boolean isNeedTraceClass(File file) {
//        def name = file.name
//        if(!name.endsWith(".class")){
//            return false
//        }
//        if (name.startsWith("R.class")
//                || name.startsWith('R$')) {
//            return true
//        }
        return true
    }

    @Override
    String getName() {
        return "RFileMinifyTransform"
    }
}