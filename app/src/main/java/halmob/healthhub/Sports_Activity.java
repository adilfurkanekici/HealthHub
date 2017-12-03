package halmob.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Sports_Activity extends AppCompatActivity {
    private Button addSportRecordButton;
    private Button ListSportRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_);

        ListSportRecord = findViewById(R.id.sportRecord_Button);
        ListSportRecord.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sports_Activity.this, ListBodyWorkSportRecordActivity.class);
                startActivity(i);
            }
        });

        addSportRecordButton = findViewById(R.id.addSportRecord);
        addSportRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sports_Activity.this, addNewSportRecordActivity.class);
                startActivity(i);
            }
        });
    }
}
