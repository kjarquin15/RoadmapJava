package accessspecifiers;

public class AccessSpecifierDemo {
    public String publicField = "Public";

    private String privateField = "Private";

    protected String protectedField = "Protected";

    public void displayPrivateField() {
        System.out.println(privateField);
    }
}
