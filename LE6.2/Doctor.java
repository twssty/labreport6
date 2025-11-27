class Doctor {
    private Record[] records;
    private static int numOfRecords = 0;

    // CONSTRUCTORS
    public Doctor() {
        this.records = new Record[100];
    }

    // ACCESSORS
    public Record[] getRecords() {
        return this.records;
    }

    // MUTATORS
    public void setRecord(Record newRecords) {
       this.getRecords()[numOfRecords++] = newRecords;
    }

}

