package edu.sdccd.cisc191;
import java.util.*;

/**
 * Interface IndividualAccountRepository not public:
 * Goal is to have privacy for the user to access their account
 * on their own accord
 */

@SpringBootApplication

interface IndividualAccountRepository extends CrudRepository<IndividualAccount, Long> {
    IndividualAccount findAccountProfile(String profile);


}
