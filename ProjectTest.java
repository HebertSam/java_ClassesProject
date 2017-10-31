public class ProjectTest{
    public static void main(String[] args){
        Project thing = new Project();
        Project otherThing = new Project("Stuff", "This project does stuff");
        Project anotherThing = new Project("More Stuff", "This project does alot of stuff", 5.00);

        thing.setName("Project Bob");

        System.out.println(thing.getName());
        System.out.println(otherThing.getDescription());
        System.out.println(anotherThing.getPitch());

    }
}