# Lost---Found-Item-Management-System
📌 Project Description

The Lost & Found Item Management System is a simple Java-based console application designed to help users report, view, and search for lost and found items.

The system provides a menu-driven interface where users can report a lost item, report a found item, view all reported items, and search for a specific item.

This project demonstrates basic Java programming concepts, including classes, methods, ArrayList, Scanner, loops, conditional statements, and switch-case.

🎯 Objectives
To provide a simple system for reporting lost items.
To allow users to report found items.
To display all reported lost and found items.
To provide a search facility for finding an item.
To demonstrate Java programming concepts through a real-world application.
✨ Features

The system provides the following features:

Report Lost Item
Enter the name of the lost item.
Enter the location.
Store the item details in the system.
Report Found Item
Enter the name of the found item.
Enter the location.
Store the item as a found item.
View Items
Displays all reported lost and found items.
Search Item
Allows the user to search for an item by name.
The search is case-insensitive.
Exit
Safely exits the application.
🛠️ Technologies Used
Programming Language: Java
Data Structure: ArrayList
Input: Scanner
Interface: Command Line / Console
IDE: Any Java-supported IDE
📂 Project Structure
LostAndFound/
│
├── LostAndFound.java
└── README.md
⚙️ How the System Works

When the program starts, it displays a menu:

--- LOST AND FOUND SYSTEM ---
1. Report Lost Item
2. Report Found Item
3. View Items
4. Search Item
5. Exit
Enter choice:

The user selects an option using a number.

The program uses a do-while loop to repeatedly display the menu until the user selects Exit.
🧩 Main Functionalities
1. Report Lost Item

The user selects option 1. The program calls:

addItem("Lost");

The user then enters the item name and location. The information is stored in an ArrayList.

2. Report Found Item

The user selects option 2. The program calls:

addItem("Found");

The item is stored with its location and "Found" status.

3. View Items

Option 3 displays all items stored in the system.

The program uses a for loop to display every item in the ArrayList.

4. Search Item

Option 4 allows the user to enter an item name.

The program searches through the stored items and uses toLowerCase() so that the search is case-insensitive.

5. Exit

Option 5 terminates the menu loop and displays:

Thank you!
▶️ How to Run
Step 1: Install Java

Make sure Java JDK is installed on your computer.

Check the installation using:

java -version
Step 2: Compile the Program

Open a terminal in the project directory and run:

javac LostAndFound.java
Step 3: Run the Program
java LostAndFound
🖥️ Sample Output
--- LOST AND FOUND SYSTEM ---
1. Report Lost Item
2. Report Found Item
3. View Items
4. Search Item
5. Exit
Enter choice: 1

Enter item name: Wallet
Enter location: Library
Item added successfully!

Example of viewing items:

Items:
Wallet - Library - Lost
Watch - Canteen - Found

Example of searching:

Enter item name: wallet

Wallet - Library - Lost
📚 Java Concepts Used

This project demonstrates:

import java.util.*
Scanner
ArrayList
Methods
do-while loop
for loop
switch-case
if statement
String operations
Case-insensitive searching
User input handling
🔮 Future Enhancements

The system can be improved by adding:

Unique item IDs
User/contact details
Item descriptions
Date and time of reporting
Item categories
Database storage
Login and authentication
Admin dashboard
Automatic matching of lost and found items
Graphical User Interface (GUI)
Web or mobile application
Notifications when a possible match is found
👨‍💻 Project Type

Academic Mini Project

Project Name: Lost & Found Item Management System

Language: Java

Application Type: Console-Based Application
