package espol.edu.ec.aplicationofinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class GraficaActivity extends AppCompatActivity {
    LineChart lineChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafica);
        lineChart=(LineChart)findViewById(R.id.line_chart);
        LineDataSet lineDataSet=new LineDataSet(dateValue1(),"Data set 1");
        ArrayList<ILineDataSet>dataSets=new ArrayList<>();
        dataSets.add(lineDataSet);

        LineData data= new LineData(dataSets);
        lineChart.setData(data);
        lineChart.invalidate();

    }

    private ArrayList<Entry> dateValue1(){
        ArrayList<Entry>dataValue=new ArrayList<Entry>();
        dataValue.add(new Entry(0,20));
        dataValue.add(new Entry(1,24));
        dataValue.add(new Entry(2,2));
        dataValue.add(new Entry(3,15));
        dataValue.add(new Entry(4,28));
        return dataValue;


    }
}