package com.example.first_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController

class SegundoFragment : Fragment(R.layout.fragment_segundo) {

    private var nombre: String? = ""
    private var edad: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            nombre = arguments?.getString(MI_NOMBRE)
            edad = arguments?.getInt(MI_EDAD)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = view.findViewById<TextView>(R.id.txt_output)
        val button = view.findViewById<Button>(R.id.btn_enviar_datos)
        /*button.setOnClickListener {
            val result = "Hola desde el fragmento"
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
        }*/
        //text.text = "Hola $nombre, tienes $edad años"


        button.setOnClickListener {
            //val result = "Hola desde el segundo fragment"
            //setFragmentResult("requestKey", bundleOf("bundleKey" to result))

            findNavController().navigate(R.id.action_segundoFragment_to_tercerFragment)
        }

        setFragmentResultListener("requestKey") { requestKey, bundle ->
            val result = bundle.getString("bundleKey")
            //resultado.text = result
        }
    }

    companion object{
        private const val MI_NOMBRE = "nombre"
        private const val MI_EDAD = "edad"

        fun newInstance(nombre: String, edad: Int) = SegundoFragment().apply {
            arguments = bundleOf(MI_NOMBRE to nombre, MI_EDAD to edad)
        }
    }
}