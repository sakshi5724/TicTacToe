package com.example.saksham.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);

        turn=1;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn1.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn1.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn1.setText("0");
                    }
                }
                endgame();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn2.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn2.setText("0");
                    }
                }
                endgame();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn3.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn3.setText("0");
                    }
                }
                endgame();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn4.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn4.setText("0");
                    }
                }
                endgame();
            }
        }); btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn5.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn5.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn5.setText("0");
                    }
                }
                endgame();
            }
        }); btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn6.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn6.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn6.setText("0");
                    }
                }
                endgame();
            }
        }); btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn7.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn7.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn7.setText("0");
                    }
                }
                endgame();
            }
        }); btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn8.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn8.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn8.setText("0");
                    }
                }
                endgame();
            }
        }); btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn9.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        btn9.setText("X");
                    }else if(turn==2){
                        turn=1;
                        btn9.setText("0");
                    }
                }
                endgame();
            }
        });
    }
    public void endgame(){
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;
        a=btn1.getText().toString();
        b=btn2.getText().toString();
        c=btn3.getText().toString();
        d=btn4.getText().toString();
        e=btn5.getText().toString();
        f=btn6.getText().toString();
        g=btn7.getText().toString();
        h=btn8.getText().toString();
        i=btn9.getText().toString();


        if(a.equals("X")&& b.equals("X")&& c.equals("X")){
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_LONG).show();
            end=true;
        }

        if(a.equals("X")&& e.equals("X")&& i.equals("X")){
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_LONG).show();
            end=true;
        }

        if(a.equals(d)&& d.equals("X")&& g.equals("X")){
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals("X")&& e.equals("X")&& h.equals("X")){
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_LONG).show();
            end=true;
        }

        if(c.equals("X")&& f.equals("X")&& i.equals("X")){
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals("X")&& e.equals("X")&& f.equals("X")){
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals("X")&& h.equals("X")&& i.equals("X")){
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_LONG).show();
            end=true;
        }


        if(a.equals("0")&& b.equals("0")&& c.equals("0")){
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_LONG).show();
            end=true;
        }

        if(a.equals("0")&& e.equals("0")&& i.equals("0")){
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_LONG).show();
            end=true;
        }

        if(a.equals(d)&& d.equals("0")&& g.equals("0")){
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals("0")&& e.equals("0")&& h.equals("0")){
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_LONG).show();
            end=true;
        }

        if(c.equals("0")&& f.equals("0")&& i.equals("0")){
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals("0")&& e.equals("0")&& f.equals("0")){
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals("0")&& h.equals("0")&& i.equals("0")){
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_LONG).show();
            end=true;
        }
        if(end){
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        }

    }
}
