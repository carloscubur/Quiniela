package com.byte.quiniela

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by carloscubur on 6/04/18.
 */

@RestController
class EstudianteController {
    @GetMapping("/dummy-student")
    fun Estudiantes(@RequestParam nombre:String):Estudiante {
        val estudiante = Estudiante("1", nombre)
        return estudiante
    }
}
