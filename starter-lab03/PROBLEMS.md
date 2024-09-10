
# Instructions for Lab 03

Remember:

 - "Design" means follow the design recipie, as described on the
   course site. You can keep any pieces that are provided in the
   starter code.
 - If complete tests are provided for something, you should leave
   those tests unmodified and write code that passes them.
 - If commented out tests are provided, uncomment them as you
   implement the pieces but don't modify the logic.
 - Run the tests manually with "perl test.pl" before submitting to
   Inkfish.
       

# Task 1: Lab Grade

Design a record, LabGrade, that stores the name and numeric score
(0.0 - 100.0) for a lab assignment.


# Task 2: Student Grade

(Switch pilot / co-pilot.)

Design a record, StudentGrade, that stores the name, a list of their
lab grades (as ```List<LabGrade>```), and their final exam grade as a
numeric score (0.0 - 100.0).

Design an instance method of StudentGrade that returns the name
of the lab that student has the worst score on.


# Task 3: Final Grade

(Switch pilot / co-pilot.)

Design an instance method of StudentGrade that calculates the
student's average lab grade.

Design an instance method of StudentGrade that calculates 
the student's final grade.

For this calculation, the average lab grade should be half and the
exam should be the other half of the final grade.


# Task 4: Run on Sample Data

(Switch pilot / co-pilot.)

Design the static method getStudent in the app class so it loads the
grades for the student of a given name from the provided grades.csv
file into a StudentGrade object.

Uncomment the code in App#main that prints out the worst lab and total
grade for Alice and Bob. Run it. Look at grades.csv and manually
confirm that the output is correct.
