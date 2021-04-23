package com.example.fitnessapp;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class DataInputFragment extends Fragment {

    Context context;
    EditText editTextAge;
    EditText editTextGender;
    EditText editTextHeight;
    EditText editTextWeight;

    String age,gender,height,weight;
    int i=0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = container.getContext();
        return inflater.inflate(R.layout.datainput_layout, container, false);

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button loginBtn = getView().findViewById(R.id.btnLogin);
        loginBtn.setOnClickListener(this::onClick);

        editTextAge = (EditText) getView().findViewById(R.id.editTextAge);
        editTextGender = (EditText) getView().findViewById(R.id.editTextGender);
        editTextHeight = (EditText) getView().findViewById(R.id.editTextHeight);
        editTextWeight = (EditText) getView().findViewById(R.id.editTextWeight);

        /* Refreshes text on age*/
        editTextAge.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                age = editTextAge.getText().toString();
            }@Override public void afterTextChanged(Editable s) {}
        });

        /* Refreshes text on Gender*/
        editTextGender.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                gender = editTextGender.getText().toString();
            }@Override public void afterTextChanged(Editable s) {}
        });

        /* Refreshes text on Height*/
        editTextHeight.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                height = editTextHeight.getText().toString();
            }@Override public void afterTextChanged(Editable s) {}
        });

        /* Refreshes text on Weight*/
        editTextWeight.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                weight = editTextWeight.getText().toString();
            }@Override public void afterTextChanged(Editable s) {}
        });



    }


    public void onClick(View v){
        //TODO ADD INFO TO CREATED USER
    }
}
