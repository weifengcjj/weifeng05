package View;

import java.util.ArrayList;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students("吴焕烽",100,100,100));
        list.add(new Students("汪庆",50,60,70));
        list.add(new Students("cjj",10,200,100));
        list.add(new Students("黄岩",100,80,40));
        list.add(new Students("荣耀",20,80,100));
        list.add(new Students("刘强东",100,10,100));
        //System.out.println(list.size());
        System.out.println("输入要查询的学生的名字：");
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.next();
        for (Students s:list)
        {
            if(s.getName().equals(s1))
            {
                System.out.println("学生"+s1+"的成绩如下：");
                System.out.println(s);
                break;
            }
        }
    }
}

class Students {
    private String name;
    private int o1;
    private int o2;
    private int o3;

    public Students(String name, int o1, int o2, int o3) {
        this.name = name;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getO1() {
        return o1;
    }

    public void setO1(int o1) {
        o1 = o1;
    }

    public int getO2() {
        return o2;
    }

    public void setO2(int o2) {
        o2 = o2;
    }

    public int getO3() {
        return o3;
    }

    public void setO3(int o3) {
        o3 = o3;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", O1=" + o1 +
                ", O2=" + o2 +
                ", O3=" + o3 +
                '}'+"\n";
    }
}

