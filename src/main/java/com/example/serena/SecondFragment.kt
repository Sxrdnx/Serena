package com.example.serena

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.serena.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController =  findNavController()
        binding.buttonOp1.setOnClickListener {
                navController.navigate(R.id.action_SecondFragment_to_tutorialGuideFragment)
        }
        binding.buttonOp2.setOnClickListener {
            navController.navigate(R.id.action_SecondFragment_to_breathingBoxFragment)
        }
        binding.buttonOp3.setOnClickListener {
            navController.navigate(R.id.action_SecondFragment_to_calmingCirclesTutorialFragment)
        }
        binding.buttonOp4.setOnClickListener {
            navController.navigate(R.id.action_SecondFragment_to_connectsSensesFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}