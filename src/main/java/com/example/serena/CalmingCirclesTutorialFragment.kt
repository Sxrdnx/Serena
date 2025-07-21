package com.example.serena

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.serena.databinding.FragmentCalmingCirclesTutorialBinding
import com.google.android.material.tabs.TabLayoutMediator


class CalmingCirclesTutorialFragment : Fragment() {
    private lateinit var binding: FragmentCalmingCirclesTutorialBinding
    private val adapter: ViewPagerTutorialAdapter by lazy { ViewPagerTutorialAdapter() }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCalmingCirclesTutorialBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpInfoTutorial()
    }


    private fun setUpInfoTutorial()= with(binding){
        adapter.submitList(setInfo())
        vpTutorial.adapter = adapter
        val tablyM= TabLayoutMediator(tabSelect,vpTutorial) { p0, p1 -> }
        tablyM.attach()
    }

    private fun setInfo(): List<TutorialModel> {
        return listOf(
            TutorialModel(R.drawable.tecnica3paso1al2,"Paso 1: Siéntate en una mesa con los pies firmemente plantados en el suelo."),
            TutorialModel(R.drawable.tecnica3paso1al2, "Paso 2: Dibuja un círculo en una hoja de papel que llene la mayor parte de la página."),
            TutorialModel(R.drawable.tecnica3paso3al6,"Paso 3: Manteniendo tu lápiz en la página en todo momento, comienza a dibujar un patrón circular."),
            TutorialModel(R.drawable.tecnica3paso3al6,"Paso 4: Mantente enfocado en tu dibujo sin juzgar."),
            TutorialModel(R.drawable.tecnica3paso3al6,"Paso 5: Continúa dibujando en círculos todo el tiempo que necesites."),
            TutorialModel(R.drawable.tecnica3paso3al6,"Paso 6: Después de unos minutos, puedes cambiar el patrón (dirección o forma) y el color de la pluma."),
        )
    }

}