package com.example.ecommercekotlin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ecommercekotlin.databinding.FragmentHomeBinding
import com.example.ecommercekotlin.ui.dashboard.DashboardViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Removed the TextView and its observer
        // val textView: TextView = binding.textDashboard
        // dashboardViewModel.text.observe(viewLifecycleOwner) {
        //     textView.text = it
        // }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}