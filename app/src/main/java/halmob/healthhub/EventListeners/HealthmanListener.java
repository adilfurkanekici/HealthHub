package halmob.healthhub.EventListeners;

import java.util.List;

import halmob.healthhub.Models.Person;

/**
 * Created by RIDVAN SIRMA on 12/3/2017.
 */

public interface HealthmanListener {
    void healthmanRead(List<Person> personList);
}
