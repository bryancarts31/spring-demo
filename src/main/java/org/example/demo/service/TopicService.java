package org.example.demo.service;

import org.example.demo.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(List.of(
            new Topic(1,"Spring Framework","Spring Framework Description"),
            new Topic(2,"Core Java", "Core Java Description"),
            new Topic(3,"Javascript","JavaScript Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(int id){
       return topics.stream().filter(t -> t.getTopicID() == id)
               .findFirst()
               .orElse(null);
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(Topic topic, int id) {
        for(int i =0; i <topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getTopicID() == id){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(int id) {
        topics.removeIf(t -> t.getTopicID() == id);
    }
}
