package app.kvc.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import app.kvc.activity.CategoryActivity;
import app.kvc.activity.CleanActivity;
import app.kvc.activity.NotAvailableActivity;
import app.kvc.activity.OverviewActivity;
import app.kvc.activity.RoomActivity;
import app.kvc.kvc_ict.R;

/**
 * Created by DSOFT on 6/22/2017 AD.
 */

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ImageButton imgBtnOverview = (ImageButton) rootView.findViewById(R.id.imgBtnOverview);
        ImageButton imgBtnCategory = (ImageButton) rootView.findViewById(R.id.imgBtnCategory);
        ImageButton imgBtnRoom = (ImageButton) rootView.findViewById(R.id.imgBtnRoom);
        ImageButton imgBtnClean = (ImageButton) rootView.findViewById(R.id.imgBtnClean);
        ImageButton imgBtnNotAvailable = (ImageButton) rootView.findViewById(R.id.imgBtnNotAvailable);
        ImageButton imgBtnAmiss = (ImageButton) rootView.findViewById(R.id.imgBtnAmiss);

        imgBtnOverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "cick", Toast.LENGTH_SHORT).show();
                // open activity
                Intent intent = new Intent(getActivity(), OverviewActivity.class);
               // Bundle bundle = ActivityOptions.makeCustomAnimation(getActivity(), R.anim.slide_in_left, R.anim.slide_out_right).toBundle();
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        imgBtnCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        imgBtnRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RoomActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        imgBtnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CleanActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        imgBtnNotAvailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NotAvailableActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        return rootView;

    }
}
