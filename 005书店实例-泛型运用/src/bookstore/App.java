package bookstore;

import java.util.ArrayList;

import account.Admin;
import account.SuperAdmin;
import account.User;
import data.Book;

public class App {
    private ArrayList<Book> storedBooks;
    private ArrayList<User> users;
    private ArrayList<Admin> admins;
    private SuperAdmin superAdmin;

    public static void main(String args[]) {
        // Book book1 = new Book(("2","3",4);
        // book1.Book("2","3",4);
        ArrayList<Book> storedBooks = new ArrayList<>();
        storedBooks.add(new Book("原神好玩吗","七画",55));
        storedBooks.add(new Book("万象物语好玩吗","七画",75));
        storedBooks.add(new Book("阿卡伊好玩吗","七画",65));

        System.out.println(storedBooks);
    }
}
