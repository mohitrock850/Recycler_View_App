package com.example.recycler_view.models

class Anime {
    var image: Int? = null
    lateinit var name : String
    lateinit var title : String

    constructor(image:Int?, name:String, title:String){
        this.image=image
        this.name=name
        this.title=title
    }
}
