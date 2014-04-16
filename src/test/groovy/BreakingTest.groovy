import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.*

class BreakingTest extends Specification {
  Project project

  def setup() {
    project = ProjectBuilder.builder().build()
  }

  def "can evaluate ProjectBuilder"() {
    expect:
    project.apply(plugin: 'groovy')
    project.evaluate()
  }
}
