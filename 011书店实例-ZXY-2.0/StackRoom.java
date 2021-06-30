package bookstore;
/**
书库书籍信息类
 * @author 玖
 */
public class StackRoom {
    private int bookNumber=0;
    private String bookname=null;
    private double bookmoney=0;
    private String authorname=null;
    private String press=null;

   public StackRoom(int bookNumber,String bookname, double bookmoney, String authorname, String press) {
        this.bookNumber=bookNumber;
        this.bookname = bookname;
        this.bookmoney = bookmoney;
        this.authorname = authorname;
        this.press = press;
    }

    /*****以字符串的形式返回书籍信息*****/
    public String getBooks(){
        return("编号:"+this.bookNumber+"\n书名:"+this.bookname+"\n单价:"+this.bookmoney+"\n作者:"+this.authorname+"\n出版社:"+this.press);
    }
    /***********设置书籍信息***********/
    public void setBooks(int bookNumber,String bookname, double bookmoney, String authorname, String press){
        this.bookNumber=bookNumber;
        this.bookname=bookname;
        this.bookmoney=bookmoney;
        this.authorname=authorname;
        this.press=press;
    }

    public double getBookmoney() {
        return bookmoney;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookmoney(double bookmoney) {
        this.bookmoney = bookmoney;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "书籍：{" +
                "bookNumber=" + bookNumber +
                ", bookname='" + bookname + '\'' +
                ", bookmoney=" + bookmoney +
                ", authorname='" + authorname + '\'' +
                ", press='" + press + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        return this.bookNumber==((StackRoom)obj).bookNumber;
    }

    @Override
    public int hashCode(){
        return 100+this.bookNumber;
    }
}