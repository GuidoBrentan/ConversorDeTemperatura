package br.unicamp.conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtTemperatura;
    Button btnConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTemperatura = findViewById(R.id.txtTemperatura);
        btnConverter = findViewById(R.id.btnConverter);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtTemperatura.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Digite uma temperatura em Celsius", Toast.LENGTH_LONG).show();
                else
                {
                    double fahrenheit, kelvin;
                    Celsius celsius = new Celsius(Double.parseDouble(txtTemperatura.getText().toString()));

                    fahrenheit = celsius.ConverterParaFahrenheit();
                    kelvin = celsius.ConverterParaKelvin();

                    Intent intent = new Intent(MainActivity.this, ExibirResultado.class);
                    Bundle params = new Bundle();
                    params.putDouble("fahrenheit", fahrenheit);
                    params.putDouble("kelvin", kelvin);

                    intent.putExtras(params);
                    startActivity(intent);
                }
            }
        });
    }
}