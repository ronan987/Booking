package com.example.booking;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    ArrayList<String> Hoteles;

    EditText edthabitacion;
    TextView calendar, txtbusqueda;
    Button btnbuscar;

    //String almanaque = " / /";

    private int bDay, bMonth, bYear;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate( R.layout.fragment_blank,container,false );


        txtbusqueda = view.findViewById( R.id.txtbusqueda );
        calendar = view.findViewById( R.id.calendar );
        edthabitacion = view.findViewById( R.id.txthabitacion );


        txtbusqueda.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hoteles = new ArrayList<>();

                Hoteles.add( "Hotel San Martin" );
                Hoteles.add( "Hotel toledo" );
                Hoteles.add( "Hotel Monasterio" );
                Hoteles.add( "Hotel Camino Real" );
                Hoteles.add( "Alcayata" );
                Hoteles.add( "Hotel San Geronimo" );

                ArrayAdapter<String> adapter = new ArrayAdapter<String>( getActivity(),
                        R.layout.support_simple_spinner_dropdown_item,Hoteles );
               // setListAdapter( Adapter );


            }
        } );



      //  calendar.setText( almanaque );
        calendar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                bDay = calendar.get( Calendar.DAY_OF_MONTH );
                bMonth = calendar.get( Calendar.MONTH );
                bYear = calendar.get( Calendar.YEAR );

                DatePickerDialog datePickerDialog = new DatePickerDialog( getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view,int year,int month,int dayOfMonth) {
                        //calendar.(dayOfMonth+"/"+(month+1)+"/"+year);
                    }


                },bYear,bMonth,bDay );
                datePickerDialog.show();

            }
        } );

        btnbuscar = view.findViewById( R.id.btnbuscar );
        btnbuscar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getActivity(),"Enviando informacion...",Toast.LENGTH_SHORT ).show();
                //  Bundle bundle = new Bundle();

                // Inicializas el Intent
                Intent intent = new Intent( v.getContext(),MainActivity.class );

                // Información del EditText
                /*  EditText editText = (EditText) findViewById(R.id.editText);*/
                // String nombre = edtnombre.getText().toString();
                String habitacion = edthabitacion.getText().toString();


              /*  // Agregas la información del EditText al Bundle
                bundle.putString("textFromActivityA", texto);
                // Agregas el Bundle al Intent e inicias ActivityB
                intent.putExtras(bundle);*/
                startActivity( intent );

            }
        } );
        return view;
    }

    public void onListItemClick(ListView l,View view,int position,long id) {
        //super.onListItemClick( l,view,position,id );
        Toast.makeText( getActivity(),"ha seleccionado"+Hoteles.get( position ),Toast.LENGTH_SHORT ).show();
    }

}
