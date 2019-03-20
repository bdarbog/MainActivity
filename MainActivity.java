package com.pointpark.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private TextView textView1;
    private EditText aEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        textView1 = (TextView) findViewById(R.id.textView);
        aEditText = (EditText)  findViewById(R.id.aEditText);

        btnSubmit.setText(R.string.button_name);
        btnSubmit.setTextColor(Color.RED);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String InputText;
                InputText = aEditText.getText().toString();

                textView1.setVisibility(View.VISIBLE);
                textView1.setText(InputText);
            }
        });
    }

/*
    public void ShowMeText(View view) {


        textView1.setVisibility(View.VISIBLE);



        textView1.setText(R.string.show_text);


    }
  */
}
