package com.codespacepro.dagger_hilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codespacepro.dagger_hilt.demo.Car
import com.codespacepro.dagger_hilt.demo.MainQualifier
import com.codespacepro.dagger_hilt.demo.One
import com.codespacepro.dagger_hilt.demo.QualifierDemo
import com.codespacepro.dagger_hilt.demo.Two
import com.codespacepro.dagger_hilt.ui.theme.DaggerHiltTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var one: One

    @Inject
    lateinit var two: Two

    @Inject
    lateinit var mainQualifier: MainQualifier

    @Inject
    lateinit var qualifierDemo: QualifierDemo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            one.getName()
            two.getName()
            mainQualifier.getName()
            qualifierDemo.getName()

            DaggerHiltTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android ")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaggerHiltTheme {
        Greeting("Android")
    }
}