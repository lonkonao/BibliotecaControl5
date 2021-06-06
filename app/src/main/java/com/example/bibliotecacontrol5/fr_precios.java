package com.example.bibliotecacontrol5;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class fr_precios  extends AppCompatActivity {
    PieChart Grafico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr_precios);

        Grafico=findViewById(R.id.grafico);

        cargaGrafico();

    }

    private void cargaGrafico() {
        Description description = new Description();
        description.setText("Precio de los Mejores Best Seller");
        description.setTextSize(12);

        Grafico.setDescription(description);

        ArrayList<PieEntry> pieEntries = new ArrayList<>();

        pieEntries.add(new PieEntry(30000,"Triologia Señor de los anillos"));
        pieEntries.add(new PieEntry(19000,"Mitos nórdicos"));
        pieEntries.add(new PieEntry(25000,"Thor"));

        Grafico.setEntryLabelTextSize(12);
        Grafico.setEntryLabelColor(Color.BLACK);

        PieDataSet pieDataSet = new PieDataSet(pieEntries,"");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextSize(12);
        pieDataSet.setYValuePosition(PieDataSet.ValuePosition.INSIDE_SLICE);

        PieData pieData = new PieData(pieDataSet);

        Grafico.setData(pieData);

    }
}
