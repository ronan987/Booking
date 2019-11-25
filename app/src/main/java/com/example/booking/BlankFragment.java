package com.example.booking;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    EditText edtnombre, edthabitacion, calendar;
    Button btnbuscar;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate( R.layout.fragment_blank,container,false );
        edtnombre = view.findViewById( R.id.txtnombre );
        calendar = view.findViewById( R.id.calendar );
        edthabitacion = view.findViewById( R.id.txthabitacion );


      calendar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );

        btnbuscar = view.findViewById( R.id.btnbuscar );
        btnbuscar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getActivity(),"Enviando informacion...",Toast.LENGTH_SHORT ).show();
              //  Bundle bundle = new Bundle();

                // Inicializas el Intent
                Intent intent = new Intent(v.getContext(), MainActivity.class);

                // Información del EditText
              /*  EditText editText = (EditText) findViewById(R.id.editText);*/
                String nombre = edtnombre.getText().toString();
                String habitacion = edthabitacion.getText().toString();


              /*  // Agregas la información del EditText al Bundle
                bundle.putString("textFromActivityA", texto);
                // Agregas el Bundle al Intent e inicias ActivityB
                intent.putExtras(bundle);*/
                startActivity(intent);

            }
        } );
        return view;

    }
}
