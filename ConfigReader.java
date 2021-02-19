package Mentoring.Framework;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties configFile;

    static {
        String path = "Batch7.properties";

        try{
            FileInputStream input = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(input);
            input.close();

            } catch (Exception e) {
            System.out.println(e.getMessage());

            }
        }

        public static String getProperty(String keyValue){
        return configFile.getProperty(keyValue);

        }


    }

