package com.my.visionbuilder.activities.Business.BusinessContacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;

public class AddBusinessContactsActivity extends AppCompatActivity {

    RelativeLayout back_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_business_contacts);

        back_Sign = findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}