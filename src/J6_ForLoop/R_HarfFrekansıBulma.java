package J6_ForLoop;

public class R_HarfFrekansıBulma {
    public static void main(String[] args) {

        int counter=0;

        String message = "AAABBCDDAC";

        for (char i='A' ;i<='Z' ; i++) {
            if(message .contains(String .valueOf(i ))) {
                for (int j = 0; j < message .length() ; j++) {
                    if(message.charAt(j) ==i){
                        counter ++;
                    }

                }
                //  System.out.println("there are "+ counter+ i + " 's in the word "+message );//bu benim nasıl çıkmasını istediğim output
                System.out.print(""+i+counter); //bu da tam olarak istenen output
                counter =0;
            }
        }








    }

}

