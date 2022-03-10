package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Client> clients = new LinkedList<>(List.of(new Client("Maks", "Samsung", 4),
                new Client("Jeny","Toshiba",15),
                new Client("Battery","Lenovo",8),
                new Client("Tom","Panasonic",3),
                new Client("Henks","Acer",1),
                new Client("Jani","Toshiba",7),
                new Client("Aleksei","Hp",18),
                new Client("Sasha","Sony",4)));

        LinkedList<Client> starsWithABC = new LinkedList<>();
        for (Client client : clients) {
            if(client.getName().startsWith("A") || client.getName().startsWith("B") ||
            client.getName().startsWith("C")) {
                starsWithABC.add(client);
            }
        }
        LinkedList<Client> moreThanFive = new LinkedList<>();
        for (Client client : clients) {
            if(client.getAmountOfItem() > 5) {
                moreThanFive.add(client);
            }
        }
       // test(starsWithABC);
          test(moreThanFive);

    }
    public static void test (List<Client> clients) {
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
