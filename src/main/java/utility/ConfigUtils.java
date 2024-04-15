package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
    public static Properties props;
    public static void LoadProperties() {
        try
        {
            props = new Properties();
            String filepath = "./src/test/resources/config.properties";
            FileInputStream in = new FileInputStream(filepath);
            props.load(in);
        }catch (IOException e)
        {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
