package ru.iitdgroup.app;

import org.apache.ignite.Ignition;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class IgniteStarter {

    public void init() {
        URL url;
        try {
            url = new URL("file:/resources/ignite-config.xml");
            System.out.println(Paths.get(url.toURI()));
        } catch (Exception e){
            e.printStackTrace();
        }

        Ignition.start("/config/ignite-config.xml");
    }
}
