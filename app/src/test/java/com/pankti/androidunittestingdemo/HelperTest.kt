package com.pankti.androidunittestingdemo

import junit.framework.TestCase
import org.junit.Test

class HelperTest : TestCase() {


    @Test
    fun testIsPalindromeString() {
       val helper = Helper()
       assertEquals(false, helper.isPalindrome("Hello"))
    }

    @Test
    fun testIsPalindromeNumber() {
       val obj = Helper()
        assertEquals(true,  obj.isPalindrome(1234321))
    }
}