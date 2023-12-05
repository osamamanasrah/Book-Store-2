package com.example.bookstore2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.bookstore2.model.Book;
import com.example.bookstore2.model.BooksFactory;
import com.example.bookstore2.model.IBook;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IBook fromModel = BooksFactory.getModel();
        setUpVars();
        String [] categories = fromModel.getCategories();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        spinner.setAdapter(adapter);

    }

    private void setUpVars(){
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.btnSearch);
        editText = findViewById(R.id.edtResults);
    }
    public void btnSearchOnClick(View view) {
        String str =  spinner.getSelectedItem().toString();
        IBook fromModel = BooksFactory.getModel();
        List<Book> list = fromModel.getBooks(str);
        String str2 = "";
        for(Book b : list){
            str2 += b.toString() +"\n";
        }
        editText.setText(str2);
    }
}