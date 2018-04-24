package pl.edu.ur.oopl8;

public class czekolada extends Product{
       public czekolada(double price, String name, String describe) {
        super(price, name, describe);
    }

    public void buy() {
        System.out.println(
                "Kupilem czekolade!!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    } 
}