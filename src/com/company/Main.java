package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*    public static void main(String[] args) {
            // write y public class Test{
            //       char c1 = '1';
            //       char c2 = '\u0031';
            //       char c3 = 49;
            //       System.out.printin(c1 + c2 + c3);
            //  char a='A';
            //    String b="qwerty";
            //    String  b1="qwerty";
            //   System.out.println(b1==b);
            //   System.out.println(b1.equals(b));
            //    byte a=40;
            //    byte b=100;
            //      a<b
            //    byte c= (byte) (a+b);
            //    System.out.println(c);
            //      int i=a<b?100+10/2:200;
            //      System.out.println(i);

         //   int x = 6;
        //    String schooltype = null;

         *//*   if ((x >= 3) && (x <= 7)) {
            schooltype = "Kindergarden";
        } else if ((x > 8) && (x < 17)) {
            schooltype = "School";
        } else if ((x > 18) && (x < 23)) {
            schooltype = "University";
        } else if ((x > 24) && (x < 65)) {
            schooltype = "Work";
        } else if ((x > 65) && (x < 90)) {
            schooltype = "Pentcia";
        }
        System.out.println("I go to the " + schooltype);
*//*// work example        }
//    int day = 6;
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Work day");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Holidays");
//                break;
//            default:
//                System.out.println("Select a day");
//            } work example

//      for (int i = 0; i <= 100; i++) {
//           if (i % 3 == 0) continue;
//               System.out.println(i+"");
//           }

        //    int i = 200;
        //    do {
        //        System.out.println(i);
       //         i++;
        //    }
        //      while (i <= 100) ;
        //       for (String arg : args) {
 //           System.out.println(arg);
//        for (String s : "2552".split("")) {
//            System.out.printf(s);
     *//*  String strInt = "123"; String strDouble = "123.456";
       int x; double y;
       x = Integer.parseInt(strInt);
       y = Double.parseDouble(strDouble);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt=String.valueOf(x+1);
        strDouble = String.valueOf(y+1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str = "num=" +345;
        System.out.println(str);
        System.out.println(Integer.toString(123));
        System.out.println(Integer.toBinaryString(123));*//*
        int[]i = {1,2,3,4,5,6};
        int[][]i2 = {{1,2,3},
                {4,5,6}};
        int[]i1 = new int[5];
       *//* System.out.println(Arrays.toString(i1));
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.deepToString(i2));
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
        for (int j = i.length - 1; j >= 0; j--) {
            System.out.println("Revesr mass" + i[j]);
        }
        for (int j : i) {
            System.out.println(j);
        }*//*
     *//*   int sum=0;
        for (int[] ints : i2) {
            int sum1=0;
            for (int anInt : ints) {
                sum+=anInt;
                sum1+=anInt;
                System.out.print("+" + anInt);
            }
            System.out.println("=" + sum1);
            System.out.println();
        }
        System.out.println(sum);*//*
     *//* System.out.println(i[2]); // вывод элемента массива под определенным номером
        System.out.println(i.length); //вывод общей длинны массива
        System.out.println(i[i.length-1]); // вывод последнего элемента массива
        System.out.println(i2[1][1]); // вывод 5рки из i2 массива (номер строки и номер столбца)
        System.out.println(i2[1][2]); // вывод 6рки из i2 массива (номер строки и номер столбца)
        System.out.println(i2[0][0]); // вывод 1цы из i2 массива (номер строки и номер столбца)
*//*
        For_Inversion(i);
        System.out.println(Arrays.toString(i));
    }

    private static void For_Inversion(int[] i) {
        for (int j = 0; j < i.length/2; j++) {
            int temp=i[j];
            i[j]=i[i.length-1-j];
            i[i.length-1-j]=temp;
        }
    }*/
 /*   public static void main(String[] args) {
        int[] a =[2, 1, 7, 4, 5, 6, 3];
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[0];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(a));
*/
    public static void main(String[] args) {
        System.out.println(new StringBuffer("Мама мыла раму!").reverse());
        String[] split = "Мама мыла раму!".split(""); // вывели массив стрингов
        System.out.println(Arrays.toString(split)); // сплит просто название массива

        for (int i = 0; i < split.length / 2; i++) {
            String temp = split[i]; // первый элемент заносим в временную переменную
            split[i] = split[split.length - 1 - i]; // последний элемент заносим в первую переменную
            split[split.length - 1 - i] = temp; // временную переменную заносим в последний элемент
        }


        /// rfjfjh
       // System.out.println(Arrays.toString(split));
       /* Scanner scanner=new Scanner(System.in);  как задание №6
        String next=scanner.nextLine();
        String[] s=next.split(" ");
        System.out.println(Arrays.toString(s));
        String[] strings=s[0].split("");
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));*/


    }
}






