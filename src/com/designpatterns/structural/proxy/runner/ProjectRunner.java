package com.designpatterns.structural.proxy.runner;

import com.designpatterns.structural.proxy.proxyProject.Project;
import com.designpatterns.structural.proxy.proxyProject.ProxyProject;

public class ProjectRunner {
    public static void main(String[] args){
        Project project = new ProxyProject("https://www.github.com/proselyte/realProject");

        project.run();
    }
}
