/**
 * The student class creates students with a specific name, age, and student numbers.
 */

class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * 
     * @param name a String that represents a student's name
     * @param age an integer that represents a student's age in years
     * @param studentNumber a String that represents a student's student number
     */
    public Student(String name, int age, String studentNumber){
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Gets the student's name
     * @return the student's name as a String
     */
    public String getName(){
        return this.name;
    }

    /**
     * Gets the student's age in years
     * @return the student's age as an integer
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Gets the student's student number
     * @return the student's student number as a String
     */
    public String getStudentNumber(){
        return this.studentNumber;
    }

    /**
     * Returns a String that represent's the student in the following format:
     * name, age - studentNumber
     * @return Returns a string containing the student's name, age and student number
     */
    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    /**
     * Checks to see if there are two students that have the same student Number
     * @param obj an object to compare to
     * @return returns true if the students have the same student number, otherwise false
     */
    @Override
    public boolean equals(Object obj){
         if (obj == null || getClass() != obj.getClass() ){
            return false;
        }
        Student student = (Student)obj;
        if (student.getStudentNumber() == this.studentNumber){
            return true;
        }
            return false;
        }
    }