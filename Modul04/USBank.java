package Modul04;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return US_BANK_LIMIT_WITHDRAWAL_USD;
        }
        return US_BANK_LIMIT_WITHDRAWAL_EUR;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return US_BANK_LIMIT_FUNDING_EUR;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        }
        return 2;

    }

    @Override
    int getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            summ = summ < US_BANK_COMMISIN_LESS_EUR ? 3 : 5;
        } else {
            summ = summ > US_BANK_COMMISIN_LESS_EUR ? 10 : 11;
        }
        return summ;
    }
}
