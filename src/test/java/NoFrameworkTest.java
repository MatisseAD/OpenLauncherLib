import fr.flowarg.openlauncherlib.NoFramework;
import org.junit.Test;
import static org.junit.Assert.*;

public class NoFrameworkTest {
    @Test
    public void testModLoaderEnum() {
        assertNotNull(NoFramework.ModLoader.FORGE);
    }
}
