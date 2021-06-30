package account;

import java.util.ArrayList;

import data.Book;
import data.UserRole;

public class User extends Account{
    private static int userNum = 0;
    private UserRole role;
    private ArrayList<Book> books;
    private int id;

    public User(String account, String password, String name, int pay) {
        super(account, password, name);
        userNum += 1;
        id = userNum;
        role = new UserRole(pay);
    }

    public void buy(int id) {

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "role: " + role + ";book list: " + books;
    }
}
