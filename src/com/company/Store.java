package com.company;

public class Store {

    private int product;

    public Store() {
        this.product = product;
    }

    public synchronized void buy() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        notify();
        System.out.println("Покупатель купил 1 товар");
        System.out.println("-----------------------------");
        System.out.println("На складе имеется  товаров:  " + product);


    }


    public synchronized void make() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        product++;
        notify();
        System.out.println("Производитель произвел 1 товар");
        System.out.println("-----------------------------");
        System.out.println("На складе имеется товаров:  " + product);
    }
}

