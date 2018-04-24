package pl.edu.ur.oopl8;

public class polopiryna extends Product{
       public polopiryna(double price, String name, String describe) {
        super(price, name, describe);
    }

    public void buy() {
        System.out.println(
                "Kupilem polopiryne!!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    } 
}
