package hw2.task2;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Laptop extends PC {
    private double display;

    public Laptop(double display, int ram, int price, Manufacturer manufacturer) {
        super(ram, price, manufacturer);
        this.display = display;
    }
}
