package lesson4_test;


import com.geekbrains.lesson4.Box;
import com.geekbrains.lesson4.BoxIsEmptyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BoxTest {
    Box box;


    @Nested
    class WhenIsEmpty {

        @BeforeEach
        void createBox() {
            box = new Box();
        }


        @Test
        void addBallTest() {
            box.addBall();
            Assertions.assertEquals(1, box.getBallCounter());
        }

        @Test
        void removeBallFromEmptyBoxTest() {
            assertThatNullPointerException().isThrownBy(() -> box.removeBall());


        }

        @Test
        void shuffleEmptyBoxTest() {
            assertThatExceptionOfType(BoxIsEmptyException.class).isThrownBy(() -> box.shuffleBalls());
        }

        @Nested
        class WhenWithBalls {
            @BeforeEach
            void addBalls(){
                box.addBall();
            }

            @Test
            void removeBallFromBoxWithBalls(){
                box.removeBall();
                assertThat(box.getBallCounter()).isEqualTo(0);

            }
        }


    }
}
