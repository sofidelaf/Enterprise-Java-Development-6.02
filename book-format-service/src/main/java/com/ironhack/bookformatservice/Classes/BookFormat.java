package com.ironhack.bookformatservice.Classes;

import com.ironhack.bookformatservice.Enum.Format;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookFormat {
    @Id
    private long ISBN;
    private Format format;

    public BookFormat(Long ISBN, Format format) {
        this.ISBN = ISBN;
        this.format = format;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }
}
