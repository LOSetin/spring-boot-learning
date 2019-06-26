package com.bootExample.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.bootExample.demo.pojo.Student;

@Mapper
public interface StudentMapper {
	
	@Select("SELECT * FROM student")
	List<Student> FindAllStudent();

}
