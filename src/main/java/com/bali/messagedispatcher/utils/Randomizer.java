package com.bali.messagedispatcher.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Randomizer {
    public static String randomString() {
        return RandomStringUtils.randomAlphanumeric(10);
    }

    public static int randomInt() {
        return RandomUtils.nextInt();
    }
}
