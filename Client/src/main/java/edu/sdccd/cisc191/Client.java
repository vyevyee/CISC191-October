package edu.sdccd.cisc191;

import sun.applet.Main;

import java.net.*;
import java.io.*;
import java.io.ObjectInputStream;
import javafx.application.Application;

//  java.util.concurrent.Calllable --> import from Lambda Expressions; possible might be able to add it


/**
 * Client as JavaFX app, allow users to register, login, and logout
 * When registering, take a photo and send to server
 * Process face data and store in a database
 * When logging in, take a photo and send to server to compare with face data registered with.
 * The client can store the logged in user to local files
 * Use a 3rd party library like OpenCV on the server to convert images to face data
 * Using a web app that allows the user to use face tracking/ detection
 */
// register user
public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    // import javafx
    // Repositories

    //  private FaceRecognition faceRecognition;

    // Checkbox to detect and track face
    public void startConnection(InputStreamReader(clientSocket.getInputStream()));
    }

//    public CustomerResponse sendRequest() throws Exception {
//        out.println(CustomerRequest.toJSON(new CustomerRequest(1)));
//        return CustomerResponse.fromJSON(in.readLine());
//    }


    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.startConnection("local host", 4444);
            Main.main(args);
            client.stopConnection();
        } catch(Exception e) {
            e.printStackTrace();

        }
    }
} //end class Client

