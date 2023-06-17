package com.gigin.giginassignment.service;

import java.util.ArrayList;
import java.util.HashMap;

public class JobList {
    HashMap<String,Integer> hm = new HashMap<>();
    ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
    public HashMap<String,Integer> storeList(){

        hm.put("123",0);
        hm.put("124",1);
        hm.put("125",2);
        return hm;
    }

public ArrayList<ArrayList<String>> jobsinList(){

        ArrayList<String> jobs  = new ArrayList<>();
        jobs.add("Frontend engineer");
        jobs.add("backend engineer");
       list.add(new ArrayList<>(jobs));
       return list;
}
public ArrayList<String> getList(int index){
        return list.get(index);
}
}
