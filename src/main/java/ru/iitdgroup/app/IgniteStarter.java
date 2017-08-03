package ru.iitdgroup.app;

import org.apache.ignite.Ignition;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class IgniteStarter {

    public void init() {

        String path = System.getProperty("catalina.home") + "\\conf\\ignite-config.xml";
        Ignition.start(path);

    }

    public void finish(){
        Ignition.stopAll(true);
    }
}
