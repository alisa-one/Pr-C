package com.company;

public class Main {

    public static void main(String[] args) {
        Store store =new Store();

        Consumer Consumer=new Consumer(store);
        Produser Produser=new Produser(store);

        Thread Pr = new Thread(Produser);
        Pr.start();
        Consumer.start();

    }
}
