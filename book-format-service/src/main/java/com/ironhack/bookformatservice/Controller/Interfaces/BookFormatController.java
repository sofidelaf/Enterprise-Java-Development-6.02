package com.ironhack.bookformatservice.Controller.Interfaces;

import com.ironhack.bookformatservice.Enum.Format;

public interface BookFormatController {
    Format getBookFormat(long ISBN);
}
