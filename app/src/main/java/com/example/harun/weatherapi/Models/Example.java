package com.example.harun.weatherapi.Models;

import android.location.Location;
import android.service.notification.Condition;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Harun on 30.10.2017.
 */

public class Example {
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("current")
    @Expose
    private Current current;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Example withLocation(Location location) {
        this.location = location;
        return this;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Example withCurrent(Current current) {
        this.current = current;
        return this;
    }


}
