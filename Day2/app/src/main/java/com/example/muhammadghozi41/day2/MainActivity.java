package com.example.muhammadghozi41.day2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.muhammadghozi41.day2.adapter.ListMenuAdapter;
import com.example.muhammadghozi41.day2.model.ListMenuItem;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ListView listView = (ListView) findViewById(R.id.list_menu);
        ArrayList<ListMenuItem> listMenuItems = createSampleMenu();
        final ListMenuAdapter listMenuAdapter = new ListMenuAdapter(MainActivity.this, R.layout.list_menu_layout, listMenuItems);
        listView.setAdapter(listMenuAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String label = listMenuAdapter.getItem(i).getLabel().toString();
                Toast.makeText(MainActivity.this, label, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private ArrayList<ListMenuItem> createSampleMenu() {
        ListMenuItem item1 = new ListMenuItem(1, "http://icons.iconarchive.com/icons/designcontest/ecommerce-business/256/wallet-icon.png", "Check Balance", "check your balance");
        ListMenuItem item2 = new ListMenuItem(2, "http://icons.iconarchive.com/icons/awicons/vista-artistic/256/coin-add-icon.png", "Top Up", "top up your balance");
        ListMenuItem item3 = new ListMenuItem(3, "http://icons.iconarchive.com/icons/graphicloads/colorful-long-shadow/256/Cart-icon.png", "Shopping cart", "go to shopping cart");
        ListMenuItem item4 = new ListMenuItem(4, "http://icons.iconarchive.com/icons/ampeross/qetto-2/256/profile-icon.png", "Profile", "check your profile");
        ListMenuItem item5 = new ListMenuItem(5, "http://icons.iconarchive.com/icons/ampeross/qetto-2/256/settings-icon.png", "Setting", "go to setting");
        ArrayList<ListMenuItem> list = new ArrayList<ListMenuItem>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);

        return list;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
