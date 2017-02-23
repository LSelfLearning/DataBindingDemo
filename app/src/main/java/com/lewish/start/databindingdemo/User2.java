package com.lewish.start.databindingdemo;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Administrator on 2017/2/23 14:13.
 */

public class User2 {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
    public User2(String firstName,String lastName,int age){
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.age.set(age);
    }
}
