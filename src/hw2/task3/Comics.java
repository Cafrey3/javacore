package hw2.task3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Comics extends Book {
    private int imageCounts;

    public Comics(int age, int pages, int words, int imageCounts) {
        super(age, pages, words);
        this.imageCounts = imageCounts;
    }
}
