package id.ac.unpas.agenda.persistences


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.ac.unpas.agenda.models.Donasi

@Dao
interface DonasiDao {

    @Query("select * from donasi")
    fun loadAll(): LiveData<List<Donasi>>

    @Query("select * from donasi where id = :id")
    fun load(id: String): LiveData<Donasi>

    @Query("select * from donasi where id = :id")
    suspend fun getById(id: String): Donasi?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(vararg items: Donasi)

}