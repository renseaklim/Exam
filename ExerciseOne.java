import java.util.Scanner;

public class ExerciseOne {
    public void DateConvert(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a short date in formart YYYY-MM-DD to covert.");
        System.out.println("Input:");
        String shortdate = input.nextLine();

        String[] ch = shortdate.split("-");
        switch(ch[1]) {
            case "01":
                ch[1]="January";
                break;
            case "02":
                ch[1]="Febuary";
                break;
            case "03":
                ch[1]="March";
                break;
            case "04":
                ch[1]="April";
                break;
            case "05":
                ch[1]="May";
                break;
            case "06":
                ch[1]="June";
                break;
            case "07":
                ch[1]="July";
                break;
            case "08":
                ch[1]="August";
                break;
            case "09":
                ch[1]="September";
                break;
            case "10":
                ch[1]="October";
                break;
            case "11":
                ch[1]="November";
                break;
            case "12":
                ch[1]="December";
                break;
            default:
                System.out.println("Invaild Input!");

        }

        System.out.println("Output : " + ch[1]+" "+ch[0]+","+ch[2]);

    }
}

