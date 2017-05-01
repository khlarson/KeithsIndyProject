package edu.matc.api;

import edu.matc.entity.Location;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Properties;

/**
 * Created by student on 4/27/17.
 */
public class googlemaps {

    //TODO Load properties in its own method
    Properties prop = new Properties();
    InputStream input = null;
	try {
        input = new FileInputStream("properties.properties");
        //load a properties file
        prop.load(input);
        String center = prop.getProperty("center");
        String zoomSize = prop.getProperty("zoomSize");
        String key = prop.getProperty("key");
        String googleMapsStaticEndpoint = prop.getProperty("googleMappsStaticEndPoint");
    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        if (input != null) {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    Location location = new Location();
	//TODO makeMap cannot be void
    public void makeMap(List<Location> locations){

        createLocationsString(locations);

        //TODO make URL parts in properties file
        String parameters = center + zoomSize + markers + key;

        String googleMappsStaticEndPoint = "https://maps.googleapis.com/maps/api/staticmap?";

        InputStream in = new URL(googleMappsStaticEndPoint + parameters).openStream();
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
