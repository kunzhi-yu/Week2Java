package uoft.csc207.week2;
/**
 * A student at UofT
*/

public class Student extends Person {
    private final String stuNum;

    @Override
    public String toString() {
        return "Student: " + super.toString() + " " + this.stuNum; // Both variables and objects have a type

    }

    /**
     * Initialize this Person named name with UTORid utorid.
     *
     * @param name   the person's name (family name last)
     * @param utorid the person's UTORid
     * @param stuNum the 1-=digit student number
     */
    Student(String[] name, String utorid, String stuNum) {
        super(name, utorid);
        this.stuNum = stuNum;
    }
}
