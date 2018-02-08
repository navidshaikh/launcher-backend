package io.fabric8.launcher.core.api;

import javax.annotation.Nullable;

import io.fabric8.launcher.booster.catalog.rhoar.Mission;
import io.fabric8.launcher.booster.catalog.rhoar.Runtime;
import org.immutables.value.Value;

/**
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface CreateProjectile extends Projectile {

    Mission getMission();

    Runtime getRuntime();

    /**
     * @return The name to use in creating the new OpenShift project
     */
    @Nullable
    String getOpenShiftProjectName();

    /**
     * @return The name to use in creating the new OpenShift project
     */
    @Nullable
    String getGitRepositoryName();

    @Value.Default
    default String getGitRepositoryDescription() {
        return "Generated by the Red Hat Developer Launch (https://developers.redhat.com/launch)";
    }


}
