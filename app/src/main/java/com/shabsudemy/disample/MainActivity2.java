package com.shabsudemy.disample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {

    @Inject
    NetworkApi networkApi;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        injecting MyApplicationCOmponent to this class
        MyApplication.getAppComponent().inject(this);

        textView =(TextView) findViewById(R.id.textView2);
        textView.setText(String.valueOf(networkApi.hashCode()));


    }
}