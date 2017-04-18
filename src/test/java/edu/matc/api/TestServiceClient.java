package edu.matc.api;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.Assert.*;

/**
 * Created by Khlarson on 2/28/17.
 */
public class TestServiceClient {

    //TODO rename this test if Response Media Type != json
    @Test
    public void testGoogleApiJSON() throws Exception {
        //Gives ability to make a  call to an external service
        Client client = ClientBuilder.newClient();
        WebTarget target =

                //TODO get target (URI + resource + parameters) from google places api
                client.target("http://maps.googleapis.com/maps/api/geocode/json?" +
                        "address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&sensor=false");

        //TODO MediaType... This needs to be changed to what the web service will respond in, either xml or json
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        assertEquals("???", response);
    }
}