package com.example.vecinamidtermexamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Connect3 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19,
            btn20, btn21, btn22, btn23, btn24, btn25;

    TextView text;

    int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0;

    ArrayList<Boolean> col1, col2, col3, col4, col5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);

        Toast.makeText(Connect3.this, "Peter Sylvan L. Vecina", Toast.LENGTH_SHORT).show();

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn13 = (Button) findViewById(R.id.button13);
        btn14 = (Button) findViewById(R.id.button14);
        btn15 = (Button) findViewById(R.id.button15);
        btn16 = (Button) findViewById(R.id.button16);
        btn17 = (Button) findViewById(R.id.button17);
        btn18 = (Button) findViewById(R.id.button18);
        btn19 = (Button) findViewById(R.id.button19);
        btn20 = (Button) findViewById(R.id.button20);
        btn21 = (Button) findViewById(R.id.button21);
        btn22 = (Button) findViewById(R.id.button22);
        btn23 = (Button) findViewById(R.id.button23);
        btn24 = (Button) findViewById(R.id.button24);
        btn25 = (Button) findViewById(R.id.button25);

        col1 = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            col1.add(false);
        }

        col2 = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            col2.add(false);
        }

        col3 = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            col3.add(false);
        }

        col4 = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            col4.add(false);
        }

        col5 = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            col5.add(false);
        }

        ArrayList<Button> coll1 = new ArrayList<>();
        ArrayList<Button> coll2 = new ArrayList<>();
        ArrayList<Button> coll3 = new ArrayList<>();
        ArrayList<Button> coll4 = new ArrayList<>();
        ArrayList<Button> coll5 = new ArrayList<>();

        coll1.add(btn21);
        coll1.add(btn16);
        coll1.add(btn11);
        coll1.add(btn6);
        coll1.add(btn1);

        coll2.add(btn22);
        coll2.add(btn17);
        coll2.add(btn12);
        coll2.add(btn7);
        coll2.add(btn2);

        coll3.add(btn23);
        coll3.add(btn18);
        coll3.add(btn13);
        coll3.add(btn8);
        coll3.add(btn3);

        coll4.add(btn24);
        coll4.add(btn19);
        coll4.add(btn14);
        coll4.add(btn9);
        coll4.add(btn4);

        coll5.add(btn25);
        coll5.add(btn20);
        coll5.add(btn15);
        coll5.add(btn10);
        coll5.add(btn5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (; i1 < 5;) {
                    if(!col1.get(i1)) {
                        coll1.get(i1).setBackgroundColor(Color.RED);
                        i1++;
                        break;
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}