package com.arms.mygithubapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.arms.mygithubapp.model.User;
import com.arms.mygithubapp.res.ApiClient;
import com.arms.mygithubapp.res.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserActivity extends AppCompatActivity {

    Bundle bundle;
    String userNameInfo;
    TextView LogIn;

    TextView name;
    TextView company;
    TextView place;
    TextView email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        name = (TextView) findViewById(R.id.name);
        company = (TextView) findViewById(R.id.company);
        place = (TextView) findViewById(R.id.place);
        email = (TextView) findViewById(R.id.email);


        bundle = getIntent().getExtras();
        userNameInfo = bundle.getString("USER NAME");
       // Toast.makeText(this,userNameInfo,Toast.LENGTH_LONG).show();
        LogIn = (TextView) findViewById(R.id.uName);
        LogIn.setText(userNameInfo);
        loadUSer();
    }

    public void loadUSer(){

        final ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<User> call = apiInterface.getUser(userNameInfo);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                name.setText("Username : " +response.body().getName());
                LogIn.setText("LogIn : " +response.body().getLogin());
                place.setText("Location : " +response.body().getPlace());
                company.setText("company : " +response.body().getCompany());
                email.setText("email : " +response.body().getEmail());


            }

            @Override
            public void onFailure(Call<User> call, Throwable throwable) {

            }
        });
    }


}
