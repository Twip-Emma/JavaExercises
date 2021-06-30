package data;

public class Book {
    private static int num = 0;
    private String name;
    private int id;
    private int price;
    private String author;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
        num += 1;
        this.id = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "id: " + id + ";name: " + name + ";author: " + author + ";price: " + price;
    }
}
