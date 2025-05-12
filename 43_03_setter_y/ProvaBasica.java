/*
 * Aquesta classe permet fer proves de les
 * funcionalitats de les diferents classes d'aquest
 * exercici.
 *
 * ATENCIÓ: no modifiquis aquest programa
 */
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.engine.discovery.DiscoverySelectors;

import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class ProvaBasica {
    private static final Class<?>[] TESTS = { TestPunt.class };
    private static final Class<?> TARGET = UsaPunt.class;

    private static void comprovaJUnit(Class<?> target) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
            .selectors(DiscoverySelectors.selectClass(target))
            .build();

        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);

        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        System.out.printf("%nEl resultat d'executar les proves de %s:%n", target.getName());
        System.out.println("- Tests passen: " + summary.getTestsSucceededCount());
        System.out.println("- Tests fallen: " + summary.getTestsFailedCount());
    }
    private static void comprovaIO(Class<?> target, String[] args) throws Exception {
        System.out.printf("%nEl resultat d'executar la classe %s:%n", target.getName());
        target.getMethod("main", String[].class).invoke(null, (Object)args);
    }
    public static void main(String[] args) throws Exception {
        comprovaIO(TARGET, args);
        for (Class target: TESTS) {
            comprovaJUnit(target);
        }
    }
}
