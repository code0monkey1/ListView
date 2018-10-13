package com.example.chiranjeev.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

/**
 * Step 1 : Put a listView widget inside the layout
 * Step 2 : Define a listView , and  get the listView object by using the findViewById method
 * Step 3 : Create an array / arraylist with the strings ( names ) of your choice
 * Step 4 : next create an ArrayAdapter and the 1st argument is the context ( this ) ,
 * the second argument is the desired layout ( simple list item 1 ,in this case )
 * and the 3rd argument is the name of the array / arrayList object
 * Step 5: next connect the arrayAdapter object with the ListView by using the setAdapter() method
 * of List view and passing in teh arrayAdapter object
 * Step 6 : To enable something to happen when you click the items in a listView ,
 * use the listView's method OnItemClickListener () and pass in an Anonmymous AdapterView.onClickListener
 * and use the onItemClick  method
 *
 * Step 7 : in it which has 4 parameters , the 3rd parameter gives the index of the element,
 * you can use that to get the value of the element ,by using that index
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2:
        final ListView myListView = findViewById(R.id.myListView);

        // Step 3:
        final String names[] = {"At", "Tom", "Ta", "Chi"};

        // Step 4:
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);

        // Step 5:
        myListView.setAdapter(arrayAdapter);

        // Step 6:
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Step 7:
                Toast.makeText(MainActivity.this, names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
