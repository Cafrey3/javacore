package hw1;

import java.util.ArrayList;

public class Book {
    private String title;

    private int pages;

    private ArrayList<String> authors;

    private String genre;

    public Book() {
    }

    public Book(String title, int pages, ArrayList<String> authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", authors=" + authors +
                ", genre='" + genre + '\'' +
                '}';
    }
}
