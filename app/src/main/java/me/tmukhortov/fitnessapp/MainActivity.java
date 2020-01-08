package me.tmukhortov.fitnessapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity {

    //    public NavHostFragment host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        Fragment navigationFragment =
        //                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        //        if (navigationFragment instanceof NavHostFragment) {
        //            host = (NavHostFragment) navigationFragment;
        //        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        Fragment navigationFragment =
                getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        return NavHostFragment.findNavController(navigationFragment).navigateUp();
    }
}
