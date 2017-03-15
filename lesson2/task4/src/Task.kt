class DateRange(var start: MyDate, val end: MyDate): Iterator<MyDate> {
    override fun hasNext(): Boolean {
        return start < end.nextDay()
    }

    override fun next(): MyDate {
        if(this.hasNext()){
            var temp = start
            start = start.nextDay()
            return temp
        }
        throw NoSuchElementException()
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}