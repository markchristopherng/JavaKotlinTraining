package au.com.auspost.training.nulls

class InjectK() {

    // @Inject
    lateinit var person: PersonK

    // @Inject
    lateinit var address: AddressK

    fun process() {
        System.out.println(" $person.firstname lives in ${address.suburb}")
    }
}
