package com.example.loginregisterapps;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface
{
    @GET("register.php")
    Call<User> performRegistrattion(@Query("name") String Name, @Query("user_name") String Username, @Query("user_password") String UserPassword);

    @GET("login.php")
    Call<User> performUserLogin( @Query("user_name") String Username, @Query("user_password") String UserPassword);
}
