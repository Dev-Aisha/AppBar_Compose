package com.example.appbar

import com.example.appbar.ui.theme.AppBarTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBarTheme {

//                val state1= remember { mutableStateListOf(0)
//                    var state2 by remember { mutableStateListOf(0)
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                            title = {
                                Text(
                                    "Answer the following Questions:",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            },
                            navigationIcon = {
                                IconButton(onClick = { /* do something */ }) {
                                    Icon(
                                        imageVector = Icons.Filled.ArrowBack,
                                        contentDescription = "Localized description"
                                    )
                                }
                            },
                        )
                    },
                    bottomBar = {
                        BottomAppBar(
                            actions = {
                                IconButton(onClick = { /* do something */ }) {
                                    Icon(Icons.Filled.Check, contentDescription = "Localized description")
                                }
                                IconButton(onClick = { /* do something */ }) {
                                    Icon(
                                        Icons.Filled.Edit,
                                        contentDescription = "Localized description",
                                    )
                                }
                                IconButton(onClick = { /* do something */ }) {
                                    Icon(
                                        Icons.Filled.Build,
                                        contentDescription = "Localized description",
                                    )
                                }
                                IconButton(onClick = { /* do something */ }) {
                                    Icon(
                                        Icons.Filled.AccountBox,
                                        contentDescription = "Localized description",
                                    )
                                }
                            },
                            floatingActionButton = {
                                FloatingActionButton(
                                    onClick = { /* do something */ },
                                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                                ) {
                                    Icon(Icons.Filled.Add, "Localized description")
                                }
                            }
                        )
                    },








                    content = { innerPadding ->
//                        @Composable
//                        fun Quiz(
//                            viewModel:QuizViewModel=androidx.lifecycle.viewmodel.compose.viewModel(),
//                        ){
//                            LazyColumn(Modifier.padding(16.dp)) {
//                                items(viewModel.qlist){qitem->
//                                    Text(text = qitem.ques)
//                                    val seloption = rememberSaveable{
//                                        mutableStateOf("")
//                                    }
//
//                                    qitem.answ.forEach{answer->
//                                        Row(){
//                                            Modifier
//                                                .padding(vertical = 12.dp)
//                                                .fillMaxWidth()
//                                                .clickable {
//                                                    seloption.value = answer
//                                                    viewModel.checkAnswer(qitem, answer)
//                                                }
//                                            RadioButton(
//                                                selected = (answer == seloption.value) ,
//                                                onClick = {
//                                                    seloption.value =answer
//                                                    viewModel.checkAnswer(qitem,answer)
//
//                                                }
//                                            )
//                                            Text(text = answer)
//                                        }
//                                    }
//                                }
//                                item{
//                                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
//                                        Button(onClick = {
//                                            viewModel.onSubmit()
//
//                                        }){
//                                            Text(text = "submit")
//                                        }
//
//                                    }
//                                }
//                                item {
//                                    Text(text = viewModel.score.value)
//
//                                }
//
//                            }
//                        }

                    }
                )
            }
        }
    }
}
//