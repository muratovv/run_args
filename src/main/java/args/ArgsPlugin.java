package args;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author @muratovv
 * @date 09.03.17
 */
public class ArgsPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("samplePlugin",  ArgsPlugin.class);
    }
}
