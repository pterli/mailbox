package peter.com

import java.util.*

fun main(args: Array<String>) {
//    val box3 = Box3(30f, 30f, 30f)
//    println(box3.validate())
    val scanner = Scanner(System.`in`)
    println("Please enter object's length:")
    var length = scanner.nextFloat()
    println("Please enter object's width:")
    var width = scanner.nextFloat()
    println("Please enter object's height:")
    var height = scanner.nextFloat()
    val box3 = Box3(length, width, height)
    val box5 = Box5(length, width, height)
    if (box3.validate())
    //經由validate()方法確認是否可以放入Box3
        println("Box3")//若可以印出Box3
    else if (box5.validate())
    //若無法放入Box3, 再經由validate()方法確認是否可以放入Box5
        println("Box5")//若可以印出Box5
    else
    //若是都無法裝入的話，印出兩個箱子都無法使用
        println("You can't use both Box3 and Box5!!")
}

class Box3(var length: Float, var width: Float, var height: Float){
    val record = floatArrayOf(length, width, height)
    val sortRecord = record.sortedArray()
    fun validate():Boolean{
        length = sortRecord[2]
        width = sortRecord[1]
        height = sortRecord[0]
        if (length > 23)
            return false
        else if (width > 14)
            return false
        else if (height > 13)
            return false
        else
            return true
    }
}


class Box5(var length:Float, var width: Float, var height: Float) {
    private val record = floatArrayOf(length, width, height)
    val sortRecord = record.sortedArray()
    fun validate(): Boolean {
        length = sortRecord[2]
        width = sortRecord[1]
        height = sortRecord[0]
        if (length > 39.5)
            return false
        else if (width > 27.5)
            return false
        else if (height > 23)
            return false
        else
            return true
    }
}