
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String checkValue = String.valueOf(scanner.nextLine());
            if (!checkValue.isEmpty()){
                String fname = checkValue;
                String lname = String.valueOf(scanner.nextLine());
                String id = String.valueOf(scanner.nextLine());
                PersonalInformation curPersonalInfo = new PersonalInformation(fname, lname, id);
                infoCollection.add(curPersonalInfo);
            }
            else {
                break;
            }
        }
        for (PersonalInformation pInfo : infoCollection){
            System.out.println(pInfo.getFirstName() + " "+ pInfo.getLastName());
        }
    }
}
