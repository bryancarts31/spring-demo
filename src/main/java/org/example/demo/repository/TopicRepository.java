package org.example.demo.repository;

import org.example.demo.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,Integer> {

}
