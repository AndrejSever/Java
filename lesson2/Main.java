package ru.geekbrains.java2.lesson2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[][] arrey = {{"4", "5", "7", "8"}, {"2", "7", "5", "1"}, {"f", "3", "5", "8"}, {"1", "2", "9", "4"}};
        String[][] arrey2 = {{"4", "5", "7", "8"}, {"2", "7", "5", "1"}, {"1", "2", "9", "4"}};
        CubeArrey cube = new CubeArrey(arrey);

        try {
            System.out.println("Сумма всех элементов массива: " + cube.cubeArreys(arrey) );
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Сумма всех элементов массива: " + cube.cubeArreys(arrey2) );
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


    }

}
