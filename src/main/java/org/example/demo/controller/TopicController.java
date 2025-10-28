package org.example.demo.controller;

import org.example.demo.model.Topic;
import org.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
  private final TopicService topicService;

  @Autowired
  public TopicController(TopicService topicService){
      this.topicService = topicService;
  }

  @GetMapping("/topics")
  public List<Topic> getAllTopics(){
      return topicService.getAllTopics();
  }

  @GetMapping("/topics/{id}")
  public Topic getTopic(@PathVariable int id){
      return topicService.getTopic(id);
  }

  @PostMapping("/topics")
  public void addTopic(@RequestBody Topic topic){
      topicService.addTopic(topic);
  }

  @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable int id){
      topicService.updateTopic(topic,id);
  }

  @DeleteMapping("/topics/{id}")
    public void deleteTopic( @PathVariable int id){
      topicService.deleteTopic(id);
  }

}
