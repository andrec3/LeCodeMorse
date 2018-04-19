package com.example.andre.tp3codemorse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainCodeMorse cm;

    private EditText txtAlpha;
    private EditText txtMorse;

    private Button btnPoint;
    private Button btnTrait;
    private Button btnEspace;
    private Button btnBarre;
    private Button btnEffacer;
    private Button btnJouer;

    private TextView txvFront;
    private TextView txvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cm = new MainCodeMorse();

        txtAlpha = findViewById(R.id.editTextTexte);
        txtMorse = findViewById(R.id.editTextCode);

        btnPoint = findViewById(R.id.btnPoint);
        btnTrait = findViewById(R.id.btnTrait);
        btnEspace = findViewById(R.id.btnEspace);
        btnBarre = findViewById(R.id.btnBarre);
        btnEffacer = findViewById(R.id.btnEffacer);
        btnJouer = findViewById(R.id.btnJouer);

        txvFront = findViewById(R.id.txvFront);
        txvBack = findViewById(R.id.txvBack);

        boolean clicked = false;

        txvBack.setText("Back-end par: " + cm.getNomProgrammeurs());

        //txtCode.setText(cm.toMorse(txtTexte.getText().toString()));
        //txtTexte.setText(cm.toMorse(txtCode.getText().toString()));




            txtAlpha.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    //txtMorse.setText(cm.toMorse(txtAlpha.getText().toString()));
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    //txtAlpha.setText(cm.toMorse(txtMorse.getText().toString()));

                    txtMorse.setText(cm.toMorse(txtAlpha.getText().toString()));

                }
            });



            txtMorse.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    txtAlpha.setText(cm.toMorse(txtMorse.getText().toString()));

                }
            });


    }


    public void insererPoint(View view){
        String p = txtMorse.getText().toString();
        txtMorse.setText(p + ".");
    }

    public void insererTrait(View view){
        String t = txtMorse.getText().toString();
        txtMorse.setText(t + "-");
    }

    public void insererEspace(View view){
        String e = txtMorse.getText().toString();
        txtMorse.setText(e + " ");
    }

    public void insererBarre(View view){
        String b = txtMorse.getText().toString();
        txtMorse.setText(b + "/");
    }

    public void effacerChamp(View view){
        txtAlpha.setText("");
        txtMorse.setText("");
    }


}
