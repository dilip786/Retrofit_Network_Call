package com.demos.retrofitgooglenearby.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NearbyResponseDO {

    @SerializedName("error_message")
    private String error_message;

    @SerializedName("next_page_token")
    private String nextPageToken;

    @SerializedName("results")
    private List<PlaceDo> places = null;

    @SerializedName("status")
    private String status;

    public String getErrorMessage() {
        return error_message;
    }


    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public List<PlaceDo> getNearByPlaces() {
        return places;
    }

    public void setResults(List<PlaceDo> results) {
        this.places = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setErrorMessage(String errorMessage) {
        this.status = status;
    }
}
