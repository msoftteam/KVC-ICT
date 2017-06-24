package app.kvc.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import app.kvc.kvc_ict.R;

/**
 * Created by DSOFT on 6/22/2017 AD.
 */

public class AccountFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_account, container, false);
        //((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return rootView;

    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.action_report_problem).setVisible(false);
        super.onPrepareOptionsMenu(menu);
    }
}
