/*
 * This class creates a staff record and inherits properties form user class.
 */

public class Staff extends User{

    private String staffId;
    private String staffDesignation;


    public Staff(String userId, String fName, String lName, String email, String password, String staffId, String staffDesignation) {
        super(userId, fName, lName, email, password);
        this.staffId = staffId;
        this.staffDesignation = staffDesignation;
    }

    public String getStaffDesignation() {
        return staffDesignation;
    }

    public void setStaffDesignation(String staffDesignation) {
        this.staffDesignation = staffDesignation;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return String.format("%s ,Staff ID: %s, Designation: %s",
                super.toString(), staffId, staffDesignation);
    }
}
