package edu.badpals.examenfinalpdmm.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import edu.badpals.examenfinalpdmm.Helpers;
import edu.badpals.examenfinalpdmm.R;

public class activity_menu_principal extends AppCompatActivity {

    private Toolbar tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        tb = findViewById(R.id.toolbar);
        Helpers.cargarToolbar(this, tb);

    }
}