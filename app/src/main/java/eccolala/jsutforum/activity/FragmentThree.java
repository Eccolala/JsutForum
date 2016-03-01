package eccolala.jsutforum.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eccolala.jsutforum.R;

public class FragmentThree extends Fragment {



    public FragmentThree() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FragmentThree newInstance() {
        FragmentThree fragment = new FragmentThree();

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
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

}
