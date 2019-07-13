package com.vivaniacz.e_attendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView username, greeting, status;

    Calendar time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeting = findViewById(R.id.tv_greeting);
        time = Calendar.getInstance();
        int waktu_sekarang = time.get(Calendar.HOUR_OF_DAY);

        if (waktu_sekarang >= 0 && waktu_sekarang <12) {
            greeting.setText("Selamat Pagi !");
        } else if(waktu_sekarang >= 12 && waktu_sekarang < 15){
            greeting.setText("Selamat Siang !");
        }else if(waktu_sekarang >= 15 && waktu_sekarang < 19){
            greeting.setText("Selamat Sore !");
        }else if(waktu_sekarang >= 19 && waktu_sekarang < 24){
            greeting.setText("Selamat Malam !");
        }
    }
}
