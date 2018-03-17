class BankAccount {

    @Volatile var balance: Int = 0
        private set
        get() { check(isOpen); return field }

    private var isOpen: Boolean = true

    @Synchronized fun adjustBalance(value: Int) {
        balance += value
    }

    fun close() {
        isOpen = false
    }
}