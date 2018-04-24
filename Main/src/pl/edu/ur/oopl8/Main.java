package pl.edu.ur.oopl8;

public class Main {

    public static void main(String[] args) {
        Product[] tab = new Product[10];
        tab[0]=new Ksiazka(10,"Cos","AAA");
        tab[1]=new Czekolada(10,"AAA","BBB");
        tab[2]=new Ksiazka(10,"AAAA","BBBA");
        tab[3]=new Dlugopis(10,"AAAS","BBBS");
        tab[4]=new Dzem(10,"AAAD","BBBD");
        tab[5]=new Polopiryna(10,"AAAF","BBBF");
        tab[6]=new Dzem(10,"AAAQ","BBBQ");
        tab[7]=new Czekolada(10,"AAAW","BBBW");
        tab[8]=new Dlugopis(10,"AAAE","BBBE");
        tab[9]=new Tractor(10,"AAAR","BBBR");
        
        for(int i=0; i<10; i++){
            tab[i].buy();
            tab[i].showInfo();
            System.out.println("");
        }
        
    }
    
}
