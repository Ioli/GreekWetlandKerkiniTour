package com.example.admin.greekwetlandkerkinitour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;


public class ActionsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galery_list);


        // Create a list of action benefits
        final ArrayList<Galery> galeries = new ArrayList<Galery>();
        galeries.add(new Galery(R.string.action_title_one, R.string.action_adress_one));
        galeries.add(new Galery(R.string.action_title_two, R.string.action_adress_two));
        galeries.add(new Galery(R.string.action_title_three, R.string.action_adress_three));
        galeries.add(new Galery(R.string.action_title_four, R.string.action_adress_four));
        galeries.add(new Galery(R.string.action_title_five, R.string.action_adress_five));
        galeries.add(new Galery(R.string.action_title_six, R.string.action_adress_six));
        galeries.add(new Galery(R.string.action_title_sev, R.string.action_adress_sev));
        galeries.add(new Galery(R.string.action_title_eight, R.string.action_adress_eight));
        galeries.add(new Galery(R.string.action_title_nine, R.string.action_adress_nine));

        // Create an {@link GaleryAdapter}, whose data source is a list of {@link Galery}s. The
        // adapter knows how to create list items for each item in the list.
        GaleryAdapter adapter = new GaleryAdapter(this, galeries, R.color.category_actions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link GaleryAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Galery} in the list.
        listView.setAdapter(adapter);

        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will be executed when the info image is clicked on.
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Create a new intent to open the {@link InfoActivity}
                Intent infoIntent = new Intent(ActionsActivity.this, InfoActivity.class);
                // Start the new activity
                startActivity(infoIntent);
                finish();
            }
        });

    }
}


