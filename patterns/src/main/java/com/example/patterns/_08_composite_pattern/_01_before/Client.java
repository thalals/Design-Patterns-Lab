package com.example.patterns._08_composite_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    //클라이언트가 너무 많은 정보를 가지고 있음 -> OOP 위반
    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        System.out.println(bag.getItems().stream().mapToInt(Item::getPrice).sum());
    }
}
