package com.github.sjucker.pitestintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.sjucker.pitestintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
