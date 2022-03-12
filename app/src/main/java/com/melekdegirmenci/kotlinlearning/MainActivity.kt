package com.melekdegirmenci.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private val <E> Set<E>.add: Unit
    get() {}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 5
        var y = 4
        println(x + y)
        val name = "melek"
        var mynumber = 5
        mynumber.toFloat()
        println(mynumber)
        var myinteger = "10"
        var a = myinteger.toInt()
        println(a + 2)
        //dizi
        val myarray = arrayOf(1, 2, 3)
        myarray.set(1, 5)
        println(myarray[1])
        val myNewArray = doubleArrayOf(1.2, 2.5)
        println(myNewArray[1])
        //arraylist
        val myMusician = arrayListOf<String>("a", "b")
        myMusician.add("c")
        println(myMusician[2])
        myMusician.add(1, "d")
        println(myMusician[1])
        //Set
        val myExampleArray = arrayOf(1, 1, 2, 3)
        println("first integer:${myExampleArray[0]}")
        val mySet = setOf<Int>(1, 1, 2)
        println(mySet.size)
        //for Each
        mySet.forEach { println(it) }
        val myStringSet = HashSet<String>()
        myStringSet.add("Melek")
        myStringSet.add("\n Değirmenci")
        println(myStringSet.size)
        //Map-HashMap
        val fruitArray = arrayOf("cilek", "muz")
        val caloriesArray = arrayOf(100, 200)
        println("${fruitArray[0]},${caloriesArray[0]}")
        val fruitcalorieMap = hashMapOf<String, Int>()
        fruitcalorieMap.put("armut", 100)
        fruitcalorieMap.put("elma", 200)
        println(fruitcalorieMap["armut"])
        println(fruitcalorieMap["elma"])
        val myNewMap = hashMapOf<String, Int>("ayva" to 777, "kivi" to 888)
        println(myNewMap["ayva"])
        println(myNewMap["kivi"])
        //opaerator
        var m = 1
        m = m + 1
        println(m)
        m++
        println(m)
        var n = 5
        n = n - 1
        println(n)
        n--
        println(n)
        println(n < m)
        println(n > m)
        println(n == m)
        //&& ve || veya
        println(n > 1 && n > m)
        println(n > 1 || n > m)
        //if control
        val myAge = 32
        if (myAge < 30) {
            println("30 yaşından küçüksünüz")
        } else if (myAge >= 30 && myAge < 40) {
            println("Yaşınız 30-40 arasında")
        } else if (myAge > 40) {
            println("40 yaşından büyüksünüz")
        }
        //When
        val day = 3
        var dayy = ""
        when (day) {
            1 -> dayy = "Monday"
            2 -> dayy = "Tuesday"
            3 -> dayy = "Wednesday"

        }
        println(dayy)
        //For Loop
        val myArrayNumber = arrayOf(3, 2, 3, 4, 5, 6)
        val p: Int = (myArrayNumber[0] / 3) * 5
        println(p)
        for (number in myArrayNumber) {
            val z = number / 3 * 5
            println(z)
        }
        for (qz in 0..9) {
            println(qz)
        }

        var myStringArrayy = ArrayList<String>()
        myStringArrayy.add("Melek")
        myStringArrayy.add("Değirmenci")
        myStringArrayy.forEach { println(it) }

        //While loop
        var l = 0
        while (l < 10) {
            println(l)
            l++
        }
    }
}