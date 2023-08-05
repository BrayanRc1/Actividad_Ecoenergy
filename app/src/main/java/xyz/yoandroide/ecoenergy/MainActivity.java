package xyz.yoandroide.ecoenergy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.editTextName);
        EditText address = findViewById(R.id.editTextAddress);
        EditText phone = findViewById(R.id.editTextPhone);
        EditText email = findViewById(R.id.editTextEmail);

        RadioGroup radioGroupHomeType = findViewById(R.id.radioGroupHomeType);
        RadioButton house =  findViewById(R.id.radioButtonHouse);
        RadioButton apartment = findViewById(R.id.radioButtonApartment);
        RadioButton farm =  findViewById(R.id.radioButtonFarm);

        CheckBox Paneles = findViewById(R.id.checkBoxSolar);
        CheckBox Aerogeneradores = findViewById(R.id.checkBoxWind);
        CheckBox Otros = findViewById(R.id.checkBoxOther);
        Button enviar = findViewById(R.id.buttonSubmit);

        enviar.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                String message = "Name: " + name.getText().toString() + "\n" +
                        "Address: " + address.getText().toString() + "\n" +
                        "Phone: " + phone.getText().toString() + "\n" +
                        "Email: " + email.getText().toString();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

                if (house.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste Casa",Toast.LENGTH_LONG).show();
                    house.setChecked(false);
                }
                if (apartment.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste Apartamento",Toast.LENGTH_LONG).show();
                    apartment.setChecked(false);
                }
                if (farm.isChecked()){
                    Toast.makeText(MainActivity.this,"Selecionaste Granjas", Toast.LENGTH_LONG).show();
                    farm.setChecked(false);
                }
                if (Paneles.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste Paneles", Toast.LENGTH_LONG).show();
                    Paneles.setChecked(false);
                }
                if (Aerogeneradores.isChecked()){
                    Toast.makeText(MainActivity.this, "Selecionaste Aerogeneradores", Toast.LENGTH_LONG).show();
                    Aerogeneradores.setChecked(false);
                }
                if (Otros.isChecked()){
                    Toast.makeText(MainActivity.this, "Selecionaste Otras Energias", Toast.LENGTH_LONG).show();
                    Otros.setChecked(false);
                }
            }
        });
    }
}