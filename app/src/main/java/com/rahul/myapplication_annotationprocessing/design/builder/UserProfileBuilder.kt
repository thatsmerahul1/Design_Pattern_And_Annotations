package com.rahul.myapplication_annotationprocessing.design.builder

class UserProfileBuilder {
    private var firstName:String? = null
    private var lastName:String? = null
    private var age:Int? = null
    private var profilePicture:String? = null

    fun setFirstName(firstName:String) = apply { this.firstName = firstName }
    fun setLastName(lastName:String) = apply { this.lastName = lastName }
    fun setAge(age:Int) = apply { this.age = age }
    fun setProfilePicture(profilePicture:String) = apply { this.profilePicture = profilePicture }

    fun build():UserProfile {
        if (firstName==null || lastName==null || profilePicture==null || age==null) {
            throw IllegalStateException("First name, last name, and age cannot be null")
        }
        return UserProfile(firstName!!, lastName!!, age!!, profilePicture)
    }
}

fun main() {
    val userProfile = UserProfileBuilder()
        .setFirstName("Rahul")
        .setLastName("Maurya")
        .setAge(30)
        .setProfilePicture("https://www.google.com")
        .build()

    println(userProfile)
}