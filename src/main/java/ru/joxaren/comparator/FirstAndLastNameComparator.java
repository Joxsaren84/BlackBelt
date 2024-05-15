package ru.joxaren.comparator;

import java.util.Comparator;

public class FirstAndLastNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int res = e1.firstName.compareTo(e2.firstName);

        if(res == 0)
            res = e1.lastName.compareTo(e2.lastName);
        return res;
    }
}
