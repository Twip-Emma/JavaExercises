public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        char arrUser[][]={{'1','2','3','4','5'},{'8','a','b','c'},{'d','e'}};
        for(int itemOut = 0; itemOut<arrUser.length;itemOut++)
        {
            for(int itemIn = 0; itemIn<arrUser[itemOut].length;itemIn++)
            {
                System.out.print(arrUser[itemOut][itemIn] + " ");
            }
            System.out.println();
        }
    }
}
