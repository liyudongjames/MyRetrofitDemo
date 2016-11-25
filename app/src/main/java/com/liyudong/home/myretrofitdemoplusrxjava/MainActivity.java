package com.liyudong.home.myretrofitdemoplusrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://118.178.142.34")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FontApi api = retrofit.create(FontApi.class);
        Call<FontPagePagerResponse> call = api.getFront();
        call.enqueue(new Callback<FontPagePagerResponse>() {
            @Override
            public void onResponse(Response<FontPagePagerResponse> response, Retrofit retrofit) {
                Log.d("response", "onResponse: " + response.body().toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("response", "onResponse: " + t.toString());
            }
        });
    }
}
