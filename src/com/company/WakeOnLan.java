package com.company;
import java.io.*;
import java.net.*;


public class WakeOnLan {

    private int puerto = 9;
    private String macDestino;
    private String ipBroadcast;

    public String getMacDestino(){
        return macDestino;
    }

    public void setMacDestino(String macDestino){
        macDestino = this.macDestino;
    }

    public int getPuerto(){
        return puerto;
    }

    public String getIpBroadcast(){
        return ipBroadcast;
    }

    public void setIpBroadcast(String ipBroadcast){
        ipBroadcast = this.ipBroadcast;
    }


    public static void main(String[] args) {

    }
}
