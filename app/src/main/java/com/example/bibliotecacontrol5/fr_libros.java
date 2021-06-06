package com.example.bibliotecacontrol5;

import android.os.Bundle;
import android.widget.ListView;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;

public class fr_libros extends AppCompatActivity {
    ListView Listado;

    String [] [] datos = {
            {"Triologia El señor de los anillos","El Señor de los Anillos es una novela de fantasía épica escrita por el filólogo y escritor británico J. R. R. Tolkien."},
            {"Mitos nórdicos","Un clásico instantáneo, un viaje por las leyendas y los mitos nórdicos"},
            {"THOR Y EL PODER DE MJÖLNIR","Thor, hijo de Odín, está llamado a ser el guerrero que lidere la lucha contra las fuerzas del caos"},
            {""},
    };



    int [] datosimg = {R.raw.lordofthering,R.raw.mitosnordicos,R.raw.thor};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr_libros);
        Listado = (ListView) findViewById(R.id.index);
        Listado.setAdapter(new adaptador(this,datos,datosimg));

    }
}
