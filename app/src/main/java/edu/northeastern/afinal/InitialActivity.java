package edu.northeastern.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.graphics.RenderEffect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import edu.northeastern.afinal.ui.browse.BrowseFragment;
import edu.northeastern.afinal.ui.login.LoginActivity;

public class InitialActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        Button userButton = (Button) findViewById(R.id.buttonUser);
        userButton.setOnClickListener(v->{
            Intent intent = new Intent(InitialActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        Button browseButton = (Button) findViewById(R.id.buttonBrowse);
//        browseButton.setOnClickListener(v->{
//            Intent intent = new Intent(InitialActivity.this, BrowseFragment.class);
//            startActivity(intent);
//        });

        browseButton.setOnClickListener(v -> {
            Intent intent = new Intent(InitialActivity.this, MainActivity.class);
            intent.putExtra("SHOW_BROWSE_FRAGMENT", true);
            startActivity(intent);
        });
    }
}