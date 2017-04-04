package Modul04;

public class BankSystemImpl implements BankSystem {

    public BankSystemImpl() {
        super();
    }

    @Override
    public void withdrawOfUser(User user, int amount) {
        double commision = user.getBank().getCommission(amount) * 0.01;
        double limit = user.getBank().getLimitOfWithdrawal();
        double total = commision * amount;
        double balance = user.getBalance();
        if (balance < total) System.err.println("NOT ENOUGH MONEY");
        if (limit < amount && limit != 0) System.err.println("THE LIMIT OF WITHDRAW " + limit);
        else user.setBalance(balance - total);
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount > user.getBank().getLimitOfFunding())
            System.err.println("THE LIMIT OF FOUNDING " + user.getBank().getLimitOfFunding());
        else user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balance1 = fromUser.getBalance();
        double balance2 = toUser.getBalance();
        if (amount > balance1) System.err.println("NOT ENOUGH MONEY");
        else {
            fromUser.setBalance(balance1 - amount);
            toUser.setBalance(balance2 + amount);
        }
    }
    @Override
    public void paySalary(User user) {
        double commision = user.getSalary() * user.getBank().getMonthlyRate() * 0.01;
        user.setBalance(user.getBalance() + user.getSalary() - commision);
    }
}
