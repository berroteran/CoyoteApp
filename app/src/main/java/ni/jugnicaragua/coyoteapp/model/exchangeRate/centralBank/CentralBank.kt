package ni.jugnicaragua.coyoteapp.model.exchangeRate.centralBank

import androidx.room.Entity

@Entity(tableName = "CentralBank", primaryKeys = ["id"])
data class CentralBank(
    val amount: Double, // 34.0877
    val createdOn: String, // 2020-02-21T06:15:01.166
    val currency: String, // DOLAR ($)
    val date: String, // 2020-03-31
    val id: Int, // 20200331
    val updatedOn: Any // null
)