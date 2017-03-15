import java.util.*

fun getList(): List<Int> {
    val list = arrayListOf(1, 5, 2)//TODO("return the list sorted in descending order")
    return list.sort()
}

fun List<Int>.sort(): List<Int>  {
    Collections.sort(this, { x, y -> y.compareTo(x)})
    return this
}