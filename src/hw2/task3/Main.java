package hw2.task3;public class Main {
    public static void main(String[] args) {

        Papyrus papyrusInstance = new Papyrus(2000,10);
        System.out.println(papyrusInstance);

        Book bookInstance = new Book(300,2500,3000);
        System.out.println(bookInstance);

        Magazine magazineInstance = new Magazine(30,32,300,1993);
        System.out.println(magazineInstance);

        Comics comicsInstance = new Comics(23,50,300,43);
        System.out.println(comicsInstance);

    }
}
