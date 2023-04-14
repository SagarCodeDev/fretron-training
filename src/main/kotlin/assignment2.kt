import com.google.gson.JsonObject
open class Person {
    constructor() {
        println("Parent Constructor Called")
    }
}

data class Student constructor(var abc: String) : Person() {
    var id: String? = null
    var name: String? = null
    var email: String? = null
    var number: String? = null

    constructor() : this("1", "xyz", "abc@gmail.com", "3434343") {
        println("Empty Constructor Called")
    }

    constructor(id: String, name: String, email: String, number: String) : this(name) {
        this.id = id
        this.name = name
        this.email = email
        this.number = number
        println("Parameterized Constructor Called")
    }

    override fun toString(): String {
        val json = JsonObject()
        json.addProperty("Id", this.id)
        json.addProperty("Name", this.name)
        json.addProperty("Email", this.email)
        json.addProperty("Number", this.number)
        return json.toString()
    }
}

fun main(args: Array<String>) {
    var stu = Student("2", "Sagar", "sagarsheoran79@gmail.com", "7727839857")
    println(stu)
    stu = Student()
    println(stu)
}