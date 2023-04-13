open class Person {
    constructor() {
        println("Parent Constructor Called")
    }
}

class Student : Person {
    var id: String? = null
    var name: String? = null
    var email: String? = null
    var number: String? = null

    constructor() : this("1", "xyz", "abc@gmail.com", "3434343") {
        println("Empty Constructor Called")
    }

    constructor(id: String, name: String, email: String, number: String) {
        this.id = id
        this.name = name
        this.email = email
        this.number = number
        println("Parameterized Constructor Called")
    }

    override fun toString(): String {
        return """
            {
                "Id": $id,
                "Name": $name,
                "Email": $email,
                "Number": $number,
            }
        """.trimIndent()
    }
}

fun main(args: Array<String>) {
    var stu = Student("2", "Sagar", "sagarsheoran79@gmail.com", "7727839857")
    println(stu)
}