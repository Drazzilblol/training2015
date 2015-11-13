package se06.t02.propertiesReader;

import org.apache.commons.io.FileUtils;
import se06.t02.exceptions.PropertiesDoesntContainsKeyException;
import se06.t02.exceptions.PropertiesFileNotFoundException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Drazz on 09.11.2015.
 */
public class PropertiesReader {
    private Map<String, String> prop = new HashMap<>();

    public PropertiesReader(String path) {
        try {
            File f = new File(path);
            if (!f.exists()) {
                throw new PropertiesFileNotFoundException();
            }
            List<String> strList = FileUtils.readLines(f);
            for (String s : strList) {
                String[] pair = s.split("\\s*=\\s*");
                prop.put(pair[0], pair[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        if (!prop.containsKey(key)) {
            throw new PropertiesDoesntContainsKeyException();
        }
        return prop.get(key);
    }


}
