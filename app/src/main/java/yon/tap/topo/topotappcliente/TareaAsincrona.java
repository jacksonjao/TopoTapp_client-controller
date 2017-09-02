package yon.tap.topo.topotappcliente;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Jhon on 14/09/16.
 */
public class TareaAsincrona extends AsyncTask<String, Void, Integer> {
    DatagramSocket socket;
    InetAddress ipGroup;
   static String ip;
    final int port = 5000;

    @Override
    protected Integer doInBackground(String... params) {


        try {
            socket = new DatagramSocket();
            ipGroup = InetAddress.getByName(ip);

        } catch (IOException e) {
            e.printStackTrace();
        }


        byte[] mensaje = params[0].getBytes();

        DatagramPacket paquete = new DatagramPacket(mensaje, mensaje.length, ipGroup, port);
        try {
            socket.send(paquete);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

   static public void setIp(String isp) {
        ip = isp;
    }
}