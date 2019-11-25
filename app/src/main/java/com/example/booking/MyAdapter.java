package com.example.booking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter{

    Context context;
    ArrayList<Pojo>pojos;


    public MyAdapter(Context context,ArrayList<Pojo> pojos) {
        this.context = context;
        this.pojos = pojos;
    }


    @Override
    public int getCount() {
        return pojos.size();
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
    public View getView(final int position,View view,ViewGroup Parent) {
         view= LayoutInflater.from( context ).inflate( R.layout.activity_card_view,Parent,false );

        TextView title= view.findViewById( R.id.title );
        TextView description = view.findViewById( R.id.description );
        ImageView image= view.findViewById( R.id.image );


        title.setText(pojos.get(position).getTitle());
        description.setText(pojos.get( position ).getDescription());
        image.setImageResource(pojos.get(position).getImages());

         view.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText( context,"acaba de presionar"+position,Toast.LENGTH_SHORT ).show();
             }
         } );


        return view;
    }
}
