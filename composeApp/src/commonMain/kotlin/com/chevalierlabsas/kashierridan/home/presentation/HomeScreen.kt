import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MusicOff
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import home.domain.Item
import kashierridan.composeapp.generated.resources.Res
import kashierridan.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

private val Res.string.selected_item_label: StringResource
private val Res.string.add_item_fab_label: StringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    var totalPrice by remember { mutableStateOf(0.00) }
    val selectedItems = remember { mutableStateListOf<Item>() }
    var showSelectedItem by remember { mutableStateOf(true) }
    var showAllItem by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(Res.string.app_name))
                }
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { TODO("Add Item.") },
                containerColor = MaterialTheme.colorScheme.tertiary,
                text = { Text(text = stringResource(Res.string.add_item_fab_label)) },
                icon = { Icon(Icons.Filled.Add, contentDescription = stringResource(Res.string.add_item_fab_label)) }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
        ) {
            item {
                TotalPriceHeader(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    totalPrice = totalPrice,
                    TotalPrice = TODO()
                )
            }
            item {
                SaveButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onSave = { TODO("SAVE data")},
                    enabled = selectedItems.isNotEmpty() && totalPrice > 0.00
                )
            }
            item {
                MusicButton(
                    onClick = {TODO("PLAY MUSIK")},
                    modifier = Modifier.padding(horizontal = 56.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

                ) {
                    Icon(
                        ImageVector = Icons.Default.MusicOff,
                        contentDescription = "BERMUSIK",
                        tint = Color.Black,
                        imageVector = TODO(),
                    )
                }
            }
           
        }

    }

}

@Composable
fun MusicButton(
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues,
    colors: ButtonColors,
    function: () -> ERROR
) {
    TODO("Not yet implemented")
}

@Composable
fun SaveButton(enabled: Boolean, onSave: () -> Nothing, modifier: Modifier) {
    TODO("Not yet implemented")
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun HomeSeparator(modifier: Modifier, title: String, visible: Boolean, onAction: (ERROR) -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun HomeSeparator(modifier: Modifier, title: String, visible: Boolean, onAction: (ERROR) -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun MusicButton(
    onClick: () -> Nothing,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues,
    colors: ButtonColors,
    content: @Composable () -> ERROR
) {
    TODO("Not yet implemented")
}
}

@Composable
fun HomeSeparator(modifier: Modifier, title: String, visible: Boolean, onAction: (ERROR) -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun MusicButton(
    onClick: () -> Nothing,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues,
    colors: ButtonColors,
    content: @Composable () -> ERROR
) {
    TODO("Not yet implemented")
}

@Composable
fun SaveButton(modifier: Modifier, onSave: () -> Nothing, enabled: Boolean) {
    TODO("Not yet implemented")
}