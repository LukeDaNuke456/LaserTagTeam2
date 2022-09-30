import controller.Input;
import view.PlayerEntry;
import view.SplashScreen;


import javax.swing.*;

public class Main {

    PlayerEntry entry;
    Input input;

    public Main() {

        input = new Input();
        entry = new PlayerEntry();

    }

    public void run() {

//        Displays the splash for 4 seconds
        try {
            SplashScreen splashScreen = new SplashScreen();
            Thread.sleep(4000);
            splashScreen.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
            System.out.println("Kyrsti");
            System.out.println("Andrew");
        }

        //JFrame can be seen
        PlayerEntry entry = new PlayerEntry();
        entry.setVisible(true);


    }

    public static void main(String[] args) {

        Main m = new Main();
        m.run();

    }
}