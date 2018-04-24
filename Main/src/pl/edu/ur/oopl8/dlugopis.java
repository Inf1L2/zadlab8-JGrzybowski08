package pl.edu.ur.oopl8;

public class dlugopis extends Product{
       public dlugopis(double price, String name, String describe) {
        super(price, name, describe);
    }

    public void buy() {
        System.out.println(
                "Kupilem dlugopis!!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    } 
}