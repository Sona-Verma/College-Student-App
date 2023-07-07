package com.example.collegeapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_about, container, false);

        list=new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp,"Computer Science","Computer Science and Engineering started in year 2015. At present intake sheer in I-year is 30 student,and in lateral entry is 6"));
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical Production","Mechanical Engineering started in year 2015. At present intake sheer in I-year is 30 student,and in lateral entry is 6"));
        adapter=new BranchAdapter(getContext(),list);

        viewPager=view.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        ImageView imageView=view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/gehu-2e044.appspot.com/o/clg.jpg?alt=media&token=dd312f7e-95f4-45c2-883f-649cf016d739")
                .into(imageView);

        return view;
    }
}