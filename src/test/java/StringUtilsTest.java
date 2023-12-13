import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testMergeStrings() {
        StringUtils utils = new StringUtils();
        String result = utils.mergeStrings(List.of("Krym ", "nash " + "🇺🇦"));
        assertEquals("Krym nash 🇺🇦", result, "String merging failed");
    }
}
