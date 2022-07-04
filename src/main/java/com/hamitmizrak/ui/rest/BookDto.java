package com.hamitmizrak.ui.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    private Long bookId;
    private String bookName;
    private String bookPrice;
}
