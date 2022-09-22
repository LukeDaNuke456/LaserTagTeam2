package controller;

import view.SplashScreen;

import javax.swing.*;
import java.awt.*;

public class Main {


    public Main() {


    }

    public void run() {

        //Displays the splash for 4 seconds
        try {
            SplashScreen splashScreen = new SplashScreen();
            Thread.sleep(4000);
            splashScreen.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

    }


    public static void main(String[] args) {

        Main m = new Main();
        m.run();

    }
}