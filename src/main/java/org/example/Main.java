package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User("Іван Петров");
        Address address = new Address("Ірпінь", "вул. Лісовва, 10", "0101");

        user.setAddress(address);

        System.out.println("Користувач: " + user.getName());
        System.out.println("Адреса: " + user.getAddress());
    }
}