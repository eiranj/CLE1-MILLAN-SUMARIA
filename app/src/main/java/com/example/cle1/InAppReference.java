package com.example.cle1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class InAppReference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csv);

        //readAllData();                  // If you need to read the whole file row by row
        readDataByColumn();        // If you need to read specific column row by row
    }

    // Defining ordered collection as Income class
    // private List<Post> incomeList = new ArrayList<>();
    ArrayList<String> listDataArray;


    private void readDataByColumn() {
        // Read the raw csv file
        InputStream is = getResources().openRawResource(R.raw.data);

        // Reads text from character-input stream, buffering characters for efficient reading
        BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

        // Initialization
        String line = "";

        // Handling exceptions
        try {
            listDataArray = new ArrayList<>();
            // If buffer is not empty
            while ((line = br.readLine()) != null) {
                // use comma as separator columns of CSV
                String[] cols = line.split(",");

                // Print in logcat
                System.out.println("Column 0 = '" + cols[0] + "', Column 1 = '" + cols[1] + "', Column 2: '" + cols[2] + "'");
                listDataArray.add(cols[0]+ " " + cols[1]+ " " + cols[2]);
            }
        } catch (IOException e) {
            // Prints throwable details
            e.printStackTrace();
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listDataArray);
        ((ListView) findViewById(R.id.list)).setAdapter(arrayAdapter);

    }
}
