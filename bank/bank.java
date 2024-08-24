package bank;
class Account {
    public String name;
    protected String email;
    private String password;
    //for private getter and setter is used
    public String getpassword(){
        return this.password;
}
public void String setpassword(String pass){
    this.password = pass;

}
}
public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Aameen";
        account1.email = "aameen@gmail.com";
        account1.password = ""
    
    }
}