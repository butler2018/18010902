package com.example.student.a18010902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);

//        menu.add(0,1,0,"ADD");  //參數(int groupId, int itemId, int order, int titleRes)
//        menu.add(0,2,0,"Edit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.menu_add:
                Toast.makeText(MainActivity.this,"使用者按下ADD按鈕"
                        ,Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_edit:
                Toast.makeText(MainActivity.this,"使用者按下Edit按鈕"
                        ,Toast.LENGTH_SHORT).show();
                break;


        }


        return super.onOptionsItemSelected(item);
    }


}
