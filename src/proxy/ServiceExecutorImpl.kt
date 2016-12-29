package proxy

/**
 * Real subject
 */
class ServiceExecutorImpl : ServiceExecutor {
    override fun execute() {
        println("Executing ServiceExecutorImpl")
    }
}