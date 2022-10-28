package com.example.manager_product.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.manager_product.entity.Product;
import com.example.manager_product.entity.SystemMessage;
import com.example.manager_product.entity.Topic;
import com.example.manager_product.service.ProductService;
import com.example.manager_product.service.TopicService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/product")
public class RestController {

	@Autowired
	private ProductService productService;
	@Autowired
	private TopicService topicService;
	@Autowired
	private JmsTemplate jmsTemplate;

	@PutMapping("/save")
	public Product updateCustomer(@RequestBody Product theProduct) {
		productService.saveProduct(theProduct);
		return theProduct;
	}

	@GetMapping("/list-product")
	public List<Product> getCustomers() {
		return productService.getProducts();
	}

	@PutMapping("/save-topic")
	public Topic saveTopic(@RequestBody Topic theTopic) {
		topicService.saveTopic(theTopic);
		return theTopic;
	}

	@GetMapping("/list-topic-by-product={x}")
	public List<Topic> getTopicByProduct(@PathVariable int x) {
		return topicService.getTopicByProduct(x);
	}
	@PostMapping("/publishMessage")
	public ResponseEntity<String> publishMessage(@RequestBody SystemMessage systemMessage) {
		try {
			jmsTemplate.convertAndSend("bridgingcode-queue", systemMessage);

			return new ResponseEntity<>("Sent.", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	
	}
}
