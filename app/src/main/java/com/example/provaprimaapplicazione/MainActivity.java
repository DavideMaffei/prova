package com.example.provaprimaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public static final String LogTag="5Bia_First_app";
    private int cont=0;
    TextView txt_count;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_count= (TextView) findViewById(R.id.textIncremento);
        //txt_count.setText(""+cont);  --l'app parte con il valore di cont ovvero 0
        Button btn_click = (Button) findViewById(R.id.buttonIncremento); //casting in button

        btn_click.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                cont++;
                txt_count.setText(cont+"");

            }
        });
    }

    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",cont);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        cont=savedInstanceState.getInt("counter");
        txt_count.setText(""+cont);
    }
}