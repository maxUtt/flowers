package com.academy.comparator;

import com.academy.flower.Flower;
import com.academy.freshness.Fresh;

import java.util.Comparator;

public class CompareFresh implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        return Integer.compare(o2.getFresh().ordinal(), o1.getFresh().ordinal());
    }
}
