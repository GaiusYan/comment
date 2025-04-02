package com.yancode.comment;

import java.time.LocalDate;

public record Comment(
        int id,
        String message,
        LocalDate dateComment
) {
}
