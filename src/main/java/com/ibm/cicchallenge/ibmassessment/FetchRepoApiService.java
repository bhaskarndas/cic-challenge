package com.ibm.cicchallenge.ibmassessment;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * This service queries the SODA API for film data
 *
 * 
 */
public class FetchRepoApiService {

    
    private static final String AUTH_TOKEN = "";
    private static final String API_URL = "https://data.sfgov.org/resource/wwmu-gmzc.json";

   
    public List<RepoApiResponse> getFilmData(){
        return this.getFilmData(null);
    }

    
    public List<RepoApiResponse> getFilmData(String title){

        try {

            URL url;
            if(title != null && title.length() > 0){
                url = new URL(API_URL + "?title=" + URLEncoder.encode(title, "UTF-8"));
            } else {
                url  = new URL(API_URL);
            }

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("X-Auth-Token", AUTH_TOKEN);

            BufferedReader inputStreamReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = inputStreamReader.readLine()) != null) {
                response.append(line);
            }
            inputStreamReader.close();

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.toString(), new TypeReference<List<RepoApiResponse>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

}
