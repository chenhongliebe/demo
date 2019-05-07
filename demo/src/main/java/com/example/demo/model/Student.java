package com.example.demo.model;

import lombok.Data;

@Data
public class Student extends Base{

    private Long id;

    private String name;

    private Integer status;

    public String hh;

    private void tt(){
        System.out.println("test");
    }

    @Override
    public String toString() {

        return super.toString()+"Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.tt();
    }
}
