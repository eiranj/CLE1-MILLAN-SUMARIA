package com.example.cle1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    int [] images = {R.drawable.silverbracelet , R.drawable.goldnecklace ,
            R.drawable.silverearrings , R.drawable.goldring };
    String [] names = {"BRACELET" , "NECKLACE","EARRINGS","RING"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.listview);

        Button ref = findViewById(R.id.csv);
        ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                post();
            }
        });

        MyAdapter adapter = new MyAdapter();
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    startActivity(new Intent(MainActivity.this,Bracelet.class));

                }else if(position==1){

                    startActivity(new Intent(MainActivity.this,Necklace.class));

                }else if(position==2){

                    startActivity(new Intent(MainActivity.this,Earrings.class));

                }else{
                    startActivity(new Intent(MainActivity.this,Ring.class));
                }
            }
        });

    }
    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.items ,parent , false);
            TextView textView = convertView.findViewById(R.id.textview);
            ImageView imageView = convertView.findViewById(R.id.imageview);
            textView.setText(names[position]);
            imageView.setImageResource(images[position]);
            return  convertView;
        }
    }
    public void post(){
        Intent intent = new Intent(this, InAppReference.class);
        startActivity(intent);
    }
}