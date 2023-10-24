package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adı giriniz: ");
            userName = input.nextLine();
            System.out.print("Sifre Giriniz: ");
            password = input.nextLine();
            if (userName.equals("berkay") && password.equals("patika123")) {
                System.out.println("Giriş Başarılı");
                do {
                    System.out.println("1 Para Yatırma\n" +
                            "2 Para Çekme\n" +
                            "3 Bakiye Sorgulama\n" +
                            "4 Çıkış Yap");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Yatırmak istediğiniz para miktarınız : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Çekmek istediğiniz para miktarınız : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz");
                            System.out.println("-------------------------");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Para miktarınız : " + balance);
                        System.out.println("-------------------------");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Giriş haklarınız dolmuştur ve Hesabınız bloke edilmiştir Bankanız ile iletişime geçiniz..");
                } else {
                    System.out.println("Giriş Başarısız Kalan hakkınız : " + right);
                }
            }
        }
    }
}
