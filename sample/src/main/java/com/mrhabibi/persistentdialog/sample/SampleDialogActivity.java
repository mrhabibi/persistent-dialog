package com.mrhabibi.persistentdialog.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mrhabibi.persistentdialog.DialogActivity;

/**
 * Created by mrhabibi on 4/28/17.
 */

public class SampleDialogActivity extends DialogActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_dialog);
    }
}
