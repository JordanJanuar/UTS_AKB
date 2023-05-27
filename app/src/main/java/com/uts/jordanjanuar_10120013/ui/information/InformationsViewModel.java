/**
 *
 * Nama : Jordan Januar Ilhami G
 * Nim : 10120013
 * Kelas : IF 1
 * Email : jordan04583
 *
 */

package com.uts.jordanjanuar_10120013.ui.information;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InformationsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}