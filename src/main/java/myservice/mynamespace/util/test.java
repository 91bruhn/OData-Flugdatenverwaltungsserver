////////////////////////////////////////////////////////////////////////////////
//
// Created by BBruhns on 03.03.2018.
//
// Copyright (c) 2006 - 2018 FORCAM GmbH. All rights reserved.
////////////////////////////////////////////////////////////////////////////////

package myservice.mynamespace.util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 */
public class test {

public static void main(String args[]){

    int length = 10;
    boolean useLetters = true;
    boolean useNumbers = false;
    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

    System.out.println(generatedString);
    System.out.println(RandomStringUtils.randomAlphabetic(10));
    System.out.println(RandomStringUtils.randomAlphanumeric(10));
    System.out.println(RandomStringUtils.randomNumeric(10));
    System.out.println();
}

}
