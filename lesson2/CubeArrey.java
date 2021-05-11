package ru.geekbrains.java2.lesson2;

public class CubeArrey {
    String[][] arrCube;
    int sum = 0;

    public CubeArrey(String[][] arrCube) {
        this.arrCube = arrCube;
    }

    public int cubeArreys (String[][] arrCube ) throws MyArraySizeException, MyArrayDataException {

    if (arrCube.length !=4 || arrCube[0].length != 4 || arrCube[1].length != 4 || arrCube[2].length != 4 || arrCube[3].length != 4) {
        throw new MyArraySizeException("Неверный размер массива!");
    }


    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            try {
                sum = sum + Integer.parseInt(arrCube[i][j]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный тип данных в ячейке " + i + "." + j);
//                throw new MyArrayDataException("Неверный тип данных в ячейке " + i + "." + j);
                continue;




            }

            }

    }
    return sum;



}

    public int getSum() {
        return sum;
    }
}

