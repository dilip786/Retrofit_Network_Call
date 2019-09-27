package com.demos.retrofitgooglenearby.models;

import com.google.gson.annotations.SerializedName;

public class GeometryDO {

    @SerializedName("location")
    private LocationDO location;

    public LocationDO getLocation() {
        return location;
    }

    public void setLocation(LocationDO location) {
        this.location = location;
    }

}
