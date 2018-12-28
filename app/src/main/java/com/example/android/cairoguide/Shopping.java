package com.example.android.cairoguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PharosFragment())
                .commit();

    }
}
