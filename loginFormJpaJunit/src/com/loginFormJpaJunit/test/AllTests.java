package com.loginFormJpaJunit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.loginFormJpaJunit.entities.UsersEqualTest;

@RunWith(Suite.class)
@SuiteClasses({ UserServicesTest.class, UsersLoginTest.class, UsersEqualTest.class })
public class AllTests {

}
