package com.projects.designpatterns.Adapter;

public class EmployeeLDAPAdapter implements Employee {

    private EmployeeLdap ldapInstance;

    public EmployeeLDAPAdapter (EmployeeLdap instance){
        this.ldapInstance = instance;
    }


    @Override
    public String getId() {
        return ldapInstance.getCn();
    }

    @Override
    public String getFirstName() {
        return ldapInstance.getGivenName();
    }

    @Override
    public String getLastName() {
        return ldapInstance.getSurName();
    }

    @Override
    public String getEmail() {
        return ldapInstance.getMail();
    }
}
