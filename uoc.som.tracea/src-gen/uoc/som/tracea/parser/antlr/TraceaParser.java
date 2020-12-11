/*
 * generated by Xtext 2.21.0
 */
package uoc.som.tracea.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uoc.som.tracea.parser.antlr.internal.InternalTraceaParser;
import uoc.som.tracea.services.TraceaGrammarAccess;

public class TraceaParser extends AbstractAntlrParser {

	@Inject
	private TraceaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTraceaParser createParser(XtextTokenStream stream) {
		return new InternalTraceaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Tracea";
	}

	public TraceaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TraceaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
