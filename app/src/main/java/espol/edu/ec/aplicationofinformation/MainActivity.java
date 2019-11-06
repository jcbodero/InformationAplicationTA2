package espol.edu.ec.aplicationofinformation;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnMapa;
    Button btnVideo;
    Button btnCalen;
    Button btnGrafica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMapa = (Button) findViewById(R.id.btnMapa);
        btnVideo = (Button) findViewById(R.id.btnVideo);
        btnCalen= (Button) findViewById(R.id.btnCalen);
        btnGrafica=(Button)findViewById(R.id.btnGraph);

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent);
            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),VideoActivity.class);
                startActivity(intent);
            }
        });

        btnCalen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),CalendarActivity.class);
                startActivity(intent);
            }
        });

        btnGrafica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),GraficaActivity.class);
                startActivity(intent);
            }
        });

    }
}
