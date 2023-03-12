package hw2.task2;

public class Main {
    public static void main(String[] args) {
        PC pcInstance = new PC(16, 5000, Manufacturer.ASUS);
        System.out.println(pcInstance);

        Laptop laptopInstance = new Laptop(15.5, 6, 3000, Manufacturer.HP);
        System.out.println(laptopInstance);

        Ultrabook ultrabookInstance = new Ultrabook(17.5, 32, 10000, Manufacturer.DELL, true);
        System.out.println(ultrabookInstance);

        Workstation workstationInstance = new Workstation(20, 32, 100000, Manufacturer.LENOVO, 3);
        System.out.println(workstationInstance);
    }
}
