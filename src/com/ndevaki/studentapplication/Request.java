package com.ndevaki.studentapplication;

public class Request {
    int slot;
    Department department;
    Student student;
    public Request(Department department,Student student,int slot) {
        this.department=department;
        this.student=student;
        this.slot=slot;
    }
}
