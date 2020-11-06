//topLevel variables
    //val topLevelName: String = "Hello"
    //var topLevelItem: String = "OOP"

//types in kotlin are non null by default
    //val nonNullable: String = null

// see the difference with the String?
    //var nonNullable2: String? = null


//when (nonNullable2) {
//    null -> println("hi")
//    else -> println(nonNullable2)
//}

//    val nonNullable2toPrint = if(nonNullable2 != null) nonNullable2 else "Hello"
//    println(nonNullable2toPrint)

// we can infer the type of the function return as well.
//fun getGreeting(): String {
//    return "Hello Kotlin"
//}

// short hand for writing a function with type inference.
//fun getGreetingShort(): String = "Hello Kotlin"

//val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
//interestingThings.add("Dogs")
//
//val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//map.forEach { (key, value) -> println("$key -> $value")}
//map[4] = "d" // old way map.put(4, "d")

//gets length
//    println(interestingThings.size)
//    //access value from key - as usual.
//    println(interestingThings[0])
//
//    //for loop example
// for (interestingThing in interestingThings) {
//     println(interestingThing)
// }

//for each example.
//    interestingThings.forEach { interestingThing ->
//        println(interestingThing)
//    }


//foreach with index
//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }

//multiple params example.
//fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

//infer list with type String
fun sayHello(greeting:String, itemToGreets:List<String>) = println("$greeting $itemToGreet")

fun main() {
val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")

}