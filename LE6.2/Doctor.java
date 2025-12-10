class Doctor {
    private Record[] records;
    private static int numOfRecords = 0;

    // CONSTRUCTORS
    public Doctor() {
        this.records = new Record[100];
    }

    // ACCESSORS
    // PARAMS: void
    // returns the record of doctor
    public Record[] getRecords() {
        return this.records;
    }

    // MUTATORS
    // PARAMS: Record
    // This inserts a record into the doctor
    public void setRecord(Record newRecords) {
       this.getRecords()[numOfRecords++] = newRecords;
    }

}

