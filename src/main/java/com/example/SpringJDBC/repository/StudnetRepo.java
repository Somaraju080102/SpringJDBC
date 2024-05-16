package com.example.SpringJDBC.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.SpringJDBC.model.Student;

@Repository
public class StudnetRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
    
    public void save(Student sc) {
        

        String query="insert into student (id,name,marks) values(?,?,?)";
        int rows=jdbc.update(query,sc.getId(),sc.getName(),sc.getMarks());

        System.out.println("No of rows update: " + rows);
    }

    public List<Student> findAll() {
        
        String query="select * from student";
        
        RowMapper<Student> rowMapper = new RowMapper<Student>(){
            @Override
            public Student mapRow(@SuppressWarnings("null") java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
                Student sc = new Student();
                sc.setId(rs.getInt("id"));
                sc.setName(rs.getString("name"));
                sc.setMarks(rs.getInt("marks"));
                return sc;
            }
        };
        return jdbc.query(query, rowMapper);

    }

   


}
