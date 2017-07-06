package com.example.admin.greekwetlandkerkinitour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhotosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galery_list);

        // Create a list of photos
        final ArrayList<Galery> galeries = new ArrayList<Galery>();
        galeries.add(new Galery(R.drawable.fragma_kerkini));
        galeries.add(new Galery(R.drawable.lake_kerkini));
        galeries.add(new Galery(R.drawable.limanaki_kerkini));
        galeries.add(new Galery(R.drawable.mountains_lake_kerkini));
        galeries.add(new Galery(R.drawable.pagkaki_kerkini));
        galeries.add(new Galery(R.drawable.view_kerkini));


        // Create an {@link GaleryAdapter}, whose data source is a list of {@link Galery}s. The
        // adapter knows how to create list items for each item in the list.
        GaleryAdapter adapter = new GaleryAdapter(this, galeries, R.color.category_photos);

        // Find the {@link ListView} object in the view hierarchy of the {@link Food}.
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
                Intent infoIntent = new Intent(PhotosActivity.this, InfoActivity.class);
                // Start the new activity
                startActivity(infoIntent);
                finish();
            }
        });

    }
}
