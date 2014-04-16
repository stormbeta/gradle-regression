import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.*

class OkayTest extends Specification {
  Project project

  def setup() {
    project = ProjectBuilder.builder().build()
  }

  def "apply java and idea"() {
    expect:
    project.apply(plugin: 'groovy')
  }
}
