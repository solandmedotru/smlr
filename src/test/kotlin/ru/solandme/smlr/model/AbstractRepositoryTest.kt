package ru.solandme.smlr.model

import com.github.springtestdbunit.DbUnitTestExecutionListener
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests
import ru.solandme.smlr.SmlrApplication

@TestExecutionListeners(DbUnitTestExecutionListener::class)
@SpringApplicationConfiguration(classes = arrayOf(SmlrApplication::class))
@DirtiesContext
abstract class AbstractRepositoryTest : AbstractTransactionalJUnit4SpringContextTests() {
}