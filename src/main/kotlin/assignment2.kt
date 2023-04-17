import org.json.JSONObject
open class Person {
    constructor() {
        println("Parent Constructor Called")
    }
}

data class Student constructor(
    var id: String? = null,
    var name: String? = null,
    var email: String? = null,
    var number: String? = null
) : Person() {
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
        val json = JSONObject()
        json.put("Id", this.id)
        json.put("Name", this.name)
        json.put("Email", this.email)
        json.put("Number", this.number)
        return json.toString()
    }
}

fun main(args: Array<String>) {
    var stu = Student("2", "Sagar", "sagarsheoran79@gmail.com", "7727839857")
    println(stu)
    stu = Student()
    println(stu)
}