package com.example.oop;

import java.util.ArrayList;

public class BetuMember {
    //đây là đặc điểm của BetuMember
    public String name;
    public int age;
    public String email;
    public String phone; 
    public boolean dagia;

    public Task refinement;
    public Task review;
    public Task develop[];
    public ArrayList<Task> developTask = new ArrayList<Task>();


    //Đây là các hành động của BetuMember có thể làm
    public void nhanTask(Task task) { 
        this.developTask.add(task);
    }

    public void khongNhanTask(Task task) {
        this.developTask.remove(task);
    }










     
}

