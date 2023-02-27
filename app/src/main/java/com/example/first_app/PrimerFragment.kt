package com.example.first_app

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController

class PrimerFragment : Fragment(R.layout.fragment_primer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btn_navegar)
        val resultado = view.findViewById<TextView>(R.id.txt_output)

        boton.setOnClickListener {
            //Log.d("MainActivity", "Se ejecuta")
            findNavController().navigate(R.id.action_primerFragment_to_segundoFragment, bundleOf("nombre" to "Juan", "edad" to 20))
        }
        setFragmentResultListener("requestKey") { requestKey, bundle ->
            val result = bundle.getString("bundleKey")
            resultado.text = result
        }
    }


}

