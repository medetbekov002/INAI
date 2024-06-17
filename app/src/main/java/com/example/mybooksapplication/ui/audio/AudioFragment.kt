package com.example.mybooksapplication.ui.audio

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentAudioBinding


class AudioFragment : Fragment() {

    private lateinit var binding: FragmentAudioBinding
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var handler: Handler
    private var isPlaying = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAudioBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mediaPlayer = MediaPlayer.create(context, R.raw.you_can)
        binding.seekBar.max = mediaPlayer.duration
        binding.durationText.text = getTimeString(mediaPlayer.duration)

        handler = Handler()
        activity?.runOnUiThread(object : Runnable {
            override fun run() {
                if (mediaPlayer != null) {
                    val currentPosition = mediaPlayer.currentPosition
                    binding.seekBar.progress = currentPosition
                    binding.progressText.text = getTimeString(currentPosition)
                }
                handler.postDelayed(this, 1000)
            }
        })

        binding.playButton.setOnClickListener {
            if (!isPlaying) {
                mediaPlayer.start()
                isPlaying = true
                binding.playButton.setImageResource(R.drawable.play)
            } else {
                mediaPlayer.pause()
                isPlaying = false
                binding.playButton.setImageResource(R.drawable.polygon_3)
            }
        }

        binding.ivArrowBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.stopButton.setOnClickListener {
            mediaPlayer.pause()
            mediaPlayer.seekTo(0)
            binding.progressText.text = "00:00"
            binding.seekBar.progress = 0
            mediaPlayer.start() // добавлен вызов метода start()
            binding.playButton.setImageResource(R.drawable.play)
        }

        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p2) {
                    mediaPlayer.seekTo(p1)
                    binding.progressText.text = getTimeString(p1)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

        mediaPlayer.setOnCompletionListener {
            binding.stopButton.performClick()
        }
    }

    private fun getTimeString(duration: Int): String {
        val minutes = duration / 1000 / 60
        val seconds = duration / 1000 % 60
        return String.format("%02d:%02d", minutes, seconds)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        handler.removeCallbacksAndMessages(null)
        mediaPlayer.release()
    }

}