package com.theagilemonkeys.meets.magento.methods;

import com.theagilemonkeys.meets.magento.SoapApiMethod;
import com.theagilemonkeys.meets.magento.models.base.MageMeetsCollectionPojos;

/**
 * Created by kloster on 30/09/13.
 */
public class CustomerCustomerList extends SoapApiMethod {
    public CustomerCustomerList() {
        super(MageMeetsCollectionPojos.Customers.class);
    }
}
