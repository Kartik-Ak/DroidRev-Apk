Android Rev-Lab: A Beginner's Reverse Engineering Challenge
Android Rev-Lab is a gamified Android application designed to teach the fundamentals of mobile reverse engineering. It consists of three distinct levels, each focusing on a different vulnerability or bypass technique commonly found in Android applications.

Built with Kotlin and Jetpack Compose, this app serves as a playground for aspiring security researchers to practice using tools like JADX, Apktool, and Smali modification.

🚩 The Challenges
Level 1: Hardcoded Secrets & Static Analysis
The Setup: A standard login screen with two text fields (Username and Password).

The Goal: Gain access to the "Success" state without being given the credentials.

The Challenge: The credentials are not stored in a database; they are hardcoded directly within the app's logic. Beginners must decompile the APK (using JADX or similar tools) and perform Static Analysis to find the hidden strings in the source code.

Level 2: Client-Side Logic Manipulation
The Setup: A screen where the user is prompted to create their own username and password.

The Goal: Understand how user-defined data is handled within the application's state.

The Challenge: This level introduces the concept of Local State Management. It encourages learners to look at how the app stores or validates input temporarily and prepares them for more advanced topics like intercepting local storage or SharedPreferences.

Level 3: Deep Links & Navigation Routing
The Setup: An app utilizing NavHost for navigation between screens.

The Goal: Access a "Hidden Screen" that is not reachable through the standard UI flow.

The Challenge: This level focuses on Intent and Route Manipulation. To pass this, a user must identify the specific route string used in the Navigation Graph. By using tools like Frida or modifying the Smali code, the user must change the routing logic to force the app to navigate to the hidden destination.

🛠️ Tools Recommended for these Challenges
To solve these levels, you will likely need:

JADX / JADX-GUI: For viewing the Java/Kotlin source code.

Apktool: For decompiling and rebuilding the APK.

Smali: For Changing Value

Install the APK on an emulator or a rooted device.

Try to clear all 3 levels without looking at the src folder in this repo!
