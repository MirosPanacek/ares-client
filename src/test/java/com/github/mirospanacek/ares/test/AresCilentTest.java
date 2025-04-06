package com.github.mirospanacek.ares.test;

import com.github.mirospanacek.ares.model.AresClient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AresCilentTest{
    private static final Logger LOG = 
            LoggerFactory.getLogger(AresCilentTest.class);
    
    private String ico = "74807374"; 
    @Test
    public void buildRequestTest() {
        AresClient client = new AresClient();
        String requst = client.requestBodyBuilder(ico);
        assertThat(requst).contains(ico);
    }
    
    @Test
    public void searchTest() throws IOException, InterruptedException, URISyntaxException {
        AresClient client = new AresClient();
        HttpResponse<String> response = client.search(ico);
        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.body()).contains(ico);
        LOG.info(response.body());
    }
}
