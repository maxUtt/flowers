package com.academy;

import com.academy.flower.Flower;
import com.academy.freshness.Fresh;
import com.academy.service.Service;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower("Aster", 70, Fresh.LOW, 50));
        flowers.add(new Flower("Lilia", 30, Fresh.HEIGHT, 40));
        flowers.add(new Flower("Aster", 20, Fresh.LOW, 50));
        flowers.add(new Flower("Rose", 40, Fresh.MEDIUM, 70));
        flowers.add(new Flower("Rose", 60, Fresh.MEDIUM, 30));

        System.out.println("Show our flower girl");
        Service.sortFresh(flowers);

        System.out.println("Find flower by length");
        Service.findFlowerByLength(30, flowers);

        System.out.println("Find flowers by diapason");
        Service.findFlowerByLength(10,50, flowers);

        System.out.println("Get price all flowers");
        System.out.println(Service.getPrice(flowers));

    }
}
