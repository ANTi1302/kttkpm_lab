package com.example.manager_product.service;

import java.util.List;

import com.example.manager_product.entity.Product;
import com.example.manager_product.entity.Topic;

public interface TopicService {
	public Topic saveTopic(Topic topic);
	 public List<Topic> getTopicByProduct(int x);
}
