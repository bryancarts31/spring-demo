package org.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    @Id
    private int topicID;
    private String topicName;
    private String topicDescription;

    public Topic(){}
    public Topic(int id, String name, String description){
        super();
        this.topicID = id;
        this.topicName = name;
        this.topicDescription = description;
    }
    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
}
