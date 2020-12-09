package com.kashyap.majorProject.logic;

import com.kashyap.majorProject.DAO.Student;
import com.kashyap.majorProject.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class SQLEngineImpl implements  SQLEngine{
    private Logger logger = LoggerFactory.getLogger("SQLEngineImpl");
    private final JdbcTemplate jdbcTemplate;
    private final String STUDENT_TABLE = "stu_per_rec";

    @Autowired
    public SQLEngineImpl(DataSource dataSource) {
        logger.debug(dataSource.toString());
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Student getStudentWithRegno(String regno){
        String query = "SELECT * FROM "+ STUDENT_TABLE +" WHERE regno like "+regno;
        return jdbcTemplate.queryForObject(query, new StudentMapper());
    }
}
