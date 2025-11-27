class Person {
    private String name;

    // CONSTRUCTORS
    public Person(String name) { 
        this.name = name; 
    }

    public Person() { 
        this.name = "No name set"; 
    }

    // MUTATORS
    public void setName(String name) { this.name = name; }

    public void setName() { this.name = "No name set"; }

    // ACCESSORS
    public String getName() { return this.name; }

    // FUNCTION
    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }



}