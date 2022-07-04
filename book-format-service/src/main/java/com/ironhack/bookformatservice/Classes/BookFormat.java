package com.ironhack.bookformatservice.Classes;

import com.ironhack.bookformatservice.Enum.Format;

public class BookFormat {
    private Format format;

    public BookFormat(Format format) {
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }
}
