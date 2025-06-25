public class estoreApp {

    private String[] accounts;
    private String name;
    private String age;
    private String email;
    private String phoneNumber;
    private String password;
    private String address;

    public estoreApp(String name, String age, String email, String phoneNumber, String password, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.address = address;
    }

    public void createAccount(String name, String age, String email, String phoneNumber, String password, String address) {
        String accountId = name + " " + age + " " + email + " " + phoneNumber + " " + password + " " + address;
        if (accounts.contains(accountId)) {
            System.out.println("Account already exists!");
        } else {
            accounts.add(accountId);
            System.out.println("Account created successfully!");
        }
    }


}
