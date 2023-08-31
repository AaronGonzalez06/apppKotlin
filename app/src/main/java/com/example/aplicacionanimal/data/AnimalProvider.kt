package com.example.aplicacionanimal.data

import com.example.aplicacionanimal.R
import com.example.aplicacionanimal.modelo.Animal

class AnimalProvider {
    companion object{
        val animalesList = listOf<Animal>(
            Animal("Ardilla común",
                "Mamifero",
                "Turdus torquatus",
                1,
                R.drawable.ardilla1,
                R.drawable.ardilla3,
                1,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Lobo ibérico",
                "Mamifero",
                "Lynx pardinus",
                5,
                R.drawable.lobo1,
                R.drawable.lobo2,
                2,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Lince ibérico",
                "Mamifero",
                "Lynx pardinus",
                5,
                R.drawable.lince1,
                R.drawable.lince2,
                3,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Liebre común",
                "Mamifero",
                "Glis glis",
                1,
                R.drawable.liebre,
                R.drawable.liebre2,
                4,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Jabali",
                "Mamifero",
                "Turdus torquatus",
                2,
                R.drawable.jabali1,
                R.drawable.jabali2,
                5,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Milano real",
                "ave",
                "Milvus milvus",
                3,
                R.drawable.milano1,
                R.drawable.milano2,
                6,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Buitre negro",
                "ave",
                "Aegypius monachus",
                5,
                R.drawable.buitre1,
                R.drawable.buitre2,
                7,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Águila calzada",
                "ave",
                "Hieraaetus pennatus",
                5,
                R.drawable.aguila2,
                R.drawable.aguila,
                8,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Pico picapinos",
                "ave",
                "Dendrocopos major",
                1,
                R.drawable.pico1,
                R.drawable.pico2,
                9,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Arrendajo euroasiático",
                "ave",
                "Garrulus glandarius",
                1,
                R.drawable.arrendajo1,
                R.drawable.arrendajo2,
                10,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Culebra Viperina",
                "Reptil",
                "Natrix maura",
                2,
                R.drawable.culebra1,
                R.drawable.culebra2,
                11,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Culebra de Collar",
                "Reptil",
                "Natrix astreptophora",
                2,
                R.drawable.collar1,
                R.drawable.collar2,
                12,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("Vibora ibérica",
                "Reptil",
                "Coronella girondica",
                3,
                R.drawable.vibora1,
                R.drawable.vibora2,
                13,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("lagarto",
                "Reptil",
                "Barisia imbricata",
                4,
                R.drawable.lagarto2,
                R.drawable.lagarto3,
                14,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            ),
            Animal("camaleón",
                "Reptil",
                "Chamaeleo chamaeleo",
                1,
                R.drawable.camaleon1,
                R.drawable.camaleon2,
                15,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In lacus dui, viverra vel blandit ut, cursus eget sem. Sed tempus massa nec lobortis porta. Cras ipsum odio, molestie id sapien vel, posuere tempor odio. Aliquam consequat neque at dapibus bibendum. Donec in neque egestas, efficitur felis nec, finibus ex."
            )
        )
    }
}