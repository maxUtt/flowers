package com.academy.flower;

import com.academy.freshness.Fresh;

import java.util.Objects;

public class Flower {
    private String name;
    private int price;
    private Fresh fresh;
    private int length;

    public Flower(String name, int price, Fresh fresh, int length) {
        this.name = name;
        this.price = price;
        this.fresh = fresh;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fresh getFresh() {
        return fresh;
    }

    public void setFresh(Fresh fresh) {
        this.fresh = fresh;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return price == flower.price &&
                length == flower.length &&
                Objects.equals(name, flower.name) &&
                fresh == flower.fresh;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, fresh, length);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", fresh=" + fresh +
                ", length=" + length +
                '}';
    }
}
