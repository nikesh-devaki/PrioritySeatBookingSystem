package com.ndevaki.studentapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Frontdesk {
    static List<Department> departments=new ArrayList<Department>();
    static List<Student> students=new ArrayList<>();
    public static void main(String[] args){
        //add departments
        addDepartments();
        //add Students with their preferences
        addStudents();
        //process requests
        processRequests();
    }

    private static void processRequests() {
        students.forEach((student -> {
          AtomicInteger index = new AtomicInteger();
          Arrays.asList(student.preference).forEach( department ->{
              Request request=new Request(department,student,index.getAndIncrement());
              RequestProcessor.addRequest(request);
           });
        }));
        RequestProcessor.processRequests();
    }

    private static void addDepartments(){
        departments.add(new Department("CSE",1));
        departments.add(new Department("ECE",3));
        departments.add(new Department("MECH",4));
    }

    private static void addStudents(){
        students.add(new Student("Anil",90, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
        students.add(new Student("Subash",100, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
        students.add(new Student("Anirudh",90, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
        students.add(new Student("Shankar",70, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
        students.add(new Student("Ram",60, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
        students.add(new Student("Sarath",50, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
        students.add(new Student("Krish",40, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
        students.add(new Student("Sunil",30, new Department[]{departments.get(0), departments.get(2),
                departments.get(1)}));
    }
}
