package com.example.writers_pad;

import static com.example.writers_pad.MainActivity.url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
  public static  RetrofitInstance instance;

ApiInterface apiInterface;

    public RetrofitInstance() {

        Retrofit retrofit= new Retrofit.Builder().
                baseUrl(url).addConverterFactory(GsonConverterFactory.create())
                .build();
       apiInterface= retrofit.create(ApiInterface.class);

    }

    public static RetrofitInstance getInstance() {

        if(instance==null){
             instance=new RetrofitInstance();
        }
        return instance;
    }
}

