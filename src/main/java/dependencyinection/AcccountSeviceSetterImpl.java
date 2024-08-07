package dependencyinection;

import pojbean.Account;
import pojbean.AccountRepository;
import pojbean.AccountSevice;


public class AcccountSeviceSetterImpl implements AccountSevice {
    private AccountRepository accountRepository;
    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository= accountRepository;

    }
    @Override
    public void transerMoney(long fromAccountId, long toAccountId, double account) {
        Account sourAccount= accountRepository.find(fromAccountId);
        Account tagerAccount= accountRepository.find(toAccountId);
        sourAccount.setBalance(sourAccount.getBalance());
        tagerAccount.setBalance(tagerAccount.getBalance());
        accountRepository.update(sourAccount);
        accountRepository.update(tagerAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
       Account account =accountRepository.find(accountId);
       account.setBalance(account.getBalance()+amount);
       accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}
