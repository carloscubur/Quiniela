package com.bytesw.quiniela

import com.byte.quiniela.Estudiante
import org.springframework.data.repository.CrudRepository
import reactor.core.publisher.Flux

/**
 * Created by carloscubur on 15/04/18.
 */

interface EstudianteRepository : CrudRepository<Estudiante, String>{
    fun findByName(name: String): Flux<Estudiante>
}