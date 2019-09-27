package com.demos.retrofitgooglenearby.views;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.demos.retrofitgooglenearby.Adapters.PlacesAdapter;
import com.demos.retrofitgooglenearby.R;
import com.demos.retrofitgooglenearby.models.NearbyResponseDO;
import com.demos.retrofitgooglenearby.presenters.NearbyPlacePresenter;

import butterknife.BindInt;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NearByPlacesActivity extends AppCompatActivity implements NearbyPlacePresenter.NearbyPlacePresenterInterface {


    @BindString(R.string.key)
    String key;

    @BindString(R.string.type)
    String type;

    @BindString(R.string.latitude)
    String latitude;

    @BindString(R.string.longitude)
    String longitude;

    @BindInt(R.integer.radius)
    int radius;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @BindView(R.id.tvTitle)
    TextView tvTitle;

    @BindView(R.id.rvPlaces)
    RecyclerView rvPlaces;


    NearbyPlacePresenter nearbyPlacePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nearby_places);
        ButterKnife.bind(this);
        rvPlaces.setLayoutManager(new LinearLayoutManager(this));
        nearbyPlacePresenter = new NearbyPlacePresenter(this);
        tvTitle.setText("Nearby " + type + " Stores");
        progressBar.setVisibility(View.VISIBLE);
        nearbyPlacePresenter.getNearbyPlaces(Double.parseDouble(latitude), Double.parseDouble(longitude), radius, type, key);
    }

    @Override
    public void onSuccess(NearbyResponseDO nearbyResponseDO) {
        progressBar.setVisibility(View.GONE);
        rvPlaces.setAdapter(new PlacesAdapter(nearbyResponseDO.getNearByPlaces()));
    }

    @Override
    public void onFailure(String message) {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
