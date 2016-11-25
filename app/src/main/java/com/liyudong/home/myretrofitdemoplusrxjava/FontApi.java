package com.liyudong.home.myretrofitdemoplusrxjava;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Administrator on 2016/11/25.
 */
//http://118.178.142.34/YiQiHouse/HomeAD
public interface FontApi {
    @GET("/YiQiHouse/HomeAD")
    Call<FontPagePagerResponse> getFront();
}
