package hw2.task2;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Ultrabook extends Laptop{
    private boolean cdROM;

    public Ultrabook(double display, int ram, int price, Manufacturer manufacturer, boolean cdROM) {
        super(display, ram, price, manufacturer);
        this.cdROM = cdROM;
    }
}
