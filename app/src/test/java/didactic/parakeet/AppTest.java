/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package didactic.parakeet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void SumaCorrecta(){
        App classSuma = new App();
        assertEquals(4, classSuma.sumar(2, 2));
    }
    @Test void RestaCorrecta(){
        App classResta = new App();
        assertEquals(2, classResta.sumar(4, 2));
    }
}
