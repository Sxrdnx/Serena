package com.example.serena

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.serena.databinding.FragmentTutorialGuideBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class TutorialGuideFragment : Fragment() {
    private lateinit var binding: FragmentTutorialGuideBinding
    private val adapter: ViewPagerTutorialAdapter by lazy { ViewPagerTutorialAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTutorialGuideBinding.inflate(inflater,container,false)
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
            TutorialModel(R.drawable.tecpaso1,"Paso 1: Inhala lo más profundo que puedas durante cuatro segundos mientras te imaginas subiendo por un lado de un cuadrado mental."),
            TutorialModel(R.drawable.tecnica1paso2, "Paso 2: Aguanta la respiración durante cuatro segundos mientras imaginas cruzar la pared superior del cuadrado."),
            TutorialModel(R.drawable.tecnica1paso3,"Paso 3: Exhala lentamente durante cuatro segundos mientras bajás por el otro lado del cuadrado."),
            TutorialModel(R.drawable.tecnica1paso4,"Paso 4: Aguanta la respiración durante cuatro segundos mientras cruzas la parte inferior del cuadrado y regresas al punto de llegada."),
            TutorialModel(R.drawable.tecnica1paso4,"Paso 5: Disfruta del entorno que has creado. Puedes dedicarle unos minutos o el tiempo que necesites. Si se vuelve difícil mantener la concentración, enfoca tus sentidos una vez más y respira lentamente.")
        )
    }


}