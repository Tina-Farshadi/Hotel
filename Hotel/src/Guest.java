public class Guest {

        private String Name;
        private String LastName;
        private String phoneNumber;
        private String email;
        private String id;


        public Guest(String Name,String LastName, String phoneNumber, String email,String id) {
            this.Name = Name;
            this.LastName=LastName;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.id=id;
        }
        public String getName() {
            return Name;
        }
        public void setName(String name) {
            this.Name = name;
        }

       public String getLastName() {
        return LastName;
    }
        public void setLastName(String Lastname) {
        this.LastName = LastName;}


        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
        return id;}

      public void setId(String id) {
        this.id = id;}
}