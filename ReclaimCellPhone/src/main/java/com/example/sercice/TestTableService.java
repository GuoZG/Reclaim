package com.example.sercice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.example.dao.TestTableDao;
import com.example.entity.TestTable;

@Service
public class TestTableService {

	@Autowired
	private TestTableDao tableDao;
	
	public List<TestTable> query(){
		return tableDao.query();
	}
	
	public int insert(String name) {
		return tableDao.insert(name);
	}


	@Async
	public Map<String, String> testAsync(int i) {
		Map<String, String> msg=new HashMap<String, String>();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date)+"第"+i+"次"+"AAAAAAAAAAA"+insert("AA"+i));
		msg.put("code", "线程1执行完毕");
		return msg;
	}
	
	@Async
	public String testAsync2(int i) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date)+"第"+i+"次"+"BBBBBBBBBBB"+insert("BB"+i));
		return null;
	}
	
	@Async
	public String testAsync3(int i) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date)+"第"+i+"次"+"CCCCCCCCCC"+insert("CC"+i));
		return null;
	}
	
	@Async
	public String testAsync4(int i) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date)+"第"+i+"次"+"DDDDDDDDDD"+insert("DD"+i));
		return null;
	}
	
	@Async
	public String testAsync5(int i) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date)+"第"+i+"次"+"EEEEEEEEEEE"+insert("EE"+i));
		return null;
	}
}
