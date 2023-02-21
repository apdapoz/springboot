package io.springgaming.SpringTestData.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Spring creates a new instance of services and registers them on startup
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    //hard coded list before I used JPA/Derby
//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring", "Spring Framework", "Spring Framework Description"),
//                new Topic("java", "Core Java", "Core Java Description"),
//                new Topic("javascript", "Javascript", "Javascript Description")
//        ));

    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }


    public Topic getTopic(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }


    public void updateTopic(String id, Topic topic) {
//iterate through topics list and update the matching topic
//        for (int i = 0; i < topics.size(); i++){
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        //We dont need to iterate through the list when using JPA/database
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
