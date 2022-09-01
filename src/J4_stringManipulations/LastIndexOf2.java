package J4_stringManipulations;

public class LastIndexOf2 {
    public static void main(String[] args) {

        String str ="Gune java calısarak baslamak cok keyifli. Bu bir aliskanlik";

        int strFirstIndex=str.indexOf("java");
        int strLastIndex=str.lastIndexOf("java");

        if (strFirstIndex==-1) {
            System.out.println("cumlede java gecmiyor");
        } else if (strFirstIndex==strLastIndex) {
            System.out.println("java cumlede bir defa geciyor");
        } else {
            System.out.println("java cumlede birden fazla geciyor");
        }


    }
}
