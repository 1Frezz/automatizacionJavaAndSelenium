package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class TestngRootProjectDependency extends DelegatingProjectDependency {

    @Inject
    public TestngRootProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":testng"
     */
    public TestngProjectDependency getTestng() { return new TestngProjectDependency(getFactory(), create(":testng")); }

    /**
     * Creates a project dependency on the project at path ":testng-ant"
     */
    public TestngAntProjectDependency getTestngAnt() { return new TestngAntProjectDependency(getFactory(), create(":testng-ant")); }

    /**
     * Creates a project dependency on the project at path ":testng-api"
     */
    public TestngApiProjectDependency getTestngApi() { return new TestngApiProjectDependency(getFactory(), create(":testng-api")); }

    /**
     * Creates a project dependency on the project at path ":testng-asserts"
     */
    public TestngAssertsProjectDependency getTestngAsserts() { return new TestngAssertsProjectDependency(getFactory(), create(":testng-asserts")); }

    /**
     * Creates a project dependency on the project at path ":testng-bom"
     */
    public TestngBomProjectDependency getTestngBom() { return new TestngBomProjectDependency(getFactory(), create(":testng-bom")); }

    /**
     * Creates a project dependency on the project at path ":testng-collections"
     */
    public TestngCollectionsProjectDependency getTestngCollections() { return new TestngCollectionsProjectDependency(getFactory(), create(":testng-collections")); }

    /**
     * Creates a project dependency on the project at path ":testng-core"
     */
    public TestngCoreProjectDependency getTestngCore() { return new TestngCoreProjectDependency(getFactory(), create(":testng-core")); }

    /**
     * Creates a project dependency on the project at path ":testng-core-api"
     */
    public TestngCoreApiProjectDependency getTestngCoreApi() { return new TestngCoreApiProjectDependency(getFactory(), create(":testng-core-api")); }

    /**
     * Creates a project dependency on the project at path ":testng-reflection-utils"
     */
    public TestngReflectionUtilsProjectDependency getTestngReflectionUtils() { return new TestngReflectionUtilsProjectDependency(getFactory(), create(":testng-reflection-utils")); }

    /**
     * Creates a project dependency on the project at path ":testng-runner-api"
     */
    public TestngRunnerApiProjectDependency getTestngRunnerApi() { return new TestngRunnerApiProjectDependency(getFactory(), create(":testng-runner-api")); }

    /**
     * Creates a project dependency on the project at path ":testng-runner-junit4"
     */
    public TestngRunnerJunit4ProjectDependency getTestngRunnerJunit4() { return new TestngRunnerJunit4ProjectDependency(getFactory(), create(":testng-runner-junit4")); }

    /**
     * Creates a project dependency on the project at path ":testng-test-kit"
     */
    public TestngTestKitProjectDependency getTestngTestKit() { return new TestngTestKitProjectDependency(getFactory(), create(":testng-test-kit")); }

    /**
     * Creates a project dependency on the project at path ":testng-test-osgi"
     */
    public TestngTestOsgiProjectDependency getTestngTestOsgi() { return new TestngTestOsgiProjectDependency(getFactory(), create(":testng-test-osgi")); }

}
