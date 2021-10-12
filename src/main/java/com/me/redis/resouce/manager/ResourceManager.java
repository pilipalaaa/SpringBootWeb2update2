package com.me.redis.resouce.manager;

public class ResourceManager {
    private int count = 0;

    private static ResourceManager instance = new ResourceManager();

    private ResourceManager(){}

    public static ResourceManager getInstance(){
        return instance;
    }

    public synchronized void addCount(int i){
        count = count + i;
    }

    public synchronized  void minusCount(int i){
        count = count -i;
    }

    public int getCount(){
        return count;
    }

    public void initCount(int i){
        count = i;
    }
}