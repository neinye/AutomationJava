package theory.java.readingproperties;
/***
 * 1. create an object of the Properties class
 *      Properties class helps Java to understand what is a properties file.
 *      It does not read the file.
 *      when creating a prop file, always use the .properties extension
 * 2. create an object of the FileInputStream class, which accepts a properties file
 *      This class is used to read the file
 * 3. load() reads a property list (key & element) from the input byte stream. The specified stream remains open after
 *      this method returns.
 * 4. getProperty() searches for the property with the specified key in the property list.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties{
    public static void main(String[] args) throws IOException {
        String path = "src//theory//readingproperties//testProperties.properties";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(path);

        prop.load(fis);
        System.out.println(prop.getProperty("key")+" " + prop.getProperty("name")+ " " + prop.getProperty("course"));
    }
}
