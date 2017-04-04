package Modul04;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return CHINA_BANK_LIMIT_WITHDRAWAL_USD;
        }
        return CHINA_BANK_LIMIT_WITHDRAWAL_EUR;
    }
    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return CHINA_BANK_LIMIT_FUNDING_USD;
        }
        return CHINA_BANK_LIMIT_FUNDING_EUR;
    }
    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 3;
        }
        return 5;
    }
    @Override
    int getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            summ = summ < CHINA_BANK_COMMISIN_LESS_USD ? 2 : 5;
        } else {
            summ = summ > CHINA_BANK_COMMISIN_MORE_USD ? 9 : 11;
        }
        return summ;
    }
}
