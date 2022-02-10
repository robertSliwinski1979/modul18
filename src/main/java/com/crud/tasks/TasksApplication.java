package com.crud.tasks;

import com.crud.tasks.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class TasksApplication {
//
//    public static void main(String[] args) {
//
////        TaskDto taskDto = new TaskDto((long)1, "Test title", "I want to be a coder");
////        Long id = taskDto.getId();
////        String title = taskDto.getTitle();
////        String content = taskDto.getContent();
////
////        System.out.println(id + " " + title + " " + content);
//        SpringApplication.run(TasksApplication.class, args);
//    }
//
//}

@SpringBootApplication
public class TasksApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(TasksApplication.class, args);

        //This doesn't work
//        @Override
//        protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
//            return application.sources(TaskApplication.class);
//        }
    }

}
