public class Ebola {
    private String name;
    private int age;
    private String symptoms;

    public Ebola(String name1, int age1, String symptoms1) {
        name = name1;
        age = age1;
        symptoms = symptoms1;
    }

    public void addSymptoms(String symptoms2) {
        symptoms = symptoms + " and " + symptoms2;
    }

    public boolean diagnosis(){
        if (symptoms.indexOf("fever") > -1 && !(symptoms.indexOf("cough") > -1) && symptoms.indexOf("abdominal pain") > -1){
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
      if (this.diagnosis() == true) {
        return "" + name + " is " + age + " years old and due to the symptoms of " + symptoms + " most likely has Ebola.";
      }  
      else if (this.diagnosis() == false) {
        return "" + name + " is " + age + " years old and due to the symptoms of " + symptoms + " most likely does not have Ebola.";
      }
      else {
        return "There was an issue with the diagnosis of " + name;
      }
    }
}