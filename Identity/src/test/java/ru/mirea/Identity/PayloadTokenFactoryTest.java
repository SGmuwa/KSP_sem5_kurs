package ru.mirea.Identity;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class PayloadTokenFactoryTest {
    @Test
    public void SaveAndLoadPayload() {
        PayloadToken payloadToken = new PayloadToken(2, "pup", Collections.singletonList(Role.ADMIN));
        assertEquals("{\"id\":2,\"login\":\"pup\",\"role\":[\"ADMIN\"]}", payloadToken.generateJSON());
    }
}