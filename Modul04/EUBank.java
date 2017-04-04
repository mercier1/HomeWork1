package Modul04;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return EUR_BANK_LIMIT_WITHDRAWAL_USD;
        }
        return EUR_BANK_LIMIT_WITHDRAWAL_EUR;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return EUR_BANK_LIMIT_FUNDING_USD;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 4;
        }
        return 2;

    }

    @Override
    int getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            summ = summ < EUR_BANK_COMMISIN_LESS_USD ? 8 : 11;
        } else {
            summ = summ > EUR_BANK_COMMISIN_MORE_USD ? 13 : 15;
        }
        return summ;
    }
}
