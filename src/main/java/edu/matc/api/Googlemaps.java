package edu.matc.api;

import edu.matc.entity.Location;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class Googlemaps {

    public String makeMap(List<Location> locations) throws MalformedURLException, IOException {
        String urlLocations = createLocationsString(locations);
        String googleMapsStaticEndPoint = "https://maps.googleapis.com/maps/api/staticmap?Madison,WI&zoom=14&size=600x600" + urlLocations + "&key=AIzaSyBy_nDPQJnsmbKsZ0WSDlpDcnnfFVvzMN0";
        System.out.println("my formatted endpoint:" + googleMapsStaticEndPoint);
        InputStream in = new URL(googleMapsStaticEndPoint).openStream();
        //declares a random unique string to hold the value of the photo
        String fileName = UUID.randomUUID().toString() + ".PNG";
        Path saveDestination = Paths.get("KeithsIndyProject/src/main/webapp/maps/" + fileName);
        Files.copy(in, saveDestination, REPLACE_EXISTING);
        return fileName;
    }


    public String createLocationsString(List <Location> locations){
        String urlLocations = "";
        for (Location location : locations){
            String label = ".";
            String address = location.getAddress();
            address = address.replace(",", "");
            address = address.replace(' ', '+');
            System.out.println(address);
            urlLocations = urlLocations + "&markers=color:red|label:" + label + "|" + address;
        }
        System.out.println("Upon leaving createLocationString, urlLocations=" +urlLocations);
        return urlLocations;
    }
    //example of working url
    //https://maps.googleapis.com/maps/api/staticmap?center=Madison,WI&zoom=14&size=600x600&markers=color:blue|label:1|140+Iota+ct&markers=color:blue|label:S|10+n+livingston&key=AIzaSyBy_nDPQJnsmbKsZ0WSDlpDcnnfFVvzMN0
}

