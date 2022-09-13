package uoft.csc207.week2;
/**
 * A student at UofT
*/

public class Student extends Person {
    @Override
    public String toString() {
        return "Student: " + super.toString(); // Both variables and objects have a type

    }

    /**
     * Initialize this Person named name with UTORid utorid.
     *
     * @param name   the person's name (family name last)
     * @param utorid the person's UTORid
     */
    Student(String[] name, String utorid) {
        super(name, utorid);
    }
}
