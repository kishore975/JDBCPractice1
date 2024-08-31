package com.example.SpringBootJdbc.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.SpringBootJdbc.model.Student;

@Repository
public class StudentRepository 
{
 private JdbcTemplate jdbctemplate;
	public JdbcTemplate getJdbctemplate() {
	return jdbctemplate;
}
@Autowired
public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}

	public void save(Student student)
	{
		String sql="insert into students(sId, sName,sMarks) values(?,?,?)";
		int rows=jdbctemplate.update(sql,student.getsId(),student.getsName(),student.getsMarks());
		System.out.println(rows+"Effected");
	}
	
	public List<Student> findAll()
	{
		String sql="select * from students";

        return jdbctemplate.query(sql, (rs, rowNum) ->{
			Student s=new Student();
			s.setsId(rs.getInt("sId"));
			s.setsName(rs.getString("sName"));
			s.setsMarks(rs.getInt("sMarks"));
			return s;
	});
		
		
//		List<Student> students=new ArrayList<>();
//		return students;
	}
}
