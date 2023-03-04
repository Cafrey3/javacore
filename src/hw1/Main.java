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

        Post postInstance = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        System.out.println(postInstance);

        Comment commentInstance = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
        System.out.println(commentInstance);
    }
}
