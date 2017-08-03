package ru.iitdgroup.app;

import org.apache.ignite.Ignition;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class IgniteStarter {

    public void init() {

//        Properties p = System.getProperties();
//        Enumeration keys = p.keys();
//        while (keys.hasMoreElements()) {
//            String key = (String)keys.nextElement();
//            String value = (String)p.get(key);
//            System.out.println(key + ": " + value);
//        }
        String path = System.getProperty("catalina.home") + "\\conf\\ignite-config.xml";
        Ignition.start(path);
//        Ignition.start();
    }
}
