package transform.inline

import com.android.build.api.transform.Transform
import org.gradle.api.Project
import transform.base.BaseTransformPlugin

class RFileMinifyTransformPlugin extends BaseTransformPlugin {

    @Override
    Transform getCustomTransform(Project project) {
        return new RFileMinifyTransform()
    }
}
