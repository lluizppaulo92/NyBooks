package br.com.lluizppaulo.nybooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lluizppaulo.nybooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = creatFakeBooks()
    }

    fun creatFakeBooks(): List<Book> {
        return listOf(
            Book("Livro 1", "Luiz"),
            Book("Livro 2", "Paulo"),
            Book("Livro 3", "Joao"),
            Book("Livro 4", "Luiz")
        )
    }
}