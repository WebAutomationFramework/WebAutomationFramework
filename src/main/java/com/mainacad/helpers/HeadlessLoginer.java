package com.mainacad.helpers;

import com.mainacad.user_management.UserCredentials;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HeadlessLoginer {
    public static void performLogin (UserCredentials user, WebDriver driver) {

        // Get session id
        Set<Cookie> allcookies = driver.manage().getCookies();
        String jSessionId = "";
        for (Cookie c: allcookies) {
            if(c.getName().equals("JSESSIONID")){
                jSessionId = c.getValue();
                break;
            }
        }

        // Create cookie
        BasicCookieStore cookieStore = new BasicCookieStore();
        BasicClientCookie cookie = new BasicClientCookie("JSESSIONID", jSessionId);
        cookie.setDomain("52.210.246.113");
        cookie.setPath("/jpetstore");
        cookieStore.addCookie(cookie);

        // Create httpclient and set cookie for it
        HttpClient httpclient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        HttpPost httppost = new HttpPost("http://52.210.246.113:8080/jpetstore/actions/Account.action");

        // Set request parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("username", user.getUsername()));
        params.add(new BasicNameValuePair("password", user.getPassword()));
        params.add(new BasicNameValuePair("signon", "Login"));
        try {
            httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //Execute
        try {
            httpclient.execute(httppost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
