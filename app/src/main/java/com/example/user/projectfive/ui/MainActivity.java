package com.example.user.projectfive.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.user.projectfive.R;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Жизненый цикл Activity";
    private Button mStartService;
    private Button mStopService;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartService = (Button) findViewById(R.id.btn_start_service);
        mStopService = (Button) findViewById(R.id.btn_stop_service);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

        Toast.makeText(getApplicationContext(), "Activity onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate");

        mStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressBar.setVisibility(ProgressBar.VISIBLE);
                startService(new Intent(MainActivity.this, ExampleService.class));
            }
        });

        mStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressBar.setVisibility(ProgressBar.INVISIBLE);
                stopService(new Intent(MainActivity.this, ExampleService.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "Activity onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "Activity onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "Activity onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "Activity onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "Activity onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "Activity onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy()");
    }
}
