package com.example.what2wear.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {
  private static Retrofit retrofit;

  private HttpClient() {

  }

  public static Retrofit getClient(String url) {
    if (retrofit == null) {
      retrofit = new Retrofit.Builder()
              .baseUrl(url)
              .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
              .addConverterFactory(GsonConverterFactory.create())
              .build();
    }
    return retrofit;
  }
}
