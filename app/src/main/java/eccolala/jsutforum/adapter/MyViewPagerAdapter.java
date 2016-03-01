package eccolala.jsutforum.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyViewPagerAdapter extends FragmentPagerAdapter{

    private final List<Fragment> mFragments = new ArrayList<Fragment>();
    private final List<String> mFragmentTitles = new ArrayList<String>();

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment,String fragmentTitles){
        mFragments.add(fragment);
        mFragmentTitles.add(fragmentTitles);
    }
    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public CharSequence getPageTitle(int position) {
        //得到对应position的Fragment的title
        return mFragmentTitles.get(position);
    }
}
