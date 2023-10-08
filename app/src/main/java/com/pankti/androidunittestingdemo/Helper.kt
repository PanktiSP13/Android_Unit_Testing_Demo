package com.pankti.androidunittestingdemo

import java.lang.StringBuilder

class Helper {

    fun isPalindrome(str : String) : Boolean{
        val originalStr = str
        val stringBuilder  = StringBuilder(originalStr)
        stringBuilder.reverse()
        return str == stringBuilder.toString()
    }

    fun isPalindrome(item : Int) : Boolean{
       var originalItem = item
        var finalItem = 0

        while (originalItem>0){
            finalItem  = (finalItem*10 + (originalItem%10))
            originalItem /= 10
        }

        return  (item == finalItem)
    }

}