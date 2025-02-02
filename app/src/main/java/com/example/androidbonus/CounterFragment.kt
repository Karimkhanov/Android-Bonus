package com.example.androidbonus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_counter, container, false)

        val counterText = view.findViewById<TextView>(R.id.counterText)
        val incrementButton = view.findViewById<Button>(R.id.incrementButton)

        // Восстанавливаем сохраненное значение (если есть)
        counterText.text = counter.toString()

        incrementButton.setOnClickListener {
            counter++
            counterText.text = counter.toString()
        }

        return view
    }
}
