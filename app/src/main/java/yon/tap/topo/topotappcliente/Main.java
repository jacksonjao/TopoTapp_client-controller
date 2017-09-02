package yon.tap.topo.topotappcliente;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main extends AppCompatActivity {
    EditText ip;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        ip= (EditText) findViewById(R.id.ip);

    }

    public void jugar(View v){
        Intent intent = new Intent(this, Juego.class);
        startActivity(intent);
        TareaAsincrona.setIp(ip.getText().toString());
    }

    public void instrucciones(View v){
        TareaAsincrona.setIp(ip.getText().toString());
new TareaAsincrona().execute("instrucciones");

    }


}
