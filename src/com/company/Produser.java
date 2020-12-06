package com.company;

public class Produser implements Runnable {
    private Store store;

    public Produser(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            store.make();

        }
    }
}
