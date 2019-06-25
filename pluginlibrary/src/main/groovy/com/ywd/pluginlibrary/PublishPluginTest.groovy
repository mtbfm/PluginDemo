package com.ywd.pluginlibrary

import org.gradle.api.Plugin
import org.gradle.api.Project

class PublishPluginTest implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def extension = project.extensions.create("publishPluginExtension", PublishPluginExtension)
        project.task("publishPluginTest"){
            doLast {
                println("新内容是：${extension.msg}")
            }
        }
    }
}