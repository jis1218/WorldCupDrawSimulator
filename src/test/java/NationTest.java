import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NationTest {

    @Test
    void validatePortNumber() {
        assertThat(Nation.validatePort()).isEqualTo(true);

    }
}
