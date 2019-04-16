package com.demo.idcard.net.bean;

public class Page {

    private int count;
    private int current;
    private int size;
    private int total;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Page{" +
                "count=" + count +
                ", current=" + current +
                ", size=" + size +
                ", total=" + total +
                '}';
    }
}