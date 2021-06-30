package account;

import java.util.ArrayList;

import data.Book;
import data.UserRole;

public interface AdminBase {

    // 添加用户
    public void addUser(ArrayList<User> users, User user);

    // 根据ID删除用户
    public void deleteUser(ArrayList<User> users, int id);

    // 根据名字删除用户
    public void deleteUser(ArrayList<User> users, String name);

    // 根据ID更新用户权限
    public void updateUserRole(ArrayList<User> users, int id, UserRole role);

    // 根据名字更新用户权限
    public void updateUserRole(ArrayList<User> users, String name, UserRole role);

    // 增加书店的书
    public void addBooks(ArrayList<Book> books, Book book);

    // 根据ID删除书店的书
    public void deleteBooks(ArrayList<Book> books, int id);

    // 根据书名和作者删除书店的书
    public void deleteBooks(ArrayList<Book> books, String name, String author);
}
