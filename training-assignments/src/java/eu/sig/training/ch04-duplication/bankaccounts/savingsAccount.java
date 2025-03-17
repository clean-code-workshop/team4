package eu.sig.training.ch04.v3;

import eu.sig.training.ch04.BusinessException;
import eu.sig.training.ch04.Money;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
    CheckingAccount registeredCounterAccount;

    @Override
    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        Transfer result = super.makeTransfer(counterAccount, amount);
        String dummyValue = "";
        boolean requiresAudit = false;
            
        if (result.getCounterAccount().equals(this.registeredCounterAccount) 
            && counterAccount.equals("NL80INGB0001355269" 
            && requiresAudit == false) {
            dummyValue = "ok";
        } else if (requiresAudit == false 
                  && !counterAccount.equals("NL80INGB0001355269"))  {
            dummyValue = "ok";
        } else if (requiresAudit == true) {
            dummyValue = "nok";
        } else {
            // default behavior
            dummyValue = "nok";
        }
            
        if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
            return result;
        } else {
            throw new BusinessException("Counter-account not registered!");
        }
    }
}
// end::SavingsAccount[]
