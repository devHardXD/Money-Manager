package com.example.moneymanager

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton

import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

import java.util.ArrayList;
import java.util.List;

public class Analyst : AppCompatActivity()  {

    @SuppressLint("WrongViewCast")
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.analyst)

        val pieChart: PieChart = findViewById(R.id.pieChart)

        val entries = ArrayList<PieEntry>()
        entries.add(PieEntry(20f, "Category A"))
        entries.add(PieEntry(30f, "Category B"))
        entries.add(PieEntry(50f, "Category C"))

        // Creating dataset
        val dataSet = PieDataSet(entries, "Pie Chart")

        // Add colors
        dataSet.colors = listOf(Color.RED, Color.BLUE, Color.GREEN)

        // Create pie data object
        val data = PieData(dataSet)

        // Set data to the chart
        pieChart.data = data

        // Customize chart
        pieChart.setUsePercentValues(true)
        pieChart.description.isEnabled = false
        pieChart.centerText = "Pie Chart"
        pieChart.setCenterTextSize(24f)

        // Refresh chart
        pieChart.invalidate()

        val backButton = findViewById<AppCompatImageButton>(R.id.backbuttonanalyst)
        backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
