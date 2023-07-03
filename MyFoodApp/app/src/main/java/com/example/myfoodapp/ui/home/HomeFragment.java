package com.example.myfoodapp.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.HomeHorAdapter;
import com.example.myfoodapp.adapters.HomeVerAdapter;
import com.example.myfoodapp.models.HomeHorModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {



    RecyclerView homeHorizontalRec, homeVerticalRec;
    List<HomeHorModel> homeHormodelList;
    HomeHorAdapter homeHorAdapter;
    /////////
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;



    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeHormodelList = new ArrayList<>();
        homeHormodelList.add(new HomeHorModel(R.drawable.pizza, "Pizza"));
        homeHormodelList.add(new HomeHorModel(R.drawable.hamburger, "Hamburger"));
        homeHormodelList.add(new HomeHorModel(R.drawable.sandwich, "Sandwich"));
        homeHormodelList.add(new HomeHorModel(R.drawable.ice_cream, "Ice Cream"));
        homeHormodelList.add(new HomeHorModel(R.drawable.fried_potatoes, "Fried"));

        homeHorAdapter = new HomeHorAdapter(getActivity(), homeHormodelList);

        homeHorizontalRec.setAdapter(homeHorAdapter);

        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL,false ));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        homeVerticalRec = root.findViewById(R.id.home_ver_rec);
        homeVerModelList = new ArrayList<>();
        homeVerModelList.add(new HomeVerModel(R.drawable.fries1, "Phạm Hoàng Ân", "Cách Chiên Khoai Tây Cực Ngon", "123"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza2, "Nguyễn Thanh Thuyền", "Pizza Phô Mai Tại Nhà", "323"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza3, "Nguyễn Thị Thanh", "Pizza Cho Trẻ Nhỏ", "125"));
        homeVerModelList.add(new HomeVerModel(R.drawable.breakfast, "Nguyễn Thị Mỹ", "Bánh Mì Kẹp Trứng Siêu Dễ", "15"));
        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL,false ));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);

        return root;
    }

}