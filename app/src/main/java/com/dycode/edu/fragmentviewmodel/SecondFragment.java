package com.dycode.edu.fragmentviewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private PageViewModel2 pageViewModel2;
    private PageViewModel3 pageViewModel3;
    private PageViewModel4 pageViewModel4;
    private TextView txtName, txtName2, txtName3, txtName4;

    public SecondFragment() {
// Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
        pageViewModel2 =
                ViewModelProviders.of(requireActivity()).get(PageViewModel2.class);
        pageViewModel3 =
                ViewModelProviders.of(requireActivity()).get(PageViewModel3.class);
        pageViewModel4 =
                ViewModelProviders.of(requireActivity()).get(PageViewModel4.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        pageViewModel.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName.setText(s);
                    }
                });

        txtName2 = view.findViewById(R.id.textViewName2);
        pageViewModel2.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s2) {
                        txtName2.setText(s2);
                    }
                });

        txtName3 = view.findViewById(R.id.textViewName3);
        pageViewModel3.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s3) {
                        txtName3.setText(s3);
                    }
                });

        txtName4 = view.findViewById(R.id.textViewName4);
        pageViewModel4.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s4) {
                        txtName4.setText(s4);
                    }
                });
    }
}