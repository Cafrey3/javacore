package hw2.task3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Book extends Papyrus {
    private int words;

    public Book(int age, int pages, int words) {
        super(age, pages);
        this.words = words;
    }
}
