package com.journeyeats.repository

import com.google.firebase.firestore.FirebaseFirestore

// Define a simple data class that represents your Firestore document
data class User(val name: String, val email: String, val age: Int)

class FirestoreRepository {
    private val db = FirebaseFirestore.getInstance()

}