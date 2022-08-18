package com.joserobertofilho.personiawebflux.Dto

import com.joserobertofilho.personiawebflux.model.Cat


data class CatDto(
    val name: String,
    val type: String,
    val age: Int
)

fun CatDto.toEntity(): Cat = Cat(
    name = name,
    type = type,
    age = age
)