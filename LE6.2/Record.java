class Record extends Person {
    private String specialty;
    private double officeVisitFee;

    // CONSTRUCTORS
    public Record(double officeVisitFee, String specialty, String name) {
        super(name);
        this.officeVisitFee = officeVisitFee;
        this.specialty = specialty;
    }
    
    public Record(double officeVisitFee, String specialty) {
        this.officeVisitFee = officeVisitFee;
        this.specialty = specialty;
    }

    // MUTATORS
    public void setVisitFee(double fee) { this.officeVisitFee = fee; }

    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public void setName(String name) { super.setName(name); }

    public void setName() { super.setName(); }

    // ACCESSORS
    public double getVisitFee() { return this.officeVisitFee; }
    
    public String getSpecialty() { return this.specialty; }

    public String getName() { 
        return super.getName(); 
    }

    // FUNCTION 



}   