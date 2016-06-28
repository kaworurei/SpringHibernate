package com.springhibernate.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/27.
 */
public class WebServiceUtil {




    public static void main (String[] args){
        String str=function("/bac/area/list","get",null);
        System.out.println(str);
    }

    private static  String LoaclHost="http://171.34.44.62:8084";

    public static String  function(String urlpath, String Method, Map<String,String> paramsMap) {
        HttpURLConnection httpURLConnection = null;
//        message=URLEncoder.encode(message, "UTF-8");
        try {
            if (Method.equalsIgnoreCase("Post")) {
                String url = LoaclHost + urlpath;
                httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);

                if (paramsMap != null && paramsMap.size() > 0) {
                    StringBuffer params = new StringBuffer();
                    for (String key : paramsMap.keySet()) {
                        params.append("&").append(key).append("=").append(paramsMap.get(key));
                    }
                    byte[] bytes = params.toString().substring(1).getBytes();
                    httpURLConnection.getOutputStream().write(bytes);
                }
            } else {
                String url = LoaclHost + urlpath;
                if (paramsMap != null && paramsMap.size() > 0) {
                    StringBuffer params = new StringBuffer();
                    for (String key : paramsMap.keySet()) {
                        params.append("&").append(key).append("=").append(paramsMap.get(key));
                    }
                    url = url + "?" + params.toString().substring(1);
                }
                httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setUseCaches(false);
            }
            if(httpURLConnection.getResponseCode()==200) {
                return new String(readInputStream(httpURLConnection.getInputStream()), "UTF-8");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                httpURLConnection = null;
            }
        }
        return "";
    }

    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while( (len = inStream.read(buffer)) !=-1 ){
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();//网页的二进制数据
        outStream.close();
        inStream.close();
        return data;
    }
}
