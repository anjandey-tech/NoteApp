package com.inturnsala.notes

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao
{
     @Insert(onConflict = OnConflictStrategy.IGNORE)
  suspend  fun insert(note: Note)

    @Delete
   suspend   fun delete(note: Note)  //suspend ensure that this method call only by background thead, not by main thread
  @Query("Select * from notes_table order by id ASC")
    fun getAllNotes():LiveData<List<Note>>
}