package com.dlr.ciscoware_wc;

import com.dlr.ciscoware_wc.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-27T22:19:26")
@StaticMetamodel(Inventory.class)
public class Inventory_ { 

    public static volatile SingularAttribute<Inventory, Integer> branchId;
    public static volatile SingularAttribute<Inventory, Integer> quantity;
    public static volatile SingularAttribute<Inventory, Product> productId;
    public static volatile SingularAttribute<Inventory, Integer> id;

}