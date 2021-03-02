package com.example.androiddevchallenge

data class AnimalModel(
    val id: Int,
    val imageUrl: String,
    val name: String = "Your Future Pet!",
    val description: String = "Hurry!! Make this your pet before it's too late. Call us right now!"
)

var animalModelList = listOf(
    AnimalModel(
        1,"https://expertphotography.com/wp-content/uploads/2018/04/pug-outfit.jpg",
        "Charlie",
        "Akitas are muscular, double-coated dogs of ancient Japanese lineage famous for their dignity…"
    )
,   AnimalModel(
        2, "https://i.pinimg.com/originals/9d/54/34/9d54345f6e8d7bdf67035e085c272418.jpg",
        "Max",
        "The Alaskan Klee Kai is a small-sized companion dog that is alert, energetic, and curiou…"
    )
,   AnimalModel(
        3,"https://lh3.googleusercontent.com/proxy/xHiRSiRxU2UcuySUmi94HglW2fl4SkOO1eDWIb3TVaqgbHoCi9ZNQMxZzf0gRAi5S40mVwG5qNVkot8bmlhWf-QqMFzhZkEXPcP29PugLNSGEMr6O0l7e9K5hO2zS-S6VM5ymlyzhFnPJBLLDUSdJ1MDsv4PTPUva0UzZTd5wNZtNL1ucSK3mRY33fwfnIL4qv0TDTWy2YkHBqkggdm1",
        "Buddy",
        "An immensely strong, heavy-duty worker of spitz type, the Alaskan Malamute is an affectionate…"
    )
,   AnimalModel(4,"https://swiftype-ss.imgix.net/https%3A%2F%2Fcdn.petcarerx.com%2Fblog%2Fwp-content-uploads-2014-03-sophie-bulldog-blog-thumb.jpg?ixlib=rb-1.1.0&h=320&fit=clip&dpr=2.0&s=04f32e55878ae1fffc0b0243ef37ab67",
        "Oscar",
        "American Bulldogs are a well-balanced athletic dog that demonstrate great strength, endurance…"
    )
,   AnimalModel(5,"https://i.pinimg.com/originals/40/22/87/4022871d75dca9ea790d7b2613d110dd.jpg",
        "Milo",
        "The American Hairless Terrier, a Louisiana native, is a smart, inquisitive, and playful dog tha…"
    )
,   AnimalModel(6,"https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX3604368.jpg",
        "Archie",
        "American Foxhounds are good-natured, low-maintenance hounds who get on well with kids, dogs, eve…"
    )
,   AnimalModel(7,"https://bulldogangels.com/artillery/wp-content/uploads/2019/12/baby5wka.jpg",
        "Ollie",
        "The American Hairless Terrier, a Louisiana native, is a smart, inquisitive, and playful dog tha…"
    )
,   AnimalModel(8,"https://data.whicdn.com/images/335157102/original.jpg",
        "Toby",
        "Intelligence is one of the American Leopard Hound's very best attributes. The breed is loving and…"
    )
,   AnimalModel(9,"https://expertphotography.com/wp-content/uploads/2019/02/pet-photography-6.jpg",
        "Jack",
        "The American Water Spaniel, native to the lake country of the upper Midwest, is an upbea…"
    )
,   AnimalModel(10,"https://pbs.twimg.com/profile_images/1231318855861067776/YbQegxv-_400x400.jpg",
        "Teddy",
        "The American Staffordshire Terrier, known to their fans as AmStaffs, are smart, confide…"
    )
,   AnimalModel(11,"https://i.pinimg.com/originals/a3/cf/ce/a3cfce855a833b760b5a8cc34a1f4cd1.jpg",
        "Bella",
        "The Australian Kelpie is a lithe, active dog, capable of untiring work. He is extremely…"
    )
,   AnimalModel(12,"https://i.pinimg.com/originals/b2/77/8f/b2778f20b528e6f0281bee5dd8c8995b.jpg",
        "Molly",
        "The Australian Shepherd, a lean, tough ranch dog, is one of those “only in America” stories: a…"
    )
,   AnimalModel(13,"https://www.meme-arsenal.com/memes/e92591aac0a517b91375f9e74ed0e590.jpg",
        "Coco",
        "The Barbado da Terceira is medium-sized herder that is a great companion and family dog. The breed…"
    )
,   AnimalModel(14,"https://i.pinimg.com/originals/84/8e/87/848e87961b785b95231547c07ed1f63f.jpg",
        "Lucy",
        "An archetypic water dog of France, the Barbet is a rustic breed of medium size and balanced…"
    )
)