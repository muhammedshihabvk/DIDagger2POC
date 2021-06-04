package com.shabsudemy.disample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkApi networkApi;

    Button clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickme =(Button) findViewById(R.id.clickme);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

//        injecting MyApplicationCOmponent to this class
        MyApplication.getAppComponent().inject(this);

        boolean injected = networkApi == null ? false : true;
        TextView userAvailable = (TextView) findViewById(R.id.injectStatusText);
        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected)+networkApi.hashCode());
    }
}