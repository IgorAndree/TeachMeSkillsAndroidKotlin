package com.example.teachmeskillsandroidkotlin.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import com.example.teachmeskillsandroidkotlin.databinding.TestCoroutinesFragmentBinding
import com.example.teachmeskillsandroidkotlin.presentation.view_models.TestCoroutinesViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO

class TestCoroutinesFragment : Fragment() {
    private lateinit var binding: TestCoroutinesFragmentBinding
    private val viewModel: TestCoroutinesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TestCoroutinesFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        workWithMultithreading()
    }

    private fun workWithMultithreading() {
        workWithCoroutines()
    }

    private fun workWithCoroutines() =
        viewModel.viewModelScope.launch {
            Log.d("TEST_ANDROID", "Start work with downloading file")
            downloadFilesThroughAsync()
            downloadFilesThroughLaunch()
            Log.d("TEST_ANDROID", "All uploaded!")
        }

    private suspend fun downloadFilesThroughLaunch() = withContext(IO) {
        coroutineScope {
            launch { downloadFirstFile() }
            launch { downloadSecondFile() }
            launch { downloadThirdFile() }
            launch { downloadFourthFile() }
            launch { downloadFifthFile() }
        }
    }

    private suspend fun downloadFirstFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting launch download first file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... first file launch download finished ! .....")
    }

    private suspend fun downloadSecondFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting launch download second file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... second file launch download finished ! .....")
    }

    private suspend fun downloadThirdFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting launch download third file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... third file launch download finished ! .....")
    }

    private suspend fun downloadFourthFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting launch download fourth file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... fourth file launch download finished ! .....")
    }

    private suspend fun downloadFifthFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting launch download fifth file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... fifth file launch download finished ! .....")
    }
}

private suspend fun downloadFilesThroughAsync() = withContext(IO) {
    coroutineScope {
        async { downloadFirstFile() }
        async { downloadSecondFile() }
        async { downloadThirdFile() }
        async { downloadFourthFile() }
        async { downloadFifthFile() }
    }
}

private suspend fun downloadFirstFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting async download first file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... first file async download finished ! .....")
}

private suspend fun downloadSecondFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting async download second file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... second file async download finished ! .....")
}

private suspend fun downloadThirdFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting async download third file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... third file async download finished ! .....")
}

private suspend fun downloadFourthFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting async download fourth file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... fourth file async download finished ! .....")
}

private suspend fun downloadFifthFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting async download fifth file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... fifth file async download finished ! .....")
}



















