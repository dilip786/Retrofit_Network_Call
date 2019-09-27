package com.demos.retrofitgooglenearby.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlaceDo {

    @SerializedName("geometry")
    private GeometryDO geometry;

    @SerializedName("icon")
    private String icon;

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("place_id")
    private String placeId;

    @SerializedName("rating")
    private Double rating;

    @SerializedName("types")

    private List<String> types = null;
    @SerializedName("user_ratings_total")

    private Integer userRatingsTotal;
    @SerializedName("vicinity")

    private String vicinity;

    public GeometryDO getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryDO geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }


    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }


    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Integer getUserRatingsTotal() {
        return userRatingsTotal;
    }

    public void setUserRatingsTotal(Integer userRatingsTotal) {
        this.userRatingsTotal = userRatingsTotal;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }
}
