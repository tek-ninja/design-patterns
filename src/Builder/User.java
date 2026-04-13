package Builder;

public class User {

    private final String firstName;
    private final String lastName;
    private final String dob;
    private final int id;

    // Private constructor
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.id = builder.id;
    }

    // Getters only (no setters)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDob() { return dob; }
    public int getId() { return id; }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String dob;
        private int id;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder dob(String dob){
            this.dob = dob;
            return this;
        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public User build(){
            return new User(this); // ✅ enforce immutability
        }
    }
}