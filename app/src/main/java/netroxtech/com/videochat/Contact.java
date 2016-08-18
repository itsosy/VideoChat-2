package netroxtech.com.videochat;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Contact extends Activity {
    private String[] contacts = { "Abdullah", "Asad", "BILAL", "Husain", "harune", "abdulrehman", "umer malik"};

    private ListView monthsListView;
    private ArrayAdapter arrayAdapter;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        monthsListView = (ListView) findViewById(R.id.list);


        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts);
        monthsListView.setAdapter(arrayAdapter);
    }
}
