package com.example.hellotoastapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Hello Toast");
        }

        mTextView = findViewById(R.id.textView);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        buttonToast.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_LONG).show());

        buttonCount.setOnClickListener(v -> {

            mCount++;
            mTextView.setText(String.valueOf(mCount));
        });
    }
}