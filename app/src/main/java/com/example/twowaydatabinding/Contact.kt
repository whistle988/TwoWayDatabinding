package com.example.twowaydatabinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class Contact(
    name: String,
    email: String
): BaseObservable() {

    @get: Bindable
    var id: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.id)
        }

    @get: Bindable
    var name: String = String()
        set(value) {
        field = value
        notifyPropertyChanged(BR.name)
    }

    @get: Bindable
    var email: String = String()
    set(value) {
        field = value
        notifyPropertyChanged(BR.email)
    }

    init {
        this.name = name
        this.email = email
    }
}