package pl.edu.ur.oopl8;

public class Tractor extends Product {

    public Tractor(double price, String name, String describe) {
        super(price, name, describe);
    }

    public void buy() {
        System.out.println(
                "Kupiłem czarny ciągnik, pojemność 2400!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
}