package com.example.tharushashehan.ermsapp04;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by Tharusha Shehan on 6/11/2016.
 */
public class httpManagerJson{
        public static ArrayList getData(String uri) {
            //This doesn't needed anymore because HttpJsonParser class has done the trick
            //and it is finalized as the usung class

            ArrayList<String> items = new ArrayList<String>();
            BufferedReader reader = null;

            try {
                URL url = new URL(uri);

                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                //StringBuilder sb = new StringBuilder();
                reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String line;

                while ((line = reader.readLine()) != null) {
                    JSONArray jar = new JSONArray(line);
                    for (int i = 0; i < jar.length(); i++) {
                        JSONObject job = (JSONObject) jar.get(i);
                        items.add(job.getString("text"));
                    }
                }
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return items;
        }
}