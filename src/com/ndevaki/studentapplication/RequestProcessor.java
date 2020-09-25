package com.ndevaki.studentapplication;

import java.util.Iterator;
import java.util.PriorityQueue;

public class RequestProcessor {
    private static PriorityQueue<Request> requests=new PriorityQueue<>(new RequestPreferenceComparator());

    public static void addRequest(Request request){
        requests.add(request);
    }

    public static void processRequests(){
        Iterator iterator=requests.iterator();
        while(iterator.hasNext()){
            Request request= (Request) iterator.next();
            if(request.department.hasOpenSlots()){
                request.department.addStudent(request.student);
            }
        }
    }
}
