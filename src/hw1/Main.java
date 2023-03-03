package hw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car carInstance = new Car("BMW M3", 230, 2.5, false);
        System.out.println(carInstance);

        Dog dogInstance = new Dog("Mars", 3, "Golden retriever");
        System.out.println(dogInstance);

        ArrayList<String> authors = new ArrayList();
        authors.add("John Doe");
        authors.add("Dmitry Glukhovsky");
        authors.add("Peter Jackson");

        Book bookInstance = new Book("Metro 2033", 383, authors, "post-apocalyptic");
        System.out.println(bookInstance);
    }
}
