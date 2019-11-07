package facci.kevincastro.tarea_convertidor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNumero;
    Button btnConvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero = (EditText) findViewById(R.id.txtNumero);
        btnConvertir = (Button) findViewById(R.id.btnConvertir);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("dato", txtNumero.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
