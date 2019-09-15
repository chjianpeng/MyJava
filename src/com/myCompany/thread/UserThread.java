package com.myCompany.thread;

public class UserThread extends Thread{

    private final Gate gate;
    private final String myname;
    private final String myadress;

    public UserThread(Gate gate, String myname, String myadress) {
        this.gate = gate;
        this.myname = myname;
        this.myadress = myadress;
    }

    public void run(){
        System.out.println(myname + " BEGIN");
        while (true){
            gate.pass(myname, myadress);
        }
    }
}
