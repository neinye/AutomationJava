package theory.readingproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties{
    public static void main(String[] args) throws IOException {
        String path = "src/theory/readingproperties/testProperties.properties";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(path);

        prop.load(fis);
        System.out.println(prop.getProperty("key")+" " + prop.getProperty("name")+ " " + prop.getProperty("course"));


    }
}
