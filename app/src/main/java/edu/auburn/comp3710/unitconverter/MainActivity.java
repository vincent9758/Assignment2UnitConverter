package edu.auburn.comp3710.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtK, txtM, txtKG, txtL,txtLi, txtG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtK = findViewById(R.id.txtK);
        txtM = findViewById(R.id.txtM);
        txtKG = findViewById(R.id.txtKG);
        txtL = findViewById(R.id.txtL);
        txtLi = findViewById(R.id.txtLi);
        txtG = findViewById(R.id.txtG);


        //F and C convert
        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );


        //Km and mile convert
        txtK.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strK = s.toString();
                Log.i("UnitConverter", "Value in txtK = " + strK);

                if (!txtK.isFocused()) return;
                if (strK.length() == 0) return;


                try {
                    double valK = Double.parseDouble(strK);
                    double valM = valK * 0.62137;
                    String strM = Double.toString(valM);
                    Log.i("UnitConverter", "Value in txtM = " + strM);

                    MainActivity.this.txtM.setText(strM);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtM.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strM = s.toString();
                Log.i("UnitConverter", "Value in txtM = " + strM);

                if (!txtM.isFocused()) return;
                if (strM.length() == 0) return;

                try {
                    double valM = Double.parseDouble(strM);
                    double valK = valM/0.62137;
                    String strK = Double.toString(valK);
                    Log.i("UnitConverter", "Value in txtK = " + strK);

                    MainActivity.this.txtK.setText(strK);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        //Kg and Lb convert
        txtKG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKG = s.toString();
                Log.i("UnitConverter", "Value in txtKG = " + strKG);

                if (!txtKG.isFocused()) return;
                if (strKG.length() == 0) return;


                try {
                    double valKG = Double.parseDouble(strKG);
                    double valL = valKG/0.4536;
                    String strL = Double.toString(valL);
                    Log.i("UnitConverter", "Value in txtL = " + strL);

                    MainActivity.this.txtL.setText(strL);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtL.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strL = s.toString();
                Log.i("UnitConverter", "Value in txtL = " + strL);

                if (!txtL.isFocused()) return;
                if (strL.length() == 0) return;

                try {
                    double valL = Double.parseDouble(strL);
                    double valKG = valL*0.4536;
                    String strKG = Double.toString(valKG);
                    Log.i("UnitConverter", "Value in txtF = " + strKG);

                    MainActivity.this.txtKG.setText(strKG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        //Liter and Gallon convert
        txtLi.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLi = s.toString();
                Log.i("UnitConverter", "Value in txtLi = " + strLi);

                if (!txtLi.isFocused()) return;
                if (strLi.length() == 0) return;


                try {
                    double valLi = Double.parseDouble(strLi);
                    double valG = valLi * 0.2642;
                    String strG = Double.toString(valG);
                    Log.i("UnitConverter", "Value in txtG = " + strG);

                    MainActivity.this.txtG.setText(strG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strG = s.toString();
                Log.i("UnitConverter", "Value in txtG = " + strG);

                if (!txtG.isFocused()) return;
                if (strG.length() == 0) return;

                try {
                    double valG = Double.parseDouble(strG);
                    double valLi = valG/0.2642;
                    String strLi = Double.toString(valLi);
                    Log.i("UnitConverter", "Value in txtLi = " + strLi);

                    MainActivity.this.txtLi.setText(strLi);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

    }
}
