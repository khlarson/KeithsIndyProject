package edu.matc.api;

import edu.matc.entity.Location;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * Created by student on 4/27/17.
 */
public class googlemaps {

    Location location = new Location();

    public ??? makeMap(List<Location> locations){
        //TODO might not be an int
        List <Integer> location_coordinates;

        for (Location loc : locations) {
            location_coordinates.add(loc.getCoordinates());
        }

        //TODO make URL parts in properties file
        InputStream in = new URL(googleMappsEndPoint + location_coordinates).openStream();
    }

}
