package com.academy.service;

import com.academy.comparator.CompareFresh;
import com.academy.flower.Flower;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {
    public static void sortFresh(List<Flower> flowers) {
        Comparator comparator = new CompareFresh();
        Collections.sort(flowers, comparator);
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }

    public static void findFlowerByLength(int a, List<Flower> flowers) {
        if (a <= 0) {
            System.out.println("Please input value more then 0");
            return;
        }
        int count = 0;
        for (Flower flower : flowers) {
            if (flower.getLength() == a) {
                System.out.println(flower);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("We can not find flower length " + a);
        }
    }

    public static void findFlowerByLength(int a, int b, List<Flower> flowers) {
        if (a > b) {
            System.out.println("First value should less then second");
            return;
        }
        if (a <= 0) {
            System.out.println("Please input value more then 0");
            return;
        }
        int count = 0;
        for (Flower flower : flowers) {
            if (a <= flower.getLength() && flower.getLength() <= b) {
                System.out.println(flower);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("We can not find flowers diapason " + a + " to " + b);
        }
    }

    public static int getPrice(List<Flower> flowers) {
        int price = 0;
        for (int i = 0; i < flowers.size(); i++) {
            price += flowers.get(i).getPrice();
        }
        return price;
    }
}
