package com.demos.retrofitgooglenearby.presenters;

import android.text.TextUtils;

import com.demos.retrofitgooglenearby.models.NearbyResponseDO;
import com.demos.retrofitgooglenearby.webservices.ApiClient;
import com.demos.retrofitgooglenearby.webservices.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NearbyPlacePresenter {

    NearbyResponseDO nearbyResponseDO;

    NearbyPlacePresenterInterface view;

    public NearbyPlacePresenter(NearbyPlacePresenterInterface view) {

        this.view = view;
        nearbyResponseDO = new NearbyResponseDO();
    }

    public void getNearbyPlaces(double latitude, double longitude, int radius, String type, String key) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        if (TextUtils.isEmpty(key))
            view.onFailure("Please pass a valid API key.");

        else if (TextUtils.isEmpty(type))
            view.onFailure("Please pass a valid type of places you are looking for.");

        else if (radius == 0)
            view.onFailure("Radius should be greater 0");

        else if ((latitude < -90 && latitude > 90) && (longitude < -180 && longitude > 180))
            view.onFailure("Please pass valid coordinates");

        else {
            String latLang = latitude + "," + longitude;

            Call<NearbyResponseDO> call = apiService.getNearbyPlaces(latLang, radius + "", type + "", key + "");
            call.enqueue(new Callback<NearbyResponseDO>() {
                @Override
                public void onResponse(Call<NearbyResponseDO> call, Response<NearbyResponseDO> response) {

                    if (response.body().getStatus().equalsIgnoreCase("OK"))
                        view.onSuccess(response.body());
                    else
                        view.onFailure(response.body().getErrorMessage());
                }

                @Override
                public void onFailure(Call<NearbyResponseDO> call, Throwable t) {
                    view.onFailure(t.toString());
                }
            });
        }

    }

    public interface NearbyPlacePresenterInterface {

        void onSuccess(NearbyResponseDO nearbyResponseDO);

        void onFailure(String message);
    }
}
