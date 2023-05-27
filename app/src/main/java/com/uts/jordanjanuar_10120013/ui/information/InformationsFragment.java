/**
 *
 * Nama : Jordan Januar Ilhami G
 * Nim : 10120013
 * Kelas : IF 1
 * Email : jordan04583
 *
 */

package com.uts.jordanjanuar_10120013.ui.information;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.uts.jordanjanuar_10120013.databinding.FragmentInformationBinding;

public class InformationsFragment extends Fragment {

    private FragmentInformationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InformationsViewModel ViewModel =
                new ViewModelProvider(this).get(InformationsViewModel.class);

        binding = FragmentInformationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}