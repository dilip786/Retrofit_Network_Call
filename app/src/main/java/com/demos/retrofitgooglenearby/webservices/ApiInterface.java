package com.demos.retrofitgooglenearby.webservices;

import com.demos.retrofitgooglenearby.models.NearbyResponseDO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("place/nearbysearch/json")
    abstract Call<NearbyResponseDO> getNearbyPlaces(@Query("location") String location,
                                                    @Query("radius") String radius,
                                                    @Query("type") String type,
                                                    @Query("key") String key);
}
