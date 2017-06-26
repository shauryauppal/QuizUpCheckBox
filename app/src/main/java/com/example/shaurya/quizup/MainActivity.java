package com.example.shaurya.quizup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String message="";
    public void print(View view)
    {
        message="You have selected->";
        CheckBox a1 = (CheckBox) findViewById(R.id.A1);
        boolean hasA = a1.isChecked();

        CheckBox b1 = (CheckBox) findViewById(R.id.B1);
        boolean hasB = b1.isChecked();

        CheckBox c1 = (CheckBox) findViewById(R.id.C1);
        boolean hasC = c1.isChecked();

        CheckBox d1 = (CheckBox) findViewById(R.id.D1);
        boolean hasD = d1.isChecked();

        if(hasA)
        {message+="1";}
        if(hasB)
            message+=",2";
        if(hasC)
            message+=",3";
        if(hasD)
            message+=",4";



        TextView text = (TextView) findViewById(R.id.answer);
        text.setText(message);
    }


}
