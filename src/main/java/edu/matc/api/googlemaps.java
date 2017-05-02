//package edu.matc.api;

import edu.matc.entity.Location;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.io.*;

/**
 * Created by student on 4/27/17.
 */
/**
public class googlemaps {

    //TODO Load properties in its own method
    Properties prop = new Properties();
    InputStream input = null;

    input = new FileInputStream("properties.properties");
    //load a properties file
    prop.load(input);
    String center = prop.getProperty("center");
    String zoomSize = prop.getProperty("zoomSize");
    String key = prop.getProperty("key");
    String googleMapsStaticEndpoint = prop.getProperty("googleMappsStaticEndPoint");


    Location location = new Location();
    //TODO makeMap cannot be void
    public void makeMap(List<Location> locations) throws MalformedURLException, IOException {

        //declares a random unique string to hold the value of the photo
        String fileName = UUID.randomUUID().toString() + ".PNG";

        //save photo to both location and db





        String urlLocations = createLocationsString(locations);

        //TODO make URL parts in properties file
        String parameters = center + zoomSize + urlLocations + key;
        String googleMappsStaticEndPoint = "https://maps.googleapis.com/maps/api/staticmap?";

        //add try catch later
        InputStream in = new URL(googleMappsStaticEndPoint + parameters).openStream();
        OutputStream out = new BufferedOutputStream(new FileOutputStream(fileName));
        out.write(in);

        //File Utils, works for deleting and adding to folder

        //add  to event
        //if event.getEventMap() is null,


    }

    public String createLocationsString(List <Location> locations){
        String urlLocations = "";
        for (Location location : locations){
            String label = location.getName();
            String address = location.getAddress();
            address.replace(' ', '+');
            //TODO lable param only can show one letter or num
            urlLocations = urlLocations + "&markers=color:red%7Clabel:" + label + "%7C" + address;
        }
        return urlLocations;
    }

    //example
    //https://maps.googleapis.com/maps/api/staticmap?center=Madison,WI&zoom=14&size=600x600&markers=color:blue|label:1|140+Iota+ct&markers=color:blue|label:S|10+n+livingston&key=AIzaSyBy_nDPQJnsmbKsZ0WSDlpDcnnfFVvzMN0
}

*/