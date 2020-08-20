package br.unicamp.conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExibirResultado extends AppCompatActivity {

    TextView txtFahrenheit, txtKelvin;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_resultado);

        txtFahrenheit = findViewById(R.id.txtFahrenheit);
        txtKelvin = findViewById(R.id.txtKelvin);
        btnVoltar = findViewById(R.id.btnVoltar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        txtFahrenheit.setText(bundle.getDouble("fahrenheit") + "");
        txtKelvin.setText(bundle.getDouble("kelvin") + " ");
        txtKelvin.setText(bundle.getDouble("kelvin") + " ");

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}