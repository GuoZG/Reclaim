package com.example.controller;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.TestTable;
import com.example.sercice.TestTableService;
import groovy.util.logging.Slf4j;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestTableController {
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private TestTableService service;
	
	@RequestMapping("/")
	public List<TestTable> qu() {
		return service.query();
	}
	
	
	/*@RequestMapping("/thread")
	public Map<String, String> threadTest() {
		long startTime=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			if(i%2==0) {
				service.testAsync(i);
			}else{
				service.testAsync2(i);
			}
		}
		long endTime=System.currentTimeMillis();
		System.out.println("用时"+(endTime-startTime)+"ms");
		return null;
	}*/
	
	@RequestMapping("/thread")
	public Map<String, String> threadTest() {
		long startTime=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			service.testAsync(i);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("用时"+(endTime-startTime)+"ms");
		return null;
	}
}
