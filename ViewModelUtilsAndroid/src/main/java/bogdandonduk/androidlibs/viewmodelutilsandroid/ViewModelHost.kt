package bogdandonduk.androidlibs.viewmodelutilsandroid

import androidx.lifecycle.ViewModel

interface ViewModelHost<T : ViewModel> {
    var viewModel: T?
    val viewModelInitialization: () -> T

    fun getCurrentViewModel() : T {
        if(viewModel == null)
            viewModel = viewModelInitialization.invoke()

        return viewModel!!
    }
}