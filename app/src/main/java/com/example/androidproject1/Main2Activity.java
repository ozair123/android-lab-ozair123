package com.example.androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.androidproject1.MainActivity.Questionarray;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void saveuserinput(View view ){

        EditText edittext = this.findViewById(R.id.textView8);
        Questionarray.add(String.valueOf(edittext.getText()));

                Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void cancel(View v){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
