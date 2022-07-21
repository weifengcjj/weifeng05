package View;

import Dao.Daodemo;
import Father.Course;
import Model.Grade;
import Model.Student;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Daodemo daodemo =new Daodemo();
        Scanner scanner=new Scanner(System.in);
        Course course=new Course();
        List<Course> courseList=course.getList();
        //Student student=new Student();
        //List<Student> lists=student.getstudent();
        Grade grade=new Grade();

        System.out.println("=============欢迎进入学生课程管理系统!!!============");
        while (true)
        {

            System.out.println("1-查询课程详情，2-查询学生，3-查询学生成绩与平均成绩，4-课程成绩排名");
            System.out.println("5-课程学生评级比例，6-修改学生课程，7-添加学生，8-删除学生，9-退出");
            int a=scanner.nextInt();
            switch (a)
            {
                case 1:
                    String Coursename;
                    System.out.println("请输入要查询课程的名称：");
                    Coursename=scanner.next();
                    daodemo.GetCourse(Coursename);
                    break;
                case 2:
                    System.out.println("请输入你要查成绩的学生：");
                    String stuname=scanner.next();
                    daodemo.Getlist(stuname);
                    break;
                case 3:
                    System.out.println("输入你要查询的课程：");
                    String kc=scanner.next();
                    daodemo.getoneCourse(kc);
                    break;
                case 4:
                    System.out.println("输入你要查询的课程：");
                    String pai=scanner.next();
                    daodemo.SelectPai(pai);
                    break;
                case 5:
                    System.out.println("输入要查询的课程：");
                    String c=scanner.next();
                    daodemo.SelectCourse(c);
                    break;
                case 6:
                    System.out.println("输入要修改成绩的学生姓名：");
                    String s=scanner.next();
                    System.out.println("输入要修改的课程：");
                    String ss=scanner.next();
                    System.out.println("输入要修改的成绩：");
                    double sss=scanner.nextDouble();
                    daodemo.Setgrade(s,ss,sss);
                    break;
                case 7:
                    List<Course> list =new ArrayList<>();
                    System.out.println("请输入添加学生的姓名，学号，年龄：");
                    String name,id;int age;
                    name=scanner.next();
                    id=scanner.next();
                    age=scanner.nextInt();
                    int num=1;
                    for(Course i:courseList)
                    {
                        System.out.println(num+"："+i.getCourseName());
                        num++;
                    }
                    int x=3;
                    System.out.println("你要选择几个课程！！！");
                    int aa=scanner.nextInt();
                    if(aa<3)
                    {
                        System.out.println("至少选择三门课程！！！");
                        break;
                    }
                    else {
                        System.out.println("请选择"+aa+"个课程：");
                        for (int i=0;i<aa;i++)
                        {
                            int bb=scanner.nextInt();
                            list.add(courseList.get(bb-1));
                        }
                    }
                    List<Map<String, Double>> map=new ArrayList<>();
                    Map<String,Double> map1=new HashMap<>();
                    for(int i = 0; i <list.size() ; i++) {
                        System.out.println(list.get(i).getCourseName()+"成绩为:");
                        double cc= scanner.nextDouble();
                        //courseList.get(i).setGrade(grade);
                        map1.put(list.get(i).getCourseName(),cc);

//                        for (Map<String,Double> map1:map)
//                        {
//                            //map1.put(list.get(i).getCourseName(),cc);
//                            for (String s1:map1.keySet())
//                            {
//                                map1.put(list.get(i).getCourseName(),cc);
//                            }
//                        }
                    }
                    map.add(map1);
                    daodemo.addStudent(name,id,age,courseList,map);
                    break;
                case 8:
                    System.out.println("请输入要删除的学生姓名：");
                    String sname=scanner.next();
                    daodemo.RemoveStudent(sname);

                    break;
                case 9:
                    System.out.println("退出程序！！！");
                    System.exit(0);
                    break;
            }
        }

    }

}
