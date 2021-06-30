package account;

import java.util.ArrayList;

import data.Book;
import data.UserRole;

public class Admin extends Account implements AdminBase {

    

    public Admin(String account, String password, String name) {
        super(account, password, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void addUser(ArrayList<User> users, User user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteUser(ArrayList<User> users, int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteUser(ArrayList<User> users, String name) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateUserRole(ArrayList<User> users, int id, UserRole role) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateUserRole(ArrayList<User> users, String name, UserRole role) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addBooks(ArrayList<Book> books, Book book) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteBooks(ArrayList<Book> books, int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteBooks(ArrayList<Book> books, String name, String author) {
        // TODO Auto-generated method stub
        
    }

}
