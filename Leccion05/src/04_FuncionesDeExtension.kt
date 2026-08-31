import java.util.Random

class Book(val title: String, val author: String, val year: Int, var pages: Int)

fun Book.weight(): Double {
    return (pages * 1.5)
}

fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

fun main() {
    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Quedan ${book.pages} páginas en ${book.title}")
    }

    println("Cachorro triste, no quedan más páginas en ${book.title}.")
}