public class LabRunner {
    public static void main(String[]args){
        BabyParrot baby = new BabyParrot("Toucan", 3);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo(); // store returned string in variable
        System.out.println(info);        // print the returned string




    }
}
