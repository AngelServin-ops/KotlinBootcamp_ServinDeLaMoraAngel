open class Book(val title: String, val author: String) {
    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
    }
}

fun main() {
    val myEbook = eBook("1984", "George Orwell")
    println("Ebook creado: ${myEbook.title} de ${myEbook.author} (Formato: ${myEbook.format})")

    myEbook.readPage()
    println("Página leída en eBook.")
}