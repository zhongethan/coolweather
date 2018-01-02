package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhongyu on 2018/1/2.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int countyCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }
}
