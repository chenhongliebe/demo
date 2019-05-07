package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Locker extends ReentrantLock implements Cloneable {

    private static final Map<String,Locker> lock_map = new HashMap<>();

    private final String key;

    public Locker(String key) {
        this.key = key;
    }

    public static Locker getLocker(final String key){
        synchronized (key.intern()){
            return lock_map.putIfAbsent(key,new Locker(key));
        }
    }
}
