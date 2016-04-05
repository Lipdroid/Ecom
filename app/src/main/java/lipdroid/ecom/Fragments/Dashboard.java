package lipdroid.ecom.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lipdroid.ecom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment {


    public static final Dashboard newInstance() {
        Dashboard f = new Dashboard();
        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dahsboard, container, false);
    }


}
