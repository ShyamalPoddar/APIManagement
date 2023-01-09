package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Books;

@Service
public class BookService {

    @Autowired
     BooksRepository booksRepository;

    public List<Books> books = new ArrayList<Books>();

    public List<Books> getAll(){
        return booksRepository.findAll();
    }


    }

