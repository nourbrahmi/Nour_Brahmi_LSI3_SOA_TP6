package com.example.Nour_Brahmi_LSI3_SOA_TP6;
import org.springframework.context.annotation.Bean;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;


public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet =new ResourceConfig();
        jerseyServlet .register(CompteRestJaxRSAPO.class);
                return jerseyServlet;
    }
}
