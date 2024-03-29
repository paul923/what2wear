
package com.example.what2wear.models.weather;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Main {

    @SerializedName("temp")
    private Double temp;
    @SerializedName("feels_like")
    private Double feelsLike;
    @SerializedName("temp_min")
    private Double tempMin = 0.0;
    @SerializedName("temp_max")
    private Double tempMax = 0.0;
    @SerializedName("pressure")
    private Integer pressure;
    @SerializedName("humidity")
    private Integer humidity;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

}
