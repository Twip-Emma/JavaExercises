public class InkPrinter extends Printer implements IScan {

    @Override
    public void print() {
        
        System.out.println("【Printer】InkPrinter");
        
    }
    
    @Override
    public void scan() {
        
        System.out.println("【IScan】");
        
    }

}
