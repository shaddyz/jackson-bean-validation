package org.unbrokendome.jackson.beanvalidation

import com.fasterxml.jackson.annotation.JsonCreator
import jakarta.validation.ValidationException
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


class ParsableInputTest : AbstractValidationTest() {

    @JsonValidated
    class TestBean
    @JsonCreator constructor()

    @Test
    fun `should throw validation exception on invalid JSON`() {
        val json = """{ invalid JSON"""
        assertThrows(ValidationException::class.java) { objectMapper.readValue(json, TestBean::class.java) }
    }
}
