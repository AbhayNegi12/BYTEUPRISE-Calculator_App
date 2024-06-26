package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator.CalculatorAction
import com.example.calculator.CalculatorButton
import com.example.calculator.CalculatorOperation
import com.plcoding.calculator.ui.theme.CalculatorPrepTheme

@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorPrepTheme {
                val hexColor = "#f7f7f7"
                val backgroundColor = Color(android.graphics.Color.parseColor(hexColor))
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 18.dp
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(backgroundColor)
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.spacedBy(buttonSpacing),
                    ) {
                        Text(
                            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp),
                            fontWeight = FontWeight.Light,
                            fontSize = 70.sp,
                            color = Color.Black,
                            maxLines = 2
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "AC",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)
                            ) {
                                viewModel.onAction(CalculatorAction.Clear)
                            }
                            CalculatorButton(
                                symbol = "Del",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Delete)
                            }
                            CalculatorButton(
                                symbol = "/",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "7",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(7))
                            }
                            CalculatorButton(
                                symbol = "8",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(8))
                            }
                            CalculatorButton(
                                symbol = "9",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(9))
                            }
                            CalculatorButton(
                                symbol = "x",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "4",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(4))
                            }
                            CalculatorButton(
                                symbol = "5",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(5))
                            }
                            CalculatorButton(
                                symbol = "6",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(6))
                            }
                            CalculatorButton(
                                symbol = "-",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "1",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(1))
                            }
                            CalculatorButton(
                                symbol = "2",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(2))
                            }
                            CalculatorButton(
                                symbol = "3",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(3))
                            }
                            CalculatorButton(
                                symbol = "+",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "0",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(0))
                            }
                            CalculatorButton(
                                symbol = ".",
                                color = White,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Decimal)
                            }
                            CalculatorButton(
                                symbol = "=",
                                color = Blue,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Calculate)
                            }
                        }
                    }
                }
            }
        }
    }
}