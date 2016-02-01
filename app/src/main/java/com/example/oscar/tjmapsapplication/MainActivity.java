package com.example.oscar.tjmapsapplication;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Obtener arreglo de strings desde los recursos
        String[] tagTitles = getResources().getStringArray(R.array.Tags);
        //Obtener drawer
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //Obtener listview
        ListView drawerList = (ListView) findViewById(R.id.left_drawer);

        //Nueva lista de drawer items
        ArrayList<DrawerItem> items = new ArrayList<DrawerItem>();
        items.add(new DrawerItem(tagTitles[0],R.drawable.ic_launcher));
        items.add(new DrawerItem(tagTitles[1],R.drawable.ic_launcher));
        items.add(new DrawerItem(tagTitles[2],R.drawable.ic_launcher));
        items.add(new DrawerItem(tagTitles[3],R.drawable.ic_launcher));
        items.add(new DrawerItem(tagTitles[4],R.drawable.ic_launcher));
        items.add(new DrawerItem(tagTitles[5],R.drawable.ic_launcher));

        // Relacionar el adaptador y la escucha de la lista del drawer
        //drawerList.setAdapter(new DrawerListAdapter(this, items));




    }

    public void irMapas(View view) {
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);

        //////////Oscar
    }







    public class DrawerItem {
        private String name;
        private int iconId;

        public DrawerItem(String name, int iconId) {
            this.name = name;
            this.iconId = iconId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIconId() {
            return iconId;
        }

        public void setIconId(int iconId) {
            this.iconId = iconId;
        }
    }

}
