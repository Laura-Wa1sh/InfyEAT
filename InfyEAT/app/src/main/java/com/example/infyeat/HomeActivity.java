package com.example.infyeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button custButton;
    private Button vendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Button for customer login page
        custButton = (Button)findViewById(R.id.custButton);
        custButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }

        });

        //Button for vendor login page
        vendButton = (Button)findViewById(R.id.vendButton);
        vendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNavigationActivity();
            }

        });

    }

    public void openLoginActivity(){
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }

    public void openVendorLoginActivity(){
        Intent loginIntent = new Intent(this, VendorLoginActivity.class);
        startActivity(loginIntent);
    }

    public void openNavigationActivity(){
        Intent loginIntent = new Intent(this, NavigationActivity.class);
        startActivity(loginIntent);
    }
}
