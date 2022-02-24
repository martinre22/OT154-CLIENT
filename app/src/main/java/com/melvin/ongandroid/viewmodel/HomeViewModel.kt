package com.melvin.ongandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.melvin.ongandroid.businesslogic.GetActivitiesInteractor
import com.melvin.ongandroid.model.apimodel.ActivityModel
import kotlinx.coroutines.launch
import org.imaginativeworld.whynotimagecarousel.CarouselItem

class HomeViewModel : ViewModel() {

    private var getActivitiesInteractor = GetActivitiesInteractor()

    //variables livedata para cargar los datos en el carrousel de bienvenida
    //martin re
    private val _activities: MutableLiveData<List<CarouselItem>> = MutableLiveData()
    val activities: LiveData<List<CarouselItem>> = _activities
    //variables livedata para ocultar carousel en caso de que la lista de actividades
    //este vacia
    //martin re
    private val _carouselIsGone: MutableLiveData<Boolean> = MutableLiveData()
    val carouselIsgone: MutableLiveData<Boolean> = _carouselIsGone


    //metodo de creacion viewmodel, iniciar los metodos privados de viewmodel actual
    //martin re



    //metodo que obtiene la lista de actividades desde el interactor
    //martin re
    fun getListActivities(){

        viewModelScope.launch {
            val activitiesInteractor: List<ActivityModel> = getActivitiesInteractor()
            var carouselList = mutableListOf<CarouselItem>()
            if (activitiesInteractor.isNotEmpty()){
                for (activity in activitiesInteractor){
                    carouselList.add(CarouselItem(activity.image,
                        activity.name.uppercase() + "\n" + activity.description))
                }
                _activities.postValue(carouselList)
            }else{
                _carouselIsGone.postValue(true)
            }
        }

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
>>>>>>> 9ce8733985c943d8f9c8be999f8d2176641e83a9
    }
}