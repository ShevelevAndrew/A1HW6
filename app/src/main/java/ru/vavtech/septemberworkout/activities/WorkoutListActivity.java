package ru.vavtech.septemberworkout.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ru.vavtech.septemberworkout.R;

public class WorkoutListActivity extends AppCompatActivity {
    public static final String TAG = "WorkoutListActivityLog" ;
    Button buttonPullingUp;
    Button buttonSquat;
    Button buttonBarbellBenchPress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_list);

        initGUI();
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"Вызван onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"Вызван onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"Вызван onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"Вызван onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"Вызван onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"Вызван onDestroy");
        super.onDestroy();
    }

    private void initGUI() {
        buttonPullingUp = findViewById(R.id.button_pulling_up);
        buttonSquat = findViewById(R.id.button_squat);
        buttonBarbellBenchPress = findViewById(R.id.button_barbell_bench_press);

        buttonPullingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(WorkoutListActivity.this,"Нажата кнопка "+getString(R.string.pulling_up),Toast.LENGTH_SHORT).show();
                Intent startWorkoutDetailActivity = new Intent(WorkoutListActivity.this, WorkoutDetailActivity.class);
                startWorkoutDetailActivity.putExtra("workout", "0");
                startActivity(startWorkoutDetailActivity);
            }
        });
        buttonSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startWorkoutDetailActivity = new Intent(WorkoutListActivity.this, WorkoutDetailActivity.class);
                startWorkoutDetailActivity.putExtra("workout", "1");
                startActivity(startWorkoutDetailActivity);
            }
        });
        buttonBarbellBenchPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startWorkoutDetailActivity = new Intent(WorkoutListActivity.this, WorkoutDetailActivity.class);
                startWorkoutDetailActivity.putExtra("workout", "2");
                startActivity(startWorkoutDetailActivity);
            }
        });

    }
}
