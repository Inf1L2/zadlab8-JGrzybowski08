package pl.edu.ur.oopl8;

public class Ksiazka extends Product{
       public Ksiazka(double price, String name, String describe) {
        super(price, name, describe);
    }

public Ksiazka(){
    
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
