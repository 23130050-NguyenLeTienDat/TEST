package lab3;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Random rd = new Random();
        int res = rd.nextInt(100);
        int count=0;
        System.out.println("Bat dau tro choi");
        System.out.println("Vui long nhap so");
        int num =-1;
        while (num != res){
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if(num<res){
                System.out.println("Sai r, so "+num+" nho hon kqua");
                count ++;
            }if(num > res){
                System.out.println("Sai r, so "+num+" lon hon kqua");
                count ++;
            }
        }
        if(num==res){
            System.out.println("dung roi, kqua la: " + res+" so lan lap la: "+ count);
        }
    }
}
