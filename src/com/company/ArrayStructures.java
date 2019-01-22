package com.company;

/**
 * Created by jonny1846 on 12/12/2016.
 */
public class ArrayStructures {

    int[] theArray = new int[50];
    int arraySize = 10;


    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10 + 10);
        }
    }

    public int[] getTheArray() {
        return theArray;

    }

    public void printArray() {
        System.out.println("--------------------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " | ");
            System.out.println("--------------------");
        }
    }
    public int getValueAtIndex(int value) {
        if (value < arraySize) return theArray[value];
        return 0;
    }
    public boolean doseArrayContainThisValue(int value) {
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) valueInArray = true;
        }
        return valueInArray;
    }
    public void deleteIndex(int value) {
        if (value < arraySize) {
            for (int i = value; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }
    public void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }
    public void binarySearch(int value) {
        int lowIndex = 0;
        int highIndex = arraySize;
        int midIndex = (lowIndex + highIndex)/ 2;
        while(lowIndex > highIndex){
            if (theArray[midIndex] < value) lowIndex = midIndex + 1;
            else if(theArray[midIndex] > value) highIndex = midIndex -1;
            else {
                System.out.println("Match found for " + value + " at index " + midIndex);

            }
        }
    }



    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();
        //System.out.println(newArray.getValueAtIndex(7));
        //System.out.println(newArray.getValueAtIndex(4));
        //newArray.doseArrayContainThisValue(7);
        newArray.deleteIndex(4);
        newArray.printArray();
        newArray.insertValue(99);
        newArray.insertValue(98);
        newArray.insertValue(97);
        newArray.insertValue(96);
        newArray.printArray();



    }
}