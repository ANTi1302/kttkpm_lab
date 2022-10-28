package com.example.manager_product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manager_product.entity.Topic;
@Service
public class TopicServiceImpl implements TopicService{

	@Autowired
	private TopicService topicService;
	@Override
	public Topic saveTopic(Topic topic) {
		// TODO Auto-generated method stub
		return topicService.saveTopic(topic);
	}

	@Override
	public List<Topic> getTopicByProduct(int x) {
		// TODO Auto-generated method stub
		return topicService.getTopicByProduct(x);
	}

}
