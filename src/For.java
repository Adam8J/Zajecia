public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i=i+2){
            System.out.println("cześć Adam");
        }
        String [] catTable = new String[] {"Mruczek", "Buczek", "Leon", "Julian"};
        for (int i = 0; i <catTable.length; i++){
            System.out.println(catTable[i]);
        }
    }
}
