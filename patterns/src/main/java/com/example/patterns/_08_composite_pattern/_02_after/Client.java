package com.example.patterns._08_composite_pattern._02_after;

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

    //클라이언트는 가장 상위를 바라봄 -> 구체적인 방법을 알 필요가 없다
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
