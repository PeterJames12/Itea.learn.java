package summer;

/**
 * author Igor
 */
public class OldPupil {

    public static String name;
    public int age;
    public String skills;
    public final int MARK = 12;

    public static void main(String[] args) {

            // not static      static
        OldPupil pupil = new OldPupil();
        OldPupil.fleck();

//        System.out.println(MARK);
//        System.out.println(MARK);


    }

    private static void fleck() {

        OldPupil pupil = new OldPupil();
        int age = pupil.age;
        String skills = pupil.skills;
    }

    public void learn() {

        System.out.println(getSkills());
    }

    public String getSkills() {
        return skills;
    }


    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int hooMuch(int much) {
        return much;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
