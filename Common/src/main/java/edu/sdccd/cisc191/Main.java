package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Adapted from 2.3 Multidimensional Arrays Lab
 * Adapted from 5.3 Inheritance, Polymorphism, Abstract Classes Lab
 * Applied Module 5
 * References to site: https://ardas-it.com/comparing-3-ways-to-store-faces-when-developing-facial-recognition-search
 */

public class Main {


    @Test
    void testFaceRecognition() {
        FaceRecognition faceRecognition = new FaceRecognition(20, "User", 2500);
        assertEquals(20, faceRecognition.getID());
        assertEquals("User", faceRecognition.getName());
        assertEquals(2500, faceRecognition.getData());

        System.out.println("Results are: " + faceRecognition);
    }
    @Test
    void testLibraries() {
        Libraries identification = new Libraries("Face ID Biometrics");


    }


}
