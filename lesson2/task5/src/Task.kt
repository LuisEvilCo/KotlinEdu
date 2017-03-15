import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

data class IntervalQuantity(val count: Int, val interval: TimeInterval)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(other: IntervalQuantity): MyDate {
    return addTimeIntervals(other.interval, other.count)
}

operator fun TimeInterval.times(number: Int): IntervalQuantity {
    return IntervalQuantity(number, this)
}

fun task1(today: MyDate): MyDate {
    return today +  YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}


