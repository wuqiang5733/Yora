package com.tuchangwei.yora.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tuchangwei.yora.R;
import com.tuchangwei.yora.fragments.LoginFragment;

/**
 * Created by vale on 1/5/16.
 */
public class LoginNarrowActivity extends BaseActivity implements LoginFragment.Callbacks {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        在自身的Layout当中，包含了Fragment
        setContentView(R.layout.activity_login_narrow);
    }

    @Override
    public void onLoggedIn() {
        setResult(RESULT_OK);
        finish();
    }
}
