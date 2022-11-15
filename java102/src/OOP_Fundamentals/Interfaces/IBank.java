package OOP_Fundamentals.Interfaces;

public interface IBank {

    final String hostIpAddress = "123.0.0.7";

    boolean connect(String ipAddress);
    boolean payment(double price, String cardNumber, String date , String cvc);
}
