package org.example.demo.service;

import org.example.demo.model.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = List.of(
            new Topic(1,"Spring Framework","Spring Framework Description"),
            new Topic(2,"Core Java", "Core Java Description"),
            new Topic(3,"Javascript","JavaScript Description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(int id){
       return topics.stream().filter(t -> t.getTopicID() == id)
               .findFirst()
               .orElse(null);
    }
}
