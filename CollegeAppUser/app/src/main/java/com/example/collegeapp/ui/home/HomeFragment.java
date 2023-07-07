package com.example.collegeapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collegeapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout=view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();

        map=view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri=Uri.parse("geo:0, 0?q=Graphic Era University Dehradun");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderViews() {
        for (int i=0;i<5;i++){
            DefaultSliderView sliderView=new DefaultSliderView(getContext());

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/gehu-2e044.appspot.com/o/a9.jpg?alt=media&token=b2133146-4464-46bb-ac8d-2a5ab7851f1d");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/gehu-2e044.appspot.com/o/a9.jpg?alt=media&token=b2133146-4464-46bb-ac8d-2a5ab7851f1d");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/gehu-2e044.appspot.com/o/clg.jpg?alt=media&token=dd312f7e-95f4-45c2-883f-649cf016d739");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/gehu-2e044.appspot.com/o/gallery%2F%5BB%40a0379f4jpg?alt=media&token=71ec54ef-43df-4dd4-8e1e-4a0e61d6e18c");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/gehu-2e044.appspot.com/o/clg.jpg?alt=media&token=dd312f7e-95f4-45c2-883f-649cf016d739");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}