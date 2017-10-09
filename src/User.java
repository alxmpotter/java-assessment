public class User extends Person {
    protected Boolean isAdmin;

    public User(String first, String last){
        super(first, last);
        this.isAdmin = true;
    }

//    public boolean isAdmin(){
//
//    }
}
