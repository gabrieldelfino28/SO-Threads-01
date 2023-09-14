package controller;

public class TIDController extends Thread {
    private int idT;

    public TIDController() {

    }

    @Override
    public void run() {
        //Só executa o que ta aqui dentro;
        ThreadID();
        super.run();
    }

    public void ThreadID(){
        int id = (int) getId();
        System.out.println(id);
    }
}
