package Dao;

import Coursedemo.Java;
import Father.Course;
import Model.Grade;
import Model.Student;
import Model.Teacher;

import java.util.*;

public class Daodemo {
    Student student=new Student();
    List<Student> list1=student.getstudent();
    //List<Course> courseList=Course.getList3();
    Course course=new Course();
    List<Course> list2=course.getList();
    Grade grade=new Grade();
    //List<Map<String,Double>> map=new ArrayList<>();
    public Daodemo() {
    }

    public void getoneCourse(String couname)
    {
        if(list1.size()==0)
        {
            System.out.println("暂时没有学生！！");
            return;
        }
        double x = 0;
                for (int i=0;i<list1.size();i++)
                {
                    List<Map<String,Double>> map=list1.get(i).getMap();
                            //System.out.println(list1.get(i).getName()+" "+list2.get(j).getGrade().getGrade());
                            //x+=list2.get(j).getGrade().getGrade();
                            for (Map<String, Double> s:map)
                            {
                                for (String key:s.keySet())
                                {
                                    if(key.equals(couname))
                                    {
                                        System.out.println(list1.get(i).getName()+" "+key+"  成绩为："+s.get(key));
                                        x+=s.get(key);
                                    }
                                }
                            }
                    }
        System.out.println("平均成绩为："+x/list1.size());
        }
    public void GetCourse(String name)
    {
        if(list1.size()==0)
        {
            System.out.println("暂时没有学生！！");
            return;
        }
        int x=0,y=0;
        List<Student> List1 = new ArrayList<>();
        for (Course c:list2)
        {
            if(c.getCourseName().equals(name))
            {
                for (Student s:list1)
                {
                    for (Course course : s.getList()) {
                        if(course.getCourseName().equals(name))
                        {
                            x++;
                            List1.add(s);
                        }
                    }
                }
                String teachername = null;
                for (Course cc:list2)
                {
                    if(cc.getCourseName().equals(name))
                    {
                        Teacher teacher = cc.getTeacher();
                        teachername=teacher.getName();
                        y++;
                    }
                }
                System.out.println("学生人数："+x+"  教师姓名："+teachername);
                System.out.println("学生姓名如下：");
                for (Student s:List1)
                {
                    System.out.println(s.getName());
                }
                System.out.println();
            }
        }
        if(list1.size()<4)
        {
            System.out.println("当前课程暂未开通");
            for(Student i:list1)
            {
                for (Course ii:i.getList())
                {
                    ii.setGrade(ii.getGrade());//分数默认没有
                    //ii.getGrade().setGrade(0);
                }
            }
            return;
        }
        else{
            System.out.println("该课程已开通，可查看成绩！");
        }

    }
     public void addStudent(String name, String id, int age, List<Course> list, List<Map<String,Double>> map)
    {
        Student student1=new Student(name,id,age,list,map);
        list1.add(student1);
        System.out.println("学生："+name+" 添加成功！！！");
    }
    public void RemoveStudent(String name)
    {
        if(list1.size()==0)
        {
            System.out.println("暂时没有学生！！");
            return;
        }
        if(list1.removeIf(s -> s.getName().equals(name)))
        {
            System.out.println("删除成功！！！");
        }
        else {
            System.out.println("该学生不存在！！");
        }

    }
    public void Setgrade(String stuname,String couname,double sum)
    {
        if(list1.size()==0)
        {
            System.out.println("暂时没有学生！！");
            return;
        }
        for (int i=0;i<list1.size();i++)
        {
            if(list1.get(i).getName().equals(stuname))
            {
                List<Map<String,Double>> map=list1.get(i).getMap();
                for(int j=0;j<list2.size();j++)
                {
                    if(list2.get(j).getCourseName().equals(couname))
                    {
                        //list2.get(j).setGrade(list2.get(j).getGrade());
//                            Map<String,Double> map1=new HashMap<>();
//                            map1.put(couname,sum);
//                            map.add(map1);
                        for (Map<String, Double> s : map) {
                            for (String ss:s.keySet())
                            {
                                if(ss.equals(couname))
                                {
                                    s.put(couname,sum);
                                    System.out.println("修改成功！！!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void   Getlist(String name)
    {
        if(list1.size()==0)
        {
            System.out.println("暂时没有学生！！");
            return;
        }
            //List<Course> List1 = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).getName().equals(name)) {
                    System.out.println("成绩如下：");
                    List<Map<String, Double>> maps = list1.get(i).getMap();
                    for (Map<String, Double> s : maps) {
                        for (String key : s.keySet()) {
                            System.out.println(key + "  成绩为：" + s.get(key));
                        }
                    }
                }
            }
                //System.out.println(list2.get(j).getCourseName()+":"+list2.get(j).getGrade().getGrade());
//                    for (String key:map.keySet())
//                    {
//                        System.out.println(key+"  成绩为："+map.get(key));
//                    }
        }
    public void SelectCourse(String course) {
        if (list1.size() == 0) {
            System.out.println("暂时没有学生！！");
            return;
        }
        int exe = 0;//优
        int fine = 0;//良
        int fied = 0;//中
        int dis = 0;//及
        int dispos = 0;//未
        for (int i = 0; i < list1.size(); i++) {
            List<Map<String, Double>> map = list1.get(i).getMap();
            for (int j = 0; j < list2.size(); j++) {
                if (list2.get(i).getCourseName().equals(course)) {
                    for (Map<String, Double> s : map) {
                        for (String key : s.keySet()) {
                            if (s.get(key) >= 90 && s.get(key) <= 100) {
                                exe++;
                            } else if (s.get(key) >= 80 && s.get(key) < 89) {
                                fine++;
                            } else if (s.get(key) >= 70 && s.get(key) < 79) {
                                fied++;
                            } else if (s.get(key) >= 60 && s.get(key) < 69) {
                                dis++;
                            } else if (s.get(key) >= 0 && s.get(key) < 59) {
                                dispos++;
                            }

                        }
                    }
                }
            }
        }
            System.out.println("优秀：" + (exe / list1.size()) * 10 + "%");
            System.out.println("良好：" + (fine / list1.size()) * 10 + "%");
            System.out.println("中等：" + (fied / list1.size()) * 10 + "%");
            System.out.println("及格：" + (dis / list1.size()) * 10 + "%");
            System.out.println("未及格：" + (dispos / list1.size()) * 10 + "%");
    }
    public void SelectPai(String corname) {
        if(list1.size()==0)
        {
            System.out.println("暂时没有学生！！");
            return;
        }
        Double[] arr={};
        for (int i = 0; i < list1.size(); i++) {
            List<Map<String, Double>> map = list1.get(i).getMap();
            for (int j = 0; j < list2.size(); j++) {
                if (list2.get(j).getCourseName().equals(corname)) {
                    for (Map<String, Double> s:map) {
                        for (String key : s.keySet()) {
                            if(key.equals(corname))
                            {
                                arr= new Double[]{s.get(key)};
                            }
                        }
                    }
                }
                double a=0;
                for(int k=0;k< arr.length;k++){
                    for(int g=k+1;g<arr.length;g++)
                    {
                        if(arr[k]<arr[g])
                        {
                            a=arr[k];
                            arr[k]=arr[g];
                            arr[g]=a;
                        }
                    }
                }
                for(int x=0;x< arr.length;x++) {
                    int xx=1;
                    System.out.println(list1.get(i).getName()+" 是第"+ xx +"名--分数："+arr[x]+"分");
                    xx++;
                }
            }
        }

    }
}

