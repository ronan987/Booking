package com.example.booking;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CardViewActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Pojo> list;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.list_custom );

        listView = findViewById( R.id.lst1 );
        listShow();

        myAdapter = new MyAdapter( this,list );
        listView.setAdapter( myAdapter );

    }

    private void listShow() {
        list = new ArrayList<Pojo>();
        list.add( new Pojo( "Hotel san Martin","confortables Y comodas Habitaciones",R.drawable.hotelsanmartin ) );
        list.add( new Pojo( "Hotel toledo","confortables Y comodas Habitaciones",R.drawable.toledo ) );
        list.add( new Pojo( "Hotel Monasterio","confortables Y comodas Habitaciones",R.drawable.monasterio ) );
        list.add( new Pojo( "Hotel Camino Real","confortables Y comodas Habitaciones",R.drawable.caminoreal) );
    }
}
