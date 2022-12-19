package com.michael.pcl.pojo;

import java.io.Serializable;
import java.util.List;


public class Weather implements Serializable {

    private String precipitation;

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

}