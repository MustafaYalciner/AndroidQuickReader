package com.example.mustafa.quickreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ProcessTextActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CharSequence text = getIntent()
                .getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT);
        String[] words = text.toString().split(" ");
        Intent intent = new Intent(this, TextViewer.class);
        startActivity(intent.putExtra("key",words));

    }
}
