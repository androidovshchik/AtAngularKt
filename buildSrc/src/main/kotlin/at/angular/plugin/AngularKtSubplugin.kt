package at.angular.plugin

import com.google.auto.service.AutoService
import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

@Suppress("SpellCheckingInspection")
@AutoService(KotlinGradleSubplugin::class)
class AngularKtSubplugin : KotlinGradleSubplugin<AbstractCompile> {

    override fun apply(
        project: Project,
        kotlinCompile: AbstractCompile,
        javaCompile: AbstractCompile?,
        variantData: Any?,
        androidProjectHandler: Any?,
        kotlinCompilation: KotlinCompilation<KotlinCommonOptions>?
    ) = emptyList<SubpluginOption>()

    override fun isApplicable(project: Project, task: AbstractCompile) =
        project.plugins.hasPlugin(AngularKtPlugin::class.java)

    override fun getCompilerPluginId() = "@AngularKt"

    override fun getPluginArtifact() = SubpluginArtifact(
        groupId = "at.angular",
        artifactId = "compiler",
        version = "0.0"
    )
}
