package src;

import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        soal1();
        soal2();

    }

    static void soal1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int lapisanA = 0;
        int lapisanB = 0;
        int selisih = 0;

        if (x1 == n && y1 == n) {
            lapisanA = 1;
        } else if (x1 == 1 || y1 == 1) {
            lapisanA = 1;

        } else {
            for (int i = 2; i <= n; i++) {
                if (x1 == i || y1 == i) {
                    if (x1 == y1) {
                        lapisanA = x1;
                    } else if (x1 == n - i + 1 || y1 == n - i + 1) {
                        lapisanA = i - 1;
                    }
                }
            }
        }

        if (x2 == 1 || y2 == 1) {
            lapisanB = 1;
        } else if (x2 == n && y2 == n) {
            lapisanB = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                if (x2 == i || y2 == i) {
                    if (x2 == y2) {
                        lapisanB = x2;
                    } else if (x2 == n - i + 1 || y2 == n - i + 1) {
                        lapisanB = i - 1;
                    }
                }
            }


        }
        selisih = Math.abs(lapisanA - lapisanB);
        System.out.println(selisih);
        System.out.println("LapisanA : " + lapisanA);
        System.out.println("LapisanB : " + lapisanB);


    }

    static void soal2() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int finalx = x + d - a;
        int finaly = y + w - s;
        String first = "";
        String last = "";

        if (finalx == 0 && finaly == 0) {
            System.out.println("Robot berada di tengah arena");
        }
        else{
            if (finalx > 100 || finalx < -100 || finaly > 100 || finaly < -100) {
                last = " Robot keluar arena";
            }

            if (finalx == 0) {
                first = "Robot berada di sumbu Y";

            } else if (finaly == 0) {
                first = "Robot berada di sumbu X";
            } else {
                if (finalx < 0 && finaly > 0) {
                    first = "Robot berada di kuadran 2";
                } else if (finalx > 0 && finaly > 0) {
                    first = "Robot berada di kuadran 1";

                } else if (finalx < 0) {
                    first = "Robot berada di kuadran 3";

                } else {
                    first = "Robot berada di kuadran 4";

                }
            }
        }




        System.out.println(first + last);




    }

}







