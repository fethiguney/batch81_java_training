package J3_Ternary_Switch;

public class Switch_FirstInitial {
    public static void main(String[] args) {

        //Kullanicidan SDET kisaltmasindaki harflerden birini isteyin
        //Kullanici S girerse "Software", D girerse "Development",
        //E girerse "Engineer", T girerse "In testing" yazdirin

        String input="s";
        input=input.toUpperCase();


        switch (input) {
            case "S" :
                System.out.println("Software");
                break;
            case "D" :
                System.out.println("Development");
                break;
            case "E" :
                System.out.println("Engineer");
                break;
            case "T" :
                System.out.println("In Engineer");
                break;
            default:
                System.out.println("Enter S, D, E or T letter");
        }




    }
}
