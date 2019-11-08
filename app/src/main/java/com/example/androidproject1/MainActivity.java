
package com.example.androidproject1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity <questionstv> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
public void randomquestion(){



    Questionarray.add("If you could go anywhere in the world, where would you go?");
    Questionarray.add("If you were stranded on a desert island");
    Questionarray.add("what three things would you want to take with you?");

    Questionarray.add("If you could eat only one food for the rest of your life; what would that be?");
    Questionarray.add("If you won a million dollars, what is the first thing you would buy?");
    Questionarray.add("If you could spend the day with one fictional character, who would it be?");
    Questionarray.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");

    TextView questiontv = findViewById(R.id.textView3);
    Random r = new Random();
    String randomElement = Questionarray.get(r.nextInt(Questionarray.size()));
    questiontv.setText(randomElement);



}

    public static ArrayList<String> Questionarray = new ArrayList<String>();


    int count = 0;


    //used to create final activity screen
    public void finish(View view) {

        Intent intent = new Intent(this, Finish.class);
        startActivity(intent);
    }
    //used to create final activity screen


    //opens second activity screen
    public void newactivity(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    //opens second activity screen

    public void roll_the_dice(View view) {


        EditText editText = this.findViewById(R.id.textView5);
        TextView arrayText = this.findViewById(R.id.textView6);
        TextView tv = this.findViewById(R.id.textView);
        TextView tv2 = this.findViewById(R.id.textView2);



        if (view.getId() ==R.id.button2) {
     randomquestion();

        }
        else {

            Random R = new Random();
            int random1 = 0;
            while (true) {
                random1 = R.nextInt(6);
                if (random1 != 0) break;


            }

            tv.setText(Integer.toString(random1));
            int num1 = Integer.parseInt(editText.getText().toString()); // user's input being changed from number to integer to be accepted by edit textview


            if ((num1 < 1 || num1 > 6) == false) { // if condition to test is number within range of 1 to 6

            } else Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();


            if (num1 == random1) {

                count++;

                tv2.setText(Integer.toString(count));


                Toast.makeText(this, "Congratulation", Toast.LENGTH_SHORT).show();


            }


        }

        }


    }

//used to roll the dice and check if the user input is the same value

//used to roll the dice and check if the user input is the same value



