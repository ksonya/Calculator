package ru.appcampsiberia.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private long b = 0;
    private long a = 0;

    // 0 = ничего
    // 1 = сложение
    // 2 = умножение
    private int op = 0;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button buttonC;
    private Button button9;
    private Button buttonSq;
    private Button button0;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMul;
    private Button buttonDone;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 1;
                render();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 2;
                render();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 3;
                render();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 4;
                render();
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 5;
                render();
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 6;
                render();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 7;
                render();
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 8;
                render();
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10 + 9;
                render();
            }
        });


        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * 10;
                render();
            }
        });

        buttonC = (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 0;
                render();
            }
        });

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = 0;
                op = 1;
                render();
            }
        });


        buttonSub= (Button) findViewById(R.id.buttonSub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = 0;
                op = 3;
                render();
            }
        });     buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = 0;
                op = 2;
                render();

            }
        });
        buttonSq = (Button) findViewById(R.id.buttonSq);
        buttonSq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a * a;
                render();
            }
        });
        buttonDone = (Button) findViewById(R.id.buttonDone);
        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 1) {
                    a = a + b;
                    op = 0;
                }
                if (op == 2) {
                    a = a * b;
                    op = 0;
                }
                if (op == 3){
                    a = b - a;
                    op = 0;
                }
                render();
            }
        });

        resultView = (TextView) findViewById(R.id.resultView);
    }

    private void render() {

        resultView.setText(Long.toString(a));

    }

}
