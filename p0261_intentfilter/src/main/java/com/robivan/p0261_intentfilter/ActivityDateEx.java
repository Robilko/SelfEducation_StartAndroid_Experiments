package com.robivan.p0261_intentfilter;

import androidx.appcompat.app.AppCompatActivity;
import java.sql.Date;
import java.text.SimpleDateFormat;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDateEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = (TextView) findViewById(R.id.tvDate);
        tvDate.setText(date);
    }
}