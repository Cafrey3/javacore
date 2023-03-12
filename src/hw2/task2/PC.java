package hw2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PC {
    private int ram;
    private int price;
    private Manufacturer manufacturer;
}
