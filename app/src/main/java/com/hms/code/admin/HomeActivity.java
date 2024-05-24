package com.hms.code.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hms.R;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_activity_home);
    }

    //login for admin, chef, hall manager
    public void onClickReg(View v) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    //customer's interface
    public void onClickReg2(View v) {
        Intent i = new Intent(this, com.hms.code.order.MainActivity.class);
        startActivity(i);
    }

}
