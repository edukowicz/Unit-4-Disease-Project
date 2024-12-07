public class Main {
    public static void main(String[] args) {
        Ebola andrew = new Ebola("Andrew", 50, "cough and abdominal pain");
        System.out.println(andrew);
        Ebola jennifer = new Ebola("Jennifer", 52, "fever of 101");
        jennifer.addSymptoms("cough");
        System.out.println(jennifer);
        Ebola ellie = new Ebola("Ellie", 16, "fever of 103 and abdominal pain");
        System.out.println(ellie);
    }
}