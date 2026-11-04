package interfaces1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Joshua Bloch", 416));
        books.add(new Book("Clean Code", "Robert Martin", 464));
        books.add(new Book("Refactoring", "Martin Fowler", 448));
        books.add(new Book("Head First Java", "Kathy Sierra", 688));

        // Ordem natural: usa o compareTo de Book (título)
        Collections.sort(books);
        System.out.println("Por título:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Outra ordem, sem mexer na classe Book: Comparator passado de fora
        books.sort(Comparator.comparingInt(Book::getPages));
        System.out.println("\nPor páginas:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Injeção de dependência: mesma BookStore, políticas diferentes
        BookStore studentStore = new BookStore(new StudentDiscount());
        BookStore regularStore = new BookStore(new NoDiscount());

        System.out.println("\nCom desconto de estudante: " + studentStore.finalPrice(100.0));
        System.out.println("Sem desconto: " + regularStore.finalPrice(100.0));
    }
}