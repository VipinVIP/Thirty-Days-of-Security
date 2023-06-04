package com.example.thirtydaysofsecurity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysofsecurity.data.SecurityTask
import com.example.thirtydaysofsecurity.data.securityTasks
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

@Preview(showBackground = true)
@Composable
fun CardList() {
    ThirtyDaysOfSecurityTheme {
    LazyColumn(Modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp)){
        items(securityTasks){
            item->
            DayCard(item)
        }
    }}
}

//@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DayCard(
    dailyTask: SecurityTask
) {
        var expanded by remember{ mutableStateOf(false) }

        Card(modifier = Modifier, onClick = {expanded=!expanded}) {
            Column(modifier= Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(text = "day ${dailyTask.dayNum}")
                Text(text = stringResource(id = dailyTask.title))
                Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription ="", modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.FillBounds )
                if(expanded) Text(text = stringResource(id = dailyTask.description))

            }

    }
}