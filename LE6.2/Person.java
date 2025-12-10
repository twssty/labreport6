class Person {
    private String name;

    // CONSTRUCTORS
    // PARAMS: String
    // sets the name to the parameter
    public Person(String name) { 
        this.name = name; 
    }

    // PARAMS: void
    // This function is a overloading function that 
    // sets the name as "no name set if there's no parameters"
    public Person() { 
        this.name = "No name set"; 
    }

    // MUTATORS
    public void setName(String name) { this.name = name; }

    public void setName() { this.name = "No name set"; }

    // ACCESSORS
    public String getName() { return this.name; }

    // FUNCTION
    // PARAMS: void
    // writes the output of the name: IN PROGRESS
    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    // PARAMS: Perso
    // checks if the other person has the same name as the current
    // person
    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }



}