package com.mynasmah.circle;

import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ANAS on 2/22/2018.
 */

public class MainActivity extends AppCompatActivity {

    // init count
    int mCount  = 0;
    // step counter
    int mStep   = 1;

    private TextView mTextView;
    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.textView);
        mProgress = findViewById(R.id.ProgressCircle);

        // Minimum Counter
        mProgress.setProgress(0);

        // Maximum Counter
        mProgress.setMax(100);

        // Even OnClick
        mProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            mCount = (mCount < 100) ?  mCount * mStep :  0;

            mProgress.setProgress(mCount);
            mTextView.setText(String.valueOf(mCount));

            }
        });

    }
}
