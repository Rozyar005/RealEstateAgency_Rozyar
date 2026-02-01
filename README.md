# 🏠 Real Estate Agency System (OOP-Based)

![Project Status](https://img.shields.io/badge/status-active-success?style=for-the-badge)
![Language](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Concept](https://img.shields.io/badge/concept-Inheritance%20%26%20Polymorphism-blue?style=for-the-badge)

## 📖 Project Breakdown
**Sim City, but strictly business.** 🏘️💼

This project is a Java-based application designed to manage a portfolio of real estate properties. Instead of treating every building the same, it uses **Object-Oriented Programming (OOP)** to categorize them intelligently.

**The Logic (ELI5):**
Imagine you are running a property agency.
1.  **Property (`Property.java`):** This is the blueprint. All buildings have a price and an address.
2.  **Apartment (`Apartment.java`):** This is a specific type of property. It has extra rules (like floor number).
3.  **Furnished Apartment (`FurnishedAppartment.java`):** This is an even *more* specific type of apartment. It includes furniture data.
4.  **Villa (`Villa.java`):** A different type of property entirely, with things like garden size.

By connecting these files through **Inheritance**, the code avoids repetition and mimics how real-world categories work. 
---

## 🛠️ Technical Specs

The project is built using standard Java technologies, keeping it lightweight and universally compatible.

| Component | Technology | Why it's here |
| :--- | :--- | :--- |
| **Language** | **Java (JDK)** | The core programming language used to define the classes and logic. |
| **Build Tool** | **Apache Ant** | The `build.xml` file suggests this project uses Ant for compiling and building the application. |
| **Paradigm** | **OOP** | Heavily relies on Inheritance (`extends`) and Encapsulation (getters/setters). |
| **I/O** | **Java Util** | Likely uses `Scanner` for user input via the console. |

---

## 📂 Project Structure

Here is the hierarchy of the source code, showing how the inheritance chain is organized:

```text
RealEstateAgency_Rozyar/
├── 📄 build.xml                        # 🛠️ Ant Build Configuration
└── 📁 src/
    └── 📁 realestateagency_rozyar/     # 📦 Main Package
        ├── 📄 Main.java                # 🏁 Entry Point (Run this!)
        ├── 📄 Property.java            # 🏛️ Parent Class (The Base)
        ├── 📄 Villa.java               # 🏡 Child Class (Extends Property)
        ├── 📄 Apartment.java           # 🏢 Child Class (Extends Property)
        └── 📄 FurnishedAppartment.java # 🛋️ Grandchild Class (Extends Apartment)
