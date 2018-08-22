package com.jessicathornsby.actionandtabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabLayout tabLayout;
    TabItem tabContacts;
    TabItem tabMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabContacts = findViewById(R.id.tabContacts);
        tabLayout = findViewById(R.id.tablayout);
        tabMessages = findViewById(R.id.tabMessages);
        viewPager = findViewById(R.id.viewPager);

        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.my_action) {
            Toast.makeText(MainActivity.this,
                    "Action button clicked", Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);
    }

}
