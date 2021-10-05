public class Code {
    Code[] people = new Code[4];
    public static void main(String[] args) {
        final String name;
        final int age;
        final String title;
    }

    public Code(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title; //change varaible name
    }

    public String toString() {
        System.out.println(
        this.name + ", directed by " + this.title + ", released in " + this.age));
    }
    
}
