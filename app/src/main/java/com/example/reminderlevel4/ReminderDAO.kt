package com.example.reminderlevel4

import androidx.room.*

@Dao
interface ReminderDAO {

    @Query("SELECT * FROM reminderTable")
    suspend fun getAllReminders(): List<Reminder>

    @Insert
    suspend fun insertReminder(rmeinder: Reminder)

    @Delete
    suspend fun deleteReminder(rmeinder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)
}