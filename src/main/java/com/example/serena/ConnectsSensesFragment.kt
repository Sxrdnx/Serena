package com.example.serena

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.serena.databinding.FragmentBreathingBoxBinding
import com.example.serena.databinding.FragmentConnectsSensesBinding
import com.google.android.material.tabs.TabLayoutMediator


class ConnectsSensesFragment : Fragment() {
    private lateinit var binding: FragmentConnectsSensesBinding
    private val adapter: ViewPagerTutorialAdapter by lazy { ViewPagerTutorialAdapter() }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentConnectsSensesBinding.inflate(inflater,container,false)
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
            TutorialModel(R.drawable.tecnica4paso1,"Paso 1: Nombra cinco objetos que puedas ver dónde estás."),
            TutorialModel(R.drawable.tecnica4paso2, "Paso 2: Nombra cuatro cosas que puedas sentir o tocar en este momento."),
            TutorialModel(R.drawable.tecnica4paso3,"Paso 3: Nombra tres cosas que puedas escuchar."),
            TutorialModel(R.drawable.tecnica4paso4,"Paso 4: Nombra dos cosas que puedas oler."),
            TutorialModel(R.drawable.tecnica4paso5,"Paso 5: Nombra una cosa que puedas saborear."),
        )
    }
}