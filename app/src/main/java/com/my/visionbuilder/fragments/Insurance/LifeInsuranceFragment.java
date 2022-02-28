package com.my.visionbuilder.fragments.Insurance;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Insurance.AddLifeInsuranceActivity;
import com.my.visionbuilder.adapters.InsuranceAdapters.InsuranceAdapter;
import com.my.visionbuilder.models.Insurance;

import java.util.ArrayList;

public class LifeInsuranceFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Insurance> list;
    InsuranceAdapter adapter;
    RelativeLayout btn_Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_life_insurance, container, false);
        btn_Add = view.findViewById(R.id.btn_Add);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Insurance>();
        adapter = new InsuranceAdapter(getActivity(), list, "LIFE_INSURANCE");
        recyclerview.setAdapter(adapter);
        loadData();
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddLifeInsuranceActivity.class);
//                intent.putExtra("PURPOSE", "ADD_STUDIES");
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadData() {
        Insurance insurance = new Insurance(1,    "", "", "", "", "");
        list.add(insurance);
        adapter.notifyDataSetChanged();
    }
}