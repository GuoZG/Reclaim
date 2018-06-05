package com.example.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.entity.TestTable;

public interface TestTableDao{
	List<TestTable> query();
	
	int insert(@Param("name")String name);
}
