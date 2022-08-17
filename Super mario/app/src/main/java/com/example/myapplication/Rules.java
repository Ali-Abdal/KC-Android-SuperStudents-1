package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        Button playbtn = findViewById(R.id.btntogame);
        TextView username = findViewById(R.id.txtname);

        username.setShowSoftInputOnFocus(false);


        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("")){
                    Toast.makeText(Rules.this, "Make sure to set your name", Toast.LENGTH_SHORT).show();
                }

                else{

                    String plyername = username.getText().toString();
                    Intent next = new Intent(Rules.this, Mainpage.class );
                    next.putExtra("name", plyername);
                    startActivity(next);


            }}
        });
    }
}