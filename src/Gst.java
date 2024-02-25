public class Gst extends incomeTax{

    @Override
    public int calculateTax(int income){
        int b = super.calculateTax(income);
        int g = 500;
        return b + g;
    }

}
