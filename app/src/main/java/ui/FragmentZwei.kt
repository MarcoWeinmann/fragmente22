package ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fragmente22.R
import com.example.fragmente22.databinding.FragmentZweiBinding


class FragmentZwei : Fragment() {

    private lateinit var binding: FragmentZweiBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_zwei, container, false)

        return binding.root
    }

    //TODO: onViewcreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.imageView.setImageResource(R.drawable.chilli1)
    }

    }

