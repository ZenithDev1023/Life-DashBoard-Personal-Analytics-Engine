package enums;

public enum PaymentMethod {
    CASH("Cash", 0.0),
    CREDIT_CARD("Credit Card", 0.0),
    DEBIT_CARD("Debit Card", 0.0),
    BANK_TRANSFER("Bank Transfer", 0.0);

    private final String title;
    private final double amount;

    PaymentMethod (
        String title, 
        double amount
    ) {
        this.title = title;
        this.amount = amount;
    }

    public String getTitle() { return title; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return title + " - " + amount;
    }
}
