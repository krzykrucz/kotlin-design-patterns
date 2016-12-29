package proxy

/**
 * Client interface
 */
fun main(args: Array<String>) {
    val normalExecutor: ServiceExecutor = ServiceExecutorImpl()
    val proxiedExecutor: ServiceExecutor = ServiceExecutorProxy(UserRole.USER)

    try {
        normalExecutor.execute()
        proxiedExecutor.execute()
    } catch (ex: Exception) {
        println(ex)
    }
}
