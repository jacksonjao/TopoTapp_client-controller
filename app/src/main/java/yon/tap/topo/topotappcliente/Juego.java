package yon.tap.topo.topotappcliente;

import android.os.AsyncTask;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Juego extends AppCompatActivity implements View.OnClickListener {

    String letra;
    ImageButton a1;
    ImageButton a2;
    ImageButton a3;
    ImageButton b1;
    Button b2;
    ImageButton b3;
    ImageButton c1;
    Button c2;
    ImageButton c3;
    String comando;
    ImageButton d1;
    ImageButton d2;
    ImageButton d3;
    Vibrator v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);


        v = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
        this.a1 = (ImageButton) findViewById(R.id.ib_a1);
        this.a2 = (ImageButton) findViewById(R.id.ib_a2);
        this.a3 = (ImageButton) findViewById(R.id.ib_a3);
        this.b1 = (ImageButton) findViewById(R.id.ib_b1);
        this.b2 = (Button) findViewById(R.id.ib_b2);
        this.b3 = (ImageButton) findViewById(R.id.ib_b3);
        this.c1 = (ImageButton) findViewById(R.id.ib_c1);
        this.c2 = (Button) findViewById(R.id.ib_c2);
        this.c3 = (ImageButton) findViewById(R.id.ib_c3);
        this.d1 = (ImageButton) findViewById(R.id.ib_d1);
        this.d2 = (ImageButton) findViewById(R.id.ib_d2);
        this.d3 = (ImageButton) findViewById(R.id.ib_d3);


        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        d1.setOnClickListener(this);
        d2.setOnClickListener(this);
        d3.setOnClickListener(this);

        new TareaAsincrona().execute("jugar");
    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.ib_a1:
                this.comando = "a1";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_a2:
                this.comando = "a2";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_a3:
                this.comando = "a3";

                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_b1:
                this.comando = "b1";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_b2:
                this.comando = "b2";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_b3:
                this.comando = "b3";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_c1:
                this.comando = "c1";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_c2:
                this.comando = "c2";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_c3:
                this.comando = "c3";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_d1:
                this.comando = "d1";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_d2:
                this.comando = "d2";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            case R.id.ib_d3:
                this.comando = "d3";
                new TareaAsincrona().execute(comando);
                this.v.vibrate(40);
                break;
            default:


        }
    }


    @Override
    public void onBackPressed() {

    }
}