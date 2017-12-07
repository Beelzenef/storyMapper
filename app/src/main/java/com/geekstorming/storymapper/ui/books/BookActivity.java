package com.geekstorming.storymapper.ui.books;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.geekstorming.storymapper.R;
import com.geekstorming.storymapper.base.BaseActivity;
import com.geekstorming.storymapper.ui.books.fragments.AddEditBook_Fragment;
import com.geekstorming.storymapper.ui.books.fragments.BookList_Fragment;
import com.geekstorming.storymapper.ui.books.presenter.ListBookPresenter;

/**
 * Books Activity, book fragment manager
 * @author Elena Guzman Blanco (Beelzenef) - 3d10Mundos
 */

public class BookActivity extends BaseActivity implements BookList_Fragment.ListBookListener {

    BookList_Fragment bookList_Frag;
    AddEditBook_Fragment addEditBook_Frag;

    ListBookPresenter bookListPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.book_activity);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        bookList_Frag = (BookList_Fragment) fragmentManager.findFragmentByTag(BookList_Fragment.TAG);

        if (bookList_Frag == null)
        {
            bookList_Frag = BookList_Fragment.newInstance(null);
            fragmentTransaction.add(android.R.id.content, bookList_Frag, BookList_Fragment.TAG);
            fragmentTransaction.commit();
        }

        bookListPresenter = new ListBookPresenter(bookList_Frag);

        bookList_Frag.setPresenter(bookListPresenter);
    }

    @Override
    public void addNewBook() {

        FragmentManager fragmentManager = getSupportFragmentManager();

        addEditBook_Frag = (AddEditBook_Fragment) fragmentManager.findFragmentByTag(AddEditBook_Fragment.TAG);

        if (addEditBook_Frag == null)
        {
            addEditBook_Frag = AddEditBook_Fragment.newInstance(null);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(android.R.id.content, addEditBook_Frag, AddEditBook_Fragment.TAG);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void editSelectedBook(int item) {

    }
}