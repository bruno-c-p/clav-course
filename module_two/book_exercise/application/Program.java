package module_two.book_exercise.application;

import module_two.book_exercise.entities.Author;
import module_two.book_exercise.entities.Book;
import module_two.dvd_exercise.entities.DVD;
import module_two.simplebank_exercise.entities.Account;
import module_two.simplebank_exercise.entities.Agency;
import module_two.simplebank_exercise.entities.Client;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Author> authors = new ArrayList<>();
        List<Book> books = new ArrayList<>();

        int op = -1;

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (op) {

                case 1:
                    Author author = new Author();
                    authors.add(author);
                    break;
                case 2:
                    registerBook(books, authors);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, bookList(books));
                    break;
                case 4:
                    ListBooksFromAnAuthor(books, authors);
                    break;
                case 5:
                    listBooksByPriceRange(books);
                    break;
                case 6:
                    ListBooksFromFemaleAuthors(books, authors);
                    break;
                case 7:
                    ListBooksFromUnderFifteenAuthors(books, authors);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "You left!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Choose a valid option!");
                    break;
            }

        } while (op != 8);
    }

    public static String menu() {

        StringBuilder menu = new StringBuilder();
        menu.append("Menu:\n\n");
        menu.append("1 - Register Author\n");
        menu.append("2 - Register Book\n");
        menu.append("3 - List of Books\n");
        menu.append("4 - Search by author\n");
        menu.append("5 - Search book in a price range\n");
        menu.append("6 - Show books from female authors\n");
        menu.append("7 - Show books by authors under the age of 15\n\n");
        menu.append("8 - Exit");

        return menu.toString();
    }

    private static void registerBook(List<Book> books, List<Author> authors) {

        Book book = new Book();

        char answer = 'x';

        do {

            int author = Integer.parseInt(JOptionPane.showInputDialog("Choose an author:\n" + authorsList(authors)));

            if (!book.existsAuthor(authors.get(author - 1))) {
                book.addAuthor(authors.get(author - 1));
            }

            answer = JOptionPane.showInputDialog("There's more authors (Y/N): ").toLowerCase().charAt(0);

        } while (answer != 'n');

        books.add(book);
    }

    public static String bookList(List<Book> books) {

        StringBuilder list = new StringBuilder();

        for (Book book : books) {
            list.append((books.indexOf(book) + 1) + " " + book.toString()).append("\n_________________________\n");
        }

        return list.toString();
    }

    public static String authorsList(List<Author> authors) {

        StringBuilder list = new StringBuilder();

        for (Author author : authors) {
            list.append(authors.indexOf(author) + 1).append(" ").append(author.toString()).append("\n_________________________\n");
        }

        return list.toString();
    }

    public static void ListBooksFromAnAuthor(List<Book> books, List<Author> authors) {

        StringBuilder bookList = new StringBuilder();

        int author = Integer.parseInt(JOptionPane.showInputDialog("Choose an author:\n" + authorsList(authors)));

        for (Book book : books) {
            for (Author aut : book.getAuthors()) {
                if (aut.getName().equals(authors.get(author-1).getName())) {
                    bookList.append(book.toString());
                }
            }
        }

        JOptionPane.showMessageDialog(null, bookList);
    }

    public static void listBooksByPriceRange(List<Book> books) {

        StringBuilder bookList = new StringBuilder();

        double minPrice = Double.parseDouble(JOptionPane.showInputDialog("Min price: "));
        double maxPrice = Double.parseDouble(JOptionPane.showInputDialog("Max price: "));

        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                bookList.append(book.toString());
            }
        }

        JOptionPane.showMessageDialog(null, bookList);
    }

    public static void ListBooksFromFemaleAuthors(List<Book> books, List<Author> authors) {

        StringBuilder bookList = new StringBuilder();

        for (Book book : books) {
            for (Author aut : book.getAuthors()) {
                if (aut.getSex() == 'F') {
                    bookList.append(book.toString());
                }
            }
        }

        JOptionPane.showMessageDialog(null, bookList);
    }

    public static void ListBooksFromUnderFifteenAuthors(List<Book> books, List<Author> authors) {

        StringBuilder bookList = new StringBuilder();

        for (Book book : books) {
            for (Author aut : book.getAuthors()) {
                if (aut.getAge() < 15) {
                    bookList.append(book.toString());
                }
            }
        }

        JOptionPane.showMessageDialog(null, bookList);
    }
}
