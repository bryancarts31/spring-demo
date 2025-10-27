package org.example.demo.controller;

import org.example.demo.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return List.of(
                new Topic(1,"Spring Framework","Spring Framework Description"),
                new Topic(2,"Core Java", "Core Java Description"),
                new Topic(3,"Javascript","JavaScript Description")
        );
    }
}
