package eccolala.jsutforum.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eccolala.jsutforum.R;

public class FragmentTwo extends Fragment {





    public FragmentTwo() {
        // Required empty public constructor
    }


    public static FragmentTwo newInstance() {
        FragmentTwo fragment = new FragmentTwo();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

}
