package com.example.mustafa.quickreader;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button quickReadButton = findViewById(R.id.readNowButton);
        quickReadButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editText = findViewById(R.id.editText);
        String toRead = editText.getText().toString();
        String[] words = toRead.split(" ");
        Intent intent = new Intent(this, TextViewer.class);
        startActivity(intent.putExtra("key",words));

    }
}
