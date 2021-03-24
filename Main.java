package ru.geekbrains.home_work_app;

public class Main {

    public static void main(String[] args) {
    PrintThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
    }
    public static void PrintThreeWords(){
        System.out.println("Banana");
        System.out.println("Orange");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 10;
        int b = 20;
        if ( a+b >= 0) {
            System.out.println(" Сумма положительная");
        }
        if ( a+b <= 0) {
            System.out.println(" Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 18;
        if ((value >=0) && (value<=100))
            System.out.println(" Желтый");
        if (value < 0)
            System.out.println(" Красный");
        if (value > 100){
            System.out.println(" Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 19;
        int b = 19;
        if ( a >= b) {
            System.out.println(" a >= b");
        } else{
                System.out.println(" a < b");
            }
        }
    }

