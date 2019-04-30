package com.example.springkotlingraphmongodb.app.expections

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class EntityNotFoundException(message: String? = null, throwable: Throwable? = null) : RuntimeException(message, throwable)
