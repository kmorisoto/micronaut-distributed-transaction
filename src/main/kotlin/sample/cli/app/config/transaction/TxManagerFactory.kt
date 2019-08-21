package sample.cli.app.config.transaction

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.config.JtaTransactionManagerFactoryBean

@Factory
class TxManagerFactory {

    @Bean
    fun txManager(): PlatformTransactionManager {
        val jtaTransactionManager = JtaTransactionManagerFactoryBean().`object`
        return jtaTransactionManager
    }
}
