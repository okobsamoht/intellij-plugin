package com.github.okobsamoht.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.okobsamoht.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
