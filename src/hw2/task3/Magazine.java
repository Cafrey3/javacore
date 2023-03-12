package hw2.task3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Magazine extends Book {
    private int year;

    public Magazine(int age, int pages, int words, int year1) {
        super(age, pages, words);
        this.year = year1;
    }
}
