package com.example.sudhanshu.mynanodegreeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String message;
    Button spotify;
    Button scores;
    Button library;
    Button build;
    Button reader;
    Button myOwn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotify = (Button)findViewById(R.id.button);
        scores = (Button)findViewById(R.id.button2);
        library = (Button)findViewById(R.id.button3);
        build = (Button)findViewById(R.id.button4);
        reader = (Button)findViewById(R.id.button5);
        myOwn = (Button)findViewById(R.id.button6);
        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        build.setOnClickListener(this);
        reader.setOnClickListener(this);
        myOwn.setOnClickListener(this);


//        spotify.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showToastMessage("This button will launch spotify streamer");
//            }
//        });
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button :
                showToastMessage("This button will launch spotify streamer");
                break;

            case R.id.button2 :
                Log.i("TAG", "button 2");
                showToastMessage("This button will launch scores app");
                break;

            case R.id.button3 :
                showToastMessage("This button will launch library app");
                break;

            case R.id.button4 :
                showToastMessage("This button will launch build app");
                break;

            case R.id.button5 :
                showToastMessage("This button will launch readers app");
                break;

            case R.id.button6 :
                showToastMessage("This button will launch my own app");
                break;

            default:
                break;


        }

    }

    public void showToastMessage(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}
