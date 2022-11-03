package edu.sdccd.cisc191;
import java.io.*;
import java.util.ArrayList;

/**
 * Adapted from 2.3 Multidimensional Arrays Lab
 */

public class FaceRecognition extends Main implements Database {
    public int ID;
    private String name;
    private int data;
    private FaceIdentification[] faceIdentification;

    private int[][] features;

    public static void main(ArrayList[] args) {
        ArrayList[] searchList = {};

        for (int i = 0; i < searchList.length; i++) {
            ArrayList<Integer> scanFaceData = new ArrayList<Integer>();
            scanFaceData.add(230);
            scanFaceData.add(350);
            scanFaceData.add(540);

            //return new ArrayList[] {0};

            /**
             * Program will do a for-loop through doing Array: will check and scan results for similar
             * facial feature. By doing so, the program will conduct a search for facial recognition
             *
             */


            /**
             * private ArrayList<Integer> arrayList = new ArrayList<Integer>();  module 9/10
             * numberList.add() // (value)
             * numberList.size() //Loop, size of array
             * numberList.remove() // (position)
             * numberList.insert(2,1) //(position, value)
             */
        }
       // public void setUp() {
            int[][] features = new int[][] { {20, 40,50} };
        }
//        else {
//            System.out.println("Face recognition undefined: ");


//  Constructors
    public FaceRecognition(int ID, String name, int data) {
        this.ID = ID;
        this.name = name;
        this.data = data;
    }
    public int getID() {
        return ID;
    }
//  Get more data to access facial recognition
    public int getData() {
        return data;
    }
    public String getName() {
        return name;
    }

//    for(int i = 1, faceIdentification > 1, i++) {
//        ArrayList<Integer> faceList = new ArrayList<Integer>();
//
//    }
}
