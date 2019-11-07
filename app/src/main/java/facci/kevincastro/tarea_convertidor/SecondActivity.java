package facci.kevincastro.tarea_convertidor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView Total;
    int valor;
    double resultado;
    private void MostrarMensaje(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Total = findViewById(R.id.Resultado_conv);
        Bundle bundle = this.getIntent().getExtras();
        Total.setText(bundle.getString("dato"));
        valor = Integer.parseInt(bundle.getString("dato"));
        resultado = valor * 0.453592;
        Total.setText(String.valueOf(resultado));
        Log.e("dato","Su resultado");
        MostrarMensaje("Su Resultado es...");
    }
}
