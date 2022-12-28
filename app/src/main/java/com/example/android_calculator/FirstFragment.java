package com.example.android_calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.android_calculator.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button buttonAdd, buttonSub, buttonDivide, buttonMultiply, buttonMod;

        buttonAdd = (Button) view.findViewById(R.id.button_add);
        buttonSub = (Button) view.findViewById(R.id.button_subtract);
        buttonDivide = (Button) view.findViewById(R.id.button_divide);
        buttonMultiply = (Button) view.findViewById(R.id.button_multiply);
        buttonMod = (Button) view.findViewById(R.id.button_modulus);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editText_num1);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editText_num2);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number1 + MainActivity.number2;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

            }

        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editText_num1);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editText_num2);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number1 - MainActivity.number2;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

            }

        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editText_num1);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editText_num2);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number1 * MainActivity.number2;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editText_num1);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editText_num2);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number1 / MainActivity.number2;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText number01 = getView().findViewById(R.id.editText_num1);
                MainActivity.number1 = Integer.parseInt(number01.getText().toString());

                EditText number02 = getView().findViewById(R.id.editText_num2);
                MainActivity.number2 = Integer.parseInt(number02.getText().toString());

                MainActivity.result = MainActivity.number1 % MainActivity.number2;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}