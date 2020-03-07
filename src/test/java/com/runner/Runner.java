package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"com\\stepdefinition1" }, monochrome = true, plugin = { "json:src\\test\\resources\\Reporting\\cucumber.json" })
public class Runner {
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reporting\\cucumber.json");

	}}

