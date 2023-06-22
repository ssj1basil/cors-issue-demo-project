package com.example.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/test")
class TestController{

  @Get("/")
  fun testMethod(): String{
    return "test"
  }
}