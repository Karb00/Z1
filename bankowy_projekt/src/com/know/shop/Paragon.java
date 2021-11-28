/*package com.example;

public class Produkt {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
*/

package com.know.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produkt {
    // wlasciwosci nazwa i cena
    private String pname;
    private double price;


    Produkt(String pname,
            double price) {
        this.pname = pname;
        this.price = price;
    }

    // getery:
    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    // format wysweitlenia
    public static void displayFormat() {
        System.out.print(
                "\nNazwa           Cena\n");
    }

    // display
    public void display() {
        System.out.format("%-9s  %10.2f \n",
                pname,  price);
    }
}

public class Paragon {
    public static void main(String[] args) {

        String productName = null;
        double price = 0.0;
        char choice = '\0';

        Scanner scan = new Scanner(System.in);

        List<Produkt> product = new ArrayList<Produkt>();

        do {
            System.out.println("Wprowadz dane produktu");
            System.out.print("Nazwa: ");
            productName = scan.nextLine();
            System.out.print("Cena (zl): ");
            price = scan.nextDouble();

            // dodaje go do listy
            product.add( new Produkt(
                    productName,  price) );

            // czy dodac kolejny produkt?
            System.out.print("Chcesz dodac kolejny produkt? (y or n): ");
            choice = scan.next().charAt(0);

            scan.nextLine();
        }
        while (choice == 'y' || choice == 'Y');

        // wyswietl produkty i ceny
        Produkt.displayFormat();
        for (Produkt p : product) {
            p.display();
        }

        scan.close();
    }

}