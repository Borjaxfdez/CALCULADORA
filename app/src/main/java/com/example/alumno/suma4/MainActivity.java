package com.example.alumno.suma4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sumar(View view){
        EditText e2=(EditText) findViewById (R.id.t2);
        EditText e1=(EditText) findViewById (R.id.t1);
        if(e1.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA PRIMERA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(e2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA SEGUNDA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(!e1.getText().toString().equals("") && !e2.getText().toString().equals("")){
            String t1=e1.getText().toString();
            String t2=e2.getText().toString();
            int n1=Integer.parseInt(t1);
            int n2=Integer.parseInt(t2);
            int n3=n1+n2;
            String n4=String.valueOf(n3);
            Toast.makeText(getApplicationContext(),"EL RESULTADO ES "+n4,Toast.LENGTH_SHORT).show();
        }

    }
    public void restar(View view){
        EditText e2=(EditText) findViewById (R.id.t2);
        EditText e1=(EditText) findViewById (R.id.t1);
        if(e1.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA PRIMERA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(e2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA SEGUNDA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(!e1.getText().toString().equals("") && !e2.getText().toString().equals("")){
            String t1=e1.getText().toString();
            String t2=e2.getText().toString();
            int n1=Integer.parseInt(t1);
            int n2=Integer.parseInt(t2);
            int n3=n1-n2;
            String n4=String.valueOf(n3);
            Toast.makeText(getApplicationContext(),"EL RESULTADO ES "+n4,Toast.LENGTH_SHORT).show();
        }

    }
    public void multiplicar(View view){
        EditText e2=(EditText) findViewById (R.id.t2);
        EditText e1=(EditText) findViewById (R.id.t1);
        if(e1.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA PRIMERA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(e2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA SEGUNDA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(!e1.getText().toString().equals("") && !e2.getText().toString().equals("")){
            String t1=e1.getText().toString();
            String t2=e2.getText().toString();
            int n1=Integer.parseInt(t1);
            int n2=Integer.parseInt(t2);
            int n3=n1*n2;
            String n4=String.valueOf(n3);
            Toast.makeText(getApplicationContext(),"EL RESULTADO ES "+n4,Toast.LENGTH_SHORT).show();
        }

    }
    public void dividir(View view){
        EditText e2=(EditText) findViewById (R.id.t2);
        EditText e1=(EditText) findViewById (R.id.t1);
        if(e1.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA PRIMERA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(e2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"PON UN NUMERO EN LA SEGUNDA CASILLA",Toast.LENGTH_SHORT).show();
        }
        else if(!e1.getText().toString().equals("") && !e2.getText().toString().equals("")){
            String t1=e1.getText().toString();
            String t2=e2.getText().toString();
            double n1=Double.parseDouble(t1);
            double n2=Double.parseDouble(t2);
            double n3=n1/n2;
            String n4=String.valueOf(n3);
            Toast.makeText(getApplicationContext(),"EL RESULTADO ES "+n4,Toast.LENGTH_SHORT).show();
        }

    }
}
