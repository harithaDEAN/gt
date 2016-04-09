package com.training.gradle;

import static com.training.gradle.SwitchStoplight.LightColor.*;
import static com.training.gradle.SwitchStoplight.LightAction.*;
import org.junit.Assert;
import org.junit.Test;

public class StoplightTest {

    @Test
    public void testStopLight() {
        final SwitchStoplight light = new SwitchStoplight();

        SwitchStoplight.LightColor color = Green;
        Assert.assertEquals("Input Green and Got incorrect Action: " + light.returnAction(color), Go, light.returnAction(color));

        color = Yellow;
        Assert.assertEquals("Input Yellow and Got incorrect Action: " + light.returnAction(color), SlowDown, light.returnAction(color));

        color = Red;
        Assert.assertEquals("Input Red and Got incorrect Action: " + light.returnAction(color), Stop, light.returnAction(color));

        color = UnknownColor;
        Assert.assertEquals("Input Unknown and Got incorrect Action: " + light.returnAction(color), UnknownAction, light.returnAction(color));
    }
}
