package com.dlr.ciscoware_wc;

import com.dlr.ciscoware_wc.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-24T23:14:58")
@StaticMetamodel(Password.class)
public class Password_ { 

    public static volatile SingularAttribute<Password, Integer> id;
    public static volatile SingularAttribute<Password, User> userId;
    public static volatile SingularAttribute<Password, String> content;

}