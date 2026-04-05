package com.example.reverse_me

import ReverseME.CreatePAss
import ReverseME.HiddenScreen
import ReverseME.Loginme
import ReverseME.NormalScreen
import ReverseME.Screens
import ViewModel.RView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.reverse_me.ui.theme.Reverse_MeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                val navController = rememberNavController()
                val viewModel: RView = viewModel()

            NavHost(navController=navController, startDestination = "login"){

                composable("login"){
                    Loginme(view = viewModel,navController)
                }

                composable ("Pass"){
                    CreatePAss(cc  = viewModel,navController)
                }

                composable("Home"){
                    Screens(navController)
                }
                composable("Normal") {
                    NormalScreen()
                }
                composable("Hidden") {
                    HiddenScreen()
                }

            }
        }
    }
}

