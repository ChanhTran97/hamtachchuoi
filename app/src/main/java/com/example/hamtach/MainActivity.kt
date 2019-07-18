package com.example.hamtach

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.lang.Math.abs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var s: String = "tran duy chanh"

        fun Hamtachchuoi(chuoivao: String): String? {
           var arr: List<String> = s.split(" ")

           println("so phan tu" + arr.size)

           var a = arr[0].length
           var b: Int
           var tong: Int = arr[0].length
           var c: Int
           var duong: Int = 0
           var am: Int = 0
           var vitriduong = 0
           var vitriam = 0
           var dong1: String? = null
           var dong2: String? = null
           var ghepchuoi: String? = null

           for (i in 1..arr.size) {
               tong += arr[i].length
           }
           for (j in 1..arr.size) {
               a += arr[j].length
               b = tong - a
               c = b - a
               if (c > 0) {
                   duong = c
                   vitriduong = j
               } else {
                   am = c
                   vitriam = j
                   break
               }
           }
           if (abs(duong) < abs(am)) {

               for (h in 0..vitriduong) {
                   dong1 += arr[h] + " "
               }

               for (k in vitriduong..arr.size) {
                   dong2 += arr[k] + " "
               }

               ghepchuoi = dong1 + "\n" + dong2

           }
           else{
               for(l in 0..vitriam){
                   dong1 += arr[l] + " "
               }
               for(m in vitriam..arr.size){
                   dong2 += arr[m] + " "
               }
               ghepchuoi = dong1 + "\n" + dong2
           }
           return ghepchuoi
       }
    }
}
