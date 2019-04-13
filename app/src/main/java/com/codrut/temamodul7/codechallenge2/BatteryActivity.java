package com.codrut.temamodul7.codechallenge2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.codrut.temamodul7.R;

public class BatteryActivity extends AppCompatActivity {

    private ImageView mBatteryImageView;
    private int mLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        initView();
    }

    private void initView() {
        mBatteryImageView = findViewById(R.id.batteryImageView);
    }

    public void increaseBatteryOnClick(View view) {
        if (mLevel < 100)
            mLevel += 25;
        mBatteryImageView.setImageLevel(mLevel);
    }

    public void decreaseBatteryOnClick(View view) {
        if (mLevel > 0)
            mLevel -= 25;
        mBatteryImageView.setImageLevel(mLevel);
    }
}
