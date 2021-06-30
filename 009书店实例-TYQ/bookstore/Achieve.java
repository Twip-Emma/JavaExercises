

package bookstore;

import java.io.*;

import java.io.InputStreamReader;
import java.util.*;

/**
 * 实现类
 * @author 玖
 * */
public class Achieve {
    Client [] client=new Client[10000];
    StackRoom [] books=new StackRoom[1000000];
    /***********主界面**********/
    protected void Welcome ()throws Exception{
        System.out.println("-------------------------------");
        System.out.println("------------欢迎进入书店管理系统-----------");
        System.out.println("1:客户管理系统\n2:书库管理系统\n3:退出系统");
        BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
        int n =cin.read();
        switch (n){
            case '1':Welcome1();break;
            case '2':Welcome2();break;
            case '3':Quit(); break;
            default:
                System.out.println("输入数据不对，请重新输入！");
                Welcome();break;
        }
    }
    protected void Welcome1() throws Exception{
        System.out.println("-------------------------------");
        System.out.println("------------欢迎进入客户管理系统-----------");
        System.out.print("1.添加客户.\n"+"2.查询客户信息.\n"+"3.充值.\n"+"4.卖书.\n"+"5.删除客户信息.\n"+"6.退出系统");
        BufferedReader cin1=new BufferedReader(new InputStreamReader(System.in));
        Scanner cin11=new Scanner(System.in);
        switch (cin1.read()){
            case '1':
                System.out.println("请依次换行输入1.客户编号 2.客户名字 3.客户电话 4.客户余额 5. 客户等级");
                generate(cin11.nextInt(), cin11.next(),cin11.next(),cin11.nextDouble(),cin11.nextInt());  break;
            case '2':
                System.out.println("请输入客户编号:");
                inquiryCustomer(cin11.nextInt()) ; break;
            case '3':
                System.out.println("变强请充值:");
                System.out.println("请依次换行输入充值金额和客户编号");
                stronger(cin11.nextDouble(),cin11.nextInt());break;
            case '4':
                System.out.println("购买书籍");
                System.out.println("请依次换行输入充值金额,书籍编号，客户编号");
                double money = cin11.nextDouble();
                int bookNumber=cin11.nextInt();
                int number = cin11.nextInt();
                shopBook(money,bookNumber,number);
                //删除书库中书籍信息
                deleteBook(bookNumber);break;
            case '5':
                System.out.println("请输入客户编号");
                deletePerseon(cin11.nextInt());
                break;
            case '6':Quit1();break;
            default:
                System.out.println("输入数据不对，请重新输入！");
                Welcome1();break;
        }
        System.out.println("-------------------------------");
        Welcome1();
    }
    /***********查看书籍系统界面******/
    protected void Welcome2() throws Exception{
        System.out.println("-------------------------------");
        System.out.println("------------欢迎进入书库管理系统-----------");
        System.out.print("1.添加书籍.\n"+"2.查询书籍信息.\n"+"3.删除书籍信息.\n"+"4.退出系统\n");
        BufferedReader cin2=new BufferedReader(new InputStreamReader(System.in));
        Scanner cin22=new Scanner(System.in);
        switch (cin2.read()){
            case '1':
                System.out.println("请依次换行输入1.书籍编号 2.书名 3.单价 4. 作者名 5.出版社");
                addBook(cin22.nextInt(),cin22.next(), cin22.nextDouble(), cin22.next(), cin22.next());
                break;
            case '2':
                System.out.println("请输入书籍编号:");
                seekBook(cin22.nextInt());break;
            case '3':
                System.out.println("请输入书籍编号");
                deleteBook(cin22.nextInt());  break;
            case '4':Quit(); break;
            default:
                System.out.println("输入数据不对，请重新输入！");
                Welcome2();break;
        }
        System.out.println("-------------------------------");
        Welcome2();
    }


    //"1.添加客户.\n"+"2.查询客户信息.\n"+"3.充值.\n"+"4.卖书.\n"+"5.删除客户信息.\n"+"6.退出系统"
    /*********动态生成客户类实例对象******/
    protected void generate(int number,String name,String phone,double money,int  member){
        client[number]=new Client(number,name,phone,money,member);
    }
    /*********查询客户信息********/
    protected void inquiryCustomer(int number){
        System.out.println (client[number].getPeople());
    }
    /***********删除客户信息*******/
   protected void deletePerseon(int number){
        client[number]=null;
    }
    /************客户购物界面********/
    protected void shopBook(double money,int bookNumber,int number) throws Exception{
        stronger(money,number);
        if(client[number].getMoney()<money){
                System.out.println("对不起您的余额不足，请充值");
        }
        else{
            if(client[number].getMember()==3){
                client[number].sub_money(money*0.6);
            }
            else if(client[number].getMember()==2){
                client[number].sub_money(money*7.5);
            }
            else if(client[number].getMember()==1){
                client[number].sub_money(money*8.5);
            }
            else {
                client[number].sub_money(money);
            }
        }
    }

    /************充值*************/
    protected void stronger(double money,int number){
            if(money>=800){
                client[number].setMember(3);
                client[number].add_money(money);
            }
            else if(money>=500){
                client[number].setMember(2);
                client[number].add_money(money);
            }
            else if (money>=200){
                client[number].setMember(1);
                client[number].add_money(money);
            }
            else{
                client[number].setMember(0);
                client[number].add_money(money);
            }
    }
    /*********退出客户管理系统************/
    protected void Quit1() throws Exception{
        Welcome();
    }


    //"1.添加书籍.\n"+"2.查询书籍信息.\n"+"3.删除书籍信息.\n"+"4.退出系统"
    /**************添加书籍**********/
    protected void addBook(int bookNumber,String bookname, double bookmoney, String authorname, String press){
        books[bookNumber]= new StackRoom(bookNumber,bookname,bookmoney,authorname,press);
    }
    /***************查看书籍信息**************/
    protected void seekBook(int bookNumber){
        System.out.println((books[bookNumber].getBooks()));
    }
    /***************删除书籍****************/
    protected void deleteBook(int bookNumber){
        books[bookNumber]=null;
    }
    /**********退出书库管理系统***********/
    protected void Quit2()throws Exception{
        Welcome();
    }


    /************管理系统退出*******/
    protected void Quit()throws Exception{
        System.out.println("感谢使用本系统，下次要收费喔！");
        System.exit(1);
    }
}

