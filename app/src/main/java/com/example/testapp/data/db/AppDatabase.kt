//package com.example.mvvm_demo.data.db
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//
//const val  CURRENT_USER_ID = 0
//
//
//@Database(
//    entities = [], version = 1, exportSchema = false)
//abstract class AppDatabase : RoomDatabase(){
//
//
//    companion object{
//
//        @Volatile
//        private var instance : AppDatabase? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context:Context) = instance ?: synchronized(LOCK){
//            instance?:buildDatabase(context).also {
//                instance = it
//            }
//        }
//
//        private fun buildDatabase(context: Context) =
//            Room.databaseBuilder(context.applicationContext,
//                AppDatabase::class.java,
//                "MyDatabase.db").build()
//    }
//}