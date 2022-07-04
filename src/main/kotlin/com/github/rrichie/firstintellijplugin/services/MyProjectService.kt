package com.github.rrichie.firstintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.rrichie.firstintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
