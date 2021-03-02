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
    )
,   AnimalModel(2, "https://i.pinimg.com/originals/9d/54/34/9d54345f6e8d7bdf67035e085c272418.jpg")
,   AnimalModel(3,"https://lh3.googleusercontent.com/proxy/xHiRSiRxU2UcuySUmi94HglW2fl4SkOO1eDWIb3TVaqgbHoCi9ZNQMxZzf0gRAi5S40mVwG5qNVkot8bmlhWf-QqMFzhZkEXPcP29PugLNSGEMr6O0l7e9K5hO2zS-S6VM5ymlyzhFnPJBLLDUSdJ1MDsv4PTPUva0UzZTd5wNZtNL1ucSK3mRY33fwfnIL4qv0TDTWy2YkHBqkggdm1")
,   AnimalModel(4,"https://swiftype-ss.imgix.net/https%3A%2F%2Fcdn.petcarerx.com%2Fblog%2Fwp-content-uploads-2014-03-sophie-bulldog-blog-thumb.jpg?ixlib=rb-1.1.0&h=320&fit=clip&dpr=2.0&s=04f32e55878ae1fffc0b0243ef37ab67")
,   AnimalModel(5,"https://i.pinimg.com/originals/40/22/87/4022871d75dca9ea790d7b2613d110dd.jpg")
,   AnimalModel(6,"https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX3604368.jpg")
,   AnimalModel(7,"https://bulldogangels.com/artillery/wp-content/uploads/2019/12/baby5wka.jpg")
,   AnimalModel(8,"https://data.whicdn.com/images/335157102/original.jpg")
,   AnimalModel(9,"https://expertphotography.com/wp-content/uploads/2019/02/pet-photography-6.jpg")
,   AnimalModel(10,"https://pbs.twimg.com/profile_images/1231318855861067776/YbQegxv-_400x400.jpg")
,   AnimalModel(11,"https://i.pinimg.com/originals/a3/cf/ce/a3cfce855a833b760b5a8cc34a1f4cd1.jpg")
,   AnimalModel(12,"https://i.pinimg.com/originals/b2/77/8f/b2778f20b528e6f0281bee5dd8c8995b.jpg")
,   AnimalModel(13,"https://www.meme-arsenal.com/memes/e92591aac0a517b91375f9e74ed0e590.jpg")
,   AnimalModel(14,"https://i.pinimg.com/originals/84/8e/87/848e87961b785b95231547c07ed1f63f.jpg")
)