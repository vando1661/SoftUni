package _12DefiningClassesExercises.JA07Google;

public class Parents {
    String parents;
    String parentBirthday;

    public Parents(String parents,String parentBirthday) {
        this.parents = parents;
        this.parentBirthday = parentBirthday;
    }

    public String getParents() {
        return parents;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }

    @Override
    public String toString() {
        return parents + " " + parentBirthday;
    }
}
