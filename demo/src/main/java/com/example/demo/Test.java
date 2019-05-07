package com.example.demo;

import com.example.demo.Enum.OrderEnum;
import com.example.demo.model.Student;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

//    public volatile int inc = 0;

    public void increase() {
//        inc++;
        inc.getAndIncrement();
    }


    public AtomicInteger inc = new AtomicInteger();

    public static void main(String[] args) {
//        final Test test = new Test();
//        for(int i=0;i<10;i++){
//            new Thread(){
//                public void run() {
//                    for(int j=0;j<1000;j++)
//                        test.increase();
//                };
//            }.start();
//        }
//
//        while(Thread.activeCount()>1)  //保证前面的线程都执行完
//            Thread.yield();
//        System.out.println(test.inc);
//        Integer a=128;
//        Integer b=128;
//        if (a == b) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        Student student = new Student();
        student.setStatus(3);
        student.hh="2";
        if (student.getStatus() == OrderEnum.HAVE_DELIVER.getStatus()) {
            System.out.println(true);
        } else {
            System.out.println(false);
      }
    }

//    public static void main(String[] args) {
//        System.out.println("dev-1");
//        System.out.println("dev-2");
//        System.out.println("dev-7");
//        System.out.println("dev-8");
//        System.out.println("dev-9");
//        System.out.println("dev-10");
//        System.out.println("dev-11");
//    }

}
