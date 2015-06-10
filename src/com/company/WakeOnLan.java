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

    public void setIpBroadcast(String ipBroadcast)
    {
        ipBroadcast = this.ipBroadcast;
    }


    public byte[] macToBytes (String macAddress) throws IllegalArgumentException {

        byte[] macInBytes = new byte[6];
        String[] macText = macAddress.split("-\\:"); // Corta los octetos de la MAC que esta en tipo String de a uno .
        if (macText.length != 6) {
            throw new IllegalArgumentException("Error, forma y tamaño de la Mac Address"); //verifica que la MAC tenga la forma/tamaño correcto.
        }
        try {
            for (int i = 0; i < 6; i++) {
                macInBytes[i] = (byte) Integer.parseInt(macText[i], 16); // se parsea cada octeto de la MAC
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error, algun digito de la Mac Address ingresada no es exadesimal");
        }
        return macInBytes;
    }


    public static void main(String[] args) {

    }
}
