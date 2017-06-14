package com.sample.firstproject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sample.firstproject.unit.SampeUserRepositoryTest;

@RunWith(Suite.class)
@SuiteClasses({ SampeUserRepositoryTest.class })
public class SuiteClass {
}
