package ru.iitdgroup.app;

import org.apache.ignite.Ignition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IgniteStarter {

    private static final String PROPERTY_NAME = "catalina.home";
    private static final String SERVER_PATH = "\\conf\\ignite-config.xml";
    private boolean isOverwrite = false;
    private static final Logger LOG = LoggerFactory.getLogger(IgniteStarter.class);


    public void init() {

        Path path = Paths.get(System.getProperty(PROPERTY_NAME) + SERVER_PATH);
        if (!Files.exists(path) || isOverwrite) {
            writeConfig(path);
        }
        LOG.info("Ignite config taken from path " + path);

        Ignition.start(path.toString());

    }

    private void writeConfig(Path path) {

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Path innerConf = Paths.get(classLoader.getResource("ignite-config.xml").toURI());
            Files.copy(innerConf, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (URISyntaxException | IOException e) {
            LOG.error("Cannot replace ignite config.", e);
        }
    }


    public void finish() {
        Ignition.stopAll(true);
    }
}
