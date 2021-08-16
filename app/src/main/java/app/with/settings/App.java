/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app.with.settings;

import java.io.IOException;
import java.util.Properties;



public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        MyProperties properties = new MyProperties();
		try {
            Properties prop = properties.getPropValues();

            System.out.println("user="+prop.getProperty("user"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
