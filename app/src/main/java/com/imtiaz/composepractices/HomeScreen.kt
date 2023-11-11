package com.imtiaz.composepractices

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.imtiaz.composepractices.ui.theme.Beige1
import com.imtiaz.composepractices.ui.theme.Beige2
import com.imtiaz.composepractices.ui.theme.Beige3
import com.imtiaz.composepractices.ui.theme.BlueViolet1
import com.imtiaz.composepractices.ui.theme.BlueViolet2
import com.imtiaz.composepractices.ui.theme.BlueViolet3
import com.imtiaz.composepractices.ui.theme.ButtonBlue
import com.imtiaz.composepractices.ui.theme.DarkerButtonBlue
import com.imtiaz.composepractices.ui.theme.LightGreen1
import com.imtiaz.composepractices.ui.theme.LightGreen2
import com.imtiaz.composepractices.ui.theme.LightGreen3
import com.imtiaz.composepractices.ui.theme.LightRed
import com.imtiaz.composepractices.ui.theme.OrangeYellow1
import com.imtiaz.composepractices.ui.theme.OrangeYellow2
import com.imtiaz.composepractices.ui.theme.OrangeYellow3
import com.imtiaz.composepractices.ui.theme.TextWhite

@Composable
fun HomeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFCA8E8E))) {
        Column {
            GreetingSection() //Heading
            ChipSection(chips = listOf("Sweet sleep", "Insomnia","Depression"))


        }
    }
}

//Heading
@Composable
fun GreetingSection(
    name: String = "Imtiaz"
) {
    Row (horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
        )
    {

        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "Good Morning, $name",
                style = MaterialTheme.typography.headlineSmall
            )

            Text(
                text = "we wish you have a nice day!",
                style = MaterialTheme.typography.bodyLarge
            )

        }

        Icon(painter = painterResource(id = R.drawable.ic_search_icon),
            contentDescription = "Search",
            tint = Color.Red,
            modifier = Modifier.size(24.dp)
        )

    }

}



/*Button Horizontal*/
@Composable
fun ChipSection(chips: List<String>)
{
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow{
        items(chips.size){
            Box(contentAlignment = Alignment.Center, 
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ){
                Text(text = chips[it],color = TextWhite)
            }
        }
    }
}









