package J13_MiracHoca.Encapsulation;

public class E1 {
    public static void main(String[] args) {


        class Laptop {
            private String model;
            private String year;
            private String memory;
            private String processor;

            public String getModel() {
                return model;
            }


            public String getYear() {
                return year;
            }

            public String getMemory() {
                return memory;
            }

            public void setMemory(String memory) {
                this.memory = memory;
            }

            public String getProcessor() {
                return processor;
            }

            @Override
            public String toString() {
                return
                        "model : " + model + "\n"+
                        "year : " + year + "\n"+
                        "memory : " + memory + "\n"+
                        "processor : " + processor ;
            }
        }




    }
}
