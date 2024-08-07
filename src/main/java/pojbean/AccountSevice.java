package pojbean;

public interface AccountSevice {
    void transerMoney(long fromAccountId,long toAccountId,double account);
    void depositMoney(long accountId,double amount) throws Exception;
    Account getAccount (long accountId);
}
