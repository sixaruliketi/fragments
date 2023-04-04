package com.example.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragments.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {_binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = Navigation.findNavController(view)

        binding.apply {
            button.setOnClickListener {
                val digit = editTextTextPersonName.text.toString()

                if (digit.isEmpty()){
                    return@setOnClickListener
                }

                val amount = digit.toInt()
                val action = BlankFragmentDirections.actionBlankFragmentToBlankFragment2(amount)
                controller.navigate(action)

            }
        }
    }
}