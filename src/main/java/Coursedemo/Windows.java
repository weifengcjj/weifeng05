package Coursedemo;

import Father.Course;
import Model.Grade;
import Model.Student;
import Model.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 微风
 * @Version 1.0.0
 * @StartTime Start
 * @EndTime End
 */
public class Windows{
    private String name="Windows";
    public List<Student> list=new ArrayList<>();
    public Windows() {
    }
    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

