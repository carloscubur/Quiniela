db.createCollection("usuarios",
    {
        validator: {$and:
            [
                {usuario: {$type: "string"}},
                {nombre: {$type: "string"}},
                {mail: {$regex: /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$/}},
                {psw: {$regex: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])([A-Za-z\d$@$!%*?&]|[^ ]){8,15}$/}}
            ]
        }
    }
)

/* jj=Juegos Jugados, jg=Ganados, je=Empatados, jp=Perdidos, gf=Goles a Favor, gc=en Contra, gd=Diferencia, pts=Puntos*/
db.createCollection("equipos",
    {
        validator: {$and:
            [
                {nombre: {$type: "string"}},
                {jj: {$type: "int"}},
                {jg: {$type: "int"}},
                {je: {$type: "int"}},
                {jp: {$type: "int"}},
                {gf: {$type: "int"}},
                {gc: {$type: "int"}},
                {gd: {$type: "int"}},
                {pts: {$type: "int"}}
            ]
        }
    }
)


db.createCollection("grupos",
    {
        validator: {$and:
            [
                {grupo: {$type: "string"}},
                {equipos: {$type: "string"}}
            ]
        }
    }
)


db.createCollection("ganadores",
    {
        validator: {$and:
            [
                {anio: {$type: "int"}},
                {sede: {$type: "string"}},
                {primer_lugar: {$type: "string"}},
                {segundo_lugar: {$type: "string"}},
                {tercer_lugar: {$type: "string"}}
            ]
        }
    }
)

db.createCollection("goleadores",
    {
        validator: {$and:
            [
                {anio: {$type: "int"}},
                {sede: {$type: "string"}},
                {goleador: {$type: "string"}},
                {goles: {$type: "int"}}            
            ]
        }
    }
)
