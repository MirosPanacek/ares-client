package com.github.mirospanacek.ares.test;

import com.github.mirospanacek.ares.model.AresClient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

import com.github.mirospanacek.ares.model.pojo.RootOfRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AresCilentTest{
    private static final Logger LOG = 
            LoggerFactory.getLogger(AresCilentTest.class);
    
    private String ico = "46981691";
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

    @Test
    public void mapToRootTest() throws IOException, InterruptedException, URISyntaxException {
        AresClient client = new AresClient();
        HttpResponse<String> response = client.search(ico);
        RootOfRequest root = client.getResult(response);
        LOG.info(response.body());
        LOG.info(root.getEconomicEntities().getFirst().toString());
        assertThat(root.getEconomicEntities().size()).isEqualTo(1);
        assertThat(root.getEconomicEntities().getFirst().toString()).contains("Lužkovice");
    }
}
