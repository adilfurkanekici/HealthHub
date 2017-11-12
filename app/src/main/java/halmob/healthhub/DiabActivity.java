package halmob.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import halmob.healthhub.Models.BloodSugar;

public class DiabActivity extends AppCompatActivity {
    private ImageButton insulinButton;
    private ImageButton bloodSugarButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diab);

        insulinButton = findViewById(R.id.insulin_button);
        insulinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiabActivity.this, InsulinActivity.class);
                startActivity(i);
            }
        });

        bloodSugarButton = findViewById(R.id.blood_sugar_button);
        bloodSugarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiabActivity.this, BloodSugarActivity.class);
                startActivity(i);
            }
        });

    }

}