package ru.geekbrains.java2.lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(String massage) {
        super(massage);
    }
}
