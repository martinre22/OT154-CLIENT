package com.melvin.ongandroid.viewmodel

import androidx.lifecycle.ViewModel
import com.google.api.AnnotationsProto.http
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class HomeViewModel : ViewModel() {
    var imageHomeList = mutableListOf<CarouselItem>()

    lateinit var carouselItem: ImageCarousel

     fun addImages() {
        imageHomeList.add(
            CarouselItem(
                "https://th.bing.com/th/id/OIP.F1b4p1LyWbTW4Mh9MhOmMQHaEc?pid=ImgDet&rs=1",
                "ONG dedicada a la educación busca recolectar fondos para niños y niñas afectados por el covid en El Milagro."
            )
        )
        imageHomeList.add(
            CarouselItem(
                "https://i.pinimg.com/736x/50/2c/e6/502ce612623e76f1026986ea0d249b7d.jpg",
                "Mas de 5000 juguetes donados"
            )
        )
        imageHomeList.add(
            CarouselItem(
                "https://th.bing.com/th/id/R.b821233e027b592cb24559f785233ff6?rik=NuZs0Hnxnw331Q&riu=http%3a%2f%2fwww.thecoderpedia.com%2fwp-content%2fuploads%2f2020%2f06%2fCoding-Meme-Code-Comments-be-Like-925x1024.jpg%3fx23803&ehk=qRwdA%2bLdi3JDoxpKyMf3QBgFCu2%2ftDZKkca4%2fCzm74Q%3d&risl=&pid=ImgRaw&r=0",
                "CodeMeme"
            )
        )
        imageHomeList.add(
            CarouselItem(
                "https://i.ytimg.com/vi/atDnnHinKUg/maxresdefault.jpg",
                "Exito en campañá escolar."
            )
        )
         carouselItem.addData(imageHomeList)
    }
}