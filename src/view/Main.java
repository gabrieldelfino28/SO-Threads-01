package view;

import controller.TIDController;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (int id = 0; id < 5; id++) {
//          TIDController idT = new TIDController(id);
            Thread threadID = new TIDController();
            threadID.start();
        }
    }
}
