package hw2.task2;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Workstation extends Laptop {
    private int monitorCounts;

    public Workstation(double display, int ram, int price, Manufacturer manufacturer, int monitorCounts) {
        super(display, ram, price, manufacturer);
        this.monitorCounts = monitorCounts;
    }
}
