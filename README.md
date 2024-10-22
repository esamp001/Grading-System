Java Grading System with Records and Raw Data Management

This project is a Java-based Grading System with a user interface built using NetBeans. The system allows users to manage student grades for Prelim, Midterm, and Final exams. It also calculates and records the grades based on attendance, class participation (CP), quizzes, and exams. The data is saved in two files: `records.txt` for final grades and `rawdata.txt` for detailed grade breakdowns.

Features

- Add Student: Add student information and calculate grades based on the input for Prelim, Midterm, and Final periods.
- Delete Student: Remove selected student records from the table and from the text file.
- Update Student: Update selected student information and modify the data in both the table and the records file.
- Retrieve Student Information: Automatically populate form fields with data from selected rows in the table for easy editing or updating.
- Store Data in Files:
  - records.txt: Stores final grades for each student.
  - rawdata.txt: Stores detailed information including attendance, CP, quiz, and exam scores for each grading period.
- Remove All Records: Clear the table and remove all entries from both records.txt and rawdata.txt.

Getting Started

Prerequisites

To run this project, you need to have the following installed:

- Java Development Kit (JDK) (version 8 or higher)
- NetBeans IDE (or any Java IDE you prefer)

### Installation

1. Clone the repository:
   bash
   git clone https://github.com/esamp001/java-grading-system.git
   

2. Open the project in NetBeans (or your preferred IDE).

3. Compile and run the project using the IDE's build/run commands.

Usage

1. Adding a Student:
   - Enter the student's first name, last name, and the raw values for Attendance, CP, Quiz, and Exam in each grading period.
   - Click the ADD button to calculate the grades and save the data to both records.txt and rawdata.txt.

2. Updating a Student:
   - Select a student from the table.
   - Modify the information in the input fields.
   - Click UPDATE to update the table and the data in both files.

3. Deleting a Student:
   - Select a student from the table.
   - Click DELETE to remove the selected student from the table and the files.

4. Retrieving Data:
   - Select a student in the table.
   - Click RETRIEVE to automatically fill the text fields with the student's data for easy modification or review.

5. Removing All Records:
   - Click REMOVE ALL RECORDS to clear all entries from the table and delete all records from both files.

File Structure

- records.txt: This file contains the student names, Prelim, Midterm, and Final grades, and remarks (Pass/Fail).
- rawdata.txt: This file contains detailed grading information for each student, including their Attendance, CP, Quiz, and Exam scores for Prelim, Midterm, and Final grading periods.

Example Record in `records.txt`

Name: Elle Sampaga
Prelim Grade: 90.00
Midterm Grade: 80.00
Final Grade: 83.33
Remarks: Passed


Example Record in rawdata.txt

Name: Elle Sampaga
Attendance: 90.00
CP: 80.00
Quiz: 83.33
Exam: Passed
Mid Attendance: 85.00
Mid CP: 82.00
Mid Quiz: 88.00
Mid Exam: 89.00
Final Attendance: 92.00
Final CP: 85.00
Final Quiz: 87.00
Final Exam: 90.00


Future Enhancements

- Implement search functionality to quickly find students based on their names.
- Add a feature to export the table data to a CSV or Excel file.
- Allow for customizable grading schemes (e.g., modifying the weight of attendance, CP, quizzes, and exams).


---

Tips:

- Installation Instructions: Make sure the installation steps are accurate for your project setup.
- Feature Descriptions: Clearly explain the functions of each feature so that anyone using your project understands how it works.
- Usage Examples: Provide relevant usage examples to help users see how they can work with the system. Include examples of how data appears in the text files.
