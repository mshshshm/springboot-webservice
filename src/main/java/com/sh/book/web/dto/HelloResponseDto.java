package com.sh.book.web.dto;

public record HelloResponseDto(String name, int amount) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public int amount() {
        return amount;
    }
}
