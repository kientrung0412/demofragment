package com.hanabi.androidb11;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RegisterFragment extends Fragment implements View.OnClickListener {

    private final String TAG = "RegisterFragment";
    private EditText edtUsername, editPassword, edtRepassword;
    private Button btnLogin, btnRegister;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: ");
        edtUsername = getActivity().findViewById(R.id.edt_reg_user_name);
        editPassword = getActivity().findViewById(R.id.edt_reg_pass);
        btnRegister = getActivity().findViewById(R.id.btn_register);
        btnLogin = getActivity().findViewById(R.id.btn_go_login);
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onClick(View view) {
        MainActivity activity = (MainActivity) getActivity();
        switch (view.getId()) {
            case R.id.btn_register:
                activity.getLoginFragment().setUsername(edtUsername.getText().toString());
                activity.showFragment(activity.getLoginFragment());
                break;
        }
    }
}
