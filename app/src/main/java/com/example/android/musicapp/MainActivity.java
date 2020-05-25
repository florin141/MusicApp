package com.example.android.musicapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private SongFragment songFragment;
    private AlbumFragment albumFragment;

    private BottomSheetBehavior layoutBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        songFragment = new SongFragment();
        albumFragment = new AlbumFragment();

        tabLayout.setupWithViewPager(viewPager);

        CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager(), 0);
        categoryAdapter.addFragment(songFragment, "Songs");
        categoryAdapter.addFragment(albumFragment, "Albums");
        viewPager.setAdapter(categoryAdapter);

        View bottomSheet = findViewById(R.id.bottom_sheet);

        layoutBottomSheet = BottomSheetBehavior.from(bottomSheet);
        layoutBottomSheet.setState(BottomSheetBehavior.STATE_HIDDEN);
    }
}
