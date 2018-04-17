package com.byte.quiniela

import com.bytesw.quiniela.EstudianteRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by carloscubur on 6/04/18.
 */

@RestController
class EstudianteController(val repository: EstudianteRepository) {
    @GetMapping("/dummy-estudiante")
    fun estudiantes(@RequestParam nombre:String):Estudiante {
        val estudiante = Estudiante("1", nombre)
        return estudiante
    }

    @GetMapping("/students")
    fun estudiantesByName(@RequestParam nombre:String) = repository.findByName(nombre)
}
