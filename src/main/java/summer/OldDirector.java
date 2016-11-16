package summer;

/**
 * author Igor
 */
public class OldDirector {

    private String name;

    private int age;


    public static void main(String[] args) {

        OldPupil alex = new OldPupil();

        System.out.println(alex.hooMuch(12));
//        System.out.println(OldPupil.learn("Java"));

        alex.age = 22;
        OldPupil.name = "Bod";

        System.out.println(alex.getName());
        System.out.println(alex.getAge());

        OldPupil peter = new OldPupil();
        peter.age = 21;
        OldPupil.name = "Peter";

        System.out.println(peter.getAge());
        System.out.println(peter.getName());

        System.out.println("Alex name: " + alex.getName());
        System.out.println("Alex age: " + alex.getAge());

        alex.setSkills("java");
        peter.setSkills("English");

        printPupilSkills(alex, peter, alex, peter, alex, peter, alex, peter, alex, peter, alex, peter);

        OldPupil pupil = new OldPupil();
        System.out.println(pupil.MARK);
    }

    public static void printPupilSkills(OldPupil... pupil) {


        String name = "pupil";

        for (int i = 0; i < pupil.length; i++) {
            if (pupil[i].getSkills().equals("java")) {
                name = "Alex";
            }
            if (pupil[i].getSkills().equals("English")) {
                name = "Peter";
            }
            System.out.print(name + ": ");
            pupil[i].learn();

        }

        /*String name = "pupil";

        for (OldPupil pupilSkills : pupil) {
            if (pupilSkills.getSkills().equals("java")) {
                name = "Alex";
            }
            if (pupilSkills.getSkills().equals("English")) {
                name = "Peter";
            }
            System.out.println(name + ": " + pupilSkills.getSkills());
        }*/
    }


    public OldDirector(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
