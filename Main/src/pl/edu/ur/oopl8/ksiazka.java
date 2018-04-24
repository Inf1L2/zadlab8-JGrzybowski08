package pl.edu.ur.oopl8;

public class ksiazka extends Product{
       public ksiazka(double price, String name, String describe) {
        super(price, name, describe);
    }

    public void buy() {
        System.out.println(
                "Kupilem ksiazke!!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    } 
}
