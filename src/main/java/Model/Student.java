package Model;

import Father.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    static Course course=new Course();
    private String name;
    private String id;
    private int age;
    List<Course> courses=new ArrayList<>();
    List<Course> list=course.getList();
    List<Student> studentList=new ArrayList<>();
    List<Map<String,Double>> map=new ArrayList<>();

    //List<Grade> gradeList=new ArrayList<>();

    public Student() {
//        Map<String,Double> map1=new HashMap<>();
//        for (Course c:list)
//        {
//            map1.put(c.getCourseName(),c.getGrade().getGrade());
//        }
//        map.add(map1);
        //studentList.add(new Student("微风","19",20,list,map));
    }
    public Student(String name, String id, int age,List<Course> list,List<Map<String,Double>> map) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.map=map;
//            Map<String,Double> map1=new HashMap<>();
//                for (Map<String,Double> s:map)
//                {
//                    for(String ss:s.keySet())
//                    {
//                        map1.put(ss,s.get(ss));
//                    }
//                }
//            this.map.add(map1);
//            List<Course> list2=new ArrayList<>();
//            list2=list1;
//            for (Map<String,Double> s:this.map)
//            {
//                for (Map<String,Double> ss:map)
//                {
//                    for (String key:ss.keySet())
//                    {
//                        s.put(key,ss.get(key));
//                    }
//                }
//        }
    }

    public  List<Map<String,Double>> getMap() {
        return map;
    }

    public void setMap(List<Map<String,Double>> map) {
        this.map = map;
    }

    public List<Student> getstudent()
    {
        return studentList;
    }
    public List<Course> getList()
    {
        return list;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public static Course getCourse() {
        return course;
    }

    public static void setCourse(Course course) {
        Student.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public List<Course> getList2()
//    {
//        return list2;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
