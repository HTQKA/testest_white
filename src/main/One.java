package main;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        One one = new One();
        int count = scanner.nextInt();
        int flag = scanner.nextInt();
        System.out.println(one.test(count,flag));

    }
    int test (int icount,int iflag){
        int itemp = 1;
        if (iflag == 0){
            itemp = icount + 100;
        }else {
            if (iflag == 1){
                itemp = icount * 10;

            }else {
                itemp = icount * 20;
            }
        }
        System.out.println(itemp);
        return itemp;
    }

}
