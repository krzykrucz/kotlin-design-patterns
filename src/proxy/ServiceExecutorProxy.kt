package proxy

/**
 * Proxy
 */
class ServiceExecutorProxy(private val role: UserRole) : ServiceExecutor {

    private val serviceExecutor: ServiceExecutor = ServiceExecutorImpl()

    override fun execute() {
        if (role != UserRole.ADMIN) {
            throw UnsupportedOperationException("Admin rights are necessary to execute this service")
        }
        this.serviceExecutor.execute()
    }
}