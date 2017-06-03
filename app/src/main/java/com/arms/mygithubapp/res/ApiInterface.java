package com.arms.mygithubapp.res;

import com.arms.mygithubapp.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by 52-511-01 on 31/3/2560.
 */

public interface ApiInterface {

    @GET("/users/{user}")
    Call<User> getUser(@Path("user")String user);

}
