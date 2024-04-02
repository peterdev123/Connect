package com.example.vecinamidtermexamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Connect3 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19,
            btn20, btn21, btn22, btn23, btn24, btn25, btn26, btnRestart;

    TextView text;

    int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0;

    boolean turn = false;

    int[][] connectArray;

    boolean gameover = false;

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
        btn26 = (Button) findViewById(R.id.button26);
        btnRestart = (Button) findViewById(R.id.btnReset);

        text = (TextView) findViewById(R.id.textView7);

        connectArray = new int[5][5];

        //Initializing all elements in the 2D array to 0
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                connectArray[i][j] = 0;
            }
        }

        //Buttons stored in arraylists with their specific columns
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

        List<Button> clicked = new ArrayList<>();

        clicked.add(btn1);
        clicked.add(btn2);
        clicked.add(btn3);
        clicked.add(btn4);
        clicked.add(btn5);

        for (Button b : clicked) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (b == btn1) {
                        if (i1 < 5) {
                            if(connectArray[i1][0] == 0) {
                                if (checkTurn()) {
                                    coll1.get(i1).setBackgroundColor(Color.RED);
                                    connectArray[i1][0] = 1;
                                }else {
                                    coll1.get(i1).setBackgroundColor(Color.BLACK);
                                    connectArray[i1][0] = 2;
                                }
                                i1++;
                            }

                            if (i1 == 5) {
                                b.setEnabled(false);
                            }
                        }
                    }

                    if (b == btn2) {
                        if (i2 < 5) {
                            if (connectArray[i2][1] == 0) {
                                if (checkTurn()) {
                                    coll2.get(i2).setBackgroundColor(Color.RED);
                                    connectArray[i2][1] = 1;
                                } else {
                                    coll2.get(i2).setBackgroundColor(Color.BLACK);
                                    connectArray[i2][1] = 2;
                                }
                                i2++;
                            }

                            if (i2 == 5) {
                                b.setEnabled(false);
                            }
                        }
                    }

                    if (b == btn3) {
                        if (i3 < 5) {
                            if (connectArray[i3][2] == 0) {
                                if (checkTurn()) {
                                    coll3.get(i3).setBackgroundColor(Color.RED);
                                    connectArray[i3][2] = 1;
                                } else {
                                    coll3.get(i3).setBackgroundColor(Color.BLACK);
                                    connectArray[i3][2] = 2;
                                }
                                i3++;
                            }

                            if (i3 == 5) {
                                b.setEnabled(false);
                            }
                        }
                    }

                    if (b == btn4) {
                        if (i4 < 5) {
                            if (connectArray[i4][3] == 0) {
                                if (checkTurn()) {
                                    coll4.get(i4).setBackgroundColor(Color.RED);
                                    connectArray[i4][3] = 1;
                                } else {
                                    coll4.get(i4).setBackgroundColor(Color.BLACK);
                                    connectArray[i4][3] = 2;
                                }
                                i4++;
                            }

                            if (i4 == 5) {
                                b.setEnabled(false);
                            }
                        }
                    }

                    if (b == btn5) {
                        if (i5 < 5) {
                            if (connectArray[i5][4] == 0) {
                                if (checkTurn()) {
                                    coll5.get(i5).setBackgroundColor(Color.RED);
                                    connectArray[i5][4] = 1;
                                } else {
                                    coll5.get(i5).setBackgroundColor(Color.BLACK);
                                    connectArray[i5][4] = 2;
                                }
                                i5++;
                            }

                            if (i5 == 5) {
                                b.setEnabled(false);
                            }
                        }
                    }
                    if(checker(connectArray)) {
                        if (turn) {
                            text.setText("Player 1 Has Won!");
                        }else {
                            text.setText("Player 2 Has Won!");
                        }
                        for (Button bb : clicked) {
                            bb.setEnabled(false);
                        }

                        gameover = true;
                    }

                    if (!gameover) {
                        if (turn) {
                            text.setText("Player 2");
                            btn26.setBackgroundColor(Color.BLACK);
                        } else {
                            text.setText("Player 1");
                            btn26.setBackgroundColor(Color.RED);
                        }
                    }
                }
            });
        }
        //Restarts the game
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameover = false;

                for (Button b : clicked) {
                    b.setEnabled(true);
                }

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        connectArray[i][j] = 0;
                    }
                }

                text.setText("Player 1");
                btn26.setBackgroundColor(Color.RED);

                for (Button b1 : coll1) {
                    b1.setBackgroundColor(Color.WHITE);
                }

                for (Button b2 : coll2) {
                    b2.setBackgroundColor(Color.WHITE);
                }

                for (Button b3 : coll3) {
                    b3.setBackgroundColor(Color.WHITE);
                }

                for (Button b4 : coll4) {
                    b4.setBackgroundColor(Color.WHITE);
                }

                for (Button b5 : coll5) {
                    b5.setBackgroundColor(Color.WHITE);
                }

                i1 = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
        });
    }
    // Rotate turns and returns a boolean value
    private boolean checkTurn() {
        if (!turn) {
            turn = true;
            return true;
        }else {
            turn = false;
            return false;
        }
    }

    public boolean checker(int[][] array) {
        //Checks horizontally
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2]
                        && array[i][j] != 0 && array[i][j + 1] != 0 && array[i][j + 2] != 0) {
                    return true;
                }
            }
        }

        //Checks vertically
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                if (array[i][j] == array[i + 1][j] && array[i][j] == array[i + 2][j]
                        && array[i][j] != 0 && array[i + 1][j] != 0 && array[i + 2][j] != 0) {
                    return true;
                }
            }
        }

        //Checks Diagonally from bottomright to topleft
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == array[i + 1][j + 1] && array[i][j] == array[i + 2][j + 2]
                        && array[i][j] != 0 && array[i + 1][j + 1] != 0 && array[i + 2][j + 2] != 0) {
                    return true;
                }
            }
        }

        //Checks Diagonally from topright to bottomleft
        for (int i = 4; i >= 2; i--) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == array[i - 1][j + 1] && array[i][j] == array[i - 2][j + 2]
                        && array[i][j] != 0 && array[i - 1][j + 1] != 0 && array[i - 2][j + 2] != 0) {
                    return true;
                }
            }
        }

        return false;
    }
}