# 🏨 Hotel Management System

A comprehensive Java-based Hotel Management System with GUI features for managing reservations, rooms, and billing operations.

![Java](https://img.shields.io/badge/Java-8+-orange.svg)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

## 📋 Overview

This Hotel Management System is designed to streamline hotel operations including room booking, guest management, and billing. Built with Java Swing, it provides an intuitive graphical interface for hotel staff to manage day-to-day operations efficiently.

## ✨ Features

- 🛏️ **Room Management** - Add, update, and track room availability
- 📝 **Reservation System** - Book rooms and manage guest check-in/check-out
- 💰 **Billing Module** - Generate invoices and track payments
- 👤 **Guest Records** - Maintain comprehensive guest information
- 📊 **Reports** - View occupancy and revenue reports
- 🎨 **User-Friendly GUI** - Intuitive Java Swing interface

## 🛠️ Tech Stack

- **Language**: Java 8+
- **GUI Framework**: Java Swing
- **IDE**: Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans)

## 🚀 Getting Started

### Prerequisites

- **JDK 8** or higher installed
- Any Java IDE (optional, can run from command line)

### Installation & Running

1. **Clone the repository**
   ```bash
   git clone https://github.com/rishit2904/Hotel-management.git
   cd Hotel-management/Hotel-Management-System-main
   ```

2. **Compile the Java files**
   ```bash
   javac HotelManagementSystem.java
   javac HotelManagementSystemGUI.java
   ```

3. **Run the application**
   
   For GUI version:
   ```bash
   java HotelManagementSystemGUI
   ```
   
   For console version:
   ```bash
   java HotelManagementSystem
   ```

### Using an IDE

1. Open the project in your preferred Java IDE
2. Navigate to `Hotel-Management-System-main` folder
3. Run `HotelManagementSystemGUI.java` as main class

## 📁 Project Structure

```
Hotel-management/
└── Hotel-Management-System-main/
    ├── HotelManagementSystem.java      # Core logic
    ├── HotelManagementSystemGUI.java   # GUI implementation
    ├── HotelManagementSystem.class     # Compiled bytecode
    ├── HotelManagementSystemGUI.class  # Compiled GUI bytecode
    ├── project/                        # Additional project files
    ├── Hotel Management System PPT.pptx # Project presentation
    └── Hotel Management System Report.pdf # Project documentation
```

## 🖥️ System Modules

### 1. Room Management
- Add new rooms with type and pricing
- Update room status (Available/Occupied/Maintenance)
- View all rooms with current status

### 2. Reservation
- Create new bookings with guest details
- Specify check-in and check-out dates
- Assign rooms based on availability

### 3. Guest Management
- Register new guests with contact information
- View guest history and preferences
- Update guest details

### 4. Billing
- Calculate charges based on stay duration
- Add additional services (room service, laundry, etc.)
- Generate and print invoices

## 📊 Class Diagram

```
┌─────────────────────┐
│  HotelManagement    │
│      System         │
├─────────────────────┤
│ - rooms[]           │
│ - guests[]          │
│ - reservations[]    │
├─────────────────────┤
│ + addRoom()         │
│ + bookRoom()        │
│ + checkout()        │
│ + generateBill()    │
└─────────────────────┘
         │
         ▼
┌─────────────────────┐
│  HotelManagement    │
│    SystemGUI        │
├─────────────────────┤
│ - JFrame window     │
│ - JPanel panels     │
├─────────────────────┤
│ + initUI()          │
│ + handleEvents()    │
└─────────────────────┘
```

## 📄 Documentation

Detailed project documentation is available:
- 📊 **Presentation**: `Hotel Management System PPT.pptx`
- 📝 **Report**: `Hotel Management System Report.pdf`

## 🔧 Future Enhancements

- [ ] Database integration (MySQL/SQLite)
- [ ] Multi-user authentication system
- [ ] Online booking integration
- [ ] Email notifications
- [ ] Payment gateway integration

## 🤝 Contributing

Contributions are welcome! Feel free to:
1. Fork the repository
2. Create a feature branch
3. Submit a pull request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

⭐ **Star this repo if you found it helpful!**

🏨 *Created as part of OOP coursework at MIT Manipal*
