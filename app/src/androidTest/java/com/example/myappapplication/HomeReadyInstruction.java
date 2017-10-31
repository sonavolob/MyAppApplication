package com.example.myappapplication;

import android.app.Activity;
import android.support.test.InstrumentationRegistry;
import android.widget.Button;
import android.widget.TextView;

import com.azimolabs.conditionwatcher.Instruction;

/**
 * Created by bolovanos on 10/31/2017.
 */

public class HomeReadyInstruction extends Instruction {
    @Override
    public String getDescription() {
        return "Waint until home Text is visible.";
    }

    @Override
    public boolean checkCondition() {

        Activity activity = ((TestApplication)
                InstrumentationRegistry.getTargetContext().getApplicationContext()).getCurrentActivity();
        if (activity == null) return false;

        TextView textView =  (TextView) activity.findViewById(R.id.message);

        return textView != null && textView.getText().equals(R.string.title_home);

    }
}
