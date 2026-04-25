package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);

        while (bill.gender != 'F' && bill.gender != 'M') {
            System.out.print("Digite apenas F ou M: ");
            bill.gender = sc.next().charAt(0);
        }

        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        if(bill.cover() == 4.0) {
            System.out.println(bill.toStringWithCover());
        }else{
            System.out.println(bill.toStringNoCover());
        }
        sc.close();
    }
}
