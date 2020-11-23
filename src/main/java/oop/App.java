package oop;

/**
 * Student equals() method
 * Overriding the equals() method in a Student class.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Student equals() demo." );
        App app = new App();
        app.start();
    }

    public void start() {

        Student s1 = new Student("Tom",18);
        Student s2 = s1;  // both references point at the same object
        if(s1.equals(s2))
            System.out.println("s1 and s2 are equal");
        else
            System.out.println("s1 and s2 are NOT equal");

        // Case 1:
        // If we do not implement equals() in the Student class the
        // Student will inherit the equals() method from the Object
        // superclass. Thus, the equals() method will return true ONLY if
        // the two references are pointing at the same object.
        // If they both point at the same object, then they are obviously equal!
        //
        // If there are two objects, then, even if they contain the same data
        // they will not be equal, because they are not the same object.

        Student s3 = new Student("Tom", 18);
        if(s1.equals(s3))
            System.out.println("s1 and s3 are equal");
        else
            System.out.println("s1 and s3 are NOT equal");

        // This behaviour is acceptable sometimes, but we often want to
        // compare two objects based on their contents.  If their contents are
        // the same, then we would like equals() to return TRUE.

        // Case 2:
        // Implement an equals() method in the Student class to define
        // what you mean by equality.  Here we will compare the name and
        // age of two student objects, and it they are all equal, we
        // will return TRUE. See the implementation of equals in Student.

        // Reveal implementation of equals() in Student and run code
        // again to see new result.


    }
}
