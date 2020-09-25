package com.ndevaki.studentapplication;

public class Department {
    public enum DepartmentName{
        CSE("CSE"),
        ECE("ECE"),
        MECH("MECH");
        String name;
        DepartmentName(String name){
            this.name=name;
        }
    }
    private DepartmentName name;
    private int totalSlots,openSlots;
    private Student[] students;

    public Department(String name, int totalSlots) {
        this.name = DepartmentName.valueOf(name);
        this.totalSlots = totalSlots;
        this.students = new Student[totalSlots];
        openSlots=totalSlots;
    }

    public boolean hasOpenSlots(){
        return openSlots>0;
    }

    public void addStudent(Student student){
        if(hasOpenSlots()&& !student.hasReserved()){
            students[totalSlots-openSlots]=student;
            openSlots--;
            student.reserveSeat();
            announceReservation(student);
        }
    }

    public void announceReservation(Student student){
        System.out.println(student.name+" - "+ student.score+" acquired seat in "+this.name);
    }
}
