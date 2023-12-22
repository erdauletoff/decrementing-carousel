package com.epam.rd.autotasks;

import java.util.ArrayList;

public class DecrementingCarousel {
    public ArrayList<Integer> container;
    boolean isFull;
    boolean isRun;
    int capacity;
    public DecrementingCarousel(int capacity) {
        container = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public boolean addElement(int element){
        if (isFull || isRun || element <= 0) {
          return false;
        } else {
            container.add(element);
            isFull = container.size() == capacity;
            return true;
        }
    }

    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun(container);
        }
        return null;
    }
}
