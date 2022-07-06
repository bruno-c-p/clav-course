package module_two.book_exercise.entities;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Book {

    DecimalFormat df = new DecimalFormat("0,000.00");
    private String title;
    private double price;
    List<Author> authors = new ArrayList<>();

    public Book() {

        this.title = JOptionPane.showInputDialog("Book title: ").toLowerCase();

        this.price = Double.parseDouble(JOptionPane.showInputDialog("Book price: "));

        while (this.price <= 0) {
            this.price = Double.parseDouble(JOptionPane.showInputDialog("Invalid book price. Book price needs to be superior to 0: "));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitle: ").append(this.getTitle());
        sb.append("\nPrice: R$").append(df.format(this.getPrice()));
        sb.append("\nAuthor(s):\n");

        for (Author author : authors) {
            sb.append(author.toString()).append("\n");
        }

        return sb.toString();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public boolean existsAuthor(Author author) {

        for (Author aut : this.authors) {
            if (author.getName().equals(aut.getName())) {
                return true;
            }
        }

        return false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
