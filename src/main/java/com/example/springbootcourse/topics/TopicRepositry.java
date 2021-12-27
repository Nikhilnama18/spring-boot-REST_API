package com.example.springbootcourse.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepositry extends CrudRepository<Topic, String> {

    // getALLTopics()

    // getTopic(String id)

    // updateTopic(Topic t)

    // deleteTopic(String id)
}
