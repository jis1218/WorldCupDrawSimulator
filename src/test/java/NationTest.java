import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NationTest {

    @Test
    void validatePortNumber() {
        assertThat(Nation.validatePort()).isEqualTo(true);
    }

    @Test
    void isSameContinentTest() {
        assertThat(Nation.ARGENTINA.isSameContinent(Nation.BRAZIL)).isTrue();
        assertThat(Nation.KOREA.isSameContinent(Nation.ASIA_SA_PLAYOFF)).isTrue();
        assertThat(Nation.BRAZIL.isSameContinent(Nation.ASIA_SA_PLAYOFF)).isTrue();
        assertThat(Nation.USA.isSameContinent(Nation.OCE_NA_PLAYOFF)).isTrue();
        assertThat(Nation.CANADA.isSameContinent(Nation.CAMEROON)).isFalse();
    }
}
