package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Util {
    public static Object fetchPropertiesValues(String parameter) throws IOException {
        FileInputStream file = new FileInputStream("config/ApplicationConfig.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(parameter);
    }
}
