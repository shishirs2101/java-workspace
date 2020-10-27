package com.saar.datastructure.inteviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class HashCodeImpl {
     Map<Integer,Object> hashMap = new HashMap<>();
    Map<Student,String> objectMap = new HashMap<>();

    public  void testMapKeys(){
        hashMap.put(1,"test1 ");
        hashMap.put(3,"test1 ");
        hashMap.put(1,"test1 ");
        System.out.println("Hashmap "+hashMap.toString());

        objectMap.put(new Student(1,"shishir"),"1");
        objectMap.put(new Student(2,"shishir1"),"2");
        objectMap.put(new Student(3,"shishir2"),"3");
        objectMap.put(new Student(1,"shishir3"),"4");
        System.out.println("object Map "+objectMap.toString());
    }

    public static void main(String[] args) {
        HashCodeImpl hashCode = new HashCodeImpl();
        hashCode.testMapKeys();
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getName() == student.getName();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
