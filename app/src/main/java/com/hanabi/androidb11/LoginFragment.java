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

public class LoginFragment extends Fragment implements View.OnClickListener {

    private final String TAG = "LoginFragment";
    private EditText edtUsername, editPassword;
    private Button btnLogin, btnRegister;
    private String username = "";

    public void setUsername(String username) {
        edtUsername.setText(username);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: ");
        MainActivity activity = (MainActivity) getActivity();
        edtUsername = getActivity().findViewById(R.id.edt_email);
        editPassword = getActivity().findViewById(R.id.edt_pass);
        btnRegister = getActivity().findViewById(R.id.btn_go_register);
        btnLogin = getActivity().findViewById(R.id.btn_login);
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
        switch (view.getId()) {
            case R.id.btn_login:
                break;
            case R.id.btn_go_register:
                MainActivity activity = (MainActivity) getActivity();
                activity.showFragment(activity.getRegisterFragment());
                break;
        }
    }
}
