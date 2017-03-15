data class Person constructor( var name: String, var age: Int)


fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}