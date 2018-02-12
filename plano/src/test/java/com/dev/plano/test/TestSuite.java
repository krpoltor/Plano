package com.dev.plano.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.dev.plano.test.controllerTest.GreetingControllerTest;
import com.dev.plano.test.startupTest.StartupTest;

@RunWith(Suite.class)
@SuiteClasses({ StartupTest.class, GreetingControllerTest.class })
public class TestSuite {

}
