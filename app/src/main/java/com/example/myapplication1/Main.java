package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final RelativeLayout main_view=findViewById(R.id.main_view);
        final TextView main_text=findViewById(R.id.main_text);
        Button red_button=findViewById(R.id.red_button);
        Button yellow_button=findViewById(R.id.yellow_button);
        Button green_button=findViewById(R.id.green_button);


        red_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_view.setBackgroundColor(getResources().getColor(R.color.redColor));
                main_text.setText(getResources().getText(R.string.red));
            }

        });
        green_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_view.setBackgroundColor(getResources().getColor(R.color.greenColor));
                main_text.setText(getResources().getText(R.string.green));
                }

                });
        yellow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_view.setBackgroundColor(getResources().getColor(R.color.yellowColor));
                main_text.setText(getResources().getText(R.string.yellow));
                }

                });



    }
}
