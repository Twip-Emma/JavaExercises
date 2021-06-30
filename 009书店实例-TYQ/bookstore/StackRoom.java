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
}
