package com.example.tugaspertemuan8tab

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tugaspertemuan8tab.LoginFragment
import com.example.tugaspertemuan8tab.RegisterFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    // Menentukan jumlah fragment yang akan ditampilkan (Register dan Login)
    override fun getItemCount(): Int {
        return 2 // Dua fragment: RegisterFragment dan LoginFragment
    }

    // Mengembalikan fragment yang sesuai berdasarkan posisi
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RegisterFragment() // Mengembalikan fragment Register
            1 -> LoginFragment()    // Mengembalikan fragment Login
            else -> throw IllegalStateException("Unexpected position $position") // Keamanan
        }
    }
}
