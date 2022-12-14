package com.dam.apprendrefraais;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    private int nbAleatoire;
    private String tag, tagAttendu;
    private int i = 0;
    private Button button;
    private String s;
    Handler handler = new Handler();

    private void generateRandomNumber() throws InterruptedException {
        Random rand = new Random();
        nbAleatoire = rand.nextInt(26) + 1;

    }

    public void gestionDuClic(View view) throws InterruptedException {
        button.setText("Prononce");
        do {

            generateRandomNumber(); // Définiton du nombre aléatoire
//                // Lecture du texte en fonction du chiffre random

            switch (nbAleatoire) {
                case 1:
                    // Lancer la lecture du morceau a.mp3
                    tagAttendu = "a";// Tag attendu
                    break;
                case 2:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "b";// Tag attendu
                    break;
                case 3:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "c";// Tag attendu
                    break;
                case 4:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "d";// Tag attendu
                    break;
                case 5:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "e";// Tag attendu
                    break;
                case 6:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "f";// Tag attendu
                    break;
                case 7:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "g";// Tag attendu
                    break;
                case 8:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "h";// Tag attendu
                    break;
                case 9:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "i";// Tag attendu
                    break;
                case 10:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "j";// Tag attendu
                    break;
                case 11:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "k";// Tag attendu
                    break;
                case 12:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "l";// Tag attendu
                    break;
                case 13:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "m";// Tag attendu
                    break;
                case 14:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "n";// Tag attendu
                    break;
                case 15:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "o";// Tag attendu
                    break;
                case 16:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "p";// Tag attendu
                    break;
                case 17:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "q";// Tag attendu
                    break;
                case 18:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "r";// Tag attendu
                    break;
                case 19:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "s";// Tag attendu
                    break;
                case 20:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "t";// Tag attendu
                    break;
                case 21:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "u";// Tag attendu
                    break;
                case 22:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "v";// Tag attendu
                    break;
                case 23:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "w";// Tag attendu
                    break;
                case 24:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "x";// Tag attendu
                    break;
                case 25:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "y";// Tag attendu
                    break;
                case 26:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "z";// Tag attendu
                    break;
            }

            MediaPlayer mediaPlayer = MediaPlayer.create(this,
                    getResources().getIdentifier(tagAttendu, "raw", getPackageName()));
            mediaPlayer.start();
            Log.i(TAG, "tagAttend: " + tagAttendu);


            i++;
            Runnable runnable = new Runnable() {

                @Override
                public void run() {
                    handler.postDelayed(runnable, 3000);
                }
            };

//            public void run_codes () {
//                handler.postDelayed(runnable, 3000);
//
//            }
        }  while (i < 26);


//

            if ( i == 26){

                    Toast.makeText(this, "Partie finie", Toast.LENGTH_SHORT).show();
                    nouveauTest();
                }}


                public void nouveauTest () {

                    button.setText("Nouveau Test");
                    i = 0;
                }

                public void reponseClic (View view){
                    ImageView imageViewPresse = (ImageView) view;
                    tag = imageViewPresse.getTag().toString();
                    Log.i(TAG, "gestionDuClic: " + tag);
                    if (tag.equals(tagAttendu)) {
                        s = s + 1; // ou s++
                        Log.i(TAG, "myRandom: " + s);
                        Toast.makeText(this, "Bonne réponse", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(this, "Essai encore !", Toast.LENGTH_SHORT).show();
                    }
                }


//        / Mettre une pause pour attendre le clic de l'utilisateur




                /// Après le clic de l'utilisateur vérifier s'il a bon et recommencer
//        Log.i(TAG,"tagClique: "+tag);
//        Log.i(TAG,"tagAttendu: "+tagAttendu);

//            if (tag.equals(tagAttendu)) {
//                s = s + 1; // ou s++
//                Log.i(TAG, "myRandom: " + s);
//
//
//            } else {
//                s = s + 0;
//                Log.i(TAG, "myRandom: " + s);
//


                @Override
                protected void onCreate (Bundle savedInstanceState){
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main2);
//        myRandom();
                    button = findViewById(R.id.proId);




                }


    }
