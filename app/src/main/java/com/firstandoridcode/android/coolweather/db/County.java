package com.firstandoridcode.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Android Studio
 *
 * @author 45169
 * Date:2020-10-20
 * Description:
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public County(int id, String countyName, String weatherId, int cityId) {
        this.id = id;
        this.countyName = countyName;
        this.weatherId = weatherId;
        this.cityId = cityId;
    }
}
