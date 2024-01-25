public class Guest {

        private String Name;
        private String LastName;
        private String email;
        private String id;
        private String password;

         public Guest(String Name,String LastName, String email,String id,String password) {
            this.Name = Name;
            this.LastName=LastName;
            this.email = email;
            this.id=id;
            this.password=password;
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

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
        return id;}

      public String getPassword() {
        return password;}
}