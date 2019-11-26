package com.example.mvvm_demo.utils

import java.io.IOError
import java.io.IOException

class ApiExceptions (message : String) : IOException(message)
class NoInternetException(message: String) : IOException(message)