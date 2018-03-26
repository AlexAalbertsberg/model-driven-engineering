package org.xtext.ps3.school.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ps3.school.services.SchooldslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchooldslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SchoolDatabase'", "'{'", "'school'", "'queries'", "','", "'}'", "'faculties'", "'coursesofstudy'", "'courses'", "'students'", "'teachers'", "'Query'", "'where'", "'Faculty'", "'('", "')'", "'CourseOfStudy'", "'faculty'", "'Course'", "'courseNumber'", "'enrolledStudents'", "'taughtBy'", "'courseresults'", "'Student'", "'studentNumber'", "'enrolledIn'", "'courseofstudy'", "'Teacher'", "'teaches'", "'CourseResult'", "'grade'", "'student'", "'-'", "'and'", "'or'", "'School'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSchooldslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSchooldslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSchooldslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g"; }



     	private SchooldslGrammarAccess grammarAccess;
     	
        public InternalSchooldslParser(TokenStream input, SchooldslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SchoolDatabase";	
       	}
       	
       	@Override
       	protected SchooldslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSchoolDatabase"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:68:1: entryRuleSchoolDatabase returns [EObject current=null] : iv_ruleSchoolDatabase= ruleSchoolDatabase EOF ;
    public final EObject entryRuleSchoolDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchoolDatabase = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:69:2: (iv_ruleSchoolDatabase= ruleSchoolDatabase EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:70:2: iv_ruleSchoolDatabase= ruleSchoolDatabase EOF
            {
             newCompositeNode(grammarAccess.getSchoolDatabaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchoolDatabase_in_entryRuleSchoolDatabase75);
            iv_ruleSchoolDatabase=ruleSchoolDatabase();

            state._fsp--;

             current =iv_ruleSchoolDatabase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSchoolDatabase85); 

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
    // $ANTLR end "entryRuleSchoolDatabase"


    // $ANTLR start "ruleSchoolDatabase"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:77:1: ruleSchoolDatabase returns [EObject current=null] : (otherlv_0= 'SchoolDatabase' otherlv_1= '{' otherlv_2= 'school' ( (lv_school_3_0= ruleSchool ) ) (otherlv_4= 'queries' otherlv_5= '{' ( (lv_query_6_0= ruleQuery ) ) (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleSchoolDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_school_3_0 = null;

        EObject lv_query_6_0 = null;

        EObject lv_query_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:80:28: ( (otherlv_0= 'SchoolDatabase' otherlv_1= '{' otherlv_2= 'school' ( (lv_school_3_0= ruleSchool ) ) (otherlv_4= 'queries' otherlv_5= '{' ( (lv_query_6_0= ruleQuery ) ) (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:81:1: (otherlv_0= 'SchoolDatabase' otherlv_1= '{' otherlv_2= 'school' ( (lv_school_3_0= ruleSchool ) ) (otherlv_4= 'queries' otherlv_5= '{' ( (lv_query_6_0= ruleQuery ) ) (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:81:1: (otherlv_0= 'SchoolDatabase' otherlv_1= '{' otherlv_2= 'school' ( (lv_school_3_0= ruleSchool ) ) (otherlv_4= 'queries' otherlv_5= '{' ( (lv_query_6_0= ruleQuery ) ) (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:81:3: otherlv_0= 'SchoolDatabase' otherlv_1= '{' otherlv_2= 'school' ( (lv_school_3_0= ruleSchool ) ) (otherlv_4= 'queries' otherlv_5= '{' ( (lv_query_6_0= ruleQuery ) ) (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSchoolDatabase122); 

                	newLeafNode(otherlv_0, grammarAccess.getSchoolDatabaseAccess().getSchoolDatabaseKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchoolDatabase134); 

                	newLeafNode(otherlv_1, grammarAccess.getSchoolDatabaseAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSchoolDatabase146); 

                	newLeafNode(otherlv_2, grammarAccess.getSchoolDatabaseAccess().getSchoolKeyword_2());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:93:1: ( (lv_school_3_0= ruleSchool ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:94:1: (lv_school_3_0= ruleSchool )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:94:1: (lv_school_3_0= ruleSchool )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:95:3: lv_school_3_0= ruleSchool
            {
             
            	        newCompositeNode(grammarAccess.getSchoolDatabaseAccess().getSchoolSchoolParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSchool_in_ruleSchoolDatabase167);
            lv_school_3_0=ruleSchool();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchoolDatabaseRule());
            	        }
                   		set(
                   			current, 
                   			"school",
                    		lv_school_3_0, 
                    		"School");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:111:2: (otherlv_4= 'queries' otherlv_5= '{' ( (lv_query_6_0= ruleQuery ) ) (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:111:4: otherlv_4= 'queries' otherlv_5= '{' ( (lv_query_6_0= ruleQuery ) ) (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSchoolDatabase180); 

                        	newLeafNode(otherlv_4, grammarAccess.getSchoolDatabaseAccess().getQueriesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchoolDatabase192); 

                        	newLeafNode(otherlv_5, grammarAccess.getSchoolDatabaseAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:119:1: ( (lv_query_6_0= ruleQuery ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:120:1: (lv_query_6_0= ruleQuery )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:120:1: (lv_query_6_0= ruleQuery )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:121:3: lv_query_6_0= ruleQuery
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchoolDatabaseAccess().getQueryQueryParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuery_in_ruleSchoolDatabase213);
                    lv_query_6_0=ruleQuery();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchoolDatabaseRule());
                    	        }
                           		add(
                           			current, 
                           			"query",
                            		lv_query_6_0, 
                            		"Query");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:137:2: (otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:137:4: otherlv_7= ',' ( (lv_query_8_0= ruleQuery ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSchoolDatabase226); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSchoolDatabaseAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:141:1: ( (lv_query_8_0= ruleQuery ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:142:1: (lv_query_8_0= ruleQuery )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:142:1: (lv_query_8_0= ruleQuery )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:143:3: lv_query_8_0= ruleQuery
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSchoolDatabaseAccess().getQueryQueryParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuery_in_ruleSchoolDatabase247);
                    	    lv_query_8_0=ruleQuery();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSchoolDatabaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"query",
                    	            		lv_query_8_0, 
                    	            		"Query");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchoolDatabase261); 

                        	newLeafNode(otherlv_9, grammarAccess.getSchoolDatabaseAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchoolDatabase275); 

                	newLeafNode(otherlv_10, grammarAccess.getSchoolDatabaseAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSchoolDatabase"


    // $ANTLR start "entryRuleSchool"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:175:1: entryRuleSchool returns [EObject current=null] : iv_ruleSchool= ruleSchool EOF ;
    public final EObject entryRuleSchool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchool = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:176:2: (iv_ruleSchool= ruleSchool EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:177:2: iv_ruleSchool= ruleSchool EOF
            {
             newCompositeNode(grammarAccess.getSchoolRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchool_in_entryRuleSchool311);
            iv_ruleSchool=ruleSchool();

            state._fsp--;

             current =iv_ruleSchool; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSchool321); 

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
    // $ANTLR end "entryRuleSchool"


    // $ANTLR start "ruleSchool"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:184:1: ruleSchool returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'faculties' otherlv_4= '{' ( (lv_faculty_5_0= ruleFaculty ) ) (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )* otherlv_8= '}' )? (otherlv_9= 'coursesofstudy' otherlv_10= '{' ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) ) (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )* otherlv_14= '}' )? (otherlv_15= 'courses' otherlv_16= '{' ( (lv_course_17_0= ruleCourse ) ) (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )* otherlv_20= '}' )? (otherlv_21= 'students' otherlv_22= '{' ( (lv_student_23_0= ruleStudent ) ) (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )* otherlv_26= '}' )? (otherlv_27= 'teachers' otherlv_28= '{' ( (lv_teacher_29_0= ruleTeacher ) ) (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
    public final EObject ruleSchool() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_faculty_5_0 = null;

        EObject lv_faculty_7_0 = null;

        EObject lv_courseofstudy_11_0 = null;

        EObject lv_courseofstudy_13_0 = null;

        EObject lv_course_17_0 = null;

        EObject lv_course_19_0 = null;

        EObject lv_student_23_0 = null;

        EObject lv_student_25_0 = null;

        EObject lv_teacher_29_0 = null;

        EObject lv_teacher_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:187:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'faculties' otherlv_4= '{' ( (lv_faculty_5_0= ruleFaculty ) ) (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )* otherlv_8= '}' )? (otherlv_9= 'coursesofstudy' otherlv_10= '{' ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) ) (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )* otherlv_14= '}' )? (otherlv_15= 'courses' otherlv_16= '{' ( (lv_course_17_0= ruleCourse ) ) (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )* otherlv_20= '}' )? (otherlv_21= 'students' otherlv_22= '{' ( (lv_student_23_0= ruleStudent ) ) (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )* otherlv_26= '}' )? (otherlv_27= 'teachers' otherlv_28= '{' ( (lv_teacher_29_0= ruleTeacher ) ) (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:188:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'faculties' otherlv_4= '{' ( (lv_faculty_5_0= ruleFaculty ) ) (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )* otherlv_8= '}' )? (otherlv_9= 'coursesofstudy' otherlv_10= '{' ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) ) (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )* otherlv_14= '}' )? (otherlv_15= 'courses' otherlv_16= '{' ( (lv_course_17_0= ruleCourse ) ) (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )* otherlv_20= '}' )? (otherlv_21= 'students' otherlv_22= '{' ( (lv_student_23_0= ruleStudent ) ) (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )* otherlv_26= '}' )? (otherlv_27= 'teachers' otherlv_28= '{' ( (lv_teacher_29_0= ruleTeacher ) ) (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:188:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'faculties' otherlv_4= '{' ( (lv_faculty_5_0= ruleFaculty ) ) (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )* otherlv_8= '}' )? (otherlv_9= 'coursesofstudy' otherlv_10= '{' ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) ) (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )* otherlv_14= '}' )? (otherlv_15= 'courses' otherlv_16= '{' ( (lv_course_17_0= ruleCourse ) ) (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )* otherlv_20= '}' )? (otherlv_21= 'students' otherlv_22= '{' ( (lv_student_23_0= ruleStudent ) ) (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )* otherlv_26= '}' )? (otherlv_27= 'teachers' otherlv_28= '{' ( (lv_teacher_29_0= ruleTeacher ) ) (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:188:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'faculties' otherlv_4= '{' ( (lv_faculty_5_0= ruleFaculty ) ) (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )* otherlv_8= '}' )? (otherlv_9= 'coursesofstudy' otherlv_10= '{' ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) ) (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )* otherlv_14= '}' )? (otherlv_15= 'courses' otherlv_16= '{' ( (lv_course_17_0= ruleCourse ) ) (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )* otherlv_20= '}' )? (otherlv_21= 'students' otherlv_22= '{' ( (lv_student_23_0= ruleStudent ) ) (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )* otherlv_26= '}' )? (otherlv_27= 'teachers' otherlv_28= '{' ( (lv_teacher_29_0= ruleTeacher ) ) (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:188:2: ()
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:189:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSchoolAccess().getSchoolAction_0(),
                        current);
                

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:194:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:195:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:195:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:196:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSchoolAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSchool376);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchoolRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchool388); 

                	newLeafNode(otherlv_2, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:216:1: (otherlv_3= 'faculties' otherlv_4= '{' ( (lv_faculty_5_0= ruleFaculty ) ) (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )* otherlv_8= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:216:3: otherlv_3= 'faculties' otherlv_4= '{' ( (lv_faculty_5_0= ruleFaculty ) ) (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSchool401); 

                        	newLeafNode(otherlv_3, grammarAccess.getSchoolAccess().getFacultiesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchool413); 

                        	newLeafNode(otherlv_4, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:224:1: ( (lv_faculty_5_0= ruleFaculty ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:225:1: (lv_faculty_5_0= ruleFaculty )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:225:1: (lv_faculty_5_0= ruleFaculty )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:226:3: lv_faculty_5_0= ruleFaculty
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchoolAccess().getFacultyFacultyParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFaculty_in_ruleSchool434);
                    lv_faculty_5_0=ruleFaculty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	        }
                           		add(
                           			current, 
                           			"faculty",
                            		lv_faculty_5_0, 
                            		"Faculty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:242:2: (otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:242:4: otherlv_6= ',' ( (lv_faculty_7_0= ruleFaculty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSchool447); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSchoolAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:246:1: ( (lv_faculty_7_0= ruleFaculty ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:247:1: (lv_faculty_7_0= ruleFaculty )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:247:1: (lv_faculty_7_0= ruleFaculty )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:248:3: lv_faculty_7_0= ruleFaculty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSchoolAccess().getFacultyFacultyParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFaculty_in_ruleSchool468);
                    	    lv_faculty_7_0=ruleFaculty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"faculty",
                    	            		lv_faculty_7_0, 
                    	            		"Faculty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchool482); 

                        	newLeafNode(otherlv_8, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:268:3: (otherlv_9= 'coursesofstudy' otherlv_10= '{' ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) ) (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )* otherlv_14= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:268:5: otherlv_9= 'coursesofstudy' otherlv_10= '{' ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) ) (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSchool497); 

                        	newLeafNode(otherlv_9, grammarAccess.getSchoolAccess().getCoursesofstudyKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchool509); 

                        	newLeafNode(otherlv_10, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:276:1: ( (lv_courseofstudy_11_0= ruleCourseOfStudy ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:277:1: (lv_courseofstudy_11_0= ruleCourseOfStudy )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:277:1: (lv_courseofstudy_11_0= ruleCourseOfStudy )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:278:3: lv_courseofstudy_11_0= ruleCourseOfStudy
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchoolAccess().getCourseofstudyCourseOfStudyParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCourseOfStudy_in_ruleSchool530);
                    lv_courseofstudy_11_0=ruleCourseOfStudy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	        }
                           		add(
                           			current, 
                           			"courseofstudy",
                            		lv_courseofstudy_11_0, 
                            		"CourseOfStudy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:294:2: (otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:294:4: otherlv_12= ',' ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSchool543); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSchoolAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:298:1: ( (lv_courseofstudy_13_0= ruleCourseOfStudy ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:299:1: (lv_courseofstudy_13_0= ruleCourseOfStudy )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:299:1: (lv_courseofstudy_13_0= ruleCourseOfStudy )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:300:3: lv_courseofstudy_13_0= ruleCourseOfStudy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSchoolAccess().getCourseofstudyCourseOfStudyParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCourseOfStudy_in_ruleSchool564);
                    	    lv_courseofstudy_13_0=ruleCourseOfStudy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"courseofstudy",
                    	            		lv_courseofstudy_13_0, 
                    	            		"CourseOfStudy");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchool578); 

                        	newLeafNode(otherlv_14, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:320:3: (otherlv_15= 'courses' otherlv_16= '{' ( (lv_course_17_0= ruleCourse ) ) (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )* otherlv_20= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:320:5: otherlv_15= 'courses' otherlv_16= '{' ( (lv_course_17_0= ruleCourse ) ) (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSchool593); 

                        	newLeafNode(otherlv_15, grammarAccess.getSchoolAccess().getCoursesKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchool605); 

                        	newLeafNode(otherlv_16, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:328:1: ( (lv_course_17_0= ruleCourse ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:329:1: (lv_course_17_0= ruleCourse )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:329:1: (lv_course_17_0= ruleCourse )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:330:3: lv_course_17_0= ruleCourse
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchoolAccess().getCourseCourseParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCourse_in_ruleSchool626);
                    lv_course_17_0=ruleCourse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	        }
                           		add(
                           			current, 
                           			"course",
                            		lv_course_17_0, 
                            		"Course");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:346:2: (otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:346:4: otherlv_18= ',' ( (lv_course_19_0= ruleCourse ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSchool639); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSchoolAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:350:1: ( (lv_course_19_0= ruleCourse ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:351:1: (lv_course_19_0= ruleCourse )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:351:1: (lv_course_19_0= ruleCourse )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:352:3: lv_course_19_0= ruleCourse
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSchoolAccess().getCourseCourseParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCourse_in_ruleSchool660);
                    	    lv_course_19_0=ruleCourse();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"course",
                    	            		lv_course_19_0, 
                    	            		"Course");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchool674); 

                        	newLeafNode(otherlv_20, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:372:3: (otherlv_21= 'students' otherlv_22= '{' ( (lv_student_23_0= ruleStudent ) ) (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )* otherlv_26= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:372:5: otherlv_21= 'students' otherlv_22= '{' ( (lv_student_23_0= ruleStudent ) ) (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSchool689); 

                        	newLeafNode(otherlv_21, grammarAccess.getSchoolAccess().getStudentsKeyword_6_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchool701); 

                        	newLeafNode(otherlv_22, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:380:1: ( (lv_student_23_0= ruleStudent ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:381:1: (lv_student_23_0= ruleStudent )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:381:1: (lv_student_23_0= ruleStudent )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:382:3: lv_student_23_0= ruleStudent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchoolAccess().getStudentStudentParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStudent_in_ruleSchool722);
                    lv_student_23_0=ruleStudent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	        }
                           		add(
                           			current, 
                           			"student",
                            		lv_student_23_0, 
                            		"Student");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:398:2: (otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:398:4: otherlv_24= ',' ( (lv_student_25_0= ruleStudent ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSchool735); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getSchoolAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:402:1: ( (lv_student_25_0= ruleStudent ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:403:1: (lv_student_25_0= ruleStudent )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:403:1: (lv_student_25_0= ruleStudent )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:404:3: lv_student_25_0= ruleStudent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSchoolAccess().getStudentStudentParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStudent_in_ruleSchool756);
                    	    lv_student_25_0=ruleStudent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"student",
                    	            		lv_student_25_0, 
                    	            		"Student");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchool770); 

                        	newLeafNode(otherlv_26, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:424:3: (otherlv_27= 'teachers' otherlv_28= '{' ( (lv_teacher_29_0= ruleTeacher ) ) (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )* otherlv_32= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:424:5: otherlv_27= 'teachers' otherlv_28= '{' ( (lv_teacher_29_0= ruleTeacher ) ) (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSchool785); 

                        	newLeafNode(otherlv_27, grammarAccess.getSchoolAccess().getTeachersKeyword_7_0());
                        
                    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSchool797); 

                        	newLeafNode(otherlv_28, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:432:1: ( (lv_teacher_29_0= ruleTeacher ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:433:1: (lv_teacher_29_0= ruleTeacher )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:433:1: (lv_teacher_29_0= ruleTeacher )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:434:3: lv_teacher_29_0= ruleTeacher
                    {
                     
                    	        newCompositeNode(grammarAccess.getSchoolAccess().getTeacherTeacherParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTeacher_in_ruleSchool818);
                    lv_teacher_29_0=ruleTeacher();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	        }
                           		add(
                           			current, 
                           			"teacher",
                            		lv_teacher_29_0, 
                            		"Teacher");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:450:2: (otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:450:4: otherlv_30= ',' ( (lv_teacher_31_0= ruleTeacher ) )
                    	    {
                    	    otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSchool831); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getSchoolAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:454:1: ( (lv_teacher_31_0= ruleTeacher ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:455:1: (lv_teacher_31_0= ruleTeacher )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:455:1: (lv_teacher_31_0= ruleTeacher )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:456:3: lv_teacher_31_0= ruleTeacher
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSchoolAccess().getTeacherTeacherParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTeacher_in_ruleSchool852);
                    	    lv_teacher_31_0=ruleTeacher();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSchoolRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"teacher",
                    	            		lv_teacher_31_0, 
                    	            		"Teacher");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchool866); 

                        	newLeafNode(otherlv_32, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_33=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSchool880); 

                	newLeafNode(otherlv_33, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSchool"


    // $ANTLR start "entryRuleQuery"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:488:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:489:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:490:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuery_in_entryRuleQuery916);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuery926); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:497:1: ruleQuery returns [EObject current=null] : ( () otherlv_1= 'Query' otherlv_2= '{' ( (lv_type_3_0= ruleSchoolElement ) )? (otherlv_4= 'where' ( (lv_where_5_0= ruleWhere ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_where_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:500:28: ( ( () otherlv_1= 'Query' otherlv_2= '{' ( (lv_type_3_0= ruleSchoolElement ) )? (otherlv_4= 'where' ( (lv_where_5_0= ruleWhere ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:501:1: ( () otherlv_1= 'Query' otherlv_2= '{' ( (lv_type_3_0= ruleSchoolElement ) )? (otherlv_4= 'where' ( (lv_where_5_0= ruleWhere ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:501:1: ( () otherlv_1= 'Query' otherlv_2= '{' ( (lv_type_3_0= ruleSchoolElement ) )? (otherlv_4= 'where' ( (lv_where_5_0= ruleWhere ) ) )? otherlv_6= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:501:2: () otherlv_1= 'Query' otherlv_2= '{' ( (lv_type_3_0= ruleSchoolElement ) )? (otherlv_4= 'where' ( (lv_where_5_0= ruleWhere ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:501:2: ()
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:502:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQueryAccess().getQueryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleQuery972); 

                	newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getQueryKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuery984); 

                	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:515:1: ( (lv_type_3_0= ruleSchoolElement ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24||LA13_0==27||LA13_0==29||LA13_0==34||LA13_0==38||LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:516:1: (lv_type_3_0= ruleSchoolElement )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:516:1: (lv_type_3_0= ruleSchoolElement )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:517:3: lv_type_3_0= ruleSchoolElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getQueryAccess().getTypeSchoolElementEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSchoolElement_in_ruleQuery1005);
                    lv_type_3_0=ruleSchoolElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQueryRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"SchoolElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:533:3: (otherlv_4= 'where' ( (lv_where_5_0= ruleWhere ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:533:5: otherlv_4= 'where' ( (lv_where_5_0= ruleWhere ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleQuery1019); 

                        	newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getWhereKeyword_4_0());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:537:1: ( (lv_where_5_0= ruleWhere ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:538:1: (lv_where_5_0= ruleWhere )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:538:1: (lv_where_5_0= ruleWhere )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:539:3: lv_where_5_0= ruleWhere
                    {
                     
                    	        newCompositeNode(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWhere_in_ruleQuery1040);
                    lv_where_5_0=ruleWhere();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQueryRule());
                    	        }
                           		set(
                           			current, 
                           			"where",
                            		lv_where_5_0, 
                            		"Where");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuery1054); 

                	newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleFaculty"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:567:1: entryRuleFaculty returns [EObject current=null] : iv_ruleFaculty= ruleFaculty EOF ;
    public final EObject entryRuleFaculty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaculty = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:568:2: (iv_ruleFaculty= ruleFaculty EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:569:2: iv_ruleFaculty= ruleFaculty EOF
            {
             newCompositeNode(grammarAccess.getFacultyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFaculty_in_entryRuleFaculty1090);
            iv_ruleFaculty=ruleFaculty();

            state._fsp--;

             current =iv_ruleFaculty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFaculty1100); 

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
    // $ANTLR end "entryRuleFaculty"


    // $ANTLR start "ruleFaculty"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:576:1: ruleFaculty returns [EObject current=null] : ( () otherlv_1= 'Faculty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'coursesofstudy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleFaculty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:579:28: ( ( () otherlv_1= 'Faculty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'coursesofstudy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:580:1: ( () otherlv_1= 'Faculty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'coursesofstudy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:580:1: ( () otherlv_1= 'Faculty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'coursesofstudy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:580:2: () otherlv_1= 'Faculty' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'coursesofstudy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:580:2: ()
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:581:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFacultyAccess().getFacultyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFaculty1146); 

                	newLeafNode(otherlv_1, grammarAccess.getFacultyAccess().getFacultyKeyword_1());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:590:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:591:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:591:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:592:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFacultyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFaculty1167);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFacultyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFaculty1179); 

                	newLeafNode(otherlv_3, grammarAccess.getFacultyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:612:1: (otherlv_4= 'coursesofstudy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:612:3: otherlv_4= 'coursesofstudy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFaculty1192); 

                        	newLeafNode(otherlv_4, grammarAccess.getFacultyAccess().getCoursesofstudyKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFaculty1204); 

                        	newLeafNode(otherlv_5, grammarAccess.getFacultyAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:620:1: ( ( ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:621:1: ( ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:621:1: ( ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:622:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFacultyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFaculty1227);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:635:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:635:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFaculty1240); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFacultyAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:639:1: ( ( ruleEString ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:640:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:640:1: ( ruleEString )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:641:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFacultyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFaculty1263);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFaculty1277); 

                        	newLeafNode(otherlv_9, grammarAccess.getFacultyAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFaculty1291); 

                	newLeafNode(otherlv_10, grammarAccess.getFacultyAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFaculty"


    // $ANTLR start "entryRuleCourseOfStudy"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:670:1: entryRuleCourseOfStudy returns [EObject current=null] : iv_ruleCourseOfStudy= ruleCourseOfStudy EOF ;
    public final EObject entryRuleCourseOfStudy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourseOfStudy = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:671:2: (iv_ruleCourseOfStudy= ruleCourseOfStudy EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:672:2: iv_ruleCourseOfStudy= ruleCourseOfStudy EOF
            {
             newCompositeNode(grammarAccess.getCourseOfStudyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseOfStudy_in_entryRuleCourseOfStudy1327);
            iv_ruleCourseOfStudy=ruleCourseOfStudy();

            state._fsp--;

             current =iv_ruleCourseOfStudy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseOfStudy1337); 

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
    // $ANTLR end "entryRuleCourseOfStudy"


    // $ANTLR start "ruleCourseOfStudy"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:679:1: ruleCourseOfStudy returns [EObject current=null] : (otherlv_0= 'CourseOfStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courses' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'faculty' ( ( ruleEString ) ) (otherlv_11= 'students' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
    public final EObject ruleCourseOfStudy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:682:28: ( (otherlv_0= 'CourseOfStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courses' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'faculty' ( ( ruleEString ) ) (otherlv_11= 'students' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:683:1: (otherlv_0= 'CourseOfStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courses' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'faculty' ( ( ruleEString ) ) (otherlv_11= 'students' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:683:1: (otherlv_0= 'CourseOfStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courses' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'faculty' ( ( ruleEString ) ) (otherlv_11= 'students' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:683:3: otherlv_0= 'CourseOfStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courses' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'faculty' ( ( ruleEString ) ) (otherlv_11= 'students' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCourseOfStudy1374); 

                	newLeafNode(otherlv_0, grammarAccess.getCourseOfStudyAccess().getCourseOfStudyKeyword_0());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:687:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:688:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:688:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:689:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCourseOfStudyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseOfStudy1395);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCourseOfStudyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCourseOfStudy1407); 

                	newLeafNode(otherlv_2, grammarAccess.getCourseOfStudyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:709:1: (otherlv_3= 'courses' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:709:3: otherlv_3= 'courses' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCourseOfStudy1420); 

                        	newLeafNode(otherlv_3, grammarAccess.getCourseOfStudyAccess().getCoursesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCourseOfStudy1432); 

                        	newLeafNode(otherlv_4, grammarAccess.getCourseOfStudyAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:717:1: ( ( ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:718:1: ( ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:718:1: ( ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:719:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCourseOfStudyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCourseOfStudyAccess().getCourseCourseCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseOfStudy1455);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:732:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:732:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCourseOfStudy1468); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCourseOfStudyAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:736:1: ( ( ruleEString ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:737:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:737:1: ( ruleEString )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:738:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCourseOfStudyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCourseOfStudyAccess().getCourseCourseCrossReference_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseOfStudy1491);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCourseOfStudy1505); 

                        	newLeafNode(otherlv_8, grammarAccess.getCourseOfStudyAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCourseOfStudy1519); 

                	newLeafNode(otherlv_9, grammarAccess.getCourseOfStudyAccess().getFacultyKeyword_4());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:759:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:760:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:760:1: ( ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:761:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseOfStudyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCourseOfStudyAccess().getFacultyFacultyCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseOfStudy1542);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:774:2: (otherlv_11= 'students' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:774:4: otherlv_11= 'students' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCourseOfStudy1555); 

                        	newLeafNode(otherlv_11, grammarAccess.getCourseOfStudyAccess().getStudentsKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCourseOfStudy1567); 

                        	newLeafNode(otherlv_12, grammarAccess.getCourseOfStudyAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:782:1: ( ( ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:783:1: ( ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:783:1: ( ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:784:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCourseOfStudyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCourseOfStudyAccess().getStudentStudentCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseOfStudy1590);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:797:2: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:797:4: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCourseOfStudy1603); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getCourseOfStudyAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:801:1: ( ( ruleEString ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:802:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:802:1: ( ruleEString )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:803:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCourseOfStudyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCourseOfStudyAccess().getStudentStudentCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseOfStudy1626);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCourseOfStudy1640); 

                        	newLeafNode(otherlv_16, grammarAccess.getCourseOfStudyAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCourseOfStudy1654); 

                	newLeafNode(otherlv_17, grammarAccess.getCourseOfStudyAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleCourseOfStudy"


    // $ANTLR start "entryRuleCourse"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:832:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:833:2: (iv_ruleCourse= ruleCourse EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:834:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse1690);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse1700); 

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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:841:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courseNumber' ( (lv_courseNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledStudents' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'taughtBy' ( ( ruleEString ) ) (otherlv_13= 'courseresults' otherlv_14= '{' ( (lv_courseresult_15_0= ruleCourseResult ) ) (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_courseNumber_4_0 = null;

        EObject lv_courseresult_15_0 = null;

        EObject lv_courseresult_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:844:28: ( (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courseNumber' ( (lv_courseNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledStudents' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'taughtBy' ( ( ruleEString ) ) (otherlv_13= 'courseresults' otherlv_14= '{' ( (lv_courseresult_15_0= ruleCourseResult ) ) (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:845:1: (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courseNumber' ( (lv_courseNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledStudents' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'taughtBy' ( ( ruleEString ) ) (otherlv_13= 'courseresults' otherlv_14= '{' ( (lv_courseresult_15_0= ruleCourseResult ) ) (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:845:1: (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courseNumber' ( (lv_courseNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledStudents' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'taughtBy' ( ( ruleEString ) ) (otherlv_13= 'courseresults' otherlv_14= '{' ( (lv_courseresult_15_0= ruleCourseResult ) ) (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:845:3: otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'courseNumber' ( (lv_courseNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledStudents' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'taughtBy' ( ( ruleEString ) ) (otherlv_13= 'courseresults' otherlv_14= '{' ( (lv_courseresult_15_0= ruleCourseResult ) ) (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCourse1737); 

                	newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:849:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:850:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:850:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:851:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourse1758);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCourseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCourse1770); 

                	newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:871:1: (otherlv_3= 'courseNumber' ( (lv_courseNumber_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:871:3: otherlv_3= 'courseNumber' ( (lv_courseNumber_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCourse1783); 

                        	newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getCourseNumberKeyword_3_0());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:875:1: ( (lv_courseNumber_4_0= ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:876:1: (lv_courseNumber_4_0= ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:876:1: (lv_courseNumber_4_0= ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:877:3: lv_courseNumber_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCourseAccess().getCourseNumberEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourse1804);
                    lv_courseNumber_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCourseRule());
                    	        }
                           		set(
                           			current, 
                           			"courseNumber",
                            		lv_courseNumber_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:893:4: (otherlv_5= 'enrolledStudents' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:893:6: otherlv_5= 'enrolledStudents' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCourse1819); 

                        	newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getEnrolledStudentsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCourse1831); 

                        	newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:901:1: ( ( ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:902:1: ( ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:902:1: ( ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:903:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCourseRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCourseAccess().getEnrolledStudentStudentCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourse1854);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:916:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:916:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCourse1867); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:920:1: ( ( ruleEString ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:921:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:921:1: ( ruleEString )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:922:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCourseRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCourseAccess().getEnrolledStudentStudentCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourse1890);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCourse1904); 

                        	newLeafNode(otherlv_10, grammarAccess.getCourseAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCourse1918); 

                	newLeafNode(otherlv_11, grammarAccess.getCourseAccess().getTaughtByKeyword_5());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:943:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:944:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:944:1: ( ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:945:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCourseAccess().getTaughtByTeacherCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourse1941);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:958:2: (otherlv_13= 'courseresults' otherlv_14= '{' ( (lv_courseresult_15_0= ruleCourseResult ) ) (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )* otherlv_18= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:958:4: otherlv_13= 'courseresults' otherlv_14= '{' ( (lv_courseresult_15_0= ruleCourseResult ) ) (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCourse1954); 

                        	newLeafNode(otherlv_13, grammarAccess.getCourseAccess().getCourseresultsKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCourse1966); 

                        	newLeafNode(otherlv_14, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:966:1: ( (lv_courseresult_15_0= ruleCourseResult ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:967:1: (lv_courseresult_15_0= ruleCourseResult )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:967:1: (lv_courseresult_15_0= ruleCourseResult )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:968:3: lv_courseresult_15_0= ruleCourseResult
                    {
                     
                    	        newCompositeNode(grammarAccess.getCourseAccess().getCourseresultCourseResultParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCourseResult_in_ruleCourse1987);
                    lv_courseresult_15_0=ruleCourseResult();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCourseRule());
                    	        }
                           		add(
                           			current, 
                           			"courseresult",
                            		lv_courseresult_15_0, 
                            		"CourseResult");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:984:2: (otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:984:4: otherlv_16= ',' ( (lv_courseresult_17_0= ruleCourseResult ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCourse2000); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getCourseAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:988:1: ( (lv_courseresult_17_0= ruleCourseResult ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:989:1: (lv_courseresult_17_0= ruleCourseResult )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:989:1: (lv_courseresult_17_0= ruleCourseResult )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:990:3: lv_courseresult_17_0= ruleCourseResult
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCourseAccess().getCourseresultCourseResultParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCourseResult_in_ruleCourse2021);
                    	    lv_courseresult_17_0=ruleCourseResult();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCourseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"courseresult",
                    	            		lv_courseresult_17_0, 
                    	            		"CourseResult");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCourse2035); 

                        	newLeafNode(otherlv_18, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCourse2049); 

                	newLeafNode(otherlv_19, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleStudent"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1022:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1023:2: (iv_ruleStudent= ruleStudent EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1024:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStudent_in_entryRuleStudent2085);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStudent2095); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1031:1: ruleStudent returns [EObject current=null] : (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'studentNumber' ( (lv_studentNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledIn' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'courseofstudy' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_studentNumber_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1034:28: ( (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'studentNumber' ( (lv_studentNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledIn' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'courseofstudy' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1035:1: (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'studentNumber' ( (lv_studentNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledIn' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'courseofstudy' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1035:1: (otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'studentNumber' ( (lv_studentNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledIn' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'courseofstudy' ( ( ruleEString ) ) otherlv_13= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1035:3: otherlv_0= 'Student' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'studentNumber' ( (lv_studentNumber_4_0= ruleEString ) ) )? (otherlv_5= 'enrolledIn' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'courseofstudy' ( ( ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStudent2132); 

                	newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1039:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1040:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1040:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1041:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStudent2153);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStudentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStudent2165); 

                	newLeafNode(otherlv_2, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1061:1: (otherlv_3= 'studentNumber' ( (lv_studentNumber_4_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1061:3: otherlv_3= 'studentNumber' ( (lv_studentNumber_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStudent2178); 

                        	newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getStudentNumberKeyword_3_0());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1065:1: ( (lv_studentNumber_4_0= ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1066:1: (lv_studentNumber_4_0= ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1066:1: (lv_studentNumber_4_0= ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1067:3: lv_studentNumber_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStudentAccess().getStudentNumberEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStudent2199);
                    lv_studentNumber_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStudentRule());
                    	        }
                           		set(
                           			current, 
                           			"studentNumber",
                            		lv_studentNumber_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1083:4: (otherlv_5= 'enrolledIn' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1083:6: otherlv_5= 'enrolledIn' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStudent2214); 

                        	newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getEnrolledInKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStudent2226); 

                        	newLeafNode(otherlv_6, grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1091:1: ( ( ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1092:1: ( ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1092:1: ( ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1093:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStudentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStudentAccess().getEnrolledInCourseCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStudent2249);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1106:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1106:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStudent2262); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getStudentAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1110:1: ( ( ruleEString ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1111:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1111:1: ( ruleEString )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1112:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStudentRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStudentAccess().getEnrolledInCourseCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStudent2285);
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

                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStudent2299); 

                        	newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStudent2313); 

                	newLeafNode(otherlv_11, grammarAccess.getStudentAccess().getCourseofstudyKeyword_5());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1133:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1134:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1134:1: ( ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1135:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStudentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStudentAccess().getCourseofstudyCourseOfStudyCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStudent2336);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStudent2348); 

                	newLeafNode(otherlv_13, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleTeacher"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1160:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1161:2: (iv_ruleTeacher= ruleTeacher EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1162:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTeacher_in_entryRuleTeacher2384);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTeacher2394); 

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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1169:1: ruleTeacher returns [EObject current=null] : ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'teaches' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1172:28: ( ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'teaches' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1173:1: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'teaches' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1173:1: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'teaches' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1173:2: () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'teaches' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1173:2: ()
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1174:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTeacherAccess().getTeacherAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleTeacher2440); 

                	newLeafNode(otherlv_1, grammarAccess.getTeacherAccess().getTeacherKeyword_1());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1183:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1184:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1184:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1185:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTeacher2461);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTeacherRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTeacher2473); 

                	newLeafNode(otherlv_3, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1205:1: (otherlv_4= 'teaches' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1205:3: otherlv_4= 'teaches' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTeacher2486); 

                        	newLeafNode(otherlv_4, grammarAccess.getTeacherAccess().getTeachesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTeacher2498); 

                        	newLeafNode(otherlv_5, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1213:1: ( ( ruleEString ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1214:1: ( ruleEString )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1214:1: ( ruleEString )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1215:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTeacherRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTeacherAccess().getTeachesCourseCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTeacher2521);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1228:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1228:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTeacher2534); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1232:1: ( ( ruleEString ) )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1233:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1233:1: ( ruleEString )
                    	    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1234:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeacherRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTeacherAccess().getTeachesCourseCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTeacher2557);
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

                    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTeacher2571); 

                        	newLeafNode(otherlv_9, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTeacher2585); 

                	newLeafNode(otherlv_10, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1263:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1264:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1265:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2622);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2633); 

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
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1272:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1275:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1276:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1276:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1276:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2673); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1284:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2699); 

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


    // $ANTLR start "entryRuleCourseResult"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1299:1: entryRuleCourseResult returns [EObject current=null] : iv_ruleCourseResult= ruleCourseResult EOF ;
    public final EObject entryRuleCourseResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourseResult = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1300:2: (iv_ruleCourseResult= ruleCourseResult EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1301:2: iv_ruleCourseResult= ruleCourseResult EOF
            {
             newCompositeNode(grammarAccess.getCourseResultRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseResult_in_entryRuleCourseResult2744);
            iv_ruleCourseResult=ruleCourseResult();

            state._fsp--;

             current =iv_ruleCourseResult; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseResult2754); 

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
    // $ANTLR end "entryRuleCourseResult"


    // $ANTLR start "ruleCourseResult"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1308:1: ruleCourseResult returns [EObject current=null] : (otherlv_0= 'CourseResult' otherlv_1= '{' (otherlv_2= 'grade' ( (lv_grade_3_0= ruleEBigInteger ) ) )? otherlv_4= 'student' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleCourseResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_grade_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1311:28: ( (otherlv_0= 'CourseResult' otherlv_1= '{' (otherlv_2= 'grade' ( (lv_grade_3_0= ruleEBigInteger ) ) )? otherlv_4= 'student' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1312:1: (otherlv_0= 'CourseResult' otherlv_1= '{' (otherlv_2= 'grade' ( (lv_grade_3_0= ruleEBigInteger ) ) )? otherlv_4= 'student' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1312:1: (otherlv_0= 'CourseResult' otherlv_1= '{' (otherlv_2= 'grade' ( (lv_grade_3_0= ruleEBigInteger ) ) )? otherlv_4= 'student' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1312:3: otherlv_0= 'CourseResult' otherlv_1= '{' (otherlv_2= 'grade' ( (lv_grade_3_0= ruleEBigInteger ) ) )? otherlv_4= 'student' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCourseResult2791); 

                	newLeafNode(otherlv_0, grammarAccess.getCourseResultAccess().getCourseResultKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCourseResult2803); 

                	newLeafNode(otherlv_1, grammarAccess.getCourseResultAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1320:1: (otherlv_2= 'grade' ( (lv_grade_3_0= ruleEBigInteger ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1320:3: otherlv_2= 'grade' ( (lv_grade_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCourseResult2816); 

                        	newLeafNode(otherlv_2, grammarAccess.getCourseResultAccess().getGradeKeyword_2_0());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1324:1: ( (lv_grade_3_0= ruleEBigInteger ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1325:1: (lv_grade_3_0= ruleEBigInteger )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1325:1: (lv_grade_3_0= ruleEBigInteger )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1326:3: lv_grade_3_0= ruleEBigInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getCourseResultAccess().getGradeEBigIntegerParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_ruleCourseResult2837);
                    lv_grade_3_0=ruleEBigInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCourseResultRule());
                    	        }
                           		set(
                           			current, 
                           			"grade",
                            		lv_grade_3_0, 
                            		"EBigInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCourseResult2851); 

                	newLeafNode(otherlv_4, grammarAccess.getCourseResultAccess().getStudentKeyword_3());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1346:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1347:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1347:1: ( ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1348:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseResultRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCourseResultAccess().getStudentStudentCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseResult2874);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCourseResult2886); 

                	newLeafNode(otherlv_6, grammarAccess.getCourseResultAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCourseResult"


    // $ANTLR start "entryRuleEBigInteger"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1373:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1374:2: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1375:2: iv_ruleEBigInteger= ruleEBigInteger EOF
            {
             newCompositeNode(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger2923);
            iv_ruleEBigInteger=ruleEBigInteger();

            state._fsp--;

             current =iv_ruleEBigInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigInteger2934); 

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
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1382:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1385:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1386:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1386:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1386:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1386:2: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1387:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEBigInteger2973); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEBigInteger2990); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "entryRuleWhere"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1407:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1408:2: (iv_ruleWhere= ruleWhere EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1409:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhere_in_entryRuleWhere3035);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhere3045); 

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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1416:1: ruleWhere returns [EObject current=null] : (otherlv_0= '{' ( (lv_booleanexpr_1_0= ruleBooleanExpr ) ) otherlv_2= '}' ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_booleanexpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1419:28: ( (otherlv_0= '{' ( (lv_booleanexpr_1_0= ruleBooleanExpr ) ) otherlv_2= '}' ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1420:1: (otherlv_0= '{' ( (lv_booleanexpr_1_0= ruleBooleanExpr ) ) otherlv_2= '}' )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1420:1: (otherlv_0= '{' ( (lv_booleanexpr_1_0= ruleBooleanExpr ) ) otherlv_2= '}' )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1420:3: otherlv_0= '{' ( (lv_booleanexpr_1_0= ruleBooleanExpr ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWhere3082); 

                	newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1424:1: ( (lv_booleanexpr_1_0= ruleBooleanExpr ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1425:1: (lv_booleanexpr_1_0= ruleBooleanExpr )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1425:1: (lv_booleanexpr_1_0= ruleBooleanExpr )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1426:3: lv_booleanexpr_1_0= ruleBooleanExpr
            {
             
            	        newCompositeNode(grammarAccess.getWhereAccess().getBooleanexprBooleanExprParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_ruleWhere3103);
            lv_booleanexpr_1_0=ruleBooleanExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhereRule());
            	        }
                   		set(
                   			current, 
                   			"booleanexpr",
                    		lv_booleanexpr_1_0, 
                    		"BooleanExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWhere3115); 

                	newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleBooleanExpr"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1454:1: entryRuleBooleanExpr returns [EObject current=null] : iv_ruleBooleanExpr= ruleBooleanExpr EOF ;
    public final EObject entryRuleBooleanExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpr = null;


        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1455:2: (iv_ruleBooleanExpr= ruleBooleanExpr EOF )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1456:2: iv_ruleBooleanExpr= ruleBooleanExpr EOF
            {
             newCompositeNode(grammarAccess.getBooleanExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_entryRuleBooleanExpr3151);
            iv_ruleBooleanExpr=ruleBooleanExpr();

            state._fsp--;

             current =iv_ruleBooleanExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpr3161); 

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
    // $ANTLR end "entryRuleBooleanExpr"


    // $ANTLR start "ruleBooleanExpr"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1463:1: ruleBooleanExpr returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleEString ) ) ( (lv_rhs_3_0= ruleEString ) ) (otherlv_4= 'and' ( (lv_and_5_0= ruleBooleanExpr ) ) )? (otherlv_6= 'or' ( (lv_or_7_0= ruleBooleanExpr ) ) )? ) ;
    public final EObject ruleBooleanExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_lhs_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_rhs_3_0 = null;

        EObject lv_and_5_0 = null;

        EObject lv_or_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1466:28: ( ( () ( (lv_lhs_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleEString ) ) ( (lv_rhs_3_0= ruleEString ) ) (otherlv_4= 'and' ( (lv_and_5_0= ruleBooleanExpr ) ) )? (otherlv_6= 'or' ( (lv_or_7_0= ruleBooleanExpr ) ) )? ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1467:1: ( () ( (lv_lhs_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleEString ) ) ( (lv_rhs_3_0= ruleEString ) ) (otherlv_4= 'and' ( (lv_and_5_0= ruleBooleanExpr ) ) )? (otherlv_6= 'or' ( (lv_or_7_0= ruleBooleanExpr ) ) )? )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1467:1: ( () ( (lv_lhs_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleEString ) ) ( (lv_rhs_3_0= ruleEString ) ) (otherlv_4= 'and' ( (lv_and_5_0= ruleBooleanExpr ) ) )? (otherlv_6= 'or' ( (lv_or_7_0= ruleBooleanExpr ) ) )? )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1467:2: () ( (lv_lhs_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleEString ) ) ( (lv_rhs_3_0= ruleEString ) ) (otherlv_4= 'and' ( (lv_and_5_0= ruleBooleanExpr ) ) )? (otherlv_6= 'or' ( (lv_or_7_0= ruleBooleanExpr ) ) )?
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1467:2: ()
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1468:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanExprAccess().getBooleanExprAction_0(),
                        current);
                

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1473:2: ( (lv_lhs_1_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1474:1: (lv_lhs_1_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1474:1: (lv_lhs_1_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1475:3: lv_lhs_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExprAccess().getLhsEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBooleanExpr3216);
            lv_lhs_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanExprRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1491:2: ( (lv_operator_2_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1492:1: (lv_operator_2_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1492:1: (lv_operator_2_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1493:3: lv_operator_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExprAccess().getOperatorEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBooleanExpr3237);
            lv_operator_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanExprRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1509:2: ( (lv_rhs_3_0= ruleEString ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1510:1: (lv_rhs_3_0= ruleEString )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1510:1: (lv_rhs_3_0= ruleEString )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1511:3: lv_rhs_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExprAccess().getRhsEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBooleanExpr3258);
            lv_rhs_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanExprRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1527:2: (otherlv_4= 'and' ( (lv_and_5_0= ruleBooleanExpr ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1527:4: otherlv_4= 'and' ( (lv_and_5_0= ruleBooleanExpr ) )
                    {
                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBooleanExpr3271); 

                        	newLeafNode(otherlv_4, grammarAccess.getBooleanExprAccess().getAndKeyword_4_0());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1531:1: ( (lv_and_5_0= ruleBooleanExpr ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1532:1: (lv_and_5_0= ruleBooleanExpr )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1532:1: (lv_and_5_0= ruleBooleanExpr )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1533:3: lv_and_5_0= ruleBooleanExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExprAccess().getAndBooleanExprParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_ruleBooleanExpr3292);
                    lv_and_5_0=ruleBooleanExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    	        }
                           		set(
                           			current, 
                           			"and",
                            		lv_and_5_0, 
                            		"BooleanExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1549:4: (otherlv_6= 'or' ( (lv_or_7_0= ruleBooleanExpr ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1549:6: otherlv_6= 'or' ( (lv_or_7_0= ruleBooleanExpr ) )
                    {
                    otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBooleanExpr3307); 

                        	newLeafNode(otherlv_6, grammarAccess.getBooleanExprAccess().getOrKeyword_5_0());
                        
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1553:1: ( (lv_or_7_0= ruleBooleanExpr ) )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1554:1: (lv_or_7_0= ruleBooleanExpr )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1554:1: (lv_or_7_0= ruleBooleanExpr )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1555:3: lv_or_7_0= ruleBooleanExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExprAccess().getOrBooleanExprParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_ruleBooleanExpr3328);
                    lv_or_7_0=ruleBooleanExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    	        }
                           		set(
                           			current, 
                           			"or",
                            		lv_or_7_0, 
                            		"BooleanExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleBooleanExpr"


    // $ANTLR start "ruleSchoolElement"
    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1579:1: ruleSchoolElement returns [Enumerator current=null] : ( (enumLiteral_0= 'School' ) | (enumLiteral_1= 'Student' ) | (enumLiteral_2= 'Teacher' ) | (enumLiteral_3= 'Faculty' ) | (enumLiteral_4= 'CourseOfStudy' ) | (enumLiteral_5= 'Course' ) ) ;
    public final Enumerator ruleSchoolElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1581:28: ( ( (enumLiteral_0= 'School' ) | (enumLiteral_1= 'Student' ) | (enumLiteral_2= 'Teacher' ) | (enumLiteral_3= 'Faculty' ) | (enumLiteral_4= 'CourseOfStudy' ) | (enumLiteral_5= 'Course' ) ) )
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1582:1: ( (enumLiteral_0= 'School' ) | (enumLiteral_1= 'Student' ) | (enumLiteral_2= 'Teacher' ) | (enumLiteral_3= 'Faculty' ) | (enumLiteral_4= 'CourseOfStudy' ) | (enumLiteral_5= 'Course' ) )
            {
            // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1582:1: ( (enumLiteral_0= 'School' ) | (enumLiteral_1= 'Student' ) | (enumLiteral_2= 'Teacher' ) | (enumLiteral_3= 'Faculty' ) | (enumLiteral_4= 'CourseOfStudy' ) | (enumLiteral_5= 'Course' ) )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt36=1;
                }
                break;
            case 34:
                {
                alt36=2;
                }
                break;
            case 38:
                {
                alt36=3;
                }
                break;
            case 24:
                {
                alt36=4;
                }
                break;
            case 27:
                {
                alt36=5;
                }
                break;
            case 29:
                {
                alt36=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1582:2: (enumLiteral_0= 'School' )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1582:2: (enumLiteral_0= 'School' )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1582:4: enumLiteral_0= 'School'
                    {
                    enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSchoolElement3380); 

                            current = grammarAccess.getSchoolElementAccess().getSchoolEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSchoolElementAccess().getSchoolEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1588:6: (enumLiteral_1= 'Student' )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1588:6: (enumLiteral_1= 'Student' )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1588:8: enumLiteral_1= 'Student'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSchoolElement3397); 

                            current = grammarAccess.getSchoolElementAccess().getStudentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSchoolElementAccess().getStudentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1594:6: (enumLiteral_2= 'Teacher' )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1594:6: (enumLiteral_2= 'Teacher' )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1594:8: enumLiteral_2= 'Teacher'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSchoolElement3414); 

                            current = grammarAccess.getSchoolElementAccess().getTeacherEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSchoolElementAccess().getTeacherEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1600:6: (enumLiteral_3= 'Faculty' )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1600:6: (enumLiteral_3= 'Faculty' )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1600:8: enumLiteral_3= 'Faculty'
                    {
                    enumLiteral_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSchoolElement3431); 

                            current = grammarAccess.getSchoolElementAccess().getFacultyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSchoolElementAccess().getFacultyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1606:6: (enumLiteral_4= 'CourseOfStudy' )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1606:6: (enumLiteral_4= 'CourseOfStudy' )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1606:8: enumLiteral_4= 'CourseOfStudy'
                    {
                    enumLiteral_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSchoolElement3448); 

                            current = grammarAccess.getSchoolElementAccess().getCourseOfStudyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSchoolElementAccess().getCourseOfStudyEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1612:6: (enumLiteral_5= 'Course' )
                    {
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1612:6: (enumLiteral_5= 'Course' )
                    // ../org.xtext.ps3.school/src-gen/org/xtext/ps3/school/parser/antlr/internal/InternalSchooldsl.g:1612:8: enumLiteral_5= 'Course'
                    {
                    enumLiteral_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSchoolElement3465); 

                            current = grammarAccess.getSchoolElementAccess().getCourseEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getSchoolElementAccess().getCourseEnumLiteralDeclaration_5()); 
                        

                    }


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
    // $ANTLR end "ruleSchoolElement"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSchoolDatabase_in_entryRuleSchoolDatabase75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSchoolDatabase85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSchoolDatabase122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchoolDatabase134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSchoolDatabase146 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleSchool_in_ruleSchoolDatabase167 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleSchoolDatabase180 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchoolDatabase192 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleQuery_in_ruleSchoolDatabase213 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSchoolDatabase226 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleQuery_in_ruleSchoolDatabase247 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSchoolDatabase261 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSchoolDatabase275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSchool_in_entryRuleSchool311 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSchool321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSchool376 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchool388 = new BitSet(new long[]{0x00000000003F0000L});
        public static final BitSet FOLLOW_17_in_ruleSchool401 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchool413 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleFaculty_in_ruleSchool434 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSchool447 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleFaculty_in_ruleSchool468 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSchool482 = new BitSet(new long[]{0x00000000003D0000L});
        public static final BitSet FOLLOW_18_in_ruleSchool497 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchool509 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCourseOfStudy_in_ruleSchool530 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSchool543 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCourseOfStudy_in_ruleSchool564 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSchool578 = new BitSet(new long[]{0x0000000000390000L});
        public static final BitSet FOLLOW_19_in_ruleSchool593 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchool605 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleCourse_in_ruleSchool626 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSchool639 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleCourse_in_ruleSchool660 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSchool674 = new BitSet(new long[]{0x0000000000310000L});
        public static final BitSet FOLLOW_20_in_ruleSchool689 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchool701 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStudent_in_ruleSchool722 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSchool735 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStudent_in_ruleSchool756 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSchool770 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_ruleSchool785 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSchool797 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleTeacher_in_ruleSchool818 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSchool831 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleTeacher_in_ruleSchool852 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSchool866 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSchool880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuery926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleQuery972 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuery984 = new BitSet(new long[]{0x0000404429810000L});
        public static final BitSet FOLLOW_ruleSchoolElement_in_ruleQuery1005 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleQuery1019 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleWhere_in_ruleQuery1040 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQuery1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFaculty_in_entryRuleFaculty1090 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFaculty1100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFaculty1146 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFaculty1167 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFaculty1179 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleFaculty1192 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleFaculty1204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFaculty1227 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_15_in_ruleFaculty1240 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFaculty1263 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleFaculty1277 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFaculty1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseOfStudy_in_entryRuleCourseOfStudy1327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseOfStudy1337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCourseOfStudy1374 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseOfStudy1395 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCourseOfStudy1407 = new BitSet(new long[]{0x0000000010080000L});
        public static final BitSet FOLLOW_19_in_ruleCourseOfStudy1420 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleCourseOfStudy1432 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseOfStudy1455 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_15_in_ruleCourseOfStudy1468 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseOfStudy1491 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleCourseOfStudy1505 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCourseOfStudy1519 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseOfStudy1542 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleCourseOfStudy1555 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleCourseOfStudy1567 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseOfStudy1590 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_15_in_ruleCourseOfStudy1603 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseOfStudy1626 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleCourseOfStudy1640 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCourseOfStudy1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse1690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCourse1737 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourse1758 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCourse1770 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_30_in_ruleCourse1783 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourse1804 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_31_in_ruleCourse1819 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleCourse1831 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourse1854 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_15_in_ruleCourse1867 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourse1890 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleCourse1904 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCourse1918 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourse1941 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_33_in_ruleCourse1954 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCourse1966 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleCourseResult_in_ruleCourse1987 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleCourse2000 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleCourseResult_in_ruleCourse2021 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleCourse2035 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCourse2049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStudent_in_entryRuleStudent2085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStudent2095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleStudent2132 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStudent2153 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStudent2165 = new BitSet(new long[]{0x0000003800000000L});
        public static final BitSet FOLLOW_35_in_ruleStudent2178 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStudent2199 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleStudent2214 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleStudent2226 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStudent2249 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_15_in_ruleStudent2262 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStudent2285 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleStudent2299 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleStudent2313 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStudent2336 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStudent2348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTeacher_in_entryRuleTeacher2384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTeacher2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleTeacher2440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTeacher2461 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTeacher2473 = new BitSet(new long[]{0x0000008000010000L});
        public static final BitSet FOLLOW_39_in_ruleTeacher2486 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTeacher2498 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTeacher2521 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_15_in_ruleTeacher2534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTeacher2557 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleTeacher2571 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTeacher2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseResult_in_entryRuleCourseResult2744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseResult2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleCourseResult2791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCourseResult2803 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_41_in_ruleCourseResult2816 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_ruleCourseResult2837 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCourseResult2851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseResult2874 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCourseResult2886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger2923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigInteger2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEBigInteger2973 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEBigInteger2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhere_in_entryRuleWhere3035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhere3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleWhere3082 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_ruleWhere3103 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWhere3115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_entryRuleBooleanExpr3151 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpr3161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBooleanExpr3216 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBooleanExpr3237 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBooleanExpr3258 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_44_in_ruleBooleanExpr3271 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_ruleBooleanExpr3292 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleBooleanExpr3307 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_ruleBooleanExpr3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleSchoolElement3380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleSchoolElement3397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSchoolElement3414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleSchoolElement3431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSchoolElement3448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSchoolElement3465 = new BitSet(new long[]{0x0000000000000002L});
    }


}