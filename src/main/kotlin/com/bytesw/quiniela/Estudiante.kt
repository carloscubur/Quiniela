package com.byte.quiniela

import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by carloscubur on 6/04/18.
 */
@Document(collection = "estudiante")
data class Estudiante(val id:String, val nombre:String){
}