package com.kashyap.majorProject.mapper;

import com.kashyap.majorProject.DAO.BLOOD_GROUP;
import com.kashyap.majorProject.DAO.GENDER;
import com.kashyap.majorProject.DAO.Student;
import org.springframework.jdbc.core.RowMapper;
//Enum.valueOf(TimeUnit.class, rs.getString("timeUnit"))
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student s = new Student();

        try{
            s.setRegno(resultSet.getString("regno"));
        }catch (Exception ignored){}

        try{
            s.setName(resultSet.getString("name"));
        }catch (Exception ignored){}

        try{
            s.setFather_name(resultSet.getString("father_name"));
        }catch (Exception ignored){}

        try{
            s.setPhone(resultSet.getString("phone"));
        }catch (Exception ignored){}

        try{
            s.setMobile(resultSet.getString("mobile"));
        }catch (Exception ignored){}

        try{
            s.setEmail(resultSet.getString("email"));
        }catch (Exception ignored){}

        try{
            s.setAddress(resultSet.getString("address"));
        }catch (Exception ignored){}

        try{
            s.setState(resultSet.getString("state"));
        }catch (Exception ignored){}

        try{
            s.setCategory(resultSet.getString("category"));
        }catch (Exception ignored){}

        try{
            s.setDob(Date.valueOf(resultSet.getString("dob")));
        }catch (Exception ignored){}

        try{
            s.setBlood_group(Enum.valueOf(BLOOD_GROUP.class,resultSet.getString("category")));
        }catch (Exception ignored){}

        try{
            String gender = resultSet.getString("sex");
            GENDER g;
            if(gender.compareToIgnoreCase("m")==1){
                g = GENDER.MALE;
            } else{
                g = GENDER.FEMALE;
            }
            s.setSex(g);
        }catch (Exception ignored){}

        return s;
    }
}
