package com.inturnsala.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")         //name of table
class Note(@ColumnInfo(name = "text")val text:String)  //coulmn nmae= text
{
    @PrimaryKey(autoGenerate = true) var id = 0    //primarty key is id which is auto i  ncrement
}