package dk.cphbusiness.bank.contract.extended;

import dk.cphbusiness.bank.contract.dto.CustomerDetail;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;




public interface BankManager extends dk.cphbusiness.bank.contract.BankManager{
  
    CustomerDetail saveEmployee(CustomerDetail customer);
    
    
    boolean doesUserExist(CustomerIdentifier ci);
    
  }
