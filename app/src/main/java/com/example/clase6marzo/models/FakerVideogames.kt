package com.example.clase6marzo.models

import com.example.clase6marzo.R

class FakerVideogames {
    fun getGames(): ArrayList<Videojuego>{
        var videogames : ArrayList<Videojuego>
        videogames = arrayListOf<Videojuego>()

        videogames.add(Videojuego(1, "Persona 5 Royal", 1600F, "Multiplataforma", R.drawable.personr, "Everyone"))
        videogames.add(Videojuego(2, "CoD: Black Ops 2", 1700F, "Xbox", R.drawable.codbo, "Mature"))
        videogames.add(Videojuego(3, "Persona Q2", 1600F, "Nintendo", R.drawable.juego, "Everyone"))
        videogames.add(Videojuego(4, "Smite", 500F, "Multiplataforma", R.drawable.smite, "Everyone"))
        videogames.add(Videojuego(5, "Genshin Impact", 1200F, "Multiplataforma", R.drawable.genshin, "Everyone"))
        videogames.add(Videojuego(6, "Fire Emblem Engage", 999F, "Multiplataforma", R.drawable.fee, "Everyone"))

        return videogames
    }
}