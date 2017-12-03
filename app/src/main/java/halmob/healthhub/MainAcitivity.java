package halmob.healthhub;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class MainAcitivity extends BaseActivity implements View.OnClickListener {
    private Button followButton;
    private Button stepCounter;
    private Button trackMedicineButton;
    private Button diabetesButton;
    private Button sportsPageButton;
    private Button profilePageButton;
    private Button logoutButton;
    private Button sampleRead;
    private Button cameraDemo;
    private Button Report;
    private Button MedicalAnalysisButton;
    private Button HearthRateButton;
    private Button UserSearch;
    private DatabaseReference mPersonRef;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mPersonRef = FirebaseUtil.getPeopleRef();
        followButton = findViewById(R.id.follow);
        followButton.setOnClickListener(this);
        stepCounter = findViewById(R.id.step_counter);
        stepCounter.setOnClickListener(this);
        trackMedicineButton = findViewById(R.id.track_medicine);
        trackMedicineButton.setOnClickListener(this);
        HearthRateButton = findViewById(R.id.heart_rate_button);
        HearthRateButton.setOnClickListener(this);
        diabetesButton = findViewById(R.id.diabetes_button);
        diabetesButton.setOnClickListener(this);
        sportsPageButton = findViewById(R.id.sportsPage_button);
        sportsPageButton.setOnClickListener(this);
        profilePageButton = findViewById(R.id.profilePage_button);
        profilePageButton.setOnClickListener(this);
        logoutButton = findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(this);
        sampleRead = findViewById(R.id.sample_button);
        sampleRead.setOnClickListener(this);
        cameraDemo = findViewById(R.id.camera_demo_button);
        cameraDemo.setOnClickListener(this);
        Report = findViewById(R.id.report_button);
        Report.setOnClickListener(this);
        MedicalAnalysisButton = findViewById(R.id.medical_analysis_page);
        MedicalAnalysisButton.setOnClickListener(this);
        UserSearch = findViewById(R.id.user_search_button);
        UserSearch.setOnClickListener(this);

        // camera permission
        if (checkSelfPermission(android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{android.Manifest.permission.CAMERA}, 111);
        }

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.follow:
                FirebaseTransaction.follow("GldLQw9wyiV2wvfDo6OiMi2QhFa2");
                break;
            case R.id.step_counter:
                intent = new Intent(this, StepCounterActivity.class);
                startActivity(intent);
                break;
            case R.id.track_medicine:
                intent = new Intent(this, MedicineMainActivity.class);
                startActivity(intent);
                break;
            case R.id.diabetes_button:
                intent = new Intent(this, DiabActivity.class);
                startActivity(intent);
                break;
            case R.id.sportsPage_button:
                intent = new Intent(this, Sports_Activity.class);
                startActivity(intent);
                break;
            case R.id.profilePage_button:
                intent = new Intent(this, ProfilePageActivity.class);
                intent.putExtra("userId",FirebaseUtil.getCurrentUserId());
                startActivity(intent);
                break;
            case R.id.sample_button:
                intent = new Intent(this, SampleReadActivity.class);
                startActivity(intent);
                break;
            case R.id.camera_demo_button:
                intent = new Intent(this, CameraDemoActivity.class);
                startActivity(intent);
                break;
            case R.id.report_button:
                intent = new Intent(this, ReportActivity.class);
                startActivity(intent);
                break;
            case R.id.logout_button:
                signOut();
                break;
            case R.id.user_search_button:
                intent = new Intent(this, UserSearchActivity.class);
                startActivity(intent);
                break;
            case R.id.medical_analysis_page:
                intent = new Intent(this, MedicalAnalysisActivity.class);
                startActivity(intent);
                break;
            case R.id.heart_rate_button:
                intent = new Intent(this, HeartRateMonitorActivity.class);
                startActivity(intent);
                break;
        }
    }
    private void signOut() {
        // Firebase sign out
        FirebaseAuth.getInstance().signOut();

        /*// Google sign out
        Auth.GoogleSignInApi.signOut(LoginActivity.mGoogleApiClient).setResultCallback(
                new ResultCallback<Status>() {
                    @Override
                    public void onResult(@NonNull Status status) {
                        finish();
                    }
                });*/
        finish();
        System.exit(0);
    }



}

