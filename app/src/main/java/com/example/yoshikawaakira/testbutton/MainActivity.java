package com.example.yoshikawaakira.testbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);


        textView = findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag) {

                    textView.setText("Hello");

                    flag = false;
                }

                else {

                    textView.setText("World");
                    flag = true;
                }
            }
        });
    }
}
