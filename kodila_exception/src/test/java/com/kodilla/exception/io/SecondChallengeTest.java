package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {
    @Test
    public void SecondChallengeTestCorrect() {
        SecondChallenge secondChallenge = new SecondChallenge();
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1.0));
    }

    @Test
    public void SecondChallengeTestWrong() {
        SecondChallenge secondChallenge = new SecondChallenge();
        assertThrows((Exception.class), () -> secondChallenge.probablyIWillThrowException(0.5, 1.5));
    }
}
