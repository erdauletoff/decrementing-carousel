package com.epam.rd.autotasks;

import java.util.ArrayList;

public class CarouselRun {
    ArrayList<Integer> container;
    boolean isEmpty;

    public CarouselRun(ArrayList<Integer> container) {
        this.container = container;
        isEmpty = container.isEmpty() || container.size() == 1 && container.get(0) == 0;
    }

    public int next() {
        if (!isEmpty) {
            int currentValue = container.get(0);
            if (currentValue == 0) {
                container.remove(0);
                currentValue = container.get(0);
            }
            container.set(0, currentValue - 1);
            if (container.size() != 1) {
                shift();
            }
            isEmpty = container.isEmpty() || container.size() == 1 && container.get(0) == 0;
            return currentValue;
        }
        return -1;
    }

    private void shift() {
        int temp = container.get(0);
        container.remove(0);
        container.add(temp);
    }

    public boolean isFinished() {
        return isEmpty;
    }

}
