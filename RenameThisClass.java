
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] strArray = {"Array","Bravo","Charlie","Delta","Echo"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        for (String value : strArray) {
            System.out.print(value);
        }
        for (String value : strArray) {
            System.out.print(value + "-");
        }
    }
}
