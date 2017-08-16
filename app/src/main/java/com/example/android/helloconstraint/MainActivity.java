/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Displays two buttons and a text view.
 * - Pressing the TOAST button shows a toast.
 * - Pressing the COUNT button increases the displayed mCount and also change the bg color.
 * - Pressing the RESET button reset the count to 0 in mCount and also change the bg color.
 * <p>
 * Note: Fixing behavior when device is rotated is a challenge exercise for the student.
 */

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    @BindView(R.id.show_count) TextView mShowCount;
    @BindView(R.id.button_count) Button btnCount;
    @BindView(R.id.btn_rst_count) Button btnResetCount;

    int primaryColor;
    int lightGray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        primaryColor = Color.parseColor("#3F51B5");
        lightGray = Color.parseColor("#d3d3d3");

        btnResetCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When Reset Button pressed. Set count to 0 and display the text
                mCount = 0;
                mShowCount.setText(Integer.toString(mCount));

                // change the background of Count button to primary Color
                btnCount.setBackgroundColor(primaryColor);
                // change the background of Reset button to light Gray
                v.setBackgroundColor(lightGray);
            }
        });
    }

    /**
     * Increments the number in the text view when the COUNT button is clicked.
     * Change the background color of the RESET Button
     * Change the background color of the Count Button
     * @param view The view that triggered this onClick handler.
     *             Since the count always appears in the text view, the passed in view is not used.
     */
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        // change the background color of the RESET button
        btnResetCount.setBackgroundColor(Color.RED);

        // change the bg color of the COUNT Button
        view.setBackgroundColor(Color.GREEN);
    }

    /**
     * Shows a toast when the TOAST button is clicked.
     *
     * @param view The view that triggered this onClick handler.
     *             Since a toast always shows on the top, the passed in view is not used.
     */
    public void showToast(View view) {
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(this, R.string.toast_button_toast, duration);
        toast.show();
    }
}
