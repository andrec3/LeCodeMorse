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

    private EditText txtTexte;
    private EditText txtCode;

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

        txtTexte = (EditText) findViewById(R.id.editTextTexte);
        txtCode = (EditText) findViewById(R.id.editTextCode);

        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnTrait = (Button) findViewById(R.id.btnTrait);
        btnEspace = (Button) findViewById(R.id.btnEspace);
        btnBarre = (Button) findViewById(R.id.btnBarre);
        btnEffacer = (Button) findViewById(R.id.btnEffacer);
        btnJouer = (Button) findViewById(R.id.btnJouer);

        txvFront = (TextView) findViewById(R.id.txvFront);
        txvBack = (TextView) findViewById(R.id.txvBack);

        txvFront.setText("txvFront: " + cm.getNomProgrammeurs());

        txtTexte.addTextChangedListener(watcher);
        //txtCode.addTextChangedListener(watcher);



    }

    TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if(txtTexte.hasFocus() == true){
                txtCode.setText(cm.toMorse(txtTexte.getText().toString()));
            }else if(txtTexte.hasFocus() == false){
                txtTexte.setText(cm.toMorse(txtCode.getText().toString()));
            }
            //txtCode.setText(cm.toMorse(txtTexte.getText().toString()));
            //txtTexte.setText(cm.toMorse(txtCode.getText().toString()));
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }
    };


    public void insererPoint(View view){
        String p = txtCode.getText().toString();
        txtCode.setText(p + ".");
    }

    public void insererTrait(View view){
        String t = txtCode.getText().toString();
        txtCode.setText(t + "-");
    }

    public void insererEspace(View view){
        String e = txtCode.getText().toString();
        txtCode.setText(e + " ");
    }

    public void insererBarre(View view){
        String b = txtCode.getText().toString();
        txtCode.setText(b + "/");
    }

    public void effacerChamp(View view){
        txtTexte.setText("");
        txtCode.setText("");
    }


}
