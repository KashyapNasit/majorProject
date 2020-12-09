package com.kashyap.majorProject.logic;

import com.kashyap.majorProject.DAO.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class Service {
    private SQLEngine sqlEngine;

    @Autowired
    Service(SQLEngine sqlEngine){
        this.sqlEngine = sqlEngine;
    }

    public Student getStudent(String regno){
        return sqlEngine.getStudentWithRegno(regno);
    }
}
