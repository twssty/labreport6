class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        //PARAMS: double: OfficeVisit, String: specialty, String: name
        Record record1 = new Record(23.5, "Optomologists", "Watkins");
        Record record2 = new Record(23.5, "Optomologists");

        doctor.setRecord(record1);
        doctor.setRecord(record2);

        for(Record record: doctor.getRecords()) {
            if(record == null) break;

            
            record.writeOutput();
        }
    }
}