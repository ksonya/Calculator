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
    private Button buttonAdd;
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

        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = 0;
                op = 2;
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
                render();
            }
        });

        resultView = (TextView) findViewById(R.id.resultView);
    }

    private void render() {
        resultView.setText(Long.toString(a));
    }

}
