package com.example.androidbonus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class JokeFragment : Fragment() {
    private val jokes = listOf(
        "Почему программисты не любят природу? – В ней слишком много багов!",
        "Кодер пошел на свидание… и получил NullPointerException.",
        "Где программисты берут кофе? – В Java кафе!"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_joke, container, false)

        val jokeText = view.findViewById<TextView>(R.id.jokeText)
        val jokeButton = view.findViewById<Button>(R.id.jokeButton)

        jokeButton.setOnClickListener {
            jokeText.text = jokes.random()
        }

        return view
    }
}
