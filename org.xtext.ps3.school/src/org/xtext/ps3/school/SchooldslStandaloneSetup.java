/*
 * generated by Xtext
 */
package org.xtext.ps3.school;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SchooldslStandaloneSetup extends SchooldslStandaloneSetupGenerated{

	public static void doSetup() {
		new SchooldslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
