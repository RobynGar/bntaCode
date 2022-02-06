import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MyFirstTest {
// we can run each test individually or together
    // this test does not return anything or require an input
    @Test
    void canAddTwoNumbers(){
        //given
        int n1 = 4;
        int n2 = 4;
        //when
        int result = n1 + n2;
        //then
        assertThat(result).isEqualTo(8);


    }

    @Test
    void hello1(){

    }
}
