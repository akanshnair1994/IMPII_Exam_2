package com.hexamind.retrofitevaluation1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/bins/tx23m")
    Call<JsonElement> getJson();
}