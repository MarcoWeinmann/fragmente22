package ui

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragmente22.R
import com.example.fragmente22.databinding.FragmentHomeBinding


class FragmentHome : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
//TODO: onViewcreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.buttonLinks.setOnClickListener{
          findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToFragmentZwei())
        }
    binding.buttonRechts.setOnClickListener{
        findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToFragmentDrei())
    }

    }

    }

