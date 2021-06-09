package uoc.som.tracea.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uoc.som.tracea.services.TraceaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Tracea'", "'{'", "'traces'", "','", "'}'", "'relationshiptypes'", "'artefacts'", "'fragments'", "'evidences'", "'referees'", "'Trace'", "'relationshiptype'", "'starts'", "'tracelinks'", "'('", "')'", "'timestamp'", "'LeafTraceLink'", "'source'", "'target'", "'NodeTraceLink'", "'successors'", "'ModelArtefact'", "'TextArtefact'", "'TextFragment'", "'subFragments'", "'Document'", "'title'", "'sections'", "'Section'", "'number'", "'partofspeechsDefined'", "'partofspeechsUsed'", "'PartOfSpeech'", "'position'", "'ModelFragment'", "'namedelementsDefined'", "'namedelementsUsed'", "'Model'", "'packages'", "'NamedElement'", "'Package'", "'subFragment'", "'classes'", "'Classe'", "'structuralfeatures'", "'StructuralFeature'", "'DomainType'", "'EngineeringType'", "'Transclusion'", "'Doc2Section'", "'Section2PoS'", "'PoSSynonym'", "'PoS2NamedEntity'", "'NamedEntitySynonym'", "'NamedEntity2Class'", "'NameEntity2Package'", "'Package2Model'", "'Referee'", "'Evidence'", "'impactedElements'", "'RuleEvidence'", "'rule'", "'executionDate'", "'AnnotationEvidence'", "'content'", "'AIEvidence'", "'algorithmUsed'", "'parameters'", "'results'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTraceaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTraceaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTraceaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTracea.g"; }



     	private TraceaGrammarAccess grammarAccess;

        public InternalTraceaParser(TokenStream input, TraceaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tracea";
       	}

       	@Override
       	protected TraceaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTracea"
    // InternalTracea.g:64:1: entryRuleTracea returns [EObject current=null] : iv_ruleTracea= ruleTracea EOF ;
    public final EObject entryRuleTracea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTracea = null;


        try {
            // InternalTracea.g:64:47: (iv_ruleTracea= ruleTracea EOF )
            // InternalTracea.g:65:2: iv_ruleTracea= ruleTracea EOF
            {
             newCompositeNode(grammarAccess.getTraceaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTracea=ruleTracea();

            state._fsp--;

             current =iv_ruleTracea; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTracea"


    // $ANTLR start "ruleTracea"
    // InternalTracea.g:71:1: ruleTracea returns [EObject current=null] : ( () otherlv_1= 'Tracea' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'traces' otherlv_5= '{' ( (lv_traces_6_0= ruleTrace ) ) (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationshiptypes' otherlv_11= '{' ( (lv_relationshiptypes_12_0= ruleRelationshipType ) ) (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )* otherlv_15= '}' )? (otherlv_16= 'artefacts' otherlv_17= '{' ( (lv_artefacts_18_0= ruleArtefact ) ) (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )* otherlv_21= '}' )? (otherlv_22= 'fragments' otherlv_23= '{' ( (lv_fragments_24_0= ruleArtefactFragment ) ) (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )* otherlv_27= '}' )? (otherlv_28= 'evidences' otherlv_29= '{' ( (lv_evidences_30_0= ruleEvidence ) ) (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )* otherlv_33= '}' )? (otherlv_34= 'referees' otherlv_35= '{' ( (lv_referees_36_0= ruleReferee ) ) (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) ;
    public final EObject ruleTracea() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_traces_6_0 = null;

        EObject lv_traces_8_0 = null;

        EObject lv_relationshiptypes_12_0 = null;

        EObject lv_relationshiptypes_14_0 = null;

        EObject lv_artefacts_18_0 = null;

        EObject lv_artefacts_20_0 = null;

        EObject lv_fragments_24_0 = null;

        EObject lv_fragments_26_0 = null;

        EObject lv_evidences_30_0 = null;

        EObject lv_evidences_32_0 = null;

        EObject lv_referees_36_0 = null;

        EObject lv_referees_38_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:77:2: ( ( () otherlv_1= 'Tracea' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'traces' otherlv_5= '{' ( (lv_traces_6_0= ruleTrace ) ) (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationshiptypes' otherlv_11= '{' ( (lv_relationshiptypes_12_0= ruleRelationshipType ) ) (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )* otherlv_15= '}' )? (otherlv_16= 'artefacts' otherlv_17= '{' ( (lv_artefacts_18_0= ruleArtefact ) ) (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )* otherlv_21= '}' )? (otherlv_22= 'fragments' otherlv_23= '{' ( (lv_fragments_24_0= ruleArtefactFragment ) ) (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )* otherlv_27= '}' )? (otherlv_28= 'evidences' otherlv_29= '{' ( (lv_evidences_30_0= ruleEvidence ) ) (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )* otherlv_33= '}' )? (otherlv_34= 'referees' otherlv_35= '{' ( (lv_referees_36_0= ruleReferee ) ) (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) )
            // InternalTracea.g:78:2: ( () otherlv_1= 'Tracea' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'traces' otherlv_5= '{' ( (lv_traces_6_0= ruleTrace ) ) (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationshiptypes' otherlv_11= '{' ( (lv_relationshiptypes_12_0= ruleRelationshipType ) ) (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )* otherlv_15= '}' )? (otherlv_16= 'artefacts' otherlv_17= '{' ( (lv_artefacts_18_0= ruleArtefact ) ) (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )* otherlv_21= '}' )? (otherlv_22= 'fragments' otherlv_23= '{' ( (lv_fragments_24_0= ruleArtefactFragment ) ) (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )* otherlv_27= '}' )? (otherlv_28= 'evidences' otherlv_29= '{' ( (lv_evidences_30_0= ruleEvidence ) ) (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )* otherlv_33= '}' )? (otherlv_34= 'referees' otherlv_35= '{' ( (lv_referees_36_0= ruleReferee ) ) (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            {
            // InternalTracea.g:78:2: ( () otherlv_1= 'Tracea' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'traces' otherlv_5= '{' ( (lv_traces_6_0= ruleTrace ) ) (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationshiptypes' otherlv_11= '{' ( (lv_relationshiptypes_12_0= ruleRelationshipType ) ) (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )* otherlv_15= '}' )? (otherlv_16= 'artefacts' otherlv_17= '{' ( (lv_artefacts_18_0= ruleArtefact ) ) (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )* otherlv_21= '}' )? (otherlv_22= 'fragments' otherlv_23= '{' ( (lv_fragments_24_0= ruleArtefactFragment ) ) (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )* otherlv_27= '}' )? (otherlv_28= 'evidences' otherlv_29= '{' ( (lv_evidences_30_0= ruleEvidence ) ) (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )* otherlv_33= '}' )? (otherlv_34= 'referees' otherlv_35= '{' ( (lv_referees_36_0= ruleReferee ) ) (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            // InternalTracea.g:79:3: () otherlv_1= 'Tracea' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'traces' otherlv_5= '{' ( (lv_traces_6_0= ruleTrace ) ) (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationshiptypes' otherlv_11= '{' ( (lv_relationshiptypes_12_0= ruleRelationshipType ) ) (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )* otherlv_15= '}' )? (otherlv_16= 'artefacts' otherlv_17= '{' ( (lv_artefacts_18_0= ruleArtefact ) ) (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )* otherlv_21= '}' )? (otherlv_22= 'fragments' otherlv_23= '{' ( (lv_fragments_24_0= ruleArtefactFragment ) ) (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )* otherlv_27= '}' )? (otherlv_28= 'evidences' otherlv_29= '{' ( (lv_evidences_30_0= ruleEvidence ) ) (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )* otherlv_33= '}' )? (otherlv_34= 'referees' otherlv_35= '{' ( (lv_referees_36_0= ruleReferee ) ) (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )* otherlv_39= '}' )? otherlv_40= '}'
            {
            // InternalTracea.g:79:3: ()
            // InternalTracea.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceaAccess().getTraceaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceaAccess().getTraceaKeyword_1());
            		
            // InternalTracea.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:91:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTraceaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTraceaAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:113:3: (otherlv_4= 'traces' otherlv_5= '{' ( (lv_traces_6_0= ruleTrace ) ) (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTracea.g:114:4: otherlv_4= 'traces' otherlv_5= '{' ( (lv_traces_6_0= ruleTrace ) ) (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getTraceaAccess().getTracesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getTraceaAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:122:4: ( (lv_traces_6_0= ruleTrace ) )
                    // InternalTracea.g:123:5: (lv_traces_6_0= ruleTrace )
                    {
                    // InternalTracea.g:123:5: (lv_traces_6_0= ruleTrace )
                    // InternalTracea.g:124:6: lv_traces_6_0= ruleTrace
                    {

                    						newCompositeNode(grammarAccess.getTraceaAccess().getTracesTraceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_traces_6_0=ruleTrace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceaRule());
                    						}
                    						add(
                    							current,
                    							"traces",
                    							lv_traces_6_0,
                    							"uoc.som.tracea.Tracea.Trace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:141:4: (otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTracea.g:142:5: otherlv_7= ',' ( (lv_traces_8_0= ruleTrace ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTraceaAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:146:5: ( (lv_traces_8_0= ruleTrace ) )
                    	    // InternalTracea.g:147:6: (lv_traces_8_0= ruleTrace )
                    	    {
                    	    // InternalTracea.g:147:6: (lv_traces_8_0= ruleTrace )
                    	    // InternalTracea.g:148:7: lv_traces_8_0= ruleTrace
                    	    {

                    	    							newCompositeNode(grammarAccess.getTraceaAccess().getTracesTraceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_traces_8_0=ruleTrace();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTraceaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"traces",
                    	    								lv_traces_8_0,
                    	    								"uoc.som.tracea.Tracea.Trace");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getTraceaAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:171:3: (otherlv_10= 'relationshiptypes' otherlv_11= '{' ( (lv_relationshiptypes_12_0= ruleRelationshipType ) ) (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTracea.g:172:4: otherlv_10= 'relationshiptypes' otherlv_11= '{' ( (lv_relationshiptypes_12_0= ruleRelationshipType ) ) (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTraceaAccess().getRelationshiptypesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getTraceaAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:180:4: ( (lv_relationshiptypes_12_0= ruleRelationshipType ) )
                    // InternalTracea.g:181:5: (lv_relationshiptypes_12_0= ruleRelationshipType )
                    {
                    // InternalTracea.g:181:5: (lv_relationshiptypes_12_0= ruleRelationshipType )
                    // InternalTracea.g:182:6: lv_relationshiptypes_12_0= ruleRelationshipType
                    {

                    						newCompositeNode(grammarAccess.getTraceaAccess().getRelationshiptypesRelationshipTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_relationshiptypes_12_0=ruleRelationshipType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceaRule());
                    						}
                    						add(
                    							current,
                    							"relationshiptypes",
                    							lv_relationshiptypes_12_0,
                    							"uoc.som.tracea.Tracea.RelationshipType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:199:4: (otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTracea.g:200:5: otherlv_13= ',' ( (lv_relationshiptypes_14_0= ruleRelationshipType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTraceaAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:204:5: ( (lv_relationshiptypes_14_0= ruleRelationshipType ) )
                    	    // InternalTracea.g:205:6: (lv_relationshiptypes_14_0= ruleRelationshipType )
                    	    {
                    	    // InternalTracea.g:205:6: (lv_relationshiptypes_14_0= ruleRelationshipType )
                    	    // InternalTracea.g:206:7: lv_relationshiptypes_14_0= ruleRelationshipType
                    	    {

                    	    							newCompositeNode(grammarAccess.getTraceaAccess().getRelationshiptypesRelationshipTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_relationshiptypes_14_0=ruleRelationshipType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTraceaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relationshiptypes",
                    	    								lv_relationshiptypes_14_0,
                    	    								"uoc.som.tracea.Tracea.RelationshipType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getTraceaAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:229:3: (otherlv_16= 'artefacts' otherlv_17= '{' ( (lv_artefacts_18_0= ruleArtefact ) ) (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTracea.g:230:4: otherlv_16= 'artefacts' otherlv_17= '{' ( (lv_artefacts_18_0= ruleArtefact ) ) (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getTraceaAccess().getArtefactsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getTraceaAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:238:4: ( (lv_artefacts_18_0= ruleArtefact ) )
                    // InternalTracea.g:239:5: (lv_artefacts_18_0= ruleArtefact )
                    {
                    // InternalTracea.g:239:5: (lv_artefacts_18_0= ruleArtefact )
                    // InternalTracea.g:240:6: lv_artefacts_18_0= ruleArtefact
                    {

                    						newCompositeNode(grammarAccess.getTraceaAccess().getArtefactsArtefactParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_artefacts_18_0=ruleArtefact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceaRule());
                    						}
                    						add(
                    							current,
                    							"artefacts",
                    							lv_artefacts_18_0,
                    							"uoc.som.tracea.Tracea.Artefact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:257:4: (otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTracea.g:258:5: otherlv_19= ',' ( (lv_artefacts_20_0= ruleArtefact ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getTraceaAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:262:5: ( (lv_artefacts_20_0= ruleArtefact ) )
                    	    // InternalTracea.g:263:6: (lv_artefacts_20_0= ruleArtefact )
                    	    {
                    	    // InternalTracea.g:263:6: (lv_artefacts_20_0= ruleArtefact )
                    	    // InternalTracea.g:264:7: lv_artefacts_20_0= ruleArtefact
                    	    {

                    	    							newCompositeNode(grammarAccess.getTraceaAccess().getArtefactsArtefactParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_artefacts_20_0=ruleArtefact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTraceaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"artefacts",
                    	    								lv_artefacts_20_0,
                    	    								"uoc.som.tracea.Tracea.Artefact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getTraceaAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:287:3: (otherlv_22= 'fragments' otherlv_23= '{' ( (lv_fragments_24_0= ruleArtefactFragment ) ) (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )* otherlv_27= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTracea.g:288:4: otherlv_22= 'fragments' otherlv_23= '{' ( (lv_fragments_24_0= ruleArtefactFragment ) ) (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getTraceaAccess().getFragmentsKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getTraceaAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTracea.g:296:4: ( (lv_fragments_24_0= ruleArtefactFragment ) )
                    // InternalTracea.g:297:5: (lv_fragments_24_0= ruleArtefactFragment )
                    {
                    // InternalTracea.g:297:5: (lv_fragments_24_0= ruleArtefactFragment )
                    // InternalTracea.g:298:6: lv_fragments_24_0= ruleArtefactFragment
                    {

                    						newCompositeNode(grammarAccess.getTraceaAccess().getFragmentsArtefactFragmentParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_fragments_24_0=ruleArtefactFragment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceaRule());
                    						}
                    						add(
                    							current,
                    							"fragments",
                    							lv_fragments_24_0,
                    							"uoc.som.tracea.Tracea.ArtefactFragment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:315:4: (otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTracea.g:316:5: otherlv_25= ',' ( (lv_fragments_26_0= ruleArtefactFragment ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getTraceaAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:320:5: ( (lv_fragments_26_0= ruleArtefactFragment ) )
                    	    // InternalTracea.g:321:6: (lv_fragments_26_0= ruleArtefactFragment )
                    	    {
                    	    // InternalTracea.g:321:6: (lv_fragments_26_0= ruleArtefactFragment )
                    	    // InternalTracea.g:322:7: lv_fragments_26_0= ruleArtefactFragment
                    	    {

                    	    							newCompositeNode(grammarAccess.getTraceaAccess().getFragmentsArtefactFragmentParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_fragments_26_0=ruleArtefactFragment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTraceaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fragments",
                    	    								lv_fragments_26_0,
                    	    								"uoc.som.tracea.Tracea.ArtefactFragment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_27, grammarAccess.getTraceaAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:345:3: (otherlv_28= 'evidences' otherlv_29= '{' ( (lv_evidences_30_0= ruleEvidence ) ) (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )* otherlv_33= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTracea.g:346:4: otherlv_28= 'evidences' otherlv_29= '{' ( (lv_evidences_30_0= ruleEvidence ) ) (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getTraceaAccess().getEvidencesKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_29, grammarAccess.getTraceaAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalTracea.g:354:4: ( (lv_evidences_30_0= ruleEvidence ) )
                    // InternalTracea.g:355:5: (lv_evidences_30_0= ruleEvidence )
                    {
                    // InternalTracea.g:355:5: (lv_evidences_30_0= ruleEvidence )
                    // InternalTracea.g:356:6: lv_evidences_30_0= ruleEvidence
                    {

                    						newCompositeNode(grammarAccess.getTraceaAccess().getEvidencesEvidenceParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_evidences_30_0=ruleEvidence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceaRule());
                    						}
                    						add(
                    							current,
                    							"evidences",
                    							lv_evidences_30_0,
                    							"uoc.som.tracea.Tracea.Evidence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:373:4: (otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTracea.g:374:5: otherlv_31= ',' ( (lv_evidences_32_0= ruleEvidence ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getTraceaAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:378:5: ( (lv_evidences_32_0= ruleEvidence ) )
                    	    // InternalTracea.g:379:6: (lv_evidences_32_0= ruleEvidence )
                    	    {
                    	    // InternalTracea.g:379:6: (lv_evidences_32_0= ruleEvidence )
                    	    // InternalTracea.g:380:7: lv_evidences_32_0= ruleEvidence
                    	    {

                    	    							newCompositeNode(grammarAccess.getTraceaAccess().getEvidencesEvidenceParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_evidences_32_0=ruleEvidence();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTraceaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"evidences",
                    	    								lv_evidences_32_0,
                    	    								"uoc.som.tracea.Tracea.Evidence");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_33, grammarAccess.getTraceaAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:403:3: (otherlv_34= 'referees' otherlv_35= '{' ( (lv_referees_36_0= ruleReferee ) ) (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )* otherlv_39= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTracea.g:404:4: otherlv_34= 'referees' otherlv_35= '{' ( (lv_referees_36_0= ruleReferee ) ) (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getTraceaAccess().getRefereesKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_35, grammarAccess.getTraceaAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalTracea.g:412:4: ( (lv_referees_36_0= ruleReferee ) )
                    // InternalTracea.g:413:5: (lv_referees_36_0= ruleReferee )
                    {
                    // InternalTracea.g:413:5: (lv_referees_36_0= ruleReferee )
                    // InternalTracea.g:414:6: lv_referees_36_0= ruleReferee
                    {

                    						newCompositeNode(grammarAccess.getTraceaAccess().getRefereesRefereeParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_referees_36_0=ruleReferee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceaRule());
                    						}
                    						add(
                    							current,
                    							"referees",
                    							lv_referees_36_0,
                    							"uoc.som.tracea.Tracea.Referee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:431:4: (otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalTracea.g:432:5: otherlv_37= ',' ( (lv_referees_38_0= ruleReferee ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getTraceaAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalTracea.g:436:5: ( (lv_referees_38_0= ruleReferee ) )
                    	    // InternalTracea.g:437:6: (lv_referees_38_0= ruleReferee )
                    	    {
                    	    // InternalTracea.g:437:6: (lv_referees_38_0= ruleReferee )
                    	    // InternalTracea.g:438:7: lv_referees_38_0= ruleReferee
                    	    {

                    	    							newCompositeNode(grammarAccess.getTraceaAccess().getRefereesRefereeParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_referees_38_0=ruleReferee();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTraceaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"referees",
                    	    								lv_referees_38_0,
                    	    								"uoc.som.tracea.Tracea.Referee");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_39, grammarAccess.getTraceaAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_40=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getTraceaAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTracea"


    // $ANTLR start "entryRuleTrace"
    // InternalTracea.g:469:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // InternalTracea.g:469:46: (iv_ruleTrace= ruleTrace EOF )
            // InternalTracea.g:470:2: iv_ruleTrace= ruleTrace EOF
            {
             newCompositeNode(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrace=ruleTrace();

            state._fsp--;

             current =iv_ruleTrace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrace"


    // $ANTLR start "ruleTrace"
    // InternalTracea.g:476:1: ruleTrace returns [EObject current=null] : ( () otherlv_1= 'Trace' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_6= 'evidences' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? ( (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) ) | ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' ) )? (otherlv_18= 'tracelinks' otherlv_19= '{' ( (lv_tracelinks_20_0= ruleTraceLink ) ) (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_tracelinks_20_0 = null;

        EObject lv_tracelinks_22_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_31_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:482:2: ( ( () otherlv_1= 'Trace' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_6= 'evidences' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? ( (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) ) | ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' ) )? (otherlv_18= 'tracelinks' otherlv_19= '{' ( (lv_tracelinks_20_0= ruleTraceLink ) ) (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' ) )
            // InternalTracea.g:483:2: ( () otherlv_1= 'Trace' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_6= 'evidences' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? ( (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) ) | ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' ) )? (otherlv_18= 'tracelinks' otherlv_19= '{' ( (lv_tracelinks_20_0= ruleTraceLink ) ) (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' )
            {
            // InternalTracea.g:483:2: ( () otherlv_1= 'Trace' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_6= 'evidences' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? ( (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) ) | ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' ) )? (otherlv_18= 'tracelinks' otherlv_19= '{' ( (lv_tracelinks_20_0= ruleTraceLink ) ) (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' )
            // InternalTracea.g:484:3: () otherlv_1= 'Trace' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_6= 'evidences' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? ( (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) ) | ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' ) )? (otherlv_18= 'tracelinks' otherlv_19= '{' ( (lv_tracelinks_20_0= ruleTraceLink ) ) (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}'
            {
            // InternalTracea.g:484:3: ()
            // InternalTracea.g:485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceAccess().getTraceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getTraceKeyword_1());
            		
            // InternalTracea.g:495:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:496:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:496:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:497:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTraceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTraceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:518:3: (otherlv_4= 'relationshiptype' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTracea.g:519:4: otherlv_4= 'relationshiptype' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTraceAccess().getRelationshiptypeKeyword_4_0());
                    			
                    // InternalTracea.g:523:4: ( ( ruleEString ) )
                    // InternalTracea.g:524:5: ( ruleEString )
                    {
                    // InternalTracea.g:524:5: ( ruleEString )
                    // InternalTracea.g:525:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTraceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTraceAccess().getRelationshiptypeRelationshipTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:540:3: (otherlv_6= 'evidences' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTracea.g:541:4: otherlv_6= 'evidences' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getTraceAccess().getEvidencesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTraceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:549:4: ( ( ruleEString ) )
                    // InternalTracea.g:550:5: ( ruleEString )
                    {
                    // InternalTracea.g:550:5: ( ruleEString )
                    // InternalTracea.g:551:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTraceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTraceAccess().getEvidencesEvidenceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:565:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTracea.g:566:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTraceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:570:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:571:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:571:6: ( ruleEString )
                    	    // InternalTracea.g:572:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTraceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTraceAccess().getEvidencesEvidenceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getTraceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:592:3: ( (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) ) | ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' ) )?
            int alt17=3;
            switch ( input.LA(1) ) {
                case 23:
                    {
                    alt17=1;
                    }
                    break;
                case 14:
                    {
                    alt17=2;
                    }
                    break;
                case 15:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==15) ) {
                        int LA17_5 = input.LA(3);

                        if ( (LA17_5==15) ) {
                            int LA17_6 = input.LA(4);

                            if ( ((LA17_6>=15 && LA17_6<=20)) ) {
                                alt17=2;
                            }
                        }
                        else if ( (LA17_5==EOF||LA17_5==14) ) {
                            alt17=2;
                        }
                    }
                    else if ( (LA17_3==20||LA17_3==24||LA17_3==27) ) {
                        alt17=2;
                    }
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // InternalTracea.g:593:4: (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) )
                    {
                    // InternalTracea.g:593:4: (otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) ) )
                    // InternalTracea.g:594:5: otherlv_12= 'starts' otherlv_13= '{' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_4); 

                    					newLeafNode(otherlv_12, grammarAccess.getTraceAccess().getStartsKeyword_6_0_0());
                    				
                    otherlv_13=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(otherlv_13, grammarAccess.getTraceAccess().getLeftCurlyBracketKeyword_6_0_1());
                    				
                    // InternalTracea.g:602:5: ( ( ruleEString ) )
                    // InternalTracea.g:603:6: ( ruleEString )
                    {
                    // InternalTracea.g:603:6: ( ruleEString )
                    // InternalTracea.g:604:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTraceRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getTraceAccess().getStartsTraceLinkCrossReference_6_0_2_0());
                    						
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTracea.g:620:4: ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )
                    {
                    // InternalTracea.g:620:4: ( (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )
                    // InternalTracea.g:621:5: (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}'
                    {
                    // InternalTracea.g:621:5: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalTracea.g:622:6: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getTraceAccess().getCommaKeyword_6_1_0_0());
                    	    					
                    	    // InternalTracea.g:626:6: ( ( ruleEString ) )
                    	    // InternalTracea.g:627:7: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:627:7: ( ruleEString )
                    	    // InternalTracea.g:628:8: ruleEString
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getTraceRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getTraceAccess().getStartsTraceLinkCrossReference_6_1_0_1_0());
                    	    							
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_22); 

                    					newLeafNode(otherlv_17, grammarAccess.getTraceAccess().getRightCurlyBracketKeyword_6_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalTracea.g:649:3: (otherlv_18= 'tracelinks' otherlv_19= '{' ( (lv_tracelinks_20_0= ruleTraceLink ) ) (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )* otherlv_23= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTracea.g:650:4: otherlv_18= 'tracelinks' otherlv_19= '{' ( (lv_tracelinks_20_0= ruleTraceLink ) ) (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getTraceAccess().getTracelinksKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getTraceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTracea.g:658:4: ( (lv_tracelinks_20_0= ruleTraceLink ) )
                    // InternalTracea.g:659:5: (lv_tracelinks_20_0= ruleTraceLink )
                    {
                    // InternalTracea.g:659:5: (lv_tracelinks_20_0= ruleTraceLink )
                    // InternalTracea.g:660:6: lv_tracelinks_20_0= ruleTraceLink
                    {

                    						newCompositeNode(grammarAccess.getTraceAccess().getTracelinksTraceLinkParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_tracelinks_20_0=ruleTraceLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceRule());
                    						}
                    						add(
                    							current,
                    							"tracelinks",
                    							lv_tracelinks_20_0,
                    							"uoc.som.tracea.Tracea.TraceLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:677:4: (otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalTracea.g:678:5: otherlv_21= ',' ( (lv_tracelinks_22_0= ruleTraceLink ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTraceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:682:5: ( (lv_tracelinks_22_0= ruleTraceLink ) )
                    	    // InternalTracea.g:683:6: (lv_tracelinks_22_0= ruleTraceLink )
                    	    {
                    	    // InternalTracea.g:683:6: (lv_tracelinks_22_0= ruleTraceLink )
                    	    // InternalTracea.g:684:7: lv_tracelinks_22_0= ruleTraceLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getTraceAccess().getTracelinksTraceLinkParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_tracelinks_22_0=ruleTraceLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTraceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tracelinks",
                    	    								lv_tracelinks_22_0,
                    	    								"uoc.som.tracea.Tracea.TraceLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_23, grammarAccess.getTraceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:707:3: (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTracea.g:708:4: otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_24, grammarAccess.getTraceAccess().getRefereesKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getTraceAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalTracea.g:716:4: ( ( ruleEString ) )
                    // InternalTracea.g:717:5: ( ruleEString )
                    {
                    // InternalTracea.g:717:5: ( ruleEString )
                    // InternalTracea.g:718:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTraceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTraceAccess().getRefereesRefereeCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:732:4: (otherlv_27= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalTracea.g:733:5: otherlv_27= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getTraceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:737:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:738:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:738:6: ( ruleEString )
                    	    // InternalTracea.g:739:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTraceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTraceAccess().getRefereesRefereeCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_29, grammarAccess.getTraceAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:759:3: (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTracea.g:760:4: otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) )
                    {
                    otherlv_30=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getTraceAccess().getTimestampKeyword_9_0());
                    			
                    // InternalTracea.g:764:4: ( (lv_timestamp_31_0= ruleEString ) )
                    // InternalTracea.g:765:5: (lv_timestamp_31_0= ruleEString )
                    {
                    // InternalTracea.g:765:5: (lv_timestamp_31_0= ruleEString )
                    // InternalTracea.g:766:6: lv_timestamp_31_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTraceAccess().getTimestampEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_31_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTraceRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_31_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_32=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getTraceAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrace"


    // $ANTLR start "entryRuleTraceLink"
    // InternalTracea.g:792:1: entryRuleTraceLink returns [EObject current=null] : iv_ruleTraceLink= ruleTraceLink EOF ;
    public final EObject entryRuleTraceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceLink = null;


        try {
            // InternalTracea.g:792:50: (iv_ruleTraceLink= ruleTraceLink EOF )
            // InternalTracea.g:793:2: iv_ruleTraceLink= ruleTraceLink EOF
            {
             newCompositeNode(grammarAccess.getTraceLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceLink=ruleTraceLink();

            state._fsp--;

             current =iv_ruleTraceLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceLink"


    // $ANTLR start "ruleTraceLink"
    // InternalTracea.g:799:1: ruleTraceLink returns [EObject current=null] : (this_LeafTraceLink_0= ruleLeafTraceLink | this_NodeTraceLink_1= ruleNodeTraceLink ) ;
    public final EObject ruleTraceLink() throws RecognitionException {
        EObject current = null;

        EObject this_LeafTraceLink_0 = null;

        EObject this_NodeTraceLink_1 = null;



        	enterRule();

        try {
            // InternalTracea.g:805:2: ( (this_LeafTraceLink_0= ruleLeafTraceLink | this_NodeTraceLink_1= ruleNodeTraceLink ) )
            // InternalTracea.g:806:2: (this_LeafTraceLink_0= ruleLeafTraceLink | this_NodeTraceLink_1= ruleNodeTraceLink )
            {
            // InternalTracea.g:806:2: (this_LeafTraceLink_0= ruleLeafTraceLink | this_NodeTraceLink_1= ruleNodeTraceLink )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            else if ( (LA23_0==31) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTracea.g:807:3: this_LeafTraceLink_0= ruleLeafTraceLink
                    {

                    			newCompositeNode(grammarAccess.getTraceLinkAccess().getLeafTraceLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeafTraceLink_0=ruleLeafTraceLink();

                    state._fsp--;


                    			current = this_LeafTraceLink_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:816:3: this_NodeTraceLink_1= ruleNodeTraceLink
                    {

                    			newCompositeNode(grammarAccess.getTraceLinkAccess().getNodeTraceLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeTraceLink_1=ruleNodeTraceLink();

                    state._fsp--;


                    			current = this_NodeTraceLink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceLink"


    // $ANTLR start "entryRuleLeafTraceLink"
    // InternalTracea.g:828:1: entryRuleLeafTraceLink returns [EObject current=null] : iv_ruleLeafTraceLink= ruleLeafTraceLink EOF ;
    public final EObject entryRuleLeafTraceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeafTraceLink = null;


        try {
            // InternalTracea.g:828:54: (iv_ruleLeafTraceLink= ruleLeafTraceLink EOF )
            // InternalTracea.g:829:2: iv_ruleLeafTraceLink= ruleLeafTraceLink EOF
            {
             newCompositeNode(grammarAccess.getLeafTraceLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeafTraceLink=ruleLeafTraceLink();

            state._fsp--;

             current =iv_ruleLeafTraceLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeafTraceLink"


    // $ANTLR start "ruleLeafTraceLink"
    // InternalTracea.g:835:1: ruleLeafTraceLink returns [EObject current=null] : ( () otherlv_1= 'LeafTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_10= 'evidences' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleLeafTraceLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_23_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:841:2: ( ( () otherlv_1= 'LeafTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_10= 'evidences' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' ) )
            // InternalTracea.g:842:2: ( () otherlv_1= 'LeafTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_10= 'evidences' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' )
            {
            // InternalTracea.g:842:2: ( () otherlv_1= 'LeafTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_10= 'evidences' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' )
            // InternalTracea.g:843:3: () otherlv_1= 'LeafTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_10= 'evidences' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}'
            {
            // InternalTracea.g:843:3: ()
            // InternalTracea.g:844:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeafTraceLinkAccess().getLeafTraceLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLeafTraceLinkAccess().getLeafTraceLinkKeyword_1());
            		
            // InternalTracea.g:854:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:855:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:855:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:856:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeafTraceLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getLeafTraceLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:877:3: (otherlv_4= 'source' ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTracea.g:878:4: otherlv_4= 'source' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLeafTraceLinkAccess().getSourceKeyword_4_0());
                    			
                    // InternalTracea.g:882:4: ( ( ruleEString ) )
                    // InternalTracea.g:883:5: ( ruleEString )
                    {
                    // InternalTracea.g:883:5: ( ruleEString )
                    // InternalTracea.g:884:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getSourceArtefactFragmentCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:899:3: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTracea.g:900:4: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLeafTraceLinkAccess().getTargetKeyword_5_0());
                    			
                    // InternalTracea.g:904:4: ( ( ruleEString ) )
                    // InternalTracea.g:905:5: ( ruleEString )
                    {
                    // InternalTracea.g:905:5: ( ruleEString )
                    // InternalTracea.g:906:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getTargetArtefactFragmentCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:921:3: (otherlv_8= 'relationshiptype' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTracea.g:922:4: otherlv_8= 'relationshiptype' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLeafTraceLinkAccess().getRelationshiptypeKeyword_6_0());
                    			
                    // InternalTracea.g:926:4: ( ( ruleEString ) )
                    // InternalTracea.g:927:5: ( ruleEString )
                    {
                    // InternalTracea.g:927:5: ( ruleEString )
                    // InternalTracea.g:928:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getRelationshiptypeRelationshipTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:943:3: (otherlv_10= 'evidences' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTracea.g:944:4: otherlv_10= 'evidences' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getLeafTraceLinkAccess().getEvidencesKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getLeafTraceLinkAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTracea.g:952:4: ( ( ruleEString ) )
                    // InternalTracea.g:953:5: ( ruleEString )
                    {
                    // InternalTracea.g:953:5: ( ruleEString )
                    // InternalTracea.g:954:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getEvidencesEvidenceCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:968:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalTracea.g:969:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getLeafTraceLinkAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:973:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:974:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:974:6: ( ruleEString )
                    	    // InternalTracea.g:975:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLeafTraceLinkRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getEvidencesEvidenceCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getLeafTraceLinkAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:995:3: (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTracea.g:996:4: otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getLeafTraceLinkAccess().getRefereesKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getLeafTraceLinkAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalTracea.g:1004:4: ( ( ruleEString ) )
                    // InternalTracea.g:1005:5: ( ruleEString )
                    {
                    // InternalTracea.g:1005:5: ( ruleEString )
                    // InternalTracea.g:1006:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getRefereesRefereeCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1020:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalTracea.g:1021:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getLeafTraceLinkAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:1025:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1026:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1026:6: ( ruleEString )
                    	    // InternalTracea.g:1027:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLeafTraceLinkRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getRefereesRefereeCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_21, grammarAccess.getLeafTraceLinkAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:1047:3: (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTracea.g:1048:4: otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getLeafTraceLinkAccess().getTimestampKeyword_9_0());
                    			
                    // InternalTracea.g:1052:4: ( (lv_timestamp_23_0= ruleEString ) )
                    // InternalTracea.g:1053:5: (lv_timestamp_23_0= ruleEString )
                    {
                    // InternalTracea.g:1053:5: (lv_timestamp_23_0= ruleEString )
                    // InternalTracea.g:1054:6: lv_timestamp_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLeafTraceLinkAccess().getTimestampEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeafTraceLinkRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_23_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getLeafTraceLinkAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeafTraceLink"


    // $ANTLR start "entryRuleNodeTraceLink"
    // InternalTracea.g:1080:1: entryRuleNodeTraceLink returns [EObject current=null] : iv_ruleNodeTraceLink= ruleNodeTraceLink EOF ;
    public final EObject entryRuleNodeTraceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTraceLink = null;


        try {
            // InternalTracea.g:1080:54: (iv_ruleNodeTraceLink= ruleNodeTraceLink EOF )
            // InternalTracea.g:1081:2: iv_ruleNodeTraceLink= ruleNodeTraceLink EOF
            {
             newCompositeNode(grammarAccess.getNodeTraceLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeTraceLink=ruleNodeTraceLink();

            state._fsp--;

             current =iv_ruleNodeTraceLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTraceLink"


    // $ANTLR start "ruleNodeTraceLink"
    // InternalTracea.g:1087:1: ruleNodeTraceLink returns [EObject current=null] : ( () otherlv_1= 'NodeTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'successors' otherlv_9= '{' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_16= 'evidences' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleNodeTraceLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_29_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:1093:2: ( ( () otherlv_1= 'NodeTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'successors' otherlv_9= '{' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_16= 'evidences' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' ) )
            // InternalTracea.g:1094:2: ( () otherlv_1= 'NodeTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'successors' otherlv_9= '{' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_16= 'evidences' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' )
            {
            // InternalTracea.g:1094:2: ( () otherlv_1= 'NodeTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'successors' otherlv_9= '{' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_16= 'evidences' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' )
            // InternalTracea.g:1095:3: () otherlv_1= 'NodeTraceLink' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? (otherlv_8= 'successors' otherlv_9= '{' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'relationshiptype' ( ( ruleEString ) ) )? (otherlv_16= 'evidences' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}'
            {
            // InternalTracea.g:1095:3: ()
            // InternalTracea.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeTraceLinkAccess().getNodeTraceLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeTraceLinkAccess().getNodeTraceLinkKeyword_1());
            		
            // InternalTracea.g:1106:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:1107:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:1107:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:1108:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeTraceLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeTraceLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:1129:3: (otherlv_4= 'source' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTracea.g:1130:4: otherlv_4= 'source' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeTraceLinkAccess().getSourceKeyword_4_0());
                    			
                    // InternalTracea.g:1134:4: ( ( ruleEString ) )
                    // InternalTracea.g:1135:5: ( ruleEString )
                    {
                    // InternalTracea.g:1135:5: ( ruleEString )
                    // InternalTracea.g:1136:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getSourceArtefactFragmentCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:1151:3: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTracea.g:1152:4: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getNodeTraceLinkAccess().getTargetKeyword_5_0());
                    			
                    // InternalTracea.g:1156:4: ( ( ruleEString ) )
                    // InternalTracea.g:1157:5: ( ruleEString )
                    {
                    // InternalTracea.g:1157:5: ( ruleEString )
                    // InternalTracea.g:1158:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getTargetArtefactFragmentCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:1173:3: (otherlv_8= 'successors' otherlv_9= '{' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTracea.g:1174:4: otherlv_8= 'successors' otherlv_9= '{' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getNodeTraceLinkAccess().getSuccessorsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeTraceLinkAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:1182:4: ( ( ruleEString ) )
                    // InternalTracea.g:1183:5: ( ruleEString )
                    {
                    // InternalTracea.g:1183:5: ( ruleEString )
                    // InternalTracea.g:1184:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getSuccessorsTraceLinkCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1198:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalTracea.g:1199:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getNodeTraceLinkAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:1203:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1204:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1204:6: ( ruleEString )
                    	    // InternalTracea.g:1205:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getSuccessorsTraceLinkCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getNodeTraceLinkAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:1225:3: (otherlv_14= 'relationshiptype' ( ( ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTracea.g:1226:4: otherlv_14= 'relationshiptype' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getNodeTraceLinkAccess().getRelationshiptypeKeyword_7_0());
                    			
                    // InternalTracea.g:1230:4: ( ( ruleEString ) )
                    // InternalTracea.g:1231:5: ( ruleEString )
                    {
                    // InternalTracea.g:1231:5: ( ruleEString )
                    // InternalTracea.g:1232:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getRelationshiptypeRelationshipTypeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:1247:3: (otherlv_16= 'evidences' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTracea.g:1248:4: otherlv_16= 'evidences' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getNodeTraceLinkAccess().getEvidencesKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getNodeTraceLinkAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalTracea.g:1256:4: ( ( ruleEString ) )
                    // InternalTracea.g:1257:5: ( ruleEString )
                    {
                    // InternalTracea.g:1257:5: ( ruleEString )
                    // InternalTracea.g:1258:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getEvidencesEvidenceCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1272:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalTracea.g:1273:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getNodeTraceLinkAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:1277:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1278:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1278:6: ( ruleEString )
                    	    // InternalTracea.g:1279:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getEvidencesEvidenceCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeTraceLinkAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:1299:3: (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTracea.g:1300:4: otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getNodeTraceLinkAccess().getRefereesKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getNodeTraceLinkAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalTracea.g:1308:4: ( ( ruleEString ) )
                    // InternalTracea.g:1309:5: ( ruleEString )
                    {
                    // InternalTracea.g:1309:5: ( ruleEString )
                    // InternalTracea.g:1310:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getRefereesRefereeCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1324:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTracea.g:1325:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getNodeTraceLinkAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalTracea.g:1329:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1330:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1330:6: ( ruleEString )
                    	    // InternalTracea.g:1331:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNodeTraceLinkRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getRefereesRefereeCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_27, grammarAccess.getNodeTraceLinkAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:1351:3: (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTracea.g:1352:4: otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getNodeTraceLinkAccess().getTimestampKeyword_10_0());
                    			
                    // InternalTracea.g:1356:4: ( (lv_timestamp_29_0= ruleEString ) )
                    // InternalTracea.g:1357:5: (lv_timestamp_29_0= ruleEString )
                    {
                    // InternalTracea.g:1357:5: (lv_timestamp_29_0= ruleEString )
                    // InternalTracea.g:1358:6: lv_timestamp_29_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNodeTraceLinkAccess().getTimestampEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_29_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeTraceLinkRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_29_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getNodeTraceLinkAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTraceLink"


    // $ANTLR start "entryRuleArtefact"
    // InternalTracea.g:1384:1: entryRuleArtefact returns [EObject current=null] : iv_ruleArtefact= ruleArtefact EOF ;
    public final EObject entryRuleArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefact = null;


        try {
            // InternalTracea.g:1384:49: (iv_ruleArtefact= ruleArtefact EOF )
            // InternalTracea.g:1385:2: iv_ruleArtefact= ruleArtefact EOF
            {
             newCompositeNode(grammarAccess.getArtefactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtefact=ruleArtefact();

            state._fsp--;

             current =iv_ruleArtefact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtefact"


    // $ANTLR start "ruleArtefact"
    // InternalTracea.g:1391:1: ruleArtefact returns [EObject current=null] : (this_ModelArtefact_0= ruleModelArtefact | this_TextArtefact_1= ruleTextArtefact ) ;
    public final EObject ruleArtefact() throws RecognitionException {
        EObject current = null;

        EObject this_ModelArtefact_0 = null;

        EObject this_TextArtefact_1 = null;



        	enterRule();

        try {
            // InternalTracea.g:1397:2: ( (this_ModelArtefact_0= ruleModelArtefact | this_TextArtefact_1= ruleTextArtefact ) )
            // InternalTracea.g:1398:2: (this_ModelArtefact_0= ruleModelArtefact | this_TextArtefact_1= ruleTextArtefact )
            {
            // InternalTracea.g:1398:2: (this_ModelArtefact_0= ruleModelArtefact | this_TextArtefact_1= ruleTextArtefact )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33||LA42_0==49) ) {
                alt42=1;
            }
            else if ( (LA42_0==34||LA42_0==37) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalTracea.g:1399:3: this_ModelArtefact_0= ruleModelArtefact
                    {

                    			newCompositeNode(grammarAccess.getArtefactAccess().getModelArtefactParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelArtefact_0=ruleModelArtefact();

                    state._fsp--;


                    			current = this_ModelArtefact_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:1408:3: this_TextArtefact_1= ruleTextArtefact
                    {

                    			newCompositeNode(grammarAccess.getArtefactAccess().getTextArtefactParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextArtefact_1=ruleTextArtefact();

                    state._fsp--;


                    			current = this_TextArtefact_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtefact"


    // $ANTLR start "entryRuleModelArtefact"
    // InternalTracea.g:1420:1: entryRuleModelArtefact returns [EObject current=null] : iv_ruleModelArtefact= ruleModelArtefact EOF ;
    public final EObject entryRuleModelArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelArtefact = null;


        try {
            // InternalTracea.g:1420:54: (iv_ruleModelArtefact= ruleModelArtefact EOF )
            // InternalTracea.g:1421:2: iv_ruleModelArtefact= ruleModelArtefact EOF
            {
             newCompositeNode(grammarAccess.getModelArtefactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelArtefact=ruleModelArtefact();

            state._fsp--;

             current =iv_ruleModelArtefact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelArtefact"


    // $ANTLR start "ruleModelArtefact"
    // InternalTracea.g:1427:1: ruleModelArtefact returns [EObject current=null] : (this_ModelArtefact_Impl_0= ruleModelArtefact_Impl | this_Model_1= ruleModel ) ;
    public final EObject ruleModelArtefact() throws RecognitionException {
        EObject current = null;

        EObject this_ModelArtefact_Impl_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalTracea.g:1433:2: ( (this_ModelArtefact_Impl_0= ruleModelArtefact_Impl | this_Model_1= ruleModel ) )
            // InternalTracea.g:1434:2: (this_ModelArtefact_Impl_0= ruleModelArtefact_Impl | this_Model_1= ruleModel )
            {
            // InternalTracea.g:1434:2: (this_ModelArtefact_Impl_0= ruleModelArtefact_Impl | this_Model_1= ruleModel )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            else if ( (LA43_0==49) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalTracea.g:1435:3: this_ModelArtefact_Impl_0= ruleModelArtefact_Impl
                    {

                    			newCompositeNode(grammarAccess.getModelArtefactAccess().getModelArtefact_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelArtefact_Impl_0=ruleModelArtefact_Impl();

                    state._fsp--;


                    			current = this_ModelArtefact_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:1444:3: this_Model_1= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getModelArtefactAccess().getModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    			current = this_Model_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelArtefact"


    // $ANTLR start "entryRuleTextArtefact"
    // InternalTracea.g:1456:1: entryRuleTextArtefact returns [EObject current=null] : iv_ruleTextArtefact= ruleTextArtefact EOF ;
    public final EObject entryRuleTextArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArtefact = null;


        try {
            // InternalTracea.g:1456:53: (iv_ruleTextArtefact= ruleTextArtefact EOF )
            // InternalTracea.g:1457:2: iv_ruleTextArtefact= ruleTextArtefact EOF
            {
             newCompositeNode(grammarAccess.getTextArtefactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextArtefact=ruleTextArtefact();

            state._fsp--;

             current =iv_ruleTextArtefact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextArtefact"


    // $ANTLR start "ruleTextArtefact"
    // InternalTracea.g:1463:1: ruleTextArtefact returns [EObject current=null] : (this_TextArtefact_Impl_0= ruleTextArtefact_Impl | this_Document_1= ruleDocument ) ;
    public final EObject ruleTextArtefact() throws RecognitionException {
        EObject current = null;

        EObject this_TextArtefact_Impl_0 = null;

        EObject this_Document_1 = null;



        	enterRule();

        try {
            // InternalTracea.g:1469:2: ( (this_TextArtefact_Impl_0= ruleTextArtefact_Impl | this_Document_1= ruleDocument ) )
            // InternalTracea.g:1470:2: (this_TextArtefact_Impl_0= ruleTextArtefact_Impl | this_Document_1= ruleDocument )
            {
            // InternalTracea.g:1470:2: (this_TextArtefact_Impl_0= ruleTextArtefact_Impl | this_Document_1= ruleDocument )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            else if ( (LA44_0==37) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalTracea.g:1471:3: this_TextArtefact_Impl_0= ruleTextArtefact_Impl
                    {

                    			newCompositeNode(grammarAccess.getTextArtefactAccess().getTextArtefact_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextArtefact_Impl_0=ruleTextArtefact_Impl();

                    state._fsp--;


                    			current = this_TextArtefact_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:1480:3: this_Document_1= ruleDocument
                    {

                    			newCompositeNode(grammarAccess.getTextArtefactAccess().getDocumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Document_1=ruleDocument();

                    state._fsp--;


                    			current = this_Document_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextArtefact"


    // $ANTLR start "entryRuleModelArtefact_Impl"
    // InternalTracea.g:1492:1: entryRuleModelArtefact_Impl returns [EObject current=null] : iv_ruleModelArtefact_Impl= ruleModelArtefact_Impl EOF ;
    public final EObject entryRuleModelArtefact_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelArtefact_Impl = null;


        try {
            // InternalTracea.g:1492:59: (iv_ruleModelArtefact_Impl= ruleModelArtefact_Impl EOF )
            // InternalTracea.g:1493:2: iv_ruleModelArtefact_Impl= ruleModelArtefact_Impl EOF
            {
             newCompositeNode(grammarAccess.getModelArtefact_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelArtefact_Impl=ruleModelArtefact_Impl();

            state._fsp--;

             current =iv_ruleModelArtefact_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelArtefact_Impl"


    // $ANTLR start "ruleModelArtefact_Impl"
    // InternalTracea.g:1499:1: ruleModelArtefact_Impl returns [EObject current=null] : ( () otherlv_1= 'ModelArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleModelArtefact_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_17_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:1505:2: ( ( () otherlv_1= 'ModelArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' ) )
            // InternalTracea.g:1506:2: ( () otherlv_1= 'ModelArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' )
            {
            // InternalTracea.g:1506:2: ( () otherlv_1= 'ModelArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' )
            // InternalTracea.g:1507:3: () otherlv_1= 'ModelArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}'
            {
            // InternalTracea.g:1507:3: ()
            // InternalTracea.g:1508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelArtefact_ImplAccess().getModelArtefactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelArtefact_ImplAccess().getModelArtefactKeyword_1());
            		
            // InternalTracea.g:1518:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:1519:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:1519:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:1520:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelArtefact_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelArtefact_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getModelArtefact_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:1541:3: (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==18) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTracea.g:1542:4: otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelArtefact_ImplAccess().getFragmentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelArtefact_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:1550:4: ( ( ruleEString ) )
                    // InternalTracea.g:1551:5: ( ruleEString )
                    {
                    // InternalTracea.g:1551:5: ( ruleEString )
                    // InternalTracea.g:1552:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelArtefact_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelArtefact_ImplAccess().getFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1566:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalTracea.g:1567:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelArtefact_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:1571:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1572:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1572:6: ( ruleEString )
                    	    // InternalTracea.g:1573:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelArtefact_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelArtefact_ImplAccess().getFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelArtefact_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:1593:3: (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==20) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTracea.g:1594:4: otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelArtefact_ImplAccess().getRefereesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelArtefact_ImplAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTracea.g:1602:4: ( ( ruleEString ) )
                    // InternalTracea.g:1603:5: ( ruleEString )
                    {
                    // InternalTracea.g:1603:5: ( ruleEString )
                    // InternalTracea.g:1604:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelArtefact_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelArtefact_ImplAccess().getRefereesRefereeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1618:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalTracea.g:1619:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getModelArtefact_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:1623:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1624:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1624:6: ( ruleEString )
                    	    // InternalTracea.g:1625:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelArtefact_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelArtefact_ImplAccess().getRefereesRefereeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_15, grammarAccess.getModelArtefact_ImplAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:1645:3: (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==27) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTracea.g:1646:4: otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getModelArtefact_ImplAccess().getTimestampKeyword_6_0());
                    			
                    // InternalTracea.g:1650:4: ( (lv_timestamp_17_0= ruleEString ) )
                    // InternalTracea.g:1651:5: (lv_timestamp_17_0= ruleEString )
                    {
                    // InternalTracea.g:1651:5: (lv_timestamp_17_0= ruleEString )
                    // InternalTracea.g:1652:6: lv_timestamp_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModelArtefact_ImplAccess().getTimestampEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelArtefact_ImplRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_17_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getModelArtefact_ImplAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelArtefact_Impl"


    // $ANTLR start "entryRuleTextArtefact_Impl"
    // InternalTracea.g:1678:1: entryRuleTextArtefact_Impl returns [EObject current=null] : iv_ruleTextArtefact_Impl= ruleTextArtefact_Impl EOF ;
    public final EObject entryRuleTextArtefact_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArtefact_Impl = null;


        try {
            // InternalTracea.g:1678:58: (iv_ruleTextArtefact_Impl= ruleTextArtefact_Impl EOF )
            // InternalTracea.g:1679:2: iv_ruleTextArtefact_Impl= ruleTextArtefact_Impl EOF
            {
             newCompositeNode(grammarAccess.getTextArtefact_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextArtefact_Impl=ruleTextArtefact_Impl();

            state._fsp--;

             current =iv_ruleTextArtefact_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextArtefact_Impl"


    // $ANTLR start "ruleTextArtefact_Impl"
    // InternalTracea.g:1685:1: ruleTextArtefact_Impl returns [EObject current=null] : ( () otherlv_1= 'TextArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleTextArtefact_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_11_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:1691:2: ( ( () otherlv_1= 'TextArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalTracea.g:1692:2: ( () otherlv_1= 'TextArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalTracea.g:1692:2: ( () otherlv_1= 'TextArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalTracea.g:1693:3: () otherlv_1= 'TextArtefact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalTracea.g:1693:3: ()
            // InternalTracea.g:1694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextArtefact_ImplAccess().getTextArtefactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTextArtefact_ImplAccess().getTextArtefactKeyword_1());
            		
            // InternalTracea.g:1704:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:1705:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:1705:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:1706:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextArtefact_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextArtefact_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getTextArtefact_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:1727:3: (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTracea.g:1728:4: otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextArtefact_ImplAccess().getFragmentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextArtefact_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:1736:4: ( ( ruleEString ) )
                    // InternalTracea.g:1737:5: ( ruleEString )
                    {
                    // InternalTracea.g:1737:5: ( ruleEString )
                    // InternalTracea.g:1738:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextArtefact_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextArtefact_ImplAccess().getFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1752:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalTracea.g:1753:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTextArtefact_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:1757:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1758:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1758:6: ( ruleEString )
                    	    // InternalTracea.g:1759:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTextArtefact_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTextArtefact_ImplAccess().getFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextArtefact_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:1779:3: (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==27) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTracea.g:1780:4: otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextArtefact_ImplAccess().getTimestampKeyword_5_0());
                    			
                    // InternalTracea.g:1784:4: ( (lv_timestamp_11_0= ruleEString ) )
                    // InternalTracea.g:1785:5: (lv_timestamp_11_0= ruleEString )
                    {
                    // InternalTracea.g:1785:5: (lv_timestamp_11_0= ruleEString )
                    // InternalTracea.g:1786:6: lv_timestamp_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextArtefact_ImplAccess().getTimestampEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_timestamp_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArtefact_ImplRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_11_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:1804:3: (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==20) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTracea.g:1805:4: otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextArtefact_ImplAccess().getRefereesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getTextArtefact_ImplAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTracea.g:1813:4: ( ( ruleEString ) )
                    // InternalTracea.g:1814:5: ( ruleEString )
                    {
                    // InternalTracea.g:1814:5: ( ruleEString )
                    // InternalTracea.g:1815:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextArtefact_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextArtefact_ImplAccess().getRefereesRefereeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:1829:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalTracea.g:1830:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTextArtefact_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:1834:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:1835:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:1835:6: ( ruleEString )
                    	    // InternalTracea.g:1836:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTextArtefact_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTextArtefact_ImplAccess().getRefereesRefereeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_17, grammarAccess.getTextArtefact_ImplAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTextArtefact_ImplAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextArtefact_Impl"


    // $ANTLR start "entryRuleArtefactFragment"
    // InternalTracea.g:1864:1: entryRuleArtefactFragment returns [EObject current=null] : iv_ruleArtefactFragment= ruleArtefactFragment EOF ;
    public final EObject entryRuleArtefactFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefactFragment = null;


        try {
            // InternalTracea.g:1864:57: (iv_ruleArtefactFragment= ruleArtefactFragment EOF )
            // InternalTracea.g:1865:2: iv_ruleArtefactFragment= ruleArtefactFragment EOF
            {
             newCompositeNode(grammarAccess.getArtefactFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtefactFragment=ruleArtefactFragment();

            state._fsp--;

             current =iv_ruleArtefactFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtefactFragment"


    // $ANTLR start "ruleArtefactFragment"
    // InternalTracea.g:1871:1: ruleArtefactFragment returns [EObject current=null] : (this_ModelFragment_0= ruleModelFragment | this_TextFragment_1= ruleTextFragment ) ;
    public final EObject ruleArtefactFragment() throws RecognitionException {
        EObject current = null;

        EObject this_ModelFragment_0 = null;

        EObject this_TextFragment_1 = null;



        	enterRule();

        try {
            // InternalTracea.g:1877:2: ( (this_ModelFragment_0= ruleModelFragment | this_TextFragment_1= ruleTextFragment ) )
            // InternalTracea.g:1878:2: (this_ModelFragment_0= ruleModelFragment | this_TextFragment_1= ruleTextFragment )
            {
            // InternalTracea.g:1878:2: (this_ModelFragment_0= ruleModelFragment | this_TextFragment_1= ruleTextFragment )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==46||(LA55_0>=51 && LA55_0<=52)||LA55_0==55||LA55_0==57) ) {
                alt55=1;
            }
            else if ( (LA55_0==35||LA55_0==40||LA55_0==44) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalTracea.g:1879:3: this_ModelFragment_0= ruleModelFragment
                    {

                    			newCompositeNode(grammarAccess.getArtefactFragmentAccess().getModelFragmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelFragment_0=ruleModelFragment();

                    state._fsp--;


                    			current = this_ModelFragment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:1888:3: this_TextFragment_1= ruleTextFragment
                    {

                    			newCompositeNode(grammarAccess.getArtefactFragmentAccess().getTextFragmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextFragment_1=ruleTextFragment();

                    state._fsp--;


                    			current = this_TextFragment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtefactFragment"


    // $ANTLR start "entryRuleTextFragment"
    // InternalTracea.g:1900:1: entryRuleTextFragment returns [EObject current=null] : iv_ruleTextFragment= ruleTextFragment EOF ;
    public final EObject entryRuleTextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextFragment = null;


        try {
            // InternalTracea.g:1900:53: (iv_ruleTextFragment= ruleTextFragment EOF )
            // InternalTracea.g:1901:2: iv_ruleTextFragment= ruleTextFragment EOF
            {
             newCompositeNode(grammarAccess.getTextFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextFragment=ruleTextFragment();

            state._fsp--;

             current =iv_ruleTextFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextFragment"


    // $ANTLR start "ruleTextFragment"
    // InternalTracea.g:1907:1: ruleTextFragment returns [EObject current=null] : (this_TextFragment_Impl_0= ruleTextFragment_Impl | this_Section_1= ruleSection | this_PartOfSpeech_2= rulePartOfSpeech ) ;
    public final EObject ruleTextFragment() throws RecognitionException {
        EObject current = null;

        EObject this_TextFragment_Impl_0 = null;

        EObject this_Section_1 = null;

        EObject this_PartOfSpeech_2 = null;



        	enterRule();

        try {
            // InternalTracea.g:1913:2: ( (this_TextFragment_Impl_0= ruleTextFragment_Impl | this_Section_1= ruleSection | this_PartOfSpeech_2= rulePartOfSpeech ) )
            // InternalTracea.g:1914:2: (this_TextFragment_Impl_0= ruleTextFragment_Impl | this_Section_1= ruleSection | this_PartOfSpeech_2= rulePartOfSpeech )
            {
            // InternalTracea.g:1914:2: (this_TextFragment_Impl_0= ruleTextFragment_Impl | this_Section_1= ruleSection | this_PartOfSpeech_2= rulePartOfSpeech )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt56=1;
                }
                break;
            case 40:
                {
                alt56=2;
                }
                break;
            case 44:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalTracea.g:1915:3: this_TextFragment_Impl_0= ruleTextFragment_Impl
                    {

                    			newCompositeNode(grammarAccess.getTextFragmentAccess().getTextFragment_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextFragment_Impl_0=ruleTextFragment_Impl();

                    state._fsp--;


                    			current = this_TextFragment_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:1924:3: this_Section_1= ruleSection
                    {

                    			newCompositeNode(grammarAccess.getTextFragmentAccess().getSectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Section_1=ruleSection();

                    state._fsp--;


                    			current = this_Section_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTracea.g:1933:3: this_PartOfSpeech_2= rulePartOfSpeech
                    {

                    			newCompositeNode(grammarAccess.getTextFragmentAccess().getPartOfSpeechParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartOfSpeech_2=rulePartOfSpeech();

                    state._fsp--;


                    			current = this_PartOfSpeech_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextFragment"


    // $ANTLR start "entryRuleTextFragment_Impl"
    // InternalTracea.g:1945:1: entryRuleTextFragment_Impl returns [EObject current=null] : iv_ruleTextFragment_Impl= ruleTextFragment_Impl EOF ;
    public final EObject entryRuleTextFragment_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextFragment_Impl = null;


        try {
            // InternalTracea.g:1945:58: (iv_ruleTextFragment_Impl= ruleTextFragment_Impl EOF )
            // InternalTracea.g:1946:2: iv_ruleTextFragment_Impl= ruleTextFragment_Impl EOF
            {
             newCompositeNode(grammarAccess.getTextFragment_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextFragment_Impl=ruleTextFragment_Impl();

            state._fsp--;

             current =iv_ruleTextFragment_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextFragment_Impl"


    // $ANTLR start "ruleTextFragment_Impl"
    // InternalTracea.g:1952:1: ruleTextFragment_Impl returns [EObject current=null] : ( () otherlv_1= 'TextFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleTextFragment_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_17_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:1958:2: ( ( () otherlv_1= 'TextFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' ) )
            // InternalTracea.g:1959:2: ( () otherlv_1= 'TextFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' )
            {
            // InternalTracea.g:1959:2: ( () otherlv_1= 'TextFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' )
            // InternalTracea.g:1960:3: () otherlv_1= 'TextFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}'
            {
            // InternalTracea.g:1960:3: ()
            // InternalTracea.g:1961:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextFragment_ImplAccess().getTextFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTextFragment_ImplAccess().getTextFragmentKeyword_1());
            		
            // InternalTracea.g:1971:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:1972:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:1972:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:1973:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextFragment_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextFragment_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getTextFragment_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:1994:3: (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==36) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTracea.g:1995:4: otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextFragment_ImplAccess().getSubFragmentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextFragment_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:2003:4: ( ( ruleEString ) )
                    // InternalTracea.g:2004:5: ( ruleEString )
                    {
                    // InternalTracea.g:2004:5: ( ruleEString )
                    // InternalTracea.g:2005:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextFragment_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextFragment_ImplAccess().getSubFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2019:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTracea.g:2020:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTextFragment_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:2024:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2025:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2025:6: ( ruleEString )
                    	    // InternalTracea.g:2026:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTextFragment_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTextFragment_ImplAccess().getSubFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextFragment_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2046:3: (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==20) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTracea.g:2047:4: otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextFragment_ImplAccess().getRefereesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTextFragment_ImplAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTracea.g:2055:4: ( ( ruleEString ) )
                    // InternalTracea.g:2056:5: ( ruleEString )
                    {
                    // InternalTracea.g:2056:5: ( ruleEString )
                    // InternalTracea.g:2057:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextFragment_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextFragment_ImplAccess().getRefereesRefereeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2071:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalTracea.g:2072:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTextFragment_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:2076:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2077:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2077:6: ( ruleEString )
                    	    // InternalTracea.g:2078:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTextFragment_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTextFragment_ImplAccess().getRefereesRefereeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_15, grammarAccess.getTextFragment_ImplAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2098:3: (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==27) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTracea.g:2099:4: otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getTextFragment_ImplAccess().getTimestampKeyword_6_0());
                    			
                    // InternalTracea.g:2103:4: ( (lv_timestamp_17_0= ruleEString ) )
                    // InternalTracea.g:2104:5: (lv_timestamp_17_0= ruleEString )
                    {
                    // InternalTracea.g:2104:5: (lv_timestamp_17_0= ruleEString )
                    // InternalTracea.g:2105:6: lv_timestamp_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextFragment_ImplAccess().getTimestampEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextFragment_ImplRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_17_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTextFragment_ImplAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextFragment_Impl"


    // $ANTLR start "entryRuleDocument"
    // InternalTracea.g:2131:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalTracea.g:2131:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalTracea.g:2132:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalTracea.g:2138:1: ruleDocument returns [EObject current=null] : ( () otherlv_1= 'Document' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'fragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'sections' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'referees' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'timestamp' ( (lv_timestamp_25_0= ruleEString ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_25_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:2144:2: ( ( () otherlv_1= 'Document' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'fragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'sections' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'referees' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'timestamp' ( (lv_timestamp_25_0= ruleEString ) ) )? otherlv_26= '}' ) )
            // InternalTracea.g:2145:2: ( () otherlv_1= 'Document' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'fragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'sections' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'referees' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'timestamp' ( (lv_timestamp_25_0= ruleEString ) ) )? otherlv_26= '}' )
            {
            // InternalTracea.g:2145:2: ( () otherlv_1= 'Document' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'fragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'sections' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'referees' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'timestamp' ( (lv_timestamp_25_0= ruleEString ) ) )? otherlv_26= '}' )
            // InternalTracea.g:2146:3: () otherlv_1= 'Document' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'fragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'sections' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'referees' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'timestamp' ( (lv_timestamp_25_0= ruleEString ) ) )? otherlv_26= '}'
            {
            // InternalTracea.g:2146:3: ()
            // InternalTracea.g:2147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentAccess().getDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentAccess().getDocumentKeyword_1());
            		
            // InternalTracea.g:2157:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:2158:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:2158:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:2159:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:2180:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTracea.g:2181:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDocumentAccess().getTitleKeyword_4_0());
                    			
                    // InternalTracea.g:2185:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalTracea.g:2186:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalTracea.g:2186:5: (lv_title_5_0= ruleEString )
                    // InternalTracea.g:2187:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:2205:3: (otherlv_6= 'fragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==18) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTracea.g:2206:4: otherlv_6= 'fragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentAccess().getFragmentsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:2214:4: ( ( ruleEString ) )
                    // InternalTracea.g:2215:5: ( ruleEString )
                    {
                    // InternalTracea.g:2215:5: ( ruleEString )
                    // InternalTracea.g:2216:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDocumentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDocumentAccess().getFragmentsArtefactFragmentCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2230:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalTracea.g:2231:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDocumentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:2235:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2236:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2236:6: ( ruleEString )
                    	    // InternalTracea.g:2237:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDocumentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDocumentAccess().getFragmentsArtefactFragmentCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_11, grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2257:3: (otherlv_12= 'sections' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==39) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTracea.g:2258:4: otherlv_12= 'sections' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getDocumentAccess().getSectionsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:2266:4: ( ( ruleEString ) )
                    // InternalTracea.g:2267:5: ( ruleEString )
                    {
                    // InternalTracea.g:2267:5: ( ruleEString )
                    // InternalTracea.g:2268:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDocumentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2282:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalTracea.g:2283:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getDocumentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:2287:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2288:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2288:6: ( ruleEString )
                    	    // InternalTracea.g:2289:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDocumentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_17, grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2309:3: (otherlv_18= 'referees' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==20) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTracea.g:2310:4: otherlv_18= 'referees' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getDocumentAccess().getRefereesKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getDocumentAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalTracea.g:2318:4: ( ( ruleEString ) )
                    // InternalTracea.g:2319:5: ( ruleEString )
                    {
                    // InternalTracea.g:2319:5: ( ruleEString )
                    // InternalTracea.g:2320:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDocumentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDocumentAccess().getRefereesRefereeCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2334:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalTracea.g:2335:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getDocumentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:2339:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2340:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2340:6: ( ruleEString )
                    	    // InternalTracea.g:2341:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDocumentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDocumentAccess().getRefereesRefereeCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_23, grammarAccess.getDocumentAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2361:3: (otherlv_24= 'timestamp' ( (lv_timestamp_25_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==27) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTracea.g:2362:4: otherlv_24= 'timestamp' ( (lv_timestamp_25_0= ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getDocumentAccess().getTimestampKeyword_8_0());
                    			
                    // InternalTracea.g:2366:4: ( (lv_timestamp_25_0= ruleEString ) )
                    // InternalTracea.g:2367:5: (lv_timestamp_25_0= ruleEString )
                    {
                    // InternalTracea.g:2367:5: (lv_timestamp_25_0= ruleEString )
                    // InternalTracea.g:2368:6: lv_timestamp_25_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentAccess().getTimestampEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_25_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_25_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleSection"
    // InternalTracea.g:2394:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalTracea.g:2394:48: (iv_ruleSection= ruleSection EOF )
            // InternalTracea.g:2395:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalTracea.g:2401:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'number' ( (lv_number_5_0= ruleEInt ) ) )? (otherlv_6= 'subFragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'partofspeechsDefined' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'partofspeechsUsed' otherlv_19= '{' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_number_5_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_31_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:2407:2: ( ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'number' ( (lv_number_5_0= ruleEInt ) ) )? (otherlv_6= 'subFragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'partofspeechsDefined' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'partofspeechsUsed' otherlv_19= '{' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' ) )
            // InternalTracea.g:2408:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'number' ( (lv_number_5_0= ruleEInt ) ) )? (otherlv_6= 'subFragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'partofspeechsDefined' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'partofspeechsUsed' otherlv_19= '{' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' )
            {
            // InternalTracea.g:2408:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'number' ( (lv_number_5_0= ruleEInt ) ) )? (otherlv_6= 'subFragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'partofspeechsDefined' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'partofspeechsUsed' otherlv_19= '{' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}' )
            // InternalTracea.g:2409:3: () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'number' ( (lv_number_5_0= ruleEInt ) ) )? (otherlv_6= 'subFragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'partofspeechsDefined' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )? (otherlv_18= 'partofspeechsUsed' otherlv_19= '{' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= '}' )? (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )? otherlv_32= '}'
            {
            // InternalTracea.g:2409:3: ()
            // InternalTracea.g:2410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
            		
            // InternalTracea.g:2420:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:2421:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:2421:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:2422:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:2443:3: (otherlv_4= 'number' ( (lv_number_5_0= ruleEInt ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==41) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTracea.g:2444:4: otherlv_4= 'number' ( (lv_number_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getNumberKeyword_4_0());
                    			
                    // InternalTracea.g:2448:4: ( (lv_number_5_0= ruleEInt ) )
                    // InternalTracea.g:2449:5: (lv_number_5_0= ruleEInt )
                    {
                    // InternalTracea.g:2449:5: (lv_number_5_0= ruleEInt )
                    // InternalTracea.g:2450:6: lv_number_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getNumberEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_number_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"uoc.som.tracea.Tracea.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:2468:3: (otherlv_6= 'subFragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==36) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTracea.g:2469:4: otherlv_6= 'subFragments' otherlv_7= '{' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getSubFragmentsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:2477:4: ( ( ruleEString ) )
                    // InternalTracea.g:2478:5: ( ruleEString )
                    {
                    // InternalTracea.g:2478:5: ( ruleEString )
                    // InternalTracea.g:2479:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSectionAccess().getSubFragmentsArtefactFragmentCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2493:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==14) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalTracea.g:2494:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:2498:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2499:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2499:6: ( ruleEString )
                    	    // InternalTracea.g:2500:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSectionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSectionAccess().getSubFragmentsArtefactFragmentCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2520:3: (otherlv_12= 'partofspeechsDefined' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==42) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTracea.g:2521:4: otherlv_12= 'partofspeechsDefined' otherlv_13= '{' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getSectionAccess().getPartofspeechsDefinedKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:2529:4: ( ( ruleEString ) )
                    // InternalTracea.g:2530:5: ( ruleEString )
                    {
                    // InternalTracea.g:2530:5: ( ruleEString )
                    // InternalTracea.g:2531:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSectionAccess().getPartofspeechsDefinedPartOfSpeechCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2545:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==14) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalTracea.g:2546:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:2550:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2551:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2551:6: ( ruleEString )
                    	    // InternalTracea.g:2552:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSectionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSectionAccess().getPartofspeechsDefinedPartOfSpeechCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_44); 

                    				newLeafNode(otherlv_17, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2572:3: (otherlv_18= 'partofspeechsUsed' otherlv_19= '{' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==43) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalTracea.g:2573:4: otherlv_18= 'partofspeechsUsed' otherlv_19= '{' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getSectionAccess().getPartofspeechsUsedKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTracea.g:2581:4: ( ( ruleEString ) )
                    // InternalTracea.g:2582:5: ( ruleEString )
                    {
                    // InternalTracea.g:2582:5: ( ruleEString )
                    // InternalTracea.g:2583:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSectionAccess().getPartofspeechsUsedPartOfSpeechCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2597:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==14) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalTracea.g:2598:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getSectionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:2602:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2603:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2603:6: ( ruleEString )
                    	    // InternalTracea.g:2604:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSectionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSectionAccess().getPartofspeechsUsedPartOfSpeechCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_23, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2624:3: (otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==20) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTracea.g:2625:4: otherlv_24= 'referees' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_24, grammarAccess.getSectionAccess().getRefereesKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getSectionAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalTracea.g:2633:4: ( ( ruleEString ) )
                    // InternalTracea.g:2634:5: ( ruleEString )
                    {
                    // InternalTracea.g:2634:5: ( ruleEString )
                    // InternalTracea.g:2635:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSectionAccess().getRefereesRefereeCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2649:4: (otherlv_27= ',' ( ( ruleEString ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==14) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalTracea.g:2650:5: otherlv_27= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getSectionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:2654:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2655:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2655:6: ( ruleEString )
                    	    // InternalTracea.g:2656:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSectionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSectionAccess().getRefereesRefereeCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_29, grammarAccess.getSectionAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2676:3: (otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==27) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTracea.g:2677:4: otherlv_30= 'timestamp' ( (lv_timestamp_31_0= ruleEString ) )
                    {
                    otherlv_30=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getSectionAccess().getTimestampKeyword_9_0());
                    			
                    // InternalTracea.g:2681:4: ( (lv_timestamp_31_0= ruleEString ) )
                    // InternalTracea.g:2682:5: (lv_timestamp_31_0= ruleEString )
                    {
                    // InternalTracea.g:2682:5: (lv_timestamp_31_0= ruleEString )
                    // InternalTracea.g:2683:6: lv_timestamp_31_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTimestampEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_31_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_31_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_32=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRulePartOfSpeech"
    // InternalTracea.g:2709:1: entryRulePartOfSpeech returns [EObject current=null] : iv_rulePartOfSpeech= rulePartOfSpeech EOF ;
    public final EObject entryRulePartOfSpeech() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartOfSpeech = null;


        try {
            // InternalTracea.g:2709:53: (iv_rulePartOfSpeech= rulePartOfSpeech EOF )
            // InternalTracea.g:2710:2: iv_rulePartOfSpeech= rulePartOfSpeech EOF
            {
             newCompositeNode(grammarAccess.getPartOfSpeechRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartOfSpeech=rulePartOfSpeech();

            state._fsp--;

             current =iv_rulePartOfSpeech; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartOfSpeech"


    // $ANTLR start "rulePartOfSpeech"
    // InternalTracea.g:2716:1: rulePartOfSpeech returns [EObject current=null] : ( () otherlv_1= 'PartOfSpeech' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'position' ( (lv_position_5_0= ruleEString ) ) )? (otherlv_6= 'referees' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'timestamp' ( (lv_timestamp_13_0= ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject rulePartOfSpeech() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_position_5_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_13_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:2722:2: ( ( () otherlv_1= 'PartOfSpeech' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'position' ( (lv_position_5_0= ruleEString ) ) )? (otherlv_6= 'referees' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'timestamp' ( (lv_timestamp_13_0= ruleEString ) ) )? otherlv_14= '}' ) )
            // InternalTracea.g:2723:2: ( () otherlv_1= 'PartOfSpeech' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'position' ( (lv_position_5_0= ruleEString ) ) )? (otherlv_6= 'referees' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'timestamp' ( (lv_timestamp_13_0= ruleEString ) ) )? otherlv_14= '}' )
            {
            // InternalTracea.g:2723:2: ( () otherlv_1= 'PartOfSpeech' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'position' ( (lv_position_5_0= ruleEString ) ) )? (otherlv_6= 'referees' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'timestamp' ( (lv_timestamp_13_0= ruleEString ) ) )? otherlv_14= '}' )
            // InternalTracea.g:2724:3: () otherlv_1= 'PartOfSpeech' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'position' ( (lv_position_5_0= ruleEString ) ) )? (otherlv_6= 'referees' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'timestamp' ( (lv_timestamp_13_0= ruleEString ) ) )? otherlv_14= '}'
            {
            // InternalTracea.g:2724:3: ()
            // InternalTracea.g:2725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPartOfSpeechAccess().getPartOfSpeechAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPartOfSpeechAccess().getPartOfSpeechKeyword_1());
            		
            // InternalTracea.g:2735:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:2736:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:2736:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:2737:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPartOfSpeechAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartOfSpeechRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getPartOfSpeechAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:2758:3: (otherlv_4= 'position' ( (lv_position_5_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==45) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTracea.g:2759:4: otherlv_4= 'position' ( (lv_position_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPartOfSpeechAccess().getPositionKeyword_4_0());
                    			
                    // InternalTracea.g:2763:4: ( (lv_position_5_0= ruleEString ) )
                    // InternalTracea.g:2764:5: (lv_position_5_0= ruleEString )
                    {
                    // InternalTracea.g:2764:5: (lv_position_5_0= ruleEString )
                    // InternalTracea.g:2765:6: lv_position_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPartOfSpeechAccess().getPositionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_position_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartOfSpeechRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_5_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:2783:3: (otherlv_6= 'referees' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==20) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalTracea.g:2784:4: otherlv_6= 'referees' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getPartOfSpeechAccess().getRefereesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getPartOfSpeechAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTracea.g:2792:4: ( ( ruleEString ) )
                    // InternalTracea.g:2793:5: ( ruleEString )
                    {
                    // InternalTracea.g:2793:5: ( ruleEString )
                    // InternalTracea.g:2794:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPartOfSpeechRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPartOfSpeechAccess().getRefereesRefereeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:2808:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==14) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalTracea.g:2809:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPartOfSpeechAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:2813:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:2814:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:2814:6: ( ruleEString )
                    	    // InternalTracea.g:2815:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPartOfSpeechRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPartOfSpeechAccess().getRefereesRefereeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_11, grammarAccess.getPartOfSpeechAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:2835:3: (otherlv_12= 'timestamp' ( (lv_timestamp_13_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==27) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTracea.g:2836:4: otherlv_12= 'timestamp' ( (lv_timestamp_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getPartOfSpeechAccess().getTimestampKeyword_6_0());
                    			
                    // InternalTracea.g:2840:4: ( (lv_timestamp_13_0= ruleEString ) )
                    // InternalTracea.g:2841:5: (lv_timestamp_13_0= ruleEString )
                    {
                    // InternalTracea.g:2841:5: (lv_timestamp_13_0= ruleEString )
                    // InternalTracea.g:2842:6: lv_timestamp_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPartOfSpeechAccess().getTimestampEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartOfSpeechRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_13_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getPartOfSpeechAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartOfSpeech"


    // $ANTLR start "entryRuleModelFragment"
    // InternalTracea.g:2868:1: entryRuleModelFragment returns [EObject current=null] : iv_ruleModelFragment= ruleModelFragment EOF ;
    public final EObject entryRuleModelFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFragment = null;


        try {
            // InternalTracea.g:2868:54: (iv_ruleModelFragment= ruleModelFragment EOF )
            // InternalTracea.g:2869:2: iv_ruleModelFragment= ruleModelFragment EOF
            {
             newCompositeNode(grammarAccess.getModelFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFragment=ruleModelFragment();

            state._fsp--;

             current =iv_ruleModelFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelFragment"


    // $ANTLR start "ruleModelFragment"
    // InternalTracea.g:2875:1: ruleModelFragment returns [EObject current=null] : (this_ModelFragment_Impl_0= ruleModelFragment_Impl | this_Package_1= rulePackage | this_Classe_2= ruleClasse | this_StructuralFeature_3= ruleStructuralFeature | this_NamedElement_4= ruleNamedElement ) ;
    public final EObject ruleModelFragment() throws RecognitionException {
        EObject current = null;

        EObject this_ModelFragment_Impl_0 = null;

        EObject this_Package_1 = null;

        EObject this_Classe_2 = null;

        EObject this_StructuralFeature_3 = null;

        EObject this_NamedElement_4 = null;



        	enterRule();

        try {
            // InternalTracea.g:2881:2: ( (this_ModelFragment_Impl_0= ruleModelFragment_Impl | this_Package_1= rulePackage | this_Classe_2= ruleClasse | this_StructuralFeature_3= ruleStructuralFeature | this_NamedElement_4= ruleNamedElement ) )
            // InternalTracea.g:2882:2: (this_ModelFragment_Impl_0= ruleModelFragment_Impl | this_Package_1= rulePackage | this_Classe_2= ruleClasse | this_StructuralFeature_3= ruleStructuralFeature | this_NamedElement_4= ruleNamedElement )
            {
            // InternalTracea.g:2882:2: (this_ModelFragment_Impl_0= ruleModelFragment_Impl | this_Package_1= rulePackage | this_Classe_2= ruleClasse | this_StructuralFeature_3= ruleStructuralFeature | this_NamedElement_4= ruleNamedElement )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt84=1;
                }
                break;
            case 52:
                {
                alt84=2;
                }
                break;
            case 55:
                {
                alt84=3;
                }
                break;
            case 57:
                {
                alt84=4;
                }
                break;
            case 51:
                {
                alt84=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalTracea.g:2883:3: this_ModelFragment_Impl_0= ruleModelFragment_Impl
                    {

                    			newCompositeNode(grammarAccess.getModelFragmentAccess().getModelFragment_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelFragment_Impl_0=ruleModelFragment_Impl();

                    state._fsp--;


                    			current = this_ModelFragment_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:2892:3: this_Package_1= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getModelFragmentAccess().getPackageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_1=rulePackage();

                    state._fsp--;


                    			current = this_Package_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTracea.g:2901:3: this_Classe_2= ruleClasse
                    {

                    			newCompositeNode(grammarAccess.getModelFragmentAccess().getClasseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Classe_2=ruleClasse();

                    state._fsp--;


                    			current = this_Classe_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTracea.g:2910:3: this_StructuralFeature_3= ruleStructuralFeature
                    {

                    			newCompositeNode(grammarAccess.getModelFragmentAccess().getStructuralFeatureParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructuralFeature_3=ruleStructuralFeature();

                    state._fsp--;


                    			current = this_StructuralFeature_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTracea.g:2919:3: this_NamedElement_4= ruleNamedElement
                    {

                    			newCompositeNode(grammarAccess.getModelFragmentAccess().getNamedElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedElement_4=ruleNamedElement();

                    state._fsp--;


                    			current = this_NamedElement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelFragment"


    // $ANTLR start "entryRuleModelFragment_Impl"
    // InternalTracea.g:2931:1: entryRuleModelFragment_Impl returns [EObject current=null] : iv_ruleModelFragment_Impl= ruleModelFragment_Impl EOF ;
    public final EObject entryRuleModelFragment_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFragment_Impl = null;


        try {
            // InternalTracea.g:2931:59: (iv_ruleModelFragment_Impl= ruleModelFragment_Impl EOF )
            // InternalTracea.g:2932:2: iv_ruleModelFragment_Impl= ruleModelFragment_Impl EOF
            {
             newCompositeNode(grammarAccess.getModelFragment_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFragment_Impl=ruleModelFragment_Impl();

            state._fsp--;

             current =iv_ruleModelFragment_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelFragment_Impl"


    // $ANTLR start "ruleModelFragment_Impl"
    // InternalTracea.g:2938:1: ruleModelFragment_Impl returns [EObject current=null] : ( () otherlv_1= 'ModelFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleModelFragment_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_29_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:2944:2: ( ( () otherlv_1= 'ModelFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' ) )
            // InternalTracea.g:2945:2: ( () otherlv_1= 'ModelFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' )
            {
            // InternalTracea.g:2945:2: ( () otherlv_1= 'ModelFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' )
            // InternalTracea.g:2946:3: () otherlv_1= 'ModelFragment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}'
            {
            // InternalTracea.g:2946:3: ()
            // InternalTracea.g:2947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelFragment_ImplAccess().getModelFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelFragment_ImplAccess().getModelFragmentKeyword_1());
            		
            // InternalTracea.g:2957:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:2958:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:2958:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:2959:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelFragment_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getModelFragment_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:2980:3: (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==36) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalTracea.g:2981:4: otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelFragment_ImplAccess().getSubFragmentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelFragment_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:2989:4: ( ( ruleEString ) )
                    // InternalTracea.g:2990:5: ( ruleEString )
                    {
                    // InternalTracea.g:2990:5: ( ruleEString )
                    // InternalTracea.g:2991:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getSubFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3005:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalTracea.g:3006:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelFragment_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:3010:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3011:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3011:6: ( ruleEString )
                    	    // InternalTracea.g:3012:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getSubFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_47); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelFragment_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3032:3: (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==47) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTracea.g:3033:4: otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelFragment_ImplAccess().getNamedelementsDefinedKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelFragment_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:3041:4: ( ( ruleEString ) )
                    // InternalTracea.g:3042:5: ( ruleEString )
                    {
                    // InternalTracea.g:3042:5: ( ruleEString )
                    // InternalTracea.g:3043:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getNamedelementsDefinedNamedElementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3057:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==14) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalTracea.g:3058:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getModelFragment_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:3062:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3063:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3063:6: ( ruleEString )
                    	    // InternalTracea.g:3064:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getNamedelementsDefinedNamedElementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_15, grammarAccess.getModelFragment_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3084:3: (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==48) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalTracea.g:3085:4: otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getModelFragment_ImplAccess().getNamedelementsUsedKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getModelFragment_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:3093:4: ( ( ruleEString ) )
                    // InternalTracea.g:3094:5: ( ruleEString )
                    {
                    // InternalTracea.g:3094:5: ( ruleEString )
                    // InternalTracea.g:3095:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getNamedelementsUsedNamedElementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3109:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==14) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalTracea.g:3110:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getModelFragment_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:3114:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3115:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3115:6: ( ruleEString )
                    	    // InternalTracea.g:3116:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getNamedelementsUsedNamedElementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getModelFragment_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3136:3: (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==20) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalTracea.g:3137:4: otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getModelFragment_ImplAccess().getRefereesKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getModelFragment_ImplAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalTracea.g:3145:4: ( ( ruleEString ) )
                    // InternalTracea.g:3146:5: ( ruleEString )
                    {
                    // InternalTracea.g:3146:5: ( ruleEString )
                    // InternalTracea.g:3147:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getRefereesRefereeCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3161:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==14) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalTracea.g:3162:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getModelFragment_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:3166:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3167:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3167:6: ( ruleEString )
                    	    // InternalTracea.g:3168:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelFragment_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getRefereesRefereeCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_27, grammarAccess.getModelFragment_ImplAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3188:3: (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==27) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalTracea.g:3189:4: otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getModelFragment_ImplAccess().getTimestampKeyword_8_0());
                    			
                    // InternalTracea.g:3193:4: ( (lv_timestamp_29_0= ruleEString ) )
                    // InternalTracea.g:3194:5: (lv_timestamp_29_0= ruleEString )
                    {
                    // InternalTracea.g:3194:5: (lv_timestamp_29_0= ruleEString )
                    // InternalTracea.g:3195:6: lv_timestamp_29_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModelFragment_ImplAccess().getTimestampEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_29_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelFragment_ImplRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_29_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getModelFragment_ImplAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelFragment_Impl"


    // $ANTLR start "entryRuleModel"
    // InternalTracea.g:3221:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTracea.g:3221:46: (iv_ruleModel= ruleModel EOF )
            // InternalTracea.g:3222:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTracea.g:3228:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'packages' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_23_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:3234:2: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'packages' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' ) )
            // InternalTracea.g:3235:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'packages' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' )
            {
            // InternalTracea.g:3235:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'packages' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}' )
            // InternalTracea.g:3236:3: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'packages' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )? otherlv_24= '}'
            {
            // InternalTracea.g:3236:3: ()
            // InternalTracea.g:3237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalTracea.g:3247:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:3248:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:3248:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:3249:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:3270:3: (otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==18) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalTracea.g:3271:4: otherlv_4= 'fragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getFragmentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:3279:4: ( ( ruleEString ) )
                    // InternalTracea.g:3280:5: ( ruleEString )
                    {
                    // InternalTracea.g:3280:5: ( ruleEString )
                    // InternalTracea.g:3281:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelAccess().getFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3295:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==14) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalTracea.g:3296:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:3300:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3301:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3301:6: ( ruleEString )
                    	    // InternalTracea.g:3302:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelAccess().getFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3322:3: (otherlv_10= 'packages' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==50) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalTracea.g:3323:4: otherlv_10= 'packages' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getPackagesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:3331:4: ( ( ruleEString ) )
                    // InternalTracea.g:3332:5: ( ruleEString )
                    {
                    // InternalTracea.g:3332:5: ( ruleEString )
                    // InternalTracea.g:3333:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3347:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==14) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalTracea.g:3348:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:3352:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3353:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3353:6: ( ruleEString )
                    	    // InternalTracea.g:3354:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3374:3: (otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==20) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalTracea.g:3375:4: otherlv_16= 'referees' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getModelAccess().getRefereesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getModelAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTracea.g:3383:4: ( ( ruleEString ) )
                    // InternalTracea.g:3384:5: ( ruleEString )
                    {
                    // InternalTracea.g:3384:5: ( ruleEString )
                    // InternalTracea.g:3385:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelAccess().getRefereesRefereeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3399:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==14) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalTracea.g:3400:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:3404:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3405:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3405:6: ( ruleEString )
                    	    // InternalTracea.g:3406:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelAccess().getRefereesRefereeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_21, grammarAccess.getModelAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3426:3: (otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==27) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalTracea.g:3427:4: otherlv_22= 'timestamp' ( (lv_timestamp_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getModelAccess().getTimestampKeyword_7_0());
                    			
                    // InternalTracea.g:3431:4: ( (lv_timestamp_23_0= ruleEString ) )
                    // InternalTracea.g:3432:5: (lv_timestamp_23_0= ruleEString )
                    {
                    // InternalTracea.g:3432:5: (lv_timestamp_23_0= ruleEString )
                    // InternalTracea.g:3433:6: lv_timestamp_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getTimestampEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_23_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNamedElement"
    // InternalTracea.g:3459:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // InternalTracea.g:3459:53: (iv_ruleNamedElement= ruleNamedElement EOF )
            // InternalTracea.g:3460:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalTracea.g:3466:1: ruleNamedElement returns [EObject current=null] : ( () otherlv_1= 'NamedElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'referees' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_11_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:3472:2: ( ( () otherlv_1= 'NamedElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'referees' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalTracea.g:3473:2: ( () otherlv_1= 'NamedElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'referees' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalTracea.g:3473:2: ( () otherlv_1= 'NamedElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'referees' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? otherlv_12= '}' )
            // InternalTracea.g:3474:3: () otherlv_1= 'NamedElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'referees' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalTracea.g:3474:3: ()
            // InternalTracea.g:3475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedElementAccess().getNamedElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedElementAccess().getNamedElementKeyword_1());
            		
            // InternalTracea.g:3485:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:3486:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:3486:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:3487:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNamedElementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getNamedElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:3508:3: (otherlv_4= 'referees' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==20) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalTracea.g:3509:4: otherlv_4= 'referees' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getNamedElementAccess().getRefereesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getNamedElementAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalTracea.g:3517:4: ( ( ruleEString ) )
                    // InternalTracea.g:3518:5: ( ruleEString )
                    {
                    // InternalTracea.g:3518:5: ( ruleEString )
                    // InternalTracea.g:3519:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNamedElementAccess().getRefereesRefereeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3533:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==14) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalTracea.g:3534:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getNamedElementAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:3538:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3539:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3539:6: ( ruleEString )
                    	    // InternalTracea.g:3540:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNamedElementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNamedElementAccess().getRefereesRefereeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_9, grammarAccess.getNamedElementAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3560:3: (otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==27) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalTracea.g:3561:4: otherlv_10= 'timestamp' ( (lv_timestamp_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getNamedElementAccess().getTimestampKeyword_5_0());
                    			
                    // InternalTracea.g:3565:4: ( (lv_timestamp_11_0= ruleEString ) )
                    // InternalTracea.g:3566:5: (lv_timestamp_11_0= ruleEString )
                    {
                    // InternalTracea.g:3566:5: (lv_timestamp_11_0= ruleEString )
                    // InternalTracea.g:3567:6: lv_timestamp_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNamedElementAccess().getTimestampEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedElementRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_11_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getNamedElementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRulePackage"
    // InternalTracea.g:3593:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalTracea.g:3593:48: (iv_rulePackage= rulePackage EOF )
            // InternalTracea.g:3594:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalTracea.g:3600:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragment' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'classes' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_35_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:3606:2: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragment' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'classes' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' ) )
            // InternalTracea.g:3607:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragment' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'classes' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' )
            {
            // InternalTracea.g:3607:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragment' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'classes' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' )
            // InternalTracea.g:3608:3: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragment' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'classes' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}'
            {
            // InternalTracea.g:3608:3: ()
            // InternalTracea.g:3609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalTracea.g:3619:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:3620:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:3620:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:3621:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:3642:3: (otherlv_4= 'subFragment' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==53) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalTracea.g:3643:4: otherlv_4= 'subFragment' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getSubFragmentKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:3651:4: ( ( ruleEString ) )
                    // InternalTracea.g:3652:5: ( ruleEString )
                    {
                    // InternalTracea.g:3652:5: ( ruleEString )
                    // InternalTracea.g:3653:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPackageAccess().getSubFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3667:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==14) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalTracea.g:3668:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:3672:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3673:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3673:6: ( ruleEString )
                    	    // InternalTracea.g:3674:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPackageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getSubFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_52); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3694:3: (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==47) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalTracea.g:3695:4: otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getNamedelementsDefinedKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:3703:4: ( ( ruleEString ) )
                    // InternalTracea.g:3704:5: ( ruleEString )
                    {
                    // InternalTracea.g:3704:5: ( ruleEString )
                    // InternalTracea.g:3705:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPackageAccess().getNamedelementsDefinedNamedElementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3719:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==14) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalTracea.g:3720:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPackageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:3724:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3725:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3725:6: ( ruleEString )
                    	    // InternalTracea.g:3726:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPackageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getNamedelementsDefinedNamedElementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_53); 

                    				newLeafNode(otherlv_15, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3746:3: (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==48) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalTracea.g:3747:4: otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getPackageAccess().getNamedelementsUsedKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:3755:4: ( ( ruleEString ) )
                    // InternalTracea.g:3756:5: ( ruleEString )
                    {
                    // InternalTracea.g:3756:5: ( ruleEString )
                    // InternalTracea.g:3757:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPackageAccess().getNamedelementsUsedNamedElementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3771:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==14) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalTracea.g:3772:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:3776:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3777:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3777:6: ( ruleEString )
                    	    // InternalTracea.g:3778:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPackageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getNamedelementsUsedNamedElementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_54); 

                    				newLeafNode(otherlv_21, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3798:3: (otherlv_22= 'classes' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==54) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalTracea.g:3799:4: otherlv_22= 'classes' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getPackageAccess().getClassesKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTracea.g:3807:4: ( ( ruleEString ) )
                    // InternalTracea.g:3808:5: ( ruleEString )
                    {
                    // InternalTracea.g:3808:5: ( ruleEString )
                    // InternalTracea.g:3809:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPackageAccess().getClassesClasseCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3823:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==14) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalTracea.g:3824:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getPackageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:3828:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3829:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3829:6: ( ruleEString )
                    	    // InternalTracea.g:3830:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPackageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getClassesClasseCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_27, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3850:3: (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==20) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalTracea.g:3851:4: otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')'
                    {
                    otherlv_28=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_28, grammarAccess.getPackageAccess().getRefereesKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getPackageAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalTracea.g:3859:4: ( ( ruleEString ) )
                    // InternalTracea.g:3860:5: ( ruleEString )
                    {
                    // InternalTracea.g:3860:5: ( ruleEString )
                    // InternalTracea.g:3861:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPackageAccess().getRefereesRefereeCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:3875:4: (otherlv_31= ',' ( ( ruleEString ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==14) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalTracea.g:3876:5: otherlv_31= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getPackageAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:3880:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:3881:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:3881:6: ( ruleEString )
                    	    // InternalTracea.g:3882:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPackageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getRefereesRefereeCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_33, grammarAccess.getPackageAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:3902:3: (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==27) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalTracea.g:3903:4: otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) )
                    {
                    otherlv_34=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getPackageAccess().getTimestampKeyword_9_0());
                    			
                    // InternalTracea.g:3907:4: ( (lv_timestamp_35_0= ruleEString ) )
                    // InternalTracea.g:3908:5: (lv_timestamp_35_0= ruleEString )
                    {
                    // InternalTracea.g:3908:5: (lv_timestamp_35_0= ruleEString )
                    // InternalTracea.g:3909:6: lv_timestamp_35_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getTimestampEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_35_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_35_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_36=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleClasse"
    // InternalTracea.g:3935:1: entryRuleClasse returns [EObject current=null] : iv_ruleClasse= ruleClasse EOF ;
    public final EObject entryRuleClasse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasse = null;


        try {
            // InternalTracea.g:3935:47: (iv_ruleClasse= ruleClasse EOF )
            // InternalTracea.g:3936:2: iv_ruleClasse= ruleClasse EOF
            {
             newCompositeNode(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClasse=ruleClasse();

            state._fsp--;

             current =iv_ruleClasse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalTracea.g:3942:1: ruleClasse returns [EObject current=null] : ( () otherlv_1= 'Classe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'structuralfeatures' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' ) ;
    public final EObject ruleClasse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_35_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:3948:2: ( ( () otherlv_1= 'Classe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'structuralfeatures' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' ) )
            // InternalTracea.g:3949:2: ( () otherlv_1= 'Classe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'structuralfeatures' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' )
            {
            // InternalTracea.g:3949:2: ( () otherlv_1= 'Classe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'structuralfeatures' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}' )
            // InternalTracea.g:3950:3: () otherlv_1= 'Classe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'structuralfeatures' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )? (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )? (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )? otherlv_36= '}'
            {
            // InternalTracea.g:3950:3: ()
            // InternalTracea.g:3951:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClasseAccess().getClasseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClasseAccess().getClasseKeyword_1());
            		
            // InternalTracea.g:3961:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:3962:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:3962:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:3963:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClasseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClasseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:3984:3: (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==36) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalTracea.g:3985:4: otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getSubFragmentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:3993:4: ( ( ruleEString ) )
                    // InternalTracea.g:3994:5: ( ruleEString )
                    {
                    // InternalTracea.g:3994:5: ( ruleEString )
                    // InternalTracea.g:3995:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClasseAccess().getSubFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4009:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==14) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalTracea.g:4010:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getClasseAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:4014:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4015:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4015:6: ( ruleEString )
                    	    // InternalTracea.g:4016:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClasseRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClasseAccess().getSubFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_56); 

                    				newLeafNode(otherlv_9, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4036:3: (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==47) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalTracea.g:4037:4: otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getClasseAccess().getNamedelementsDefinedKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:4045:4: ( ( ruleEString ) )
                    // InternalTracea.g:4046:5: ( ruleEString )
                    {
                    // InternalTracea.g:4046:5: ( ruleEString )
                    // InternalTracea.g:4047:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClasseAccess().getNamedelementsDefinedNamedElementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4061:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==14) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalTracea.g:4062:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getClasseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:4066:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4067:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4067:6: ( ruleEString )
                    	    // InternalTracea.g:4068:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClasseRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClasseAccess().getNamedelementsDefinedNamedElementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_57); 

                    				newLeafNode(otherlv_15, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4088:3: (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==48) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalTracea.g:4089:4: otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getClasseAccess().getNamedelementsUsedKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:4097:4: ( ( ruleEString ) )
                    // InternalTracea.g:4098:5: ( ruleEString )
                    {
                    // InternalTracea.g:4098:5: ( ruleEString )
                    // InternalTracea.g:4099:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClasseAccess().getNamedelementsUsedNamedElementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4113:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==14) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalTracea.g:4114:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getClasseAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:4118:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4119:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4119:6: ( ruleEString )
                    	    // InternalTracea.g:4120:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClasseRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClasseAccess().getNamedelementsUsedNamedElementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_58); 

                    				newLeafNode(otherlv_21, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4140:3: (otherlv_22= 'structuralfeatures' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}' )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==56) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalTracea.g:4141:4: otherlv_22= 'structuralfeatures' otherlv_23= '{' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getClasseAccess().getStructuralfeaturesKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTracea.g:4149:4: ( ( ruleEString ) )
                    // InternalTracea.g:4150:5: ( ruleEString )
                    {
                    // InternalTracea.g:4150:5: ( ruleEString )
                    // InternalTracea.g:4151:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClasseAccess().getStructuralfeaturesStructuralFeatureCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4165:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==14) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalTracea.g:4166:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getClasseAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:4170:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4171:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4171:6: ( ruleEString )
                    	    // InternalTracea.g:4172:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClasseRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClasseAccess().getStructuralfeaturesStructuralFeatureCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_27, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4192:3: (otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==20) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalTracea.g:4193:4: otherlv_28= 'referees' otherlv_29= '(' ( ( ruleEString ) ) (otherlv_31= ',' ( ( ruleEString ) ) )* otherlv_33= ')'
                    {
                    otherlv_28=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_28, grammarAccess.getClasseAccess().getRefereesKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getClasseAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalTracea.g:4201:4: ( ( ruleEString ) )
                    // InternalTracea.g:4202:5: ( ruleEString )
                    {
                    // InternalTracea.g:4202:5: ( ruleEString )
                    // InternalTracea.g:4203:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClasseAccess().getRefereesRefereeCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4217:4: (otherlv_31= ',' ( ( ruleEString ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==14) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalTracea.g:4218:5: otherlv_31= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getClasseAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:4222:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4223:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4223:6: ( ruleEString )
                    	    // InternalTracea.g:4224:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClasseRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClasseAccess().getRefereesRefereeCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_33, grammarAccess.getClasseAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4244:3: (otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==27) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalTracea.g:4245:4: otherlv_34= 'timestamp' ( (lv_timestamp_35_0= ruleEString ) )
                    {
                    otherlv_34=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getClasseAccess().getTimestampKeyword_9_0());
                    			
                    // InternalTracea.g:4249:4: ( (lv_timestamp_35_0= ruleEString ) )
                    // InternalTracea.g:4250:5: (lv_timestamp_35_0= ruleEString )
                    {
                    // InternalTracea.g:4250:5: (lv_timestamp_35_0= ruleEString )
                    // InternalTracea.g:4251:6: lv_timestamp_35_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClasseAccess().getTimestampEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_35_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClasseRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_35_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_36=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleStructuralFeature"
    // InternalTracea.g:4277:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // InternalTracea.g:4277:58: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // InternalTracea.g:4278:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuralFeature=ruleStructuralFeature();

            state._fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // InternalTracea.g:4284:1: ruleStructuralFeature returns [EObject current=null] : ( () otherlv_1= 'StructuralFeature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_29_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:4290:2: ( ( () otherlv_1= 'StructuralFeature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' ) )
            // InternalTracea.g:4291:2: ( () otherlv_1= 'StructuralFeature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' )
            {
            // InternalTracea.g:4291:2: ( () otherlv_1= 'StructuralFeature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}' )
            // InternalTracea.g:4292:3: () otherlv_1= 'StructuralFeature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )? otherlv_30= '}'
            {
            // InternalTracea.g:4292:3: ()
            // InternalTracea.g:4293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStructuralFeatureAccess().getStructuralFeatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStructuralFeatureAccess().getStructuralFeatureKeyword_1());
            		
            // InternalTracea.g:4303:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:4304:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:4304:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:4305:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStructuralFeatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructuralFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getStructuralFeatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:4326:3: (otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==36) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalTracea.g:4327:4: otherlv_4= 'subFragments' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStructuralFeatureAccess().getSubFragmentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getStructuralFeatureAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTracea.g:4335:4: ( ( ruleEString ) )
                    // InternalTracea.g:4336:5: ( ruleEString )
                    {
                    // InternalTracea.g:4336:5: ( ruleEString )
                    // InternalTracea.g:4337:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStructuralFeatureAccess().getSubFragmentsArtefactFragmentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4351:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==14) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalTracea.g:4352:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStructuralFeatureAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:4356:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4357:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4357:6: ( ruleEString )
                    	    // InternalTracea.g:4358:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStructuralFeatureAccess().getSubFragmentsArtefactFragmentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_47); 

                    				newLeafNode(otherlv_9, grammarAccess.getStructuralFeatureAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4378:3: (otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==47) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalTracea.g:4379:4: otherlv_10= 'namedelementsDefined' otherlv_11= '{' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getStructuralFeatureAccess().getNamedelementsDefinedKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getStructuralFeatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:4387:4: ( ( ruleEString ) )
                    // InternalTracea.g:4388:5: ( ruleEString )
                    {
                    // InternalTracea.g:4388:5: ( ruleEString )
                    // InternalTracea.g:4389:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStructuralFeatureAccess().getNamedelementsDefinedNamedElementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4403:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==14) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalTracea.g:4404:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStructuralFeatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:4408:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4409:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4409:6: ( ruleEString )
                    	    // InternalTracea.g:4410:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStructuralFeatureAccess().getNamedelementsDefinedNamedElementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_15, grammarAccess.getStructuralFeatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4430:3: (otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}' )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==48) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalTracea.g:4431:4: otherlv_16= 'namedelementsUsed' otherlv_17= '{' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getStructuralFeatureAccess().getNamedelementsUsedKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getStructuralFeatureAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTracea.g:4439:4: ( ( ruleEString ) )
                    // InternalTracea.g:4440:5: ( ruleEString )
                    {
                    // InternalTracea.g:4440:5: ( ruleEString )
                    // InternalTracea.g:4441:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStructuralFeatureAccess().getNamedelementsUsedNamedElementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4455:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==14) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalTracea.g:4456:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getStructuralFeatureAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:4460:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4461:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4461:6: ( ruleEString )
                    	    // InternalTracea.g:4462:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStructuralFeatureAccess().getNamedelementsUsedNamedElementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getStructuralFeatureAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4482:3: (otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==20) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalTracea.g:4483:4: otherlv_22= 'referees' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getStructuralFeatureAccess().getRefereesKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getStructuralFeatureAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalTracea.g:4491:4: ( ( ruleEString ) )
                    // InternalTracea.g:4492:5: ( ruleEString )
                    {
                    // InternalTracea.g:4492:5: ( ruleEString )
                    // InternalTracea.g:4493:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStructuralFeatureAccess().getRefereesRefereeCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:4507:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==14) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalTracea.g:4508:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getStructuralFeatureAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:4512:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:4513:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:4513:6: ( ruleEString )
                    	    // InternalTracea.g:4514:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStructuralFeatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStructuralFeatureAccess().getRefereesRefereeCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_27, grammarAccess.getStructuralFeatureAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:4534:3: (otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==27) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalTracea.g:4535:4: otherlv_28= 'timestamp' ( (lv_timestamp_29_0= ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getStructuralFeatureAccess().getTimestampKeyword_8_0());
                    			
                    // InternalTracea.g:4539:4: ( (lv_timestamp_29_0= ruleEString ) )
                    // InternalTracea.g:4540:5: (lv_timestamp_29_0= ruleEString )
                    {
                    // InternalTracea.g:4540:5: (lv_timestamp_29_0= ruleEString )
                    // InternalTracea.g:4541:6: lv_timestamp_29_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStructuralFeatureAccess().getTimestampEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_29_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructuralFeatureRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_29_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getStructuralFeatureAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleRelationshipType"
    // InternalTracea.g:4567:1: entryRuleRelationshipType returns [EObject current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final EObject entryRuleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipType = null;


        try {
            // InternalTracea.g:4567:57: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // InternalTracea.g:4568:2: iv_ruleRelationshipType= ruleRelationshipType EOF
            {
             newCompositeNode(grammarAccess.getRelationshipTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipType=ruleRelationshipType();

            state._fsp--;

             current =iv_ruleRelationshipType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationshipType"


    // $ANTLR start "ruleRelationshipType"
    // InternalTracea.g:4574:1: ruleRelationshipType returns [EObject current=null] : (this_DomainType_Impl_0= ruleDomainType_Impl | this_EngineeringType_Impl_1= ruleEngineeringType_Impl | this_Transclusion_2= ruleTransclusion | this_Doc2Section_3= ruleDoc2Section | this_Section2PoS_4= ruleSection2PoS | this_PoSSynonym_5= rulePoSSynonym | this_PoS2NamedEntity_6= rulePoS2NamedEntity | this_NamedEntitySynonym_7= ruleNamedEntitySynonym | this_NamedEntity2Class_8= ruleNamedEntity2Class | this_NameEntity2Package_9= ruleNameEntity2Package | this_Package2Model_10= rulePackage2Model ) ;
    public final EObject ruleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject this_DomainType_Impl_0 = null;

        EObject this_EngineeringType_Impl_1 = null;

        EObject this_Transclusion_2 = null;

        EObject this_Doc2Section_3 = null;

        EObject this_Section2PoS_4 = null;

        EObject this_PoSSynonym_5 = null;

        EObject this_PoS2NamedEntity_6 = null;

        EObject this_NamedEntitySynonym_7 = null;

        EObject this_NamedEntity2Class_8 = null;

        EObject this_NameEntity2Package_9 = null;

        EObject this_Package2Model_10 = null;



        	enterRule();

        try {
            // InternalTracea.g:4580:2: ( (this_DomainType_Impl_0= ruleDomainType_Impl | this_EngineeringType_Impl_1= ruleEngineeringType_Impl | this_Transclusion_2= ruleTransclusion | this_Doc2Section_3= ruleDoc2Section | this_Section2PoS_4= ruleSection2PoS | this_PoSSynonym_5= rulePoSSynonym | this_PoS2NamedEntity_6= rulePoS2NamedEntity | this_NamedEntitySynonym_7= ruleNamedEntitySynonym | this_NamedEntity2Class_8= ruleNamedEntity2Class | this_NameEntity2Package_9= ruleNameEntity2Package | this_Package2Model_10= rulePackage2Model ) )
            // InternalTracea.g:4581:2: (this_DomainType_Impl_0= ruleDomainType_Impl | this_EngineeringType_Impl_1= ruleEngineeringType_Impl | this_Transclusion_2= ruleTransclusion | this_Doc2Section_3= ruleDoc2Section | this_Section2PoS_4= ruleSection2PoS | this_PoSSynonym_5= rulePoSSynonym | this_PoS2NamedEntity_6= rulePoS2NamedEntity | this_NamedEntitySynonym_7= ruleNamedEntitySynonym | this_NamedEntity2Class_8= ruleNamedEntity2Class | this_NameEntity2Package_9= ruleNameEntity2Package | this_Package2Model_10= rulePackage2Model )
            {
            // InternalTracea.g:4581:2: (this_DomainType_Impl_0= ruleDomainType_Impl | this_EngineeringType_Impl_1= ruleEngineeringType_Impl | this_Transclusion_2= ruleTransclusion | this_Doc2Section_3= ruleDoc2Section | this_Section2PoS_4= ruleSection2PoS | this_PoSSynonym_5= rulePoSSynonym | this_PoS2NamedEntity_6= rulePoS2NamedEntity | this_NamedEntitySynonym_7= ruleNamedEntitySynonym | this_NamedEntity2Class_8= ruleNamedEntity2Class | this_NameEntity2Package_9= ruleNameEntity2Package | this_Package2Model_10= rulePackage2Model )
            int alt135=11;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt135=1;
                }
                break;
            case 59:
                {
                alt135=2;
                }
                break;
            case 60:
                {
                alt135=3;
                }
                break;
            case 61:
                {
                alt135=4;
                }
                break;
            case 62:
                {
                alt135=5;
                }
                break;
            case 63:
                {
                alt135=6;
                }
                break;
            case 64:
                {
                alt135=7;
                }
                break;
            case 65:
                {
                alt135=8;
                }
                break;
            case 66:
                {
                alt135=9;
                }
                break;
            case 67:
                {
                alt135=10;
                }
                break;
            case 68:
                {
                alt135=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // InternalTracea.g:4582:3: this_DomainType_Impl_0= ruleDomainType_Impl
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getDomainType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainType_Impl_0=ruleDomainType_Impl();

                    state._fsp--;


                    			current = this_DomainType_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:4591:3: this_EngineeringType_Impl_1= ruleEngineeringType_Impl
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getEngineeringType_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EngineeringType_Impl_1=ruleEngineeringType_Impl();

                    state._fsp--;


                    			current = this_EngineeringType_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTracea.g:4600:3: this_Transclusion_2= ruleTransclusion
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getTransclusionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transclusion_2=ruleTransclusion();

                    state._fsp--;


                    			current = this_Transclusion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTracea.g:4609:3: this_Doc2Section_3= ruleDoc2Section
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getDoc2SectionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Doc2Section_3=ruleDoc2Section();

                    state._fsp--;


                    			current = this_Doc2Section_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTracea.g:4618:3: this_Section2PoS_4= ruleSection2PoS
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getSection2PoSParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Section2PoS_4=ruleSection2PoS();

                    state._fsp--;


                    			current = this_Section2PoS_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTracea.g:4627:3: this_PoSSynonym_5= rulePoSSynonym
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getPoSSynonymParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PoSSynonym_5=rulePoSSynonym();

                    state._fsp--;


                    			current = this_PoSSynonym_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTracea.g:4636:3: this_PoS2NamedEntity_6= rulePoS2NamedEntity
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getPoS2NamedEntityParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PoS2NamedEntity_6=rulePoS2NamedEntity();

                    state._fsp--;


                    			current = this_PoS2NamedEntity_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTracea.g:4645:3: this_NamedEntitySynonym_7= ruleNamedEntitySynonym
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getNamedEntitySynonymParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedEntitySynonym_7=ruleNamedEntitySynonym();

                    state._fsp--;


                    			current = this_NamedEntitySynonym_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTracea.g:4654:3: this_NamedEntity2Class_8= ruleNamedEntity2Class
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getNamedEntity2ClassParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedEntity2Class_8=ruleNamedEntity2Class();

                    state._fsp--;


                    			current = this_NamedEntity2Class_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTracea.g:4663:3: this_NameEntity2Package_9= ruleNameEntity2Package
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getNameEntity2PackageParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameEntity2Package_9=ruleNameEntity2Package();

                    state._fsp--;


                    			current = this_NameEntity2Package_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTracea.g:4672:3: this_Package2Model_10= rulePackage2Model
                    {

                    			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getPackage2ModelParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package2Model_10=rulePackage2Model();

                    state._fsp--;


                    			current = this_Package2Model_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "entryRuleDomainType_Impl"
    // InternalTracea.g:4684:1: entryRuleDomainType_Impl returns [EObject current=null] : iv_ruleDomainType_Impl= ruleDomainType_Impl EOF ;
    public final EObject entryRuleDomainType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainType_Impl = null;


        try {
            // InternalTracea.g:4684:56: (iv_ruleDomainType_Impl= ruleDomainType_Impl EOF )
            // InternalTracea.g:4685:2: iv_ruleDomainType_Impl= ruleDomainType_Impl EOF
            {
             newCompositeNode(grammarAccess.getDomainType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainType_Impl=ruleDomainType_Impl();

            state._fsp--;

             current =iv_ruleDomainType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainType_Impl"


    // $ANTLR start "ruleDomainType_Impl"
    // InternalTracea.g:4691:1: ruleDomainType_Impl returns [EObject current=null] : ( () otherlv_1= 'DomainType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDomainType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:4697:2: ( ( () otherlv_1= 'DomainType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTracea.g:4698:2: ( () otherlv_1= 'DomainType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTracea.g:4698:2: ( () otherlv_1= 'DomainType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTracea.g:4699:3: () otherlv_1= 'DomainType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTracea.g:4699:3: ()
            // InternalTracea.g:4700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDomainType_ImplAccess().getDomainTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainType_ImplAccess().getDomainTypeKeyword_1());
            		
            // InternalTracea.g:4710:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:4711:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:4711:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:4712:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDomainType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainType_Impl"


    // $ANTLR start "entryRuleEngineeringType_Impl"
    // InternalTracea.g:4733:1: entryRuleEngineeringType_Impl returns [EObject current=null] : iv_ruleEngineeringType_Impl= ruleEngineeringType_Impl EOF ;
    public final EObject entryRuleEngineeringType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEngineeringType_Impl = null;


        try {
            // InternalTracea.g:4733:61: (iv_ruleEngineeringType_Impl= ruleEngineeringType_Impl EOF )
            // InternalTracea.g:4734:2: iv_ruleEngineeringType_Impl= ruleEngineeringType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEngineeringType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEngineeringType_Impl=ruleEngineeringType_Impl();

            state._fsp--;

             current =iv_ruleEngineeringType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEngineeringType_Impl"


    // $ANTLR start "ruleEngineeringType_Impl"
    // InternalTracea.g:4740:1: ruleEngineeringType_Impl returns [EObject current=null] : ( () otherlv_1= 'EngineeringType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEngineeringType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:4746:2: ( ( () otherlv_1= 'EngineeringType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTracea.g:4747:2: ( () otherlv_1= 'EngineeringType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTracea.g:4747:2: ( () otherlv_1= 'EngineeringType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTracea.g:4748:3: () otherlv_1= 'EngineeringType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTracea.g:4748:3: ()
            // InternalTracea.g:4749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEngineeringType_ImplAccess().getEngineeringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEngineeringType_ImplAccess().getEngineeringTypeKeyword_1());
            		
            // InternalTracea.g:4759:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:4760:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:4760:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:4761:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEngineeringType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEngineeringType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEngineeringType_Impl"


    // $ANTLR start "entryRuleTransclusion"
    // InternalTracea.g:4782:1: entryRuleTransclusion returns [EObject current=null] : iv_ruleTransclusion= ruleTransclusion EOF ;
    public final EObject entryRuleTransclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransclusion = null;


        try {
            // InternalTracea.g:4782:53: (iv_ruleTransclusion= ruleTransclusion EOF )
            // InternalTracea.g:4783:2: iv_ruleTransclusion= ruleTransclusion EOF
            {
             newCompositeNode(grammarAccess.getTransclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransclusion=ruleTransclusion();

            state._fsp--;

             current =iv_ruleTransclusion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransclusion"


    // $ANTLR start "ruleTransclusion"
    // InternalTracea.g:4789:1: ruleTransclusion returns [EObject current=null] : ( () otherlv_1= 'Transclusion' ) ;
    public final EObject ruleTransclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:4795:2: ( ( () otherlv_1= 'Transclusion' ) )
            // InternalTracea.g:4796:2: ( () otherlv_1= 'Transclusion' )
            {
            // InternalTracea.g:4796:2: ( () otherlv_1= 'Transclusion' )
            // InternalTracea.g:4797:3: () otherlv_1= 'Transclusion'
            {
            // InternalTracea.g:4797:3: ()
            // InternalTracea.g:4798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransclusionAccess().getTransclusionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTransclusionAccess().getTransclusionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransclusion"


    // $ANTLR start "entryRuleDoc2Section"
    // InternalTracea.g:4812:1: entryRuleDoc2Section returns [EObject current=null] : iv_ruleDoc2Section= ruleDoc2Section EOF ;
    public final EObject entryRuleDoc2Section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoc2Section = null;


        try {
            // InternalTracea.g:4812:52: (iv_ruleDoc2Section= ruleDoc2Section EOF )
            // InternalTracea.g:4813:2: iv_ruleDoc2Section= ruleDoc2Section EOF
            {
             newCompositeNode(grammarAccess.getDoc2SectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoc2Section=ruleDoc2Section();

            state._fsp--;

             current =iv_ruleDoc2Section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoc2Section"


    // $ANTLR start "ruleDoc2Section"
    // InternalTracea.g:4819:1: ruleDoc2Section returns [EObject current=null] : ( () otherlv_1= 'Doc2Section' ) ;
    public final EObject ruleDoc2Section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:4825:2: ( ( () otherlv_1= 'Doc2Section' ) )
            // InternalTracea.g:4826:2: ( () otherlv_1= 'Doc2Section' )
            {
            // InternalTracea.g:4826:2: ( () otherlv_1= 'Doc2Section' )
            // InternalTracea.g:4827:3: () otherlv_1= 'Doc2Section'
            {
            // InternalTracea.g:4827:3: ()
            // InternalTracea.g:4828:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoc2SectionAccess().getDoc2SectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDoc2SectionAccess().getDoc2SectionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoc2Section"


    // $ANTLR start "entryRuleSection2PoS"
    // InternalTracea.g:4842:1: entryRuleSection2PoS returns [EObject current=null] : iv_ruleSection2PoS= ruleSection2PoS EOF ;
    public final EObject entryRuleSection2PoS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection2PoS = null;


        try {
            // InternalTracea.g:4842:52: (iv_ruleSection2PoS= ruleSection2PoS EOF )
            // InternalTracea.g:4843:2: iv_ruleSection2PoS= ruleSection2PoS EOF
            {
             newCompositeNode(grammarAccess.getSection2PoSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection2PoS=ruleSection2PoS();

            state._fsp--;

             current =iv_ruleSection2PoS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection2PoS"


    // $ANTLR start "ruleSection2PoS"
    // InternalTracea.g:4849:1: ruleSection2PoS returns [EObject current=null] : ( () otherlv_1= 'Section2PoS' ) ;
    public final EObject ruleSection2PoS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:4855:2: ( ( () otherlv_1= 'Section2PoS' ) )
            // InternalTracea.g:4856:2: ( () otherlv_1= 'Section2PoS' )
            {
            // InternalTracea.g:4856:2: ( () otherlv_1= 'Section2PoS' )
            // InternalTracea.g:4857:3: () otherlv_1= 'Section2PoS'
            {
            // InternalTracea.g:4857:3: ()
            // InternalTracea.g:4858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSection2PoSAccess().getSection2PoSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSection2PoSAccess().getSection2PoSKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection2PoS"


    // $ANTLR start "entryRulePoSSynonym"
    // InternalTracea.g:4872:1: entryRulePoSSynonym returns [EObject current=null] : iv_rulePoSSynonym= rulePoSSynonym EOF ;
    public final EObject entryRulePoSSynonym() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoSSynonym = null;


        try {
            // InternalTracea.g:4872:51: (iv_rulePoSSynonym= rulePoSSynonym EOF )
            // InternalTracea.g:4873:2: iv_rulePoSSynonym= rulePoSSynonym EOF
            {
             newCompositeNode(grammarAccess.getPoSSynonymRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoSSynonym=rulePoSSynonym();

            state._fsp--;

             current =iv_rulePoSSynonym; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoSSynonym"


    // $ANTLR start "rulePoSSynonym"
    // InternalTracea.g:4879:1: rulePoSSynonym returns [EObject current=null] : ( () otherlv_1= 'PoSSynonym' ) ;
    public final EObject rulePoSSynonym() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:4885:2: ( ( () otherlv_1= 'PoSSynonym' ) )
            // InternalTracea.g:4886:2: ( () otherlv_1= 'PoSSynonym' )
            {
            // InternalTracea.g:4886:2: ( () otherlv_1= 'PoSSynonym' )
            // InternalTracea.g:4887:3: () otherlv_1= 'PoSSynonym'
            {
            // InternalTracea.g:4887:3: ()
            // InternalTracea.g:4888:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoSSynonymAccess().getPoSSynonymAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPoSSynonymAccess().getPoSSynonymKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoSSynonym"


    // $ANTLR start "entryRulePoS2NamedEntity"
    // InternalTracea.g:4902:1: entryRulePoS2NamedEntity returns [EObject current=null] : iv_rulePoS2NamedEntity= rulePoS2NamedEntity EOF ;
    public final EObject entryRulePoS2NamedEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoS2NamedEntity = null;


        try {
            // InternalTracea.g:4902:56: (iv_rulePoS2NamedEntity= rulePoS2NamedEntity EOF )
            // InternalTracea.g:4903:2: iv_rulePoS2NamedEntity= rulePoS2NamedEntity EOF
            {
             newCompositeNode(grammarAccess.getPoS2NamedEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoS2NamedEntity=rulePoS2NamedEntity();

            state._fsp--;

             current =iv_rulePoS2NamedEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoS2NamedEntity"


    // $ANTLR start "rulePoS2NamedEntity"
    // InternalTracea.g:4909:1: rulePoS2NamedEntity returns [EObject current=null] : ( () otherlv_1= 'PoS2NamedEntity' ) ;
    public final EObject rulePoS2NamedEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:4915:2: ( ( () otherlv_1= 'PoS2NamedEntity' ) )
            // InternalTracea.g:4916:2: ( () otherlv_1= 'PoS2NamedEntity' )
            {
            // InternalTracea.g:4916:2: ( () otherlv_1= 'PoS2NamedEntity' )
            // InternalTracea.g:4917:3: () otherlv_1= 'PoS2NamedEntity'
            {
            // InternalTracea.g:4917:3: ()
            // InternalTracea.g:4918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPoS2NamedEntityAccess().getPoS2NamedEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPoS2NamedEntityAccess().getPoS2NamedEntityKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoS2NamedEntity"


    // $ANTLR start "entryRuleNamedEntitySynonym"
    // InternalTracea.g:4932:1: entryRuleNamedEntitySynonym returns [EObject current=null] : iv_ruleNamedEntitySynonym= ruleNamedEntitySynonym EOF ;
    public final EObject entryRuleNamedEntitySynonym() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedEntitySynonym = null;


        try {
            // InternalTracea.g:4932:59: (iv_ruleNamedEntitySynonym= ruleNamedEntitySynonym EOF )
            // InternalTracea.g:4933:2: iv_ruleNamedEntitySynonym= ruleNamedEntitySynonym EOF
            {
             newCompositeNode(grammarAccess.getNamedEntitySynonymRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedEntitySynonym=ruleNamedEntitySynonym();

            state._fsp--;

             current =iv_ruleNamedEntitySynonym; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedEntitySynonym"


    // $ANTLR start "ruleNamedEntitySynonym"
    // InternalTracea.g:4939:1: ruleNamedEntitySynonym returns [EObject current=null] : ( () otherlv_1= 'NamedEntitySynonym' ) ;
    public final EObject ruleNamedEntitySynonym() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:4945:2: ( ( () otherlv_1= 'NamedEntitySynonym' ) )
            // InternalTracea.g:4946:2: ( () otherlv_1= 'NamedEntitySynonym' )
            {
            // InternalTracea.g:4946:2: ( () otherlv_1= 'NamedEntitySynonym' )
            // InternalTracea.g:4947:3: () otherlv_1= 'NamedEntitySynonym'
            {
            // InternalTracea.g:4947:3: ()
            // InternalTracea.g:4948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedEntitySynonymAccess().getNamedEntitySynonymAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedEntitySynonymAccess().getNamedEntitySynonymKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedEntitySynonym"


    // $ANTLR start "entryRuleNamedEntity2Class"
    // InternalTracea.g:4962:1: entryRuleNamedEntity2Class returns [EObject current=null] : iv_ruleNamedEntity2Class= ruleNamedEntity2Class EOF ;
    public final EObject entryRuleNamedEntity2Class() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedEntity2Class = null;


        try {
            // InternalTracea.g:4962:58: (iv_ruleNamedEntity2Class= ruleNamedEntity2Class EOF )
            // InternalTracea.g:4963:2: iv_ruleNamedEntity2Class= ruleNamedEntity2Class EOF
            {
             newCompositeNode(grammarAccess.getNamedEntity2ClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedEntity2Class=ruleNamedEntity2Class();

            state._fsp--;

             current =iv_ruleNamedEntity2Class; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedEntity2Class"


    // $ANTLR start "ruleNamedEntity2Class"
    // InternalTracea.g:4969:1: ruleNamedEntity2Class returns [EObject current=null] : ( () otherlv_1= 'NamedEntity2Class' ) ;
    public final EObject ruleNamedEntity2Class() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:4975:2: ( ( () otherlv_1= 'NamedEntity2Class' ) )
            // InternalTracea.g:4976:2: ( () otherlv_1= 'NamedEntity2Class' )
            {
            // InternalTracea.g:4976:2: ( () otherlv_1= 'NamedEntity2Class' )
            // InternalTracea.g:4977:3: () otherlv_1= 'NamedEntity2Class'
            {
            // InternalTracea.g:4977:3: ()
            // InternalTracea.g:4978:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedEntity2ClassAccess().getNamedEntity2ClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedEntity2ClassAccess().getNamedEntity2ClassKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedEntity2Class"


    // $ANTLR start "entryRuleNameEntity2Package"
    // InternalTracea.g:4992:1: entryRuleNameEntity2Package returns [EObject current=null] : iv_ruleNameEntity2Package= ruleNameEntity2Package EOF ;
    public final EObject entryRuleNameEntity2Package() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameEntity2Package = null;


        try {
            // InternalTracea.g:4992:59: (iv_ruleNameEntity2Package= ruleNameEntity2Package EOF )
            // InternalTracea.g:4993:2: iv_ruleNameEntity2Package= ruleNameEntity2Package EOF
            {
             newCompositeNode(grammarAccess.getNameEntity2PackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameEntity2Package=ruleNameEntity2Package();

            state._fsp--;

             current =iv_ruleNameEntity2Package; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameEntity2Package"


    // $ANTLR start "ruleNameEntity2Package"
    // InternalTracea.g:4999:1: ruleNameEntity2Package returns [EObject current=null] : ( () otherlv_1= 'NameEntity2Package' ) ;
    public final EObject ruleNameEntity2Package() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:5005:2: ( ( () otherlv_1= 'NameEntity2Package' ) )
            // InternalTracea.g:5006:2: ( () otherlv_1= 'NameEntity2Package' )
            {
            // InternalTracea.g:5006:2: ( () otherlv_1= 'NameEntity2Package' )
            // InternalTracea.g:5007:3: () otherlv_1= 'NameEntity2Package'
            {
            // InternalTracea.g:5007:3: ()
            // InternalTracea.g:5008:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameEntity2PackageAccess().getNameEntity2PackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNameEntity2PackageAccess().getNameEntity2PackageKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameEntity2Package"


    // $ANTLR start "entryRulePackage2Model"
    // InternalTracea.g:5022:1: entryRulePackage2Model returns [EObject current=null] : iv_rulePackage2Model= rulePackage2Model EOF ;
    public final EObject entryRulePackage2Model() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage2Model = null;


        try {
            // InternalTracea.g:5022:54: (iv_rulePackage2Model= rulePackage2Model EOF )
            // InternalTracea.g:5023:2: iv_rulePackage2Model= rulePackage2Model EOF
            {
             newCompositeNode(grammarAccess.getPackage2ModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage2Model=rulePackage2Model();

            state._fsp--;

             current =iv_rulePackage2Model; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage2Model"


    // $ANTLR start "rulePackage2Model"
    // InternalTracea.g:5029:1: rulePackage2Model returns [EObject current=null] : ( () otherlv_1= 'Package2Model' ) ;
    public final EObject rulePackage2Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTracea.g:5035:2: ( ( () otherlv_1= 'Package2Model' ) )
            // InternalTracea.g:5036:2: ( () otherlv_1= 'Package2Model' )
            {
            // InternalTracea.g:5036:2: ( () otherlv_1= 'Package2Model' )
            // InternalTracea.g:5037:3: () otherlv_1= 'Package2Model'
            {
            // InternalTracea.g:5037:3: ()
            // InternalTracea.g:5038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage2ModelAccess().getPackage2ModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPackage2ModelAccess().getPackage2ModelKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage2Model"


    // $ANTLR start "entryRuleReferee"
    // InternalTracea.g:5052:1: entryRuleReferee returns [EObject current=null] : iv_ruleReferee= ruleReferee EOF ;
    public final EObject entryRuleReferee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferee = null;


        try {
            // InternalTracea.g:5052:48: (iv_ruleReferee= ruleReferee EOF )
            // InternalTracea.g:5053:2: iv_ruleReferee= ruleReferee EOF
            {
             newCompositeNode(grammarAccess.getRefereeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferee=ruleReferee();

            state._fsp--;

             current =iv_ruleReferee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferee"


    // $ANTLR start "ruleReferee"
    // InternalTracea.g:5059:1: ruleReferee returns [EObject current=null] : ( () otherlv_1= 'Referee' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReferee() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:5065:2: ( ( () otherlv_1= 'Referee' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTracea.g:5066:2: ( () otherlv_1= 'Referee' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTracea.g:5066:2: ( () otherlv_1= 'Referee' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTracea.g:5067:3: () otherlv_1= 'Referee' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTracea.g:5067:3: ()
            // InternalTracea.g:5068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefereeAccess().getRefereeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRefereeAccess().getRefereeKeyword_1());
            		
            // InternalTracea.g:5078:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:5079:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:5079:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:5080:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRefereeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefereeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferee"


    // $ANTLR start "entryRuleEvidence"
    // InternalTracea.g:5101:1: entryRuleEvidence returns [EObject current=null] : iv_ruleEvidence= ruleEvidence EOF ;
    public final EObject entryRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence = null;


        try {
            // InternalTracea.g:5101:49: (iv_ruleEvidence= ruleEvidence EOF )
            // InternalTracea.g:5102:2: iv_ruleEvidence= ruleEvidence EOF
            {
             newCompositeNode(grammarAccess.getEvidenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvidence=ruleEvidence();

            state._fsp--;

             current =iv_ruleEvidence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvidence"


    // $ANTLR start "ruleEvidence"
    // InternalTracea.g:5108:1: ruleEvidence returns [EObject current=null] : (this_Evidence_Impl_0= ruleEvidence_Impl | this_RuleEvidence_1= ruleRuleEvidence | this_AnnotationEvidence_2= ruleAnnotationEvidence | this_AIEvidence_3= ruleAIEvidence ) ;
    public final EObject ruleEvidence() throws RecognitionException {
        EObject current = null;

        EObject this_Evidence_Impl_0 = null;

        EObject this_RuleEvidence_1 = null;

        EObject this_AnnotationEvidence_2 = null;

        EObject this_AIEvidence_3 = null;



        	enterRule();

        try {
            // InternalTracea.g:5114:2: ( (this_Evidence_Impl_0= ruleEvidence_Impl | this_RuleEvidence_1= ruleRuleEvidence | this_AnnotationEvidence_2= ruleAnnotationEvidence | this_AIEvidence_3= ruleAIEvidence ) )
            // InternalTracea.g:5115:2: (this_Evidence_Impl_0= ruleEvidence_Impl | this_RuleEvidence_1= ruleRuleEvidence | this_AnnotationEvidence_2= ruleAnnotationEvidence | this_AIEvidence_3= ruleAIEvidence )
            {
            // InternalTracea.g:5115:2: (this_Evidence_Impl_0= ruleEvidence_Impl | this_RuleEvidence_1= ruleRuleEvidence | this_AnnotationEvidence_2= ruleAnnotationEvidence | this_AIEvidence_3= ruleAIEvidence )
            int alt136=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt136=1;
                }
                break;
            case 72:
                {
                alt136=2;
                }
                break;
            case 75:
                {
                alt136=3;
                }
                break;
            case 77:
                {
                alt136=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // InternalTracea.g:5116:3: this_Evidence_Impl_0= ruleEvidence_Impl
                    {

                    			newCompositeNode(grammarAccess.getEvidenceAccess().getEvidence_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Evidence_Impl_0=ruleEvidence_Impl();

                    state._fsp--;


                    			current = this_Evidence_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:5125:3: this_RuleEvidence_1= ruleRuleEvidence
                    {

                    			newCompositeNode(grammarAccess.getEvidenceAccess().getRuleEvidenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleEvidence_1=ruleRuleEvidence();

                    state._fsp--;


                    			current = this_RuleEvidence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTracea.g:5134:3: this_AnnotationEvidence_2= ruleAnnotationEvidence
                    {

                    			newCompositeNode(grammarAccess.getEvidenceAccess().getAnnotationEvidenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotationEvidence_2=ruleAnnotationEvidence();

                    state._fsp--;


                    			current = this_AnnotationEvidence_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTracea.g:5143:3: this_AIEvidence_3= ruleAIEvidence
                    {

                    			newCompositeNode(grammarAccess.getEvidenceAccess().getAIEvidenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AIEvidence_3=ruleAIEvidence();

                    state._fsp--;


                    			current = this_AIEvidence_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvidence"


    // $ANTLR start "entryRuleEvidence_Impl"
    // InternalTracea.g:5155:1: entryRuleEvidence_Impl returns [EObject current=null] : iv_ruleEvidence_Impl= ruleEvidence_Impl EOF ;
    public final EObject entryRuleEvidence_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidence_Impl = null;


        try {
            // InternalTracea.g:5155:54: (iv_ruleEvidence_Impl= ruleEvidence_Impl EOF )
            // InternalTracea.g:5156:2: iv_ruleEvidence_Impl= ruleEvidence_Impl EOF
            {
             newCompositeNode(grammarAccess.getEvidence_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvidence_Impl=ruleEvidence_Impl();

            state._fsp--;

             current =iv_ruleEvidence_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvidence_Impl"


    // $ANTLR start "ruleEvidence_Impl"
    // InternalTracea.g:5162:1: ruleEvidence_Impl returns [EObject current=null] : ( () otherlv_1= 'Evidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'impactedElements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleEvidence_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_17_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:5168:2: ( ( () otherlv_1= 'Evidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'impactedElements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' ) )
            // InternalTracea.g:5169:2: ( () otherlv_1= 'Evidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'impactedElements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' )
            {
            // InternalTracea.g:5169:2: ( () otherlv_1= 'Evidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'impactedElements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}' )
            // InternalTracea.g:5170:3: () otherlv_1= 'Evidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'impactedElements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )? otherlv_18= '}'
            {
            // InternalTracea.g:5170:3: ()
            // InternalTracea.g:5171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvidence_ImplAccess().getEvidenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvidence_ImplAccess().getEvidenceKeyword_1());
            		
            // InternalTracea.g:5181:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:5182:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:5182:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:5183:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEvidence_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvidence_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getEvidence_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:5204:3: (otherlv_4= 'impactedElements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==71) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalTracea.g:5205:4: otherlv_4= 'impactedElements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvidence_ImplAccess().getImpactedElementsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvidence_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalTracea.g:5213:4: ( ( ruleEString ) )
                    // InternalTracea.g:5214:5: ( ruleEString )
                    {
                    // InternalTracea.g:5214:5: ( ruleEString )
                    // InternalTracea.g:5215:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvidence_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvidence_ImplAccess().getImpactedElementsTrustableElementCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5229:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==14) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalTracea.g:5230:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEvidence_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTracea.g:5234:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:5235:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:5235:6: ( ruleEString )
                    	    // InternalTracea.g:5236:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEvidence_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEvidence_ImplAccess().getImpactedElementsTrustableElementCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getEvidence_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:5256:3: (otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==20) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalTracea.g:5257:4: otherlv_10= 'referees' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getEvidence_ImplAccess().getRefereesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEvidence_ImplAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTracea.g:5265:4: ( ( ruleEString ) )
                    // InternalTracea.g:5266:5: ( ruleEString )
                    {
                    // InternalTracea.g:5266:5: ( ruleEString )
                    // InternalTracea.g:5267:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvidence_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEvidence_ImplAccess().getRefereesRefereeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5281:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==14) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalTracea.g:5282:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEvidence_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:5286:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:5287:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:5287:6: ( ruleEString )
                    	    // InternalTracea.g:5288:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEvidence_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEvidence_ImplAccess().getRefereesRefereeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_15, grammarAccess.getEvidence_ImplAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:5308:3: (otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==27) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalTracea.g:5309:4: otherlv_16= 'timestamp' ( (lv_timestamp_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getEvidence_ImplAccess().getTimestampKeyword_6_0());
                    			
                    // InternalTracea.g:5313:4: ( (lv_timestamp_17_0= ruleEString ) )
                    // InternalTracea.g:5314:5: (lv_timestamp_17_0= ruleEString )
                    {
                    // InternalTracea.g:5314:5: (lv_timestamp_17_0= ruleEString )
                    // InternalTracea.g:5315:6: lv_timestamp_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEvidence_ImplAccess().getTimestampEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvidence_ImplRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_17_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getEvidence_ImplAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvidence_Impl"


    // $ANTLR start "entryRuleRuleEvidence"
    // InternalTracea.g:5341:1: entryRuleRuleEvidence returns [EObject current=null] : iv_ruleRuleEvidence= ruleRuleEvidence EOF ;
    public final EObject entryRuleRuleEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleEvidence = null;


        try {
            // InternalTracea.g:5341:53: (iv_ruleRuleEvidence= ruleRuleEvidence EOF )
            // InternalTracea.g:5342:2: iv_ruleRuleEvidence= ruleRuleEvidence EOF
            {
             newCompositeNode(grammarAccess.getRuleEvidenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleEvidence=ruleRuleEvidence();

            state._fsp--;

             current =iv_ruleRuleEvidence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleEvidence"


    // $ANTLR start "ruleRuleEvidence"
    // InternalTracea.g:5348:1: ruleRuleEvidence returns [EObject current=null] : ( () otherlv_1= 'RuleEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rule' ( (lv_rule_5_0= ruleEString ) ) )? (otherlv_6= 'executionDate' ( (lv_executionDate_7_0= ruleEString ) ) )? (otherlv_8= 'impactedElements' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'referees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'timestamp' ( (lv_timestamp_21_0= ruleEString ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleRuleEvidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_rule_5_0 = null;

        AntlrDatatypeRuleToken lv_executionDate_7_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_21_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:5354:2: ( ( () otherlv_1= 'RuleEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rule' ( (lv_rule_5_0= ruleEString ) ) )? (otherlv_6= 'executionDate' ( (lv_executionDate_7_0= ruleEString ) ) )? (otherlv_8= 'impactedElements' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'referees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'timestamp' ( (lv_timestamp_21_0= ruleEString ) ) )? otherlv_22= '}' ) )
            // InternalTracea.g:5355:2: ( () otherlv_1= 'RuleEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rule' ( (lv_rule_5_0= ruleEString ) ) )? (otherlv_6= 'executionDate' ( (lv_executionDate_7_0= ruleEString ) ) )? (otherlv_8= 'impactedElements' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'referees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'timestamp' ( (lv_timestamp_21_0= ruleEString ) ) )? otherlv_22= '}' )
            {
            // InternalTracea.g:5355:2: ( () otherlv_1= 'RuleEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rule' ( (lv_rule_5_0= ruleEString ) ) )? (otherlv_6= 'executionDate' ( (lv_executionDate_7_0= ruleEString ) ) )? (otherlv_8= 'impactedElements' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'referees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'timestamp' ( (lv_timestamp_21_0= ruleEString ) ) )? otherlv_22= '}' )
            // InternalTracea.g:5356:3: () otherlv_1= 'RuleEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rule' ( (lv_rule_5_0= ruleEString ) ) )? (otherlv_6= 'executionDate' ( (lv_executionDate_7_0= ruleEString ) ) )? (otherlv_8= 'impactedElements' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'referees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'timestamp' ( (lv_timestamp_21_0= ruleEString ) ) )? otherlv_22= '}'
            {
            // InternalTracea.g:5356:3: ()
            // InternalTracea.g:5357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleEvidenceAccess().getRuleEvidenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleEvidenceAccess().getRuleEvidenceKeyword_1());
            		
            // InternalTracea.g:5367:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:5368:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:5368:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:5369:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleEvidenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleEvidenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleEvidenceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:5390:3: (otherlv_4= 'rule' ( (lv_rule_5_0= ruleEString ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==73) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalTracea.g:5391:4: otherlv_4= 'rule' ( (lv_rule_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleEvidenceAccess().getRuleKeyword_4_0());
                    			
                    // InternalTracea.g:5395:4: ( (lv_rule_5_0= ruleEString ) )
                    // InternalTracea.g:5396:5: (lv_rule_5_0= ruleEString )
                    {
                    // InternalTracea.g:5396:5: (lv_rule_5_0= ruleEString )
                    // InternalTracea.g:5397:6: lv_rule_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRuleEvidenceAccess().getRuleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_rule_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_5_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:5415:3: (otherlv_6= 'executionDate' ( (lv_executionDate_7_0= ruleEString ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==74) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalTracea.g:5416:4: otherlv_6= 'executionDate' ( (lv_executionDate_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleEvidenceAccess().getExecutionDateKeyword_5_0());
                    			
                    // InternalTracea.g:5420:4: ( (lv_executionDate_7_0= ruleEString ) )
                    // InternalTracea.g:5421:5: (lv_executionDate_7_0= ruleEString )
                    {
                    // InternalTracea.g:5421:5: (lv_executionDate_7_0= ruleEString )
                    // InternalTracea.g:5422:6: lv_executionDate_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRuleEvidenceAccess().getExecutionDateEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_executionDate_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"executionDate",
                    							lv_executionDate_7_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:5440:3: (otherlv_8= 'impactedElements' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==71) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalTracea.g:5441:4: otherlv_8= 'impactedElements' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,71,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getRuleEvidenceAccess().getImpactedElementsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRuleEvidenceAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTracea.g:5449:4: ( ( ruleEString ) )
                    // InternalTracea.g:5450:5: ( ruleEString )
                    {
                    // InternalTracea.g:5450:5: ( ruleEString )
                    // InternalTracea.g:5451:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleEvidenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleEvidenceAccess().getImpactedElementsTrustableElementCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5465:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==14) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalTracea.g:5466:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRuleEvidenceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:5470:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:5471:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:5471:6: ( ruleEString )
                    	    // InternalTracea.g:5472:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRuleEvidenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRuleEvidenceAccess().getImpactedElementsTrustableElementCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getRuleEvidenceAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:5492:3: (otherlv_14= 'referees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==20) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalTracea.g:5493:4: otherlv_14= 'referees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getRuleEvidenceAccess().getRefereesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRuleEvidenceAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalTracea.g:5501:4: ( ( ruleEString ) )
                    // InternalTracea.g:5502:5: ( ruleEString )
                    {
                    // InternalTracea.g:5502:5: ( ruleEString )
                    // InternalTracea.g:5503:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleEvidenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleEvidenceAccess().getRefereesRefereeCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5517:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==14) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // InternalTracea.g:5518:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRuleEvidenceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTracea.g:5522:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:5523:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:5523:6: ( ruleEString )
                    	    // InternalTracea.g:5524:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRuleEvidenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRuleEvidenceAccess().getRefereesRefereeCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop146;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_19, grammarAccess.getRuleEvidenceAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:5544:3: (otherlv_20= 'timestamp' ( (lv_timestamp_21_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==27) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalTracea.g:5545:4: otherlv_20= 'timestamp' ( (lv_timestamp_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getRuleEvidenceAccess().getTimestampKeyword_8_0());
                    			
                    // InternalTracea.g:5549:4: ( (lv_timestamp_21_0= ruleEString ) )
                    // InternalTracea.g:5550:5: (lv_timestamp_21_0= ruleEString )
                    {
                    // InternalTracea.g:5550:5: (lv_timestamp_21_0= ruleEString )
                    // InternalTracea.g:5551:6: lv_timestamp_21_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRuleEvidenceAccess().getTimestampEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_21_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_21_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getRuleEvidenceAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleEvidence"


    // $ANTLR start "entryRuleAnnotationEvidence"
    // InternalTracea.g:5577:1: entryRuleAnnotationEvidence returns [EObject current=null] : iv_ruleAnnotationEvidence= ruleAnnotationEvidence EOF ;
    public final EObject entryRuleAnnotationEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationEvidence = null;


        try {
            // InternalTracea.g:5577:59: (iv_ruleAnnotationEvidence= ruleAnnotationEvidence EOF )
            // InternalTracea.g:5578:2: iv_ruleAnnotationEvidence= ruleAnnotationEvidence EOF
            {
             newCompositeNode(grammarAccess.getAnnotationEvidenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationEvidence=ruleAnnotationEvidence();

            state._fsp--;

             current =iv_ruleAnnotationEvidence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationEvidence"


    // $ANTLR start "ruleAnnotationEvidence"
    // InternalTracea.g:5584:1: ruleAnnotationEvidence returns [EObject current=null] : ( () otherlv_1= 'AnnotationEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' ( (lv_content_5_0= ruleEString ) ) )? (otherlv_6= 'impactedElements' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'timestamp' ( (lv_timestamp_19_0= ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleAnnotationEvidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_content_5_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_19_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:5590:2: ( ( () otherlv_1= 'AnnotationEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' ( (lv_content_5_0= ruleEString ) ) )? (otherlv_6= 'impactedElements' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'timestamp' ( (lv_timestamp_19_0= ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalTracea.g:5591:2: ( () otherlv_1= 'AnnotationEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' ( (lv_content_5_0= ruleEString ) ) )? (otherlv_6= 'impactedElements' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'timestamp' ( (lv_timestamp_19_0= ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalTracea.g:5591:2: ( () otherlv_1= 'AnnotationEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' ( (lv_content_5_0= ruleEString ) ) )? (otherlv_6= 'impactedElements' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'timestamp' ( (lv_timestamp_19_0= ruleEString ) ) )? otherlv_20= '}' )
            // InternalTracea.g:5592:3: () otherlv_1= 'AnnotationEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' ( (lv_content_5_0= ruleEString ) ) )? (otherlv_6= 'impactedElements' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'timestamp' ( (lv_timestamp_19_0= ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalTracea.g:5592:3: ()
            // InternalTracea.g:5593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnnotationEvidenceAccess().getAnnotationEvidenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationEvidenceAccess().getAnnotationEvidenceKeyword_1());
            		
            // InternalTracea.g:5603:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:5604:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:5604:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:5605:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnnotationEvidenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationEvidenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getAnnotationEvidenceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:5626:3: (otherlv_4= 'content' ( (lv_content_5_0= ruleEString ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==76) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalTracea.g:5627:4: otherlv_4= 'content' ( (lv_content_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAnnotationEvidenceAccess().getContentKeyword_4_0());
                    			
                    // InternalTracea.g:5631:4: ( (lv_content_5_0= ruleEString ) )
                    // InternalTracea.g:5632:5: (lv_content_5_0= ruleEString )
                    {
                    // InternalTracea.g:5632:5: (lv_content_5_0= ruleEString )
                    // InternalTracea.g:5633:6: lv_content_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnnotationEvidenceAccess().getContentEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_content_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnnotationEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"content",
                    							lv_content_5_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:5651:3: (otherlv_6= 'impactedElements' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==71) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalTracea.g:5652:4: otherlv_6= 'impactedElements' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getAnnotationEvidenceAccess().getImpactedElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAnnotationEvidenceAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTracea.g:5660:4: ( ( ruleEString ) )
                    // InternalTracea.g:5661:5: ( ruleEString )
                    {
                    // InternalTracea.g:5661:5: ( ruleEString )
                    // InternalTracea.g:5662:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationEvidenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAnnotationEvidenceAccess().getImpactedElementsTrustableElementCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5676:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==14) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // InternalTracea.g:5677:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAnnotationEvidenceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:5681:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:5682:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:5682:6: ( ruleEString )
                    	    // InternalTracea.g:5683:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAnnotationEvidenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAnnotationEvidenceAccess().getImpactedElementsTrustableElementCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop150;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getAnnotationEvidenceAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:5703:3: (otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==20) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalTracea.g:5704:4: otherlv_12= 'referees' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getAnnotationEvidenceAccess().getRefereesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getAnnotationEvidenceAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTracea.g:5712:4: ( ( ruleEString ) )
                    // InternalTracea.g:5713:5: ( ruleEString )
                    {
                    // InternalTracea.g:5713:5: ( ruleEString )
                    // InternalTracea.g:5714:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationEvidenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAnnotationEvidenceAccess().getRefereesRefereeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5728:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==14) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // InternalTracea.g:5729:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAnnotationEvidenceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTracea.g:5733:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:5734:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:5734:6: ( ruleEString )
                    	    // InternalTracea.g:5735:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAnnotationEvidenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAnnotationEvidenceAccess().getRefereesRefereeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop152;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getAnnotationEvidenceAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:5755:3: (otherlv_18= 'timestamp' ( (lv_timestamp_19_0= ruleEString ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==27) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalTracea.g:5756:4: otherlv_18= 'timestamp' ( (lv_timestamp_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getAnnotationEvidenceAccess().getTimestampKeyword_7_0());
                    			
                    // InternalTracea.g:5760:4: ( (lv_timestamp_19_0= ruleEString ) )
                    // InternalTracea.g:5761:5: (lv_timestamp_19_0= ruleEString )
                    {
                    // InternalTracea.g:5761:5: (lv_timestamp_19_0= ruleEString )
                    // InternalTracea.g:5762:6: lv_timestamp_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAnnotationEvidenceAccess().getTimestampEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnnotationEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_19_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getAnnotationEvidenceAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationEvidence"


    // $ANTLR start "entryRuleAIEvidence"
    // InternalTracea.g:5788:1: entryRuleAIEvidence returns [EObject current=null] : iv_ruleAIEvidence= ruleAIEvidence EOF ;
    public final EObject entryRuleAIEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIEvidence = null;


        try {
            // InternalTracea.g:5788:51: (iv_ruleAIEvidence= ruleAIEvidence EOF )
            // InternalTracea.g:5789:2: iv_ruleAIEvidence= ruleAIEvidence EOF
            {
             newCompositeNode(grammarAccess.getAIEvidenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIEvidence=ruleAIEvidence();

            state._fsp--;

             current =iv_ruleAIEvidence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIEvidence"


    // $ANTLR start "ruleAIEvidence"
    // InternalTracea.g:5795:1: ruleAIEvidence returns [EObject current=null] : ( () otherlv_1= 'AIEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithmUsed' ( (lv_algorithmUsed_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'executionDate' ( (lv_executionDate_13_0= ruleEString ) ) )? (otherlv_14= 'results' ( (lv_precision_15_0= ruleEDouble ) ) ( (lv_recall_16_0= ruleEDouble ) ) )? (otherlv_17= 'impactedElements' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'referees' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'timestamp' ( (lv_timestamp_30_0= ruleEString ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleAIEvidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_algorithmUsed_5_0 = null;

        AntlrDatatypeRuleToken lv_parameters_8_0 = null;

        AntlrDatatypeRuleToken lv_parameters_10_0 = null;

        AntlrDatatypeRuleToken lv_executionDate_13_0 = null;

        AntlrDatatypeRuleToken lv_precision_15_0 = null;

        AntlrDatatypeRuleToken lv_recall_16_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_30_0 = null;



        	enterRule();

        try {
            // InternalTracea.g:5801:2: ( ( () otherlv_1= 'AIEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithmUsed' ( (lv_algorithmUsed_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'executionDate' ( (lv_executionDate_13_0= ruleEString ) ) )? (otherlv_14= 'results' ( (lv_precision_15_0= ruleEDouble ) ) ( (lv_recall_16_0= ruleEDouble ) ) )? (otherlv_17= 'impactedElements' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'referees' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'timestamp' ( (lv_timestamp_30_0= ruleEString ) ) )? otherlv_31= '}' ) )
            // InternalTracea.g:5802:2: ( () otherlv_1= 'AIEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithmUsed' ( (lv_algorithmUsed_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'executionDate' ( (lv_executionDate_13_0= ruleEString ) ) )? (otherlv_14= 'results' ( (lv_precision_15_0= ruleEDouble ) ) ( (lv_recall_16_0= ruleEDouble ) ) )? (otherlv_17= 'impactedElements' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'referees' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'timestamp' ( (lv_timestamp_30_0= ruleEString ) ) )? otherlv_31= '}' )
            {
            // InternalTracea.g:5802:2: ( () otherlv_1= 'AIEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithmUsed' ( (lv_algorithmUsed_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'executionDate' ( (lv_executionDate_13_0= ruleEString ) ) )? (otherlv_14= 'results' ( (lv_precision_15_0= ruleEDouble ) ) ( (lv_recall_16_0= ruleEDouble ) ) )? (otherlv_17= 'impactedElements' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'referees' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'timestamp' ( (lv_timestamp_30_0= ruleEString ) ) )? otherlv_31= '}' )
            // InternalTracea.g:5803:3: () otherlv_1= 'AIEvidence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithmUsed' ( (lv_algorithmUsed_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'executionDate' ( (lv_executionDate_13_0= ruleEString ) ) )? (otherlv_14= 'results' ( (lv_precision_15_0= ruleEDouble ) ) ( (lv_recall_16_0= ruleEDouble ) ) )? (otherlv_17= 'impactedElements' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'referees' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'timestamp' ( (lv_timestamp_30_0= ruleEString ) ) )? otherlv_31= '}'
            {
            // InternalTracea.g:5803:3: ()
            // InternalTracea.g:5804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAIEvidenceAccess().getAIEvidenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAIEvidenceAccess().getAIEvidenceKeyword_1());
            		
            // InternalTracea.g:5814:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTracea.g:5815:4: (lv_name_2_0= ruleEString )
            {
            // InternalTracea.g:5815:4: (lv_name_2_0= ruleEString )
            // InternalTracea.g:5816:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAIEvidenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uoc.som.tracea.Tracea.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getAIEvidenceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTracea.g:5837:3: (otherlv_4= 'algorithmUsed' ( (lv_algorithmUsed_5_0= ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==78) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalTracea.g:5838:4: otherlv_4= 'algorithmUsed' ( (lv_algorithmUsed_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAIEvidenceAccess().getAlgorithmUsedKeyword_4_0());
                    			
                    // InternalTracea.g:5842:4: ( (lv_algorithmUsed_5_0= ruleEString ) )
                    // InternalTracea.g:5843:5: (lv_algorithmUsed_5_0= ruleEString )
                    {
                    // InternalTracea.g:5843:5: (lv_algorithmUsed_5_0= ruleEString )
                    // InternalTracea.g:5844:6: lv_algorithmUsed_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getAlgorithmUsedEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_algorithmUsed_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"algorithmUsed",
                    							lv_algorithmUsed_5_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:5862:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==79) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalTracea.g:5863:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAIEvidenceAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAIEvidenceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTracea.g:5871:4: ( (lv_parameters_8_0= ruleEString ) )
                    // InternalTracea.g:5872:5: (lv_parameters_8_0= ruleEString )
                    {
                    // InternalTracea.g:5872:5: (lv_parameters_8_0= ruleEString )
                    // InternalTracea.g:5873:6: lv_parameters_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getParametersEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameters_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_8_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5890:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==14) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalTracea.g:5891:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAIEvidenceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTracea.g:5895:5: ( (lv_parameters_10_0= ruleEString ) )
                    	    // InternalTracea.g:5896:6: (lv_parameters_10_0= ruleEString )
                    	    {
                    	    // InternalTracea.g:5896:6: (lv_parameters_10_0= ruleEString )
                    	    // InternalTracea.g:5897:7: lv_parameters_10_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getAIEvidenceAccess().getParametersEStringParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameters_10_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_10_0,
                    	    								"uoc.som.tracea.Tracea.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_65); 

                    				newLeafNode(otherlv_11, grammarAccess.getAIEvidenceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:5920:3: (otherlv_12= 'executionDate' ( (lv_executionDate_13_0= ruleEString ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==74) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalTracea.g:5921:4: otherlv_12= 'executionDate' ( (lv_executionDate_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getAIEvidenceAccess().getExecutionDateKeyword_6_0());
                    			
                    // InternalTracea.g:5925:4: ( (lv_executionDate_13_0= ruleEString ) )
                    // InternalTracea.g:5926:5: (lv_executionDate_13_0= ruleEString )
                    {
                    // InternalTracea.g:5926:5: (lv_executionDate_13_0= ruleEString )
                    // InternalTracea.g:5927:6: lv_executionDate_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getExecutionDateEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_executionDate_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"executionDate",
                    							lv_executionDate_13_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:5945:3: (otherlv_14= 'results' ( (lv_precision_15_0= ruleEDouble ) ) ( (lv_recall_16_0= ruleEDouble ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==80) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalTracea.g:5946:4: otherlv_14= 'results' ( (lv_precision_15_0= ruleEDouble ) ) ( (lv_recall_16_0= ruleEDouble ) )
                    {
                    otherlv_14=(Token)match(input,80,FOLLOW_67); 

                    				newLeafNode(otherlv_14, grammarAccess.getAIEvidenceAccess().getResultsKeyword_7_0());
                    			
                    // InternalTracea.g:5950:4: ( (lv_precision_15_0= ruleEDouble ) )
                    // InternalTracea.g:5951:5: (lv_precision_15_0= ruleEDouble )
                    {
                    // InternalTracea.g:5951:5: (lv_precision_15_0= ruleEDouble )
                    // InternalTracea.g:5952:6: lv_precision_15_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getPrecisionEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_precision_15_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"precision",
                    							lv_precision_15_0,
                    							"uoc.som.tracea.Tracea.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:5969:4: ( (lv_recall_16_0= ruleEDouble ) )
                    // InternalTracea.g:5970:5: (lv_recall_16_0= ruleEDouble )
                    {
                    // InternalTracea.g:5970:5: (lv_recall_16_0= ruleEDouble )
                    // InternalTracea.g:5971:6: lv_recall_16_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getRecallEDoubleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_recall_16_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"recall",
                    							lv_recall_16_0,
                    							"uoc.som.tracea.Tracea.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTracea.g:5989:3: (otherlv_17= 'impactedElements' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==71) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalTracea.g:5990:4: otherlv_17= 'impactedElements' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,71,FOLLOW_25); 

                    				newLeafNode(otherlv_17, grammarAccess.getAIEvidenceAccess().getImpactedElementsKeyword_8_0());
                    			
                    otherlv_18=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getAIEvidenceAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalTracea.g:5998:4: ( ( ruleEString ) )
                    // InternalTracea.g:5999:5: ( ruleEString )
                    {
                    // InternalTracea.g:5999:5: ( ruleEString )
                    // InternalTracea.g:6000:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAIEvidenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getImpactedElementsTrustableElementCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:6014:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==14) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // InternalTracea.g:6015:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getAIEvidenceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalTracea.g:6019:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:6020:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:6020:6: ( ruleEString )
                    	    // InternalTracea.g:6021:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAIEvidenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAIEvidenceAccess().getImpactedElementsTrustableElementCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_22, grammarAccess.getAIEvidenceAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:6041:3: (otherlv_23= 'referees' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==20) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalTracea.g:6042:4: otherlv_23= 'referees' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')'
                    {
                    otherlv_23=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_23, grammarAccess.getAIEvidenceAccess().getRefereesKeyword_9_0());
                    			
                    otherlv_24=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getAIEvidenceAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalTracea.g:6050:4: ( ( ruleEString ) )
                    // InternalTracea.g:6051:5: ( ruleEString )
                    {
                    // InternalTracea.g:6051:5: ( ruleEString )
                    // InternalTracea.g:6052:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAIEvidenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getRefereesRefereeCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTracea.g:6066:4: (otherlv_26= ',' ( ( ruleEString ) ) )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==14) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // InternalTracea.g:6067:5: otherlv_26= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getAIEvidenceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalTracea.g:6071:5: ( ( ruleEString ) )
                    	    // InternalTracea.g:6072:6: ( ruleEString )
                    	    {
                    	    // InternalTracea.g:6072:6: ( ruleEString )
                    	    // InternalTracea.g:6073:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAIEvidenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAIEvidenceAccess().getRefereesRefereeCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_28, grammarAccess.getAIEvidenceAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalTracea.g:6093:3: (otherlv_29= 'timestamp' ( (lv_timestamp_30_0= ruleEString ) ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==27) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalTracea.g:6094:4: otherlv_29= 'timestamp' ( (lv_timestamp_30_0= ruleEString ) )
                    {
                    otherlv_29=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getAIEvidenceAccess().getTimestampKeyword_10_0());
                    			
                    // InternalTracea.g:6098:4: ( (lv_timestamp_30_0= ruleEString ) )
                    // InternalTracea.g:6099:5: (lv_timestamp_30_0= ruleEString )
                    {
                    // InternalTracea.g:6099:5: (lv_timestamp_30_0= ruleEString )
                    // InternalTracea.g:6100:6: lv_timestamp_30_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAIEvidenceAccess().getTimestampEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_timestamp_30_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIEvidenceRule());
                    						}
                    						set(
                    							current,
                    							"timestamp",
                    							lv_timestamp_30_0,
                    							"uoc.som.tracea.Tracea.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getAIEvidenceAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAIEvidence"


    // $ANTLR start "entryRuleEInt"
    // InternalTracea.g:6126:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTracea.g:6126:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTracea.g:6127:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTracea.g:6133:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTracea.g:6139:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTracea.g:6140:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTracea.g:6140:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTracea.g:6141:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTracea.g:6141:3: (kw= '-' )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==81) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalTracea.g:6142:4: kw= '-'
                    {
                    kw=(Token)match(input,81,FOLLOW_68); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalTracea.g:6159:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTracea.g:6159:47: (iv_ruleEString= ruleEString EOF )
            // InternalTracea.g:6160:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTracea.g:6166:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTracea.g:6172:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTracea.g:6173:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTracea.g:6173:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==RULE_STRING) ) {
                alt166=1;
            }
            else if ( (LA166_0==RULE_ID) ) {
                alt166=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }
            switch (alt166) {
                case 1 :
                    // InternalTracea.g:6174:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTracea.g:6182:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalTracea.g:6193:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalTracea.g:6193:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalTracea.g:6194:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTracea.g:6200:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTracea.g:6206:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTracea.g:6207:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTracea.g:6207:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTracea.g:6208:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTracea.g:6208:3: (kw= '-' )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==81) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalTracea.g:6209:4: kw= '-'
                    {
                    kw=(Token)match(input,81,FOLLOW_69); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTracea.g:6215:3: (this_INT_1= RULE_INT )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==RULE_INT) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalTracea.g:6216:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_70); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,82,FOLLOW_68); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_71); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTracea.g:6236:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( ((LA171_0>=83 && LA171_0<=84)) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalTracea.g:6237:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTracea.g:6237:4: (kw= 'E' | kw= 'e' )
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==83) ) {
                        alt169=1;
                    }
                    else if ( (LA169_0==84) ) {
                        alt169=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 169, 0, input);

                        throw nvae;
                    }
                    switch (alt169) {
                        case 1 :
                            // InternalTracea.g:6238:5: kw= 'E'
                            {
                            kw=(Token)match(input,83,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTracea.g:6244:5: kw= 'e'
                            {
                            kw=(Token)match(input,84,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTracea.g:6250:4: (kw= '-' )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==81) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // InternalTracea.g:6251:5: kw= '-'
                            {
                            kw=(Token)match(input,81,FOLLOW_68); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xFC00000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002002600000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0298510800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002940L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000009D8C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000998C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000990C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000009108000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008108000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000068588000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000048588000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008588000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008188000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000168588000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000148588000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000108588000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008148000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001008108000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C008148000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008008148000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008008108000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000E1008108000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C1008108000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000C0008108000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080008108000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200008108000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001801008108000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001800008108000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000008108000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000008148000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000008108000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0061800008108000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0041800008108000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0041000008108000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000008108000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0101801008108000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0101800008108000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0101000008108000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000008108000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000008108000L,0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000008108000L,0x0000000000000680L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000008108000L,0x0000000000000480L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000008108000L,0x0000000000001080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000008108000L,0x000000000001C480L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000008108000L,0x0000000000018480L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000008108000L,0x0000000000010480L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000008108000L,0x0000000000010080L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000010L,0x0000000000060000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000010L,0x0000000000040000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});

}