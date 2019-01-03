package com.example.mustafa.quickreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;

public class TextViewer extends AppCompatActivity {

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_viewer);
        final Intent currentIntent = getIntent();
        final String[] words = currentIntent.getStringArrayExtra("key");
        final EditText editText = findViewById(R.id.editText2);
        final Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (currentIndex == words.length) {
                            cancel();
                            return;
                        }
                        editText.setText(words[currentIndex++]);

                    }
                });
            }
        }, 0, 200);
    }
}
