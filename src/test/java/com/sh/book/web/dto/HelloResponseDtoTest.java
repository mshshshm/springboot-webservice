package com.sh.book.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @Test
    @DisplayName("HelloResponseDto Record를 테스트한다")
    void recordTest() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        Assertions.assertThat(helloResponseDto.name()).isEqualTo(name);
        Assertions.assertThat(helloResponseDto.amount()).isEqualTo(amount);
    }


}