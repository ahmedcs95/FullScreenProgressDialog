package net.ekhtar.fullscreendialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ProgressDialogFragment
                        .newInstance()
                        .show(getSupportFragmentManager(), ProgressDialogFragment.class.getName());
            }
        }, 3000);
    }
}
