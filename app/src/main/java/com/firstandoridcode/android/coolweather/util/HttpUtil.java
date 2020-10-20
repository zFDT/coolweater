package com.firstandoridcode.android.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Android Studio
 *
 * @author 45169
 * Date:2020-10-20
 * Description:
 */
public class HttpUtil {
    public static void sendOkHttpRequset(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
