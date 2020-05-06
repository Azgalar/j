package com.example.movil_juego;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    //TextView carta1,carta2,carta3,carta4,carta5,carta6;
    ImageView carta1,carta2,carta3,carta4,carta5,carta6;
    Button jugar,salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        carta1.setVisibility(View.INVISIBLE);
        carta2.setVisibility(View.INVISIBLE);
        carta3.setVisibility(View.INVISIBLE);
        carta4.setVisibility(View.INVISIBLE);
        carta5.setVisibility(View.INVISIBLE);
        carta6.setVisibility(View.INVISIBLE);





        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RelativeLayout myLayout =
                        (RelativeLayout)findViewById(R.id.);

                myLayout.setOnTouchListener(
                        new RelativeLayout.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent m) {
                                handleTouch(m);
                                return true;
                            }
                        }
                );

            }
        });





    }
    void handleTouch(MotionEvent m)
    {
        carta1 = findViewById();
        carta2 = findViewById();
        carta3 = findViewById();
        carta4 = findViewById();
        carta5 = findViewById();
        carta6 = findViewById();

            int action = m.getActionMasked();
            String actionString;


            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    if (carta1.isPressed() == true && carta2.isPressed() == true)  {
                        cartasAcertadas();
                    }
                    if (carta3.isPressed() == true && carta4.isPressed() == true){
                        cartasAcertadas();
                    }
                    if (carta5.isPressed() == true && carta6.isPressed() == true){
                        cartasAcertadas();
                    }
                    actionString = "Presionando Carta";
                    break;

                default:
                    actionString = "";
            }
    }



    private  void cartasAcertadas(){

        if (carta1.getResources() == R.mipmap.  && carta2.getResources() == R.mipmap.){

            carta1.setVisibility(View.VISIBLE);
            carta2.setVisibility(View.VISIBLE);
        }

             if (carta3.getResources() ==  R.mipmap. && carta4.getResources() == R.mipmap.){

                 carta3.setVisibility(View.VISIBLE);
                 carta4.setVisibility(View.VISIBLE);
            }
             if (carta5.getResources() ==  R.mipmap. && carta6.getResources() == R.mipmap.){

                 carta5.setVisibility(View.VISIBLE);
                 carta6.setVisibility(View.VISIBLE);

            }

        else{

            Toast.makeText();

        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }



    /*private void radomCarts(){
       // Random ram = new Random();
        //ram.nextInt(10);

        List random = new ArrayList();

        ArrayList r = new ArrayList();



        random.add(R.drawable.ic_launcher_background);

        Collections.shuffle(random);


        //carta12.setImageResource(random.indexOf(1)) == random.indexOf(1);



        if (random.indexOf(0) == random.indexOf(0)) {



        }

        if (){

        }

    }*/
}
