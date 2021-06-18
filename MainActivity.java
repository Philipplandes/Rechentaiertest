package de.bookseven.techniktv.rechnetrainertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView ergebnisprufung, zahl1, zahl2, zeichen;
    RadioButton minus, plus, geteilt, mal;
    Button felderfulen, berechne;
    EditText ergebnis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ergebnisprufung = findViewById(R.id.prüfen);
        zahl1 = findViewById(R.id.zahl1);
        zahl2 = findViewById(R.id.zahl2);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.radioButton2);
        geteilt = findViewById(R.id.radioButton3);
        mal = findViewById(R.id.radioButton4);
        felderfulen = findViewById(R.id.button);
        berechne = findViewById(R.id.button2);
        ergebnis = findViewById(R.id.ergebnis);
        zeichen = findViewById(R.id.zeichen);


        final Random myRandom = new Random();

        felderfulen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (minus.isChecked()) {
                    zahl1.setText(String.valueOf(myRandom.nextInt(50)));
                    zahl2.setText(String.valueOf(myRandom.nextInt(50)));

                    Integer z1 = Integer.parseInt(zahl1.getText().toString());
                    Integer z2 = Integer.parseInt(zahl2.getText().toString());

                    ergebnisprufung.setText(String.valueOf(z1 - z2));

                    zeichen.setText("-");

                } else if (plus.isChecked()) {
                    zahl1.setText(String.valueOf(myRandom.nextInt(20)));
                    zahl2.setText(String.valueOf(myRandom.nextInt(20)));

                    Integer z1 = Integer.parseInt(zahl1.getText().toString());
                    Integer z2 = Integer.parseInt(zahl2.getText().toString());

                    ergebnisprufung.setText(String.valueOf(z1 + z2));

                    zeichen.setText("+");

                } else if (geteilt.isChecked()) {
                    zahl1.setText(String.valueOf(myRandom.nextInt(100)));
                    zahl2.setText(String.valueOf(myRandom.nextInt(100)));

                    Integer z1 = Integer.parseInt(zahl1.getText().toString());
                    Integer z2 = Integer.parseInt(zahl2.getText().toString());

                    ergebnisprufung.setText(String.valueOf(z1 / z2));

                    zeichen.setText("/");
                } else if (mal.isChecked()) {
                    zahl1.setText(String.valueOf(myRandom.nextInt(15)));
                    zahl2.setText(String.valueOf(myRandom.nextInt(20)));

                    Integer z1 = Integer.parseInt(zahl1.getText().toString());
                    Integer z2 = Integer.parseInt(zahl2.getText().toString());

                    ergebnisprufung.setText(String.valueOf(z1 * z2));

                    zeichen.setText("*");
                } else {
                    Toast.makeText(MainActivity.this, "Es würde kein Rechenzeichen ausgewält ", Toast.LENGTH_LONG).show();

                }

            }
        });


        berechne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (geteilt.isChecked()) {

                    TextView Feld4 = findViewById(R.id.ergebnis);
                    TextView Feld3 = findViewById(R.id.prüfen);


                    if (TextUtils.isEmpty(Feld4.getText().toString())) {
                        Toast.makeText(MainActivity.this, "bitte tragen sie das ergebnis ein", Toast.LENGTH_LONG).show();


                    } else if (Feld4.getText().toString().equals(Feld3.getText())) {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist richtig", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    } else {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist Falsch bitte nocheinmal ", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    }

                } else if (plus.isChecked()) {

                    TextView Feld4 = findViewById(R.id.ergebnis);
                    TextView Feld3 = findViewById(R.id.prüfen);


                    if (TextUtils.isEmpty(Feld4.getText().toString())) {
                        Toast.makeText(MainActivity.this, "bitte tragen sie das ergebnis ein", Toast.LENGTH_LONG).show();


                    } else if (Feld4.getText().toString().equals(Feld3.getText())) {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist richtig", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    } else {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist Falsch bitte nocheinmal ", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    }
                } else if (mal.isChecked()) {

                    TextView Feld4 = findViewById(R.id.ergebnis);
                    TextView Feld3 = findViewById(R.id.prüfen);


                    if (TextUtils.isEmpty(Feld4.getText().toString())) {
                        Toast.makeText(MainActivity.this, "bitte tragen sie das ergebnis ein", Toast.LENGTH_LONG).show();


                    } else if (Feld4.getText().toString().equals(Feld3.getText())) {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist richtig", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    } else {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist Falsch bitte nocheinmal ", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    }
                } else if (minus.isChecked()) {

                    TextView Feld4 = findViewById(R.id.ergebnis);
                    TextView Feld3 = findViewById(R.id.prüfen);


                    if (TextUtils.isEmpty(Feld4.getText().toString())) {
                        Toast.makeText(MainActivity.this, "bitte tragen sie das ergebnis ein", Toast.LENGTH_LONG).show();


                    } else if (Feld4.getText().toString().equals(Feld3.getText())) {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist richtig", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    } else {
                        Toast.makeText(MainActivity.this, "Das Ergebnis " + Feld4.getText() + " ist Falsch bitte nocheinmal ", Toast.LENGTH_LONG).show();
                        Feld4.setText("");


                    }
                } else {
                    Toast.makeText(MainActivity.this, "Es ist ein feler aufgekommen ", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}