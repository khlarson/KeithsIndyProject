package edu.matc.api;

import edu.matc.entity.Location;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

/**
 * Created by student on 4/27/17.
 */

public class Googlemaps {

    public String makeMap(List<Location> locations) throws MalformedURLException, IOException {
        String urlLocations = createLocationsString(locations);
        String parameters = "Madison,WI" + "&zoom=14&size=400x400" + urlLocations + "&key=AIzaSyBy_nDPQJnsmbKsZ0WSDlpDcnnfFVvzMN0";
        String googleMapsStaticEndPoint = "https://maps.googleapis.com/maps/api/staticmap?";
        InputStream in = new URL(googleMapsStaticEndPoint + parameters).openStream();
        //declares a random unique string to hold the value of the photo
        String fileName = UUID.randomUUID().toString() + ".PNG";
        Files.copy(in, Paths.get("../../../webapp/maps" + fileName));
        return fileName;
    }


    public String createLocationsString(List <Location> locations){
        String urlLocations = "";
        for (Location location : locations){
            String label = location.getName();
            String address = location.getAddress();
            address.replace(' ', '+');
            //TODO must replace all commas with empty
            //address.replace(',', "-");
            urlLocations = urlLocations + "&markers=color:red%7Clabel:" + label + "%7C" + address;
        }
        return urlLocations;
    }
    //example of working url
    //https://maps.googleapis.com/maps/api/staticmap?center=Madison,WI&zoom=14&size=600x600&markers=color:blue|label:1|140+Iota+ct&markers=color:blue|label:S|10+n+livingston&key=AIzaSyBy_nDPQJnsmbKsZ0WSDlpDcnnfFVvzMN0
}

