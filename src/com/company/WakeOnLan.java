package com.company;
import java.io.*;
import java.net.*;


public class WakeOnLan {

    private int puerto = 9;
    private String macDestino;
    private String ipBroadcast;

    // Get de la mac destino
    public String getMacDestino(){
        return macDestino;
    }

    // Set de la mac destino
    public void setMacDestino(String macDestino)
    {
        macDestino = this.macDestino;
    }

    // get del puerto
    public int getPuerto()
    {
        return puerto;
    }

    // get de la ipdestino
    public String getIpBroadcast()
    {
        return ipBroadcast;
    }

    // set de la ipdestino
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
