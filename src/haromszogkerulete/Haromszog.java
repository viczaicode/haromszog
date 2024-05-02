/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haromszogkerulete;

/**
 *
 * @author ViczaiPéterMilán(SZO
 */
public class Haromszog {
    
    private int a;
    private int b;
    private int c;
    
     
    public Haromszog() {
    this(1,2,3);
    }

    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void keruletSzamitas() {
        int vegeredmeny = 0;
        if (this.a + this.b > this.c && this.a + this.c > this.b && this.b + this.c > a) {
            vegeredmeny = this.a + this.b + this.c;
            System.out.println("A megadott háromszög kerülete: " + vegeredmeny + "cm");
        } else {
            System.out.println("A háromszög nem szerkeszthető");
        }
        
        
    }


}
