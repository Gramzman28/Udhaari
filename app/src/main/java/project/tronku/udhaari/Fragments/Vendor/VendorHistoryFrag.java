package project.tronku.udhaari.Fragments.Vendor;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import project.tronku.udhaari.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VendorHistoryFrag extends Fragment {


    public VendorHistoryFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vendor_history, container, false);
    }

}