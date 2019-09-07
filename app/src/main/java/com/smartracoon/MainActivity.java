package com.smartracoon;


import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.smartracoon.utils.FileUtils;

public class MainActivity extends Activity {


    private static final int REQUEST_CODE = 6323; // onActivityResult request
    // code
    private EditText editTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput = findViewById(R.id.edit_text_input);
    }

    public void startService(View v) {
        String input = editTextInput.getText().toString();

        Intent serviceIntent = new Intent(this, SmartRacoonService.class);
        serviceIntent.setAction(SmartRacoonService.ACTION_START_FOREGROUND_SERVICE);
        serviceIntent.putExtra(SmartRacoonService.inputExtra, input);

        ContextCompat.startForegroundService(this, serviceIntent);
    }

    public void stopService(View v) {
        Intent serviceIntent = new Intent(this, SmartRacoonService.class);
        serviceIntent.setAction(SmartRacoonService.ACTION_STOP_FOREGROUND_SERVICE);

        stopService(serviceIntent);
    }

    public void showChooser(View v) {
        // Use the GET_CONTENT intent from the utility class
        Intent target = FileUtils.createGetContentIntent();
        // Create the chooser Intent
        Intent intent = Intent.createChooser(
                target, getString(R.string.chooser_title));
        try {
            startActivityForResult(intent, REQUEST_CODE);
        } catch (ActivityNotFoundException e) {
            // The reason for the existence of aFileChooser
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case REQUEST_CODE:
                // If the file selection was successful
                if (resultCode == RESULT_OK) {
                    if (data != null) {
                        // Get the URI of the selected file
                        final Uri uri = data.getData();
                        // Log.i(TAG, "Uri = " + uri.toString())
                        if (uri != null) {
                            try {
                                Intent serviceIntent = new Intent(this, SmartRacoonService.class);
                                serviceIntent.setAction(SmartRacoonService.ACTION_GPX_SERVICE);
                                serviceIntent.putExtra(SmartRacoonService.inputGPX, uri);
                                ContextCompat.startForegroundService(this, serviceIntent);
                            } catch (Exception e) {

                            }
                        }
                    }
                }
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}