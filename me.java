public class Ass1
  {

    public static void main(String[] args) {

        
        String name = "Viktor";
        int yearOfBirth = 2003;
        double height = 1.85m; 
        double weight = 80.0kg; 

        
        int currentYear = 2023;
        int age = currentYear - yearOfBirth;

        
        double bmi = weight / (height * height);

        
        System.out.printf("%s, you are %d years old and your BMI is %.2f.\n",
                name, age, bmi);
    }
}
