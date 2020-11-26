package com.firstDBConnection;

public class ECRs {
    private Object[][] ECRsTable;
    private String[] columnHeaders;
    private int[] columnWidth;

    public ECRs() {
        this.setColumnHeaders();
        this.setDefaultValues();
    }

//    set methods
    private void setDefaultValues () {
        ECRsTable = new Object[][]{
                {1, 509123, "Name of the ECR 509987", "PR509987", "CR509987", "CN509987", "ECO509987", "PARAT", "NPI", "Active", true, ""},
                {2, 509124, "Name of the ECR 509987", "PR509987", "CR509987", "CN509987", "ECO509987", "PIMAB", "NPI", "Active", true, ""},
                {3, 509112, "Name of the ECR 509987", "PR509987", "CR509987", "CN509987", "ECO509987", "FIBAK", "NPI", "Closed", true, ""},
                {4, 509113, "Name of the ECR 509987", "PR509987", "CR509987", "CN509987", "ECO509987", "KAFNA", "NPI", "Closed", true, ""},
                {5, 509999, "Name of the ECR 509987", "PR509987", "CR509987", "CN509987", "ECO509987", "PARAT", "NPI", "Forwarded", true, ""},
        };
    }
    private void setColumnHeaders() {
        columnHeaders = new String[]{"ID", "ECR", "Description", "PR", "CR", "CN", "ECO", "TechLead", "Type", "Status", "Visibility", " "};
        columnWidth = new int[] {     20,    60,    200,           80,   80,   80,   80,    70,         80,     80,       40,          30};
    }

//    get methods
    public Object[][] getECRsTableObjectArray() {
        return ECRsTable;
    }
    public String[] getColumnHeaders() {
        return columnHeaders;
    }
    public int[] getColumnWidth() {
        return columnWidth;
    }
}
