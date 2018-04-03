package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by MFontecchio on 3/27/2018.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
