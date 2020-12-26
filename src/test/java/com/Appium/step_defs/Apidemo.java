package com.Appium.step_defs;

import com.Appium.pages.Preference;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class Apidemo {

    Preference preference = new Preference();

    public Apidemo() throws MalformedURLException {
    }

    @Given("click preference button")
    public void   click_preference_button() throws InterruptedException, MalformedURLException {

        Thread.sleep(3000);
        preference.preference.click();
    }





}
