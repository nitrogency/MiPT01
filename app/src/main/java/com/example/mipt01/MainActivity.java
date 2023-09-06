package com.example.mipt01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvHello = (TextView)findViewById(R.id.tvHello);
    }

    public void onBtnChangeTextClick(View view){
        tvHello.setText("Hello");
    }
}