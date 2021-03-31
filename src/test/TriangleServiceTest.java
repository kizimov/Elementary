package test;

import main.model.Triangle;
import main.service.TriangleService;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TriangleServiceTest {
    TriangleService triangleService;

    @Before
    public void setUp(){
        triangleService = new TriangleService();
    }

    @Test
    public void test_setParameters_normalFlow() throws IOException {
        String cleanStr = "qwerty,3,4,5";
        Triangle actualTriangle = triangleService.setParameters(cleanStr);
        Triangle expectedTriangle = new Triangle();
        expectedTriangle.setName("qwerty");
        expectedTriangle.setArea(6);
        assertEquals(expectedTriangle, actualTriangle);
    }
}