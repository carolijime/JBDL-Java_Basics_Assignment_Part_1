package Weekend1Assigments.Java_Basics_Assignment.Q10;

public class Customer {

    //static String CLASS_NAME = "Customer";
    int custId;
    String name;
    String gender;
    int age;


    public Customer(int custId, String name, String gender, int age) {
        this.custId = custId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        //CLASS_NAME = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                //", CLASS_NAME=" + CLASS_NAME +
                '}';
    }

}
