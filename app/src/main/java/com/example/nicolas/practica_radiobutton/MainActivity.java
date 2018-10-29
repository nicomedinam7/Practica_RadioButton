package com.example.nicolas.practica_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.num_1);
        et2 = (EditText)findViewById(R.id.num_2);
        tv1 = (TextView)findViewById(R.id.textView);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb2 = (RadioButton)findViewById(R.id.rb_resta);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicar);
        rb4 = (RadioButton)findViewById(R.id.rb_dividir);

    }
    // Metodo para el boton de calcular

    public void Calcular (View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        int num_1_int = Integer.parseInt(num_1_String);
        int num_2_int = Integer.parseInt((num_2_String));

        if (rb1.isChecked()==true){
            int suma = num_1_int+num_2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);

        }   else if (rb2.isChecked()==true){
            int resta = num_1_int - num_2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);

        }   else if (rb3.isChecked()==true){
            int multiplicar = num_1_int * num_2_int;
            String resultado = String.valueOf(multiplicar);
            tv1.setText(resultado);
        }  else if (rb4.isChecked()==true){
            int dividir = num_1_int / num_2_int;
            String resultado = String.valueOf(dividir);
            tv1.setText(resultado);
        }




    }
}
