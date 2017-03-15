class DateRange(val start: MyDate, val endInclusive: MyDate){
    operator fun contains(d: MyDate): Boolean{
        if(d in start .. endInclusive){
            return true
        }
        return false
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}