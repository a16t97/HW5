import com.logistics.garage.hw07.Bike;
import com.logistics.garage.hw07.Bus;
import com.logistics.garage.hw07.Car;
import com.logistics.garage.hw07.LandTrans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final String fileName = "resources/transport.csv";

    static String[] readFileUsingBufferedReader(String filename) {
        ArrayList<String> data = new ArrayList<String>();
        FileReader reader;

        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        var br = new BufferedReader(reader);

        String newLine;

        try{

        while ((newLine = br.readLine()) != null){
            data.add(newLine);
            }
        reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Arrays.copyOf(data.toArray(), data.size(), String[].class);
    }

    public static void main(String[] args) {
        String[] data = readFileUsingBufferedReader(fileName);
        System.out.println(data);

        for (int c = 1; c < data.length; c++) {
            var pieces = data[c].split(";"); // method split - щоб "побити" строку на підстроку
            LandTrans transport = null;
            switch (pieces[0].toLowerCase()) { //добавили эту строку в игнор - непонятно, в лекции был пример с enum
                case "bus":
                    transport = new Bus(pieces[0], pieces[1], Integer.parseInt(pieces[2]), Integer.parseInt(pieces[3]), Boolean.parseBoolean(pieces[4]));
                    break;
                case "car":
                    transport = new Car(pieces[0], pieces[1], Integer.parseInt(pieces[2]), Integer.parseInt(pieces[3]), Boolean.parseBoolean(pieces[4]));
                    break;
                case "bike":
                    transport = new Bike(pieces[0], pieces[1], Integer.parseInt(pieces[2]), Integer.parseInt(pieces[3]), Boolean.parseBoolean(pieces[4]));
                    break;
            }
            System.out.println("We have following car: " + transport);
        }
    }
}