package com.ndevaki.studentapplication;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    Department[] preference=new Department[3];
    int score;
    boolean reserved=false;
    public Student(String name, int score,Department[] preference) {
        this.name = name;
        this.preference = preference;
        this.score = score;
    }

    public void reserveSeat(){
        this.reserved=true;
    }

    public boolean hasReserved(){
        return reserved;
    }
}
