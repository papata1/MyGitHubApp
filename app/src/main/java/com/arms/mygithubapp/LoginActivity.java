package com.arms.mygithubapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    private EditText userName ;
    private Button Login;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.userName);
        Login = (Button) findViewById(R.id.Login);
    }
    public void getUserName(View view){
        intent = new Intent(LoginActivity.this, UserActivity.class );
        intent.putExtra("USER NAME" ,userName.getText().toString());
        startActivity(intent);

    }
}
