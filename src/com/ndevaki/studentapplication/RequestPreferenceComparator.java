package com.ndevaki.studentapplication;

import java.util.Comparator;

public class RequestPreferenceComparator implements Comparator<Request> {

    @Override
    public int compare(Request r1, Request r2) {
        if(r1.student.score>r2.student.score){
            return -1;
        }else if(r1.student.score<r2.student.score){
            return 1;
        }
        if(r1.slot>r2.slot){
            return 1;
        }else if(r1.slot<r2.slot){
            return -1;
        }
        return 0;
    }
}
