package _12DefiningClassesExercises.JA07Google;

public class Children {

    String children;
    String childBirthday;

    public Children(String children,String childBirthday) {
        this.children = children;
        this.childBirthday = childBirthday;
    }

    public String getChildren() {
        return children;
    }
    public String getChildBirthday(){
        return childBirthday;
    }

    @Override
    public String toString() {
        return children + " " + childBirthday;
    }
}
