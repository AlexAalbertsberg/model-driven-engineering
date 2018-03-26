/*
 * generated by Xtext
 */
package org.xtext.ps3.school.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.ps3.school.services.SchooldslGrammarAccess;

public class SchooldslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SchooldslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.ps3.school.parser.antlr.internal.InternalSchooldslParser createParser(XtextTokenStream stream) {
		return new org.xtext.ps3.school.parser.antlr.internal.InternalSchooldslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SchoolDatabase";
	}
	
	public SchooldslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SchooldslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
