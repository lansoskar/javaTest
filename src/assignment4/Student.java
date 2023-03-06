package assignment4;

public class Student
{

    private int studentId;
    private String name;
    private int grade;
    private double multiplier;

    /**
     * Imaginery high school students can have their grade multiplied with a number if they
     * take a higher level course (1.06) or goes direct to university (1.08)
     *
     * If they do both, they will get 1.06 * 1.08 = 1.1448
     */



    /** The constructor must create a new student object with default values for
     * the multiplier and grade variables:
     *
     * The multiplier should default to 1.06
     * Grade default to 0
     *
     * @param studentId A unique number used to identify a student
     * @param name The name of the student
     *
     * all instance variables in the constructor must be set by their
     * setter methods not by setting it directly
     *
     * setName(name)  // <--- correct
     * this.name = name // <--- wrong
     */
    public Student(int studentId, String name)
    {
        //TODO Delete line below, and implement this method
        setStudentId(studentId);
        setName(name);
        grade = 0;
        multiplier = 1.06;
    }


    /**
     *
     * @return the value of the instance field
     */
    public double getMultiplier()
    {
        //TODO Delete line below, and implement this method
        return this.multiplier;
    }


    /**
     * The setter for the multiplier must check that the value is either 
     * 1.08 * 1.06 (1.1448) or 1.08 or 1.06
     *
     * If not, then do not update the value
     *
     * @param multiplier
     * @return if the input was valid
     */
    public boolean setMultiplier(double multiplier)
    {
        //TODO Delete line below, and implement this method
        if (multiplier == 1.06) {
            this.multiplier = 1.06;
            return true;
        } else if (multiplier == 1.08) {
            this.multiplier = 1.08;
            return true;
        } else if (multiplier == 1.08 * 1.06) {
            this.multiplier = 1.08 * 1.06;
            return true;
        } else {
            return false;
        }
    }


    /**
     *
     * @return the value of the grade multiplied by the multiplier.
     */
    public double getComputedGrade()
    {
        //TODO Delete line below, and implement this method
        return this.grade * this.multiplier;
    }


    /**
     * The setter for grade, must check that it is a value from the 7-point scale
     * valid values are: -3, 0, 2, 4, 7, 10, 12
     * Do not set value if invalid
     *
     * @param grade
     * @return if input was valid
     */
    public boolean setGrade(int grade)
    {
        //TODO Delete line below, and implement this method
        int[]gradeScale = {-3, 0, 2, 4, 7, 10, 12};
        for (int x : gradeScale) {
            if (grade == x) {
                this.grade = grade;
                break;
            }
        } return true;
    } //virker ikke, lav et array med acceptable grades, iterer igennem og tjek om parameter passer, hvis sand opdater
      //grade, hvis ikke gør intet

    /**
     *
     * @return the value of the instance field
     */
    public int getGrade()
    {
        //TODO Delete line below, and implement this method
        return this.grade;
    }


    /**
     *
     * @return the value of the instance field
     */
    public String getName()
    {
        //TODO Delete line below, and implement this method
        return this.name;
    }


    /**
     * The setter for name, must check that the name is valid. A name must hold
     * at least 2 words (seperated by space) A name must not be null or empty. A
     * name cannot have the following characters: .\/,()&%€#!$ Do not set the
     * value, if the name is not valid.
     *
     * @param name
     * @return if input was valid
     */
    public boolean setName(String name)
    {

        //TODO Delete line below, and implement this method
        if (name == null || name.contains(".\\/,()&%€#!$") || !name.contains(" ")){
            return false;
        } else {
            this.name = name;
            return true;
        }
        // ikke sikker på hvordan der skal tjekkes for special characters
    }


    /**
     *
     * @return the value of the instance field
     */
    public int getStudentId()
    {
        //TODO Delete line below, and implement this method
        return this.studentId;
    }


    /**
     * The setter for studentId must check that it is larger than -1 Do not set
     * the value, if this is false.
     *
     * @param studentId
     * @return
     */
    public boolean setStudentId(int studentId)
    {
        //TODO Delete line below, and implement this method
        if (studentId > -1){
            this.studentId = studentId;
            return true;
        } else return false;
    }

}
