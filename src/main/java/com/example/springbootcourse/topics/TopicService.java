package com.example.springbootcourse.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring FrameWork", "Spring FrameWork Description"),
            new Topic("Java", "Java FrameWork", "Java FrameWork Description"),
            new Topic("javaScript", "javaScript FrameWork", "javaScript FrameWork Description")));

    public List<Topic> getAlTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic newTopic) {
        topics.add(newTopic);
        return;
    }

    public Topic updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                break;
            }
        }
        return topic;
    }

    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);

            if (t.getId().equals(id)) {
                topics.remove(i);
                return;
            }
        }
    }
}
