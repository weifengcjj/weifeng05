package Father;

import Coursedemo.Java;
import Coursedemo.Math1;
import Coursedemo.Windows;
import Model.Grade;
import Model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Course {
    Teacher teacher;//任课老师
    private String courseName;//课程名称
    List<Course> list=new ArrayList<>();
    //static List<Course> list2=new ArrayList<>();//课程成绩
    //static List<Student> list3=new ArrayList<>();
    private Grade grade;//成绩

    public Course(Teacher teacher, String courseName, Grade grade) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.grade = grade;
    }

    //    list2.add(new Course("高数",60.0));
//        list2.add(new Course("计算机基础",60.6));
//        list2.add(new Course("Java",59.0));
//        list2.add(new Course("MySQL",60.0));
//        list2.add(new Course("英语",79.9));

    public Course() {
        list.add(new Course(new Teacher("张三老师","Java"),"Java",new Grade()));
        list.add(new Course(new Teacher("李四老师","高数"),"高数",new Grade()));
        list.add(new Course(new Teacher("王五老师","Windows"),"Windows",new Grade()));
    }
     public List<Course> getList()
    {
        return  list;
    }
//    static public List<Course> getList2(String courseName,double grade)
//    {
//        for(Course c:list2)
//        {
//            if(c.getCourseName().equals(courseName))
//            {
//                c.setGrade(grade);
//            }
//        }
//        return list2;
//    }
//    static public List<Course> getList3()
//    {
//        return list2;
//    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", Grade=" + grade +
                '}';
    }

}
