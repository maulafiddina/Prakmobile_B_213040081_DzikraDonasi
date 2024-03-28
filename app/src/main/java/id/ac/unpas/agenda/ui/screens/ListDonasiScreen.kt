package id.ac.unpas.agenda.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import id.ac.unpas.agenda.persistences.DonasiDao

@Composable
fun ListDonasiScreen(donasiDao: DonasiDao) {
    val list by donasiDao.loadAll().observeAsState(listOf())

    Column(modifier = Modifier.fillMaxWidth()) {
        list.forEach { donasi ->
            DonasiItem(item = donasi)
        }
    }
}
