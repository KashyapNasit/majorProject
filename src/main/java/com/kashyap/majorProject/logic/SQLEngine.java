package com.kashyap.majorProject.logic;

import com.kashyap.majorProject.DAO.Student;

public interface SQLEngine {
    public Student getStudentWithRegno(String regno);
}
