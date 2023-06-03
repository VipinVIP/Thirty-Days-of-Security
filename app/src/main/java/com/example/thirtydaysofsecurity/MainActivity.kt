package com.example.thirtydaysofsecurity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysofsecurity.ui.theme.ThirtyDaysOfSecurityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysOfSecurityTheme {
               CardList()
        }
    }
}}

@Composable
fun CardList() {

}

@Preview(showBackground = true)
@Composable
fun DayCard() {
    ThirtyDaysOfSecurityTheme {
        Card() {
            Column(modifier= Modifier
                .fillMaxWidth()
                .padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(text = "day 1")
                Text(text = "MY TITLE")
                Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription ="", modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.FillBounds )
                Text(text = "Add an extra layer of security to your accounts by enabling two-factor authentication, which requires a verification code in addition to your password")
            }
        }
    }
}