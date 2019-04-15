package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuitarTutorialActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_tutorial);
        button1 = (Button) findViewById(R.id.buttonhome);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                //openMainActivity();
            }
        });
    }
    public void openMainActivity () {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
