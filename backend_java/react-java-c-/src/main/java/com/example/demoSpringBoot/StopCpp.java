package com.example.demoSpringBoot;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StopCpp {
	@Autowired
	private Process cppAPI; 
    @PreDestroy
    public void destroy() {
        cppAPI.destroy();
        System.out.println("Closed manage_music.cpp");
    }
}
