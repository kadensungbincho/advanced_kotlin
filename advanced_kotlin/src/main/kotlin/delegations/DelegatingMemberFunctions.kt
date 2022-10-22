package delegations

import classes.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger {

    fun index(): String {
        // is it from Logger or Repository?
        // so don't pass too many dependencies
        return getAll().toString()
    }
}
