package com.pankti.androidunittestingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.pankti.androidunittestingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        performClicks()
    }

    private fun performClicks() {

        mBinding.btnShare.setOnClickListener {

        }

        mBinding.btnNext.setOnClickListener {

        }
    }
}