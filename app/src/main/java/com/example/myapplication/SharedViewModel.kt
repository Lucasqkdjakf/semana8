import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    // Armazena o dado publicado
    val projetoAutomotivo = MutableLiveData<String>()
}