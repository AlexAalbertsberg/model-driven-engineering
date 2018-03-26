package org.xtext.ps3.school.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.ps3.school.services.SchooldslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchooldslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'School'", "'Student'", "'Teacher'", "'Faculty'", "'CourseOfStudy'", "'Course'", "'SchoolDatabase'", "'{'", "'school'", "'}'", "'queries'", "','", "'faculties'", "'coursesofstudy'", "'courses'", "'students'", "'teachers'", "'Query'", "'where'", "'('", "')'", "'faculty'", "'taughtBy'", "'courseNumber'", "'enrolledStudents'", "'courseresults'", "'courseofstudy'", "'studentNumber'", "'enrolledIn'", "'teaches'", "'CourseResult'", "'student'", "'grade'", "'-'", "'and'", "'or'"
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
    public String getGrammarFileName() { return "../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g"; }


     
     	private SchooldslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SchooldslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSchoolDatabase"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:60:1: entryRuleSchoolDatabase : ruleSchoolDatabase EOF ;
    public final void entryRuleSchoolDatabase() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:61:1: ( ruleSchoolDatabase EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:62:1: ruleSchoolDatabase EOF
            {
             before(grammarAccess.getSchoolDatabaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchoolDatabase_in_entryRuleSchoolDatabase61);
            ruleSchoolDatabase();

            state._fsp--;

             after(grammarAccess.getSchoolDatabaseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSchoolDatabase68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchoolDatabase"


    // $ANTLR start "ruleSchoolDatabase"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:69:1: ruleSchoolDatabase : ( ( rule__SchoolDatabase__Group__0 ) ) ;
    public final void ruleSchoolDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:73:2: ( ( ( rule__SchoolDatabase__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:74:1: ( ( rule__SchoolDatabase__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:74:1: ( ( rule__SchoolDatabase__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:75:1: ( rule__SchoolDatabase__Group__0 )
            {
             before(grammarAccess.getSchoolDatabaseAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:76:1: ( rule__SchoolDatabase__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:76:2: rule__SchoolDatabase__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__0_in_ruleSchoolDatabase94);
            rule__SchoolDatabase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchoolDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchoolDatabase"


    // $ANTLR start "entryRuleSchool"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:88:1: entryRuleSchool : ruleSchool EOF ;
    public final void entryRuleSchool() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:89:1: ( ruleSchool EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:90:1: ruleSchool EOF
            {
             before(grammarAccess.getSchoolRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchool_in_entryRuleSchool121);
            ruleSchool();

            state._fsp--;

             after(grammarAccess.getSchoolRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSchool128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchool"


    // $ANTLR start "ruleSchool"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:97:1: ruleSchool : ( ( rule__School__Group__0 ) ) ;
    public final void ruleSchool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:101:2: ( ( ( rule__School__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:102:1: ( ( rule__School__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:102:1: ( ( rule__School__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:103:1: ( rule__School__Group__0 )
            {
             before(grammarAccess.getSchoolAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:104:1: ( rule__School__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:104:2: rule__School__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__0_in_ruleSchool154);
            rule__School__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchool"


    // $ANTLR start "entryRuleQuery"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:116:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:117:1: ( ruleQuery EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:118:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuery_in_entryRuleQuery181);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuery188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:125:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:129:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:130:1: ( ( rule__Query__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:130:1: ( ( rule__Query__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:131:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:132:1: ( rule__Query__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:132:2: rule__Query__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__0_in_ruleQuery214);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleFaculty"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:144:1: entryRuleFaculty : ruleFaculty EOF ;
    public final void entryRuleFaculty() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:145:1: ( ruleFaculty EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:146:1: ruleFaculty EOF
            {
             before(grammarAccess.getFacultyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFaculty_in_entryRuleFaculty241);
            ruleFaculty();

            state._fsp--;

             after(grammarAccess.getFacultyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFaculty248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFaculty"


    // $ANTLR start "ruleFaculty"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:153:1: ruleFaculty : ( ( rule__Faculty__Group__0 ) ) ;
    public final void ruleFaculty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:157:2: ( ( ( rule__Faculty__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:158:1: ( ( rule__Faculty__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:158:1: ( ( rule__Faculty__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:159:1: ( rule__Faculty__Group__0 )
            {
             before(grammarAccess.getFacultyAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:160:1: ( rule__Faculty__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:160:2: rule__Faculty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__0_in_ruleFaculty274);
            rule__Faculty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFacultyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFaculty"


    // $ANTLR start "entryRuleCourseOfStudy"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:172:1: entryRuleCourseOfStudy : ruleCourseOfStudy EOF ;
    public final void entryRuleCourseOfStudy() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:173:1: ( ruleCourseOfStudy EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:174:1: ruleCourseOfStudy EOF
            {
             before(grammarAccess.getCourseOfStudyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseOfStudy_in_entryRuleCourseOfStudy301);
            ruleCourseOfStudy();

            state._fsp--;

             after(grammarAccess.getCourseOfStudyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseOfStudy308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourseOfStudy"


    // $ANTLR start "ruleCourseOfStudy"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:181:1: ruleCourseOfStudy : ( ( rule__CourseOfStudy__Group__0 ) ) ;
    public final void ruleCourseOfStudy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:185:2: ( ( ( rule__CourseOfStudy__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:186:1: ( ( rule__CourseOfStudy__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:186:1: ( ( rule__CourseOfStudy__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:187:1: ( rule__CourseOfStudy__Group__0 )
            {
             before(grammarAccess.getCourseOfStudyAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:188:1: ( rule__CourseOfStudy__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:188:2: rule__CourseOfStudy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__0_in_ruleCourseOfStudy334);
            rule__CourseOfStudy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseOfStudyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourseOfStudy"


    // $ANTLR start "entryRuleCourse"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:200:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:201:1: ( ruleCourse EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:202:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse361);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:209:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:213:2: ( ( ( rule__Course__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:214:1: ( ( rule__Course__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:214:1: ( ( rule__Course__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:215:1: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:216:1: ( rule__Course__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:216:2: rule__Course__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0_in_ruleCourse394);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleStudent"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:228:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:229:1: ( ruleStudent EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:230:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStudent_in_entryRuleStudent421);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStudent428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:237:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:241:2: ( ( ( rule__Student__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:242:1: ( ( rule__Student__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:242:1: ( ( rule__Student__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:243:1: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:244:1: ( rule__Student__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:244:2: rule__Student__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__0_in_ruleStudent454);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleTeacher"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:256:1: entryRuleTeacher : ruleTeacher EOF ;
    public final void entryRuleTeacher() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:257:1: ( ruleTeacher EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:258:1: ruleTeacher EOF
            {
             before(grammarAccess.getTeacherRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTeacher_in_entryRuleTeacher481);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getTeacherRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTeacher488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:265:1: ruleTeacher : ( ( rule__Teacher__Group__0 ) ) ;
    public final void ruleTeacher() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:269:2: ( ( ( rule__Teacher__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:270:1: ( ( rule__Teacher__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:270:1: ( ( rule__Teacher__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:271:1: ( rule__Teacher__Group__0 )
            {
             before(grammarAccess.getTeacherAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:272:1: ( rule__Teacher__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:272:2: rule__Teacher__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__0_in_ruleTeacher514);
            rule__Teacher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:284:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:285:1: ( ruleEString EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:286:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString541);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:293:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:297:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:298:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:298:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:299:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:300:1: ( rule__EString__Alternatives )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:300:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString574);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCourseResult"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:312:1: entryRuleCourseResult : ruleCourseResult EOF ;
    public final void entryRuleCourseResult() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:313:1: ( ruleCourseResult EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:314:1: ruleCourseResult EOF
            {
             before(grammarAccess.getCourseResultRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseResult_in_entryRuleCourseResult601);
            ruleCourseResult();

            state._fsp--;

             after(grammarAccess.getCourseResultRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseResult608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourseResult"


    // $ANTLR start "ruleCourseResult"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:321:1: ruleCourseResult : ( ( rule__CourseResult__Group__0 ) ) ;
    public final void ruleCourseResult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:325:2: ( ( ( rule__CourseResult__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:326:1: ( ( rule__CourseResult__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:326:1: ( ( rule__CourseResult__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:327:1: ( rule__CourseResult__Group__0 )
            {
             before(grammarAccess.getCourseResultAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:328:1: ( rule__CourseResult__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:328:2: rule__CourseResult__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__0_in_ruleCourseResult634);
            rule__CourseResult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseResultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourseResult"


    // $ANTLR start "entryRuleEBigInteger"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:340:1: entryRuleEBigInteger : ruleEBigInteger EOF ;
    public final void entryRuleEBigInteger() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:341:1: ( ruleEBigInteger EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:342:1: ruleEBigInteger EOF
            {
             before(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger661);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getEBigIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigInteger668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:349:1: ruleEBigInteger : ( ( rule__EBigInteger__Group__0 ) ) ;
    public final void ruleEBigInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:353:2: ( ( ( rule__EBigInteger__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:354:1: ( ( rule__EBigInteger__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:354:1: ( ( rule__EBigInteger__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:355:1: ( rule__EBigInteger__Group__0 )
            {
             before(grammarAccess.getEBigIntegerAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:356:1: ( rule__EBigInteger__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:356:2: rule__EBigInteger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__0_in_ruleEBigInteger694);
            rule__EBigInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBigIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "entryRuleWhere"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:368:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:369:1: ( ruleWhere EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:370:1: ruleWhere EOF
            {
             before(grammarAccess.getWhereRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhere_in_entryRuleWhere721);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getWhereRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhere728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:377:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:381:2: ( ( ( rule__Where__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:382:1: ( ( rule__Where__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:382:1: ( ( rule__Where__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:383:1: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:384:1: ( rule__Where__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:384:2: rule__Where__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Where__Group__0_in_ruleWhere754);
            rule__Where__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleBooleanExpr"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:396:1: entryRuleBooleanExpr : ruleBooleanExpr EOF ;
    public final void entryRuleBooleanExpr() throws RecognitionException {
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:397:1: ( ruleBooleanExpr EOF )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:398:1: ruleBooleanExpr EOF
            {
             before(grammarAccess.getBooleanExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_entryRuleBooleanExpr781);
            ruleBooleanExpr();

            state._fsp--;

             after(grammarAccess.getBooleanExprRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpr788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpr"


    // $ANTLR start "ruleBooleanExpr"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:405:1: ruleBooleanExpr : ( ( rule__BooleanExpr__Group__0 ) ) ;
    public final void ruleBooleanExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:409:2: ( ( ( rule__BooleanExpr__Group__0 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:410:1: ( ( rule__BooleanExpr__Group__0 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:410:1: ( ( rule__BooleanExpr__Group__0 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:411:1: ( rule__BooleanExpr__Group__0 )
            {
             before(grammarAccess.getBooleanExprAccess().getGroup()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:412:1: ( rule__BooleanExpr__Group__0 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:412:2: rule__BooleanExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__0_in_ruleBooleanExpr814);
            rule__BooleanExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpr"


    // $ANTLR start "ruleSchoolElement"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:425:1: ruleSchoolElement : ( ( rule__SchoolElement__Alternatives ) ) ;
    public final void ruleSchoolElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:429:1: ( ( ( rule__SchoolElement__Alternatives ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:430:1: ( ( rule__SchoolElement__Alternatives ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:430:1: ( ( rule__SchoolElement__Alternatives ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:431:1: ( rule__SchoolElement__Alternatives )
            {
             before(grammarAccess.getSchoolElementAccess().getAlternatives()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:432:1: ( rule__SchoolElement__Alternatives )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:432:2: rule__SchoolElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolElement__Alternatives_in_ruleSchoolElement851);
            rule__SchoolElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSchoolElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchoolElement"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:443:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:447:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:448:1: ( RULE_STRING )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:448:1: ( RULE_STRING )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:449:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives886); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:454:6: ( RULE_ID )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:454:6: ( RULE_ID )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:455:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives903); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SchoolElement__Alternatives"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:465:1: rule__SchoolElement__Alternatives : ( ( ( 'School' ) ) | ( ( 'Student' ) ) | ( ( 'Teacher' ) ) | ( ( 'Faculty' ) ) | ( ( 'CourseOfStudy' ) ) | ( ( 'Course' ) ) );
    public final void rule__SchoolElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:469:1: ( ( ( 'School' ) ) | ( ( 'Student' ) ) | ( ( 'Teacher' ) ) | ( ( 'Faculty' ) ) | ( ( 'CourseOfStudy' ) ) | ( ( 'Course' ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:470:1: ( ( 'School' ) )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:470:1: ( ( 'School' ) )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:471:1: ( 'School' )
                    {
                     before(grammarAccess.getSchoolElementAccess().getSchoolEnumLiteralDeclaration_0()); 
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:472:1: ( 'School' )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:472:3: 'School'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__SchoolElement__Alternatives936); 

                    }

                     after(grammarAccess.getSchoolElementAccess().getSchoolEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:477:6: ( ( 'Student' ) )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:477:6: ( ( 'Student' ) )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:478:1: ( 'Student' )
                    {
                     before(grammarAccess.getSchoolElementAccess().getStudentEnumLiteralDeclaration_1()); 
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:479:1: ( 'Student' )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:479:3: 'Student'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__SchoolElement__Alternatives957); 

                    }

                     after(grammarAccess.getSchoolElementAccess().getStudentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:484:6: ( ( 'Teacher' ) )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:484:6: ( ( 'Teacher' ) )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:485:1: ( 'Teacher' )
                    {
                     before(grammarAccess.getSchoolElementAccess().getTeacherEnumLiteralDeclaration_2()); 
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:486:1: ( 'Teacher' )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:486:3: 'Teacher'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__SchoolElement__Alternatives978); 

                    }

                     after(grammarAccess.getSchoolElementAccess().getTeacherEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:491:6: ( ( 'Faculty' ) )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:491:6: ( ( 'Faculty' ) )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:492:1: ( 'Faculty' )
                    {
                     before(grammarAccess.getSchoolElementAccess().getFacultyEnumLiteralDeclaration_3()); 
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:493:1: ( 'Faculty' )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:493:3: 'Faculty'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__SchoolElement__Alternatives999); 

                    }

                     after(grammarAccess.getSchoolElementAccess().getFacultyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:498:6: ( ( 'CourseOfStudy' ) )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:498:6: ( ( 'CourseOfStudy' ) )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:499:1: ( 'CourseOfStudy' )
                    {
                     before(grammarAccess.getSchoolElementAccess().getCourseOfStudyEnumLiteralDeclaration_4()); 
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:500:1: ( 'CourseOfStudy' )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:500:3: 'CourseOfStudy'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__SchoolElement__Alternatives1020); 

                    }

                     after(grammarAccess.getSchoolElementAccess().getCourseOfStudyEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:505:6: ( ( 'Course' ) )
                    {
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:505:6: ( ( 'Course' ) )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:506:1: ( 'Course' )
                    {
                     before(grammarAccess.getSchoolElementAccess().getCourseEnumLiteralDeclaration_5()); 
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:507:1: ( 'Course' )
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:507:3: 'Course'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__SchoolElement__Alternatives1041); 

                    }

                     after(grammarAccess.getSchoolElementAccess().getCourseEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolElement__Alternatives"


    // $ANTLR start "rule__SchoolDatabase__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:519:1: rule__SchoolDatabase__Group__0 : rule__SchoolDatabase__Group__0__Impl rule__SchoolDatabase__Group__1 ;
    public final void rule__SchoolDatabase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:523:1: ( rule__SchoolDatabase__Group__0__Impl rule__SchoolDatabase__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:524:2: rule__SchoolDatabase__Group__0__Impl rule__SchoolDatabase__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__0__Impl_in_rule__SchoolDatabase__Group__01074);
            rule__SchoolDatabase__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__1_in_rule__SchoolDatabase__Group__01077);
            rule__SchoolDatabase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__0"


    // $ANTLR start "rule__SchoolDatabase__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:531:1: rule__SchoolDatabase__Group__0__Impl : ( 'SchoolDatabase' ) ;
    public final void rule__SchoolDatabase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:535:1: ( ( 'SchoolDatabase' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:536:1: ( 'SchoolDatabase' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:536:1: ( 'SchoolDatabase' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:537:1: 'SchoolDatabase'
            {
             before(grammarAccess.getSchoolDatabaseAccess().getSchoolDatabaseKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__SchoolDatabase__Group__0__Impl1105); 
             after(grammarAccess.getSchoolDatabaseAccess().getSchoolDatabaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__0__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:550:1: rule__SchoolDatabase__Group__1 : rule__SchoolDatabase__Group__1__Impl rule__SchoolDatabase__Group__2 ;
    public final void rule__SchoolDatabase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:554:1: ( rule__SchoolDatabase__Group__1__Impl rule__SchoolDatabase__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:555:2: rule__SchoolDatabase__Group__1__Impl rule__SchoolDatabase__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__1__Impl_in_rule__SchoolDatabase__Group__11136);
            rule__SchoolDatabase__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__2_in_rule__SchoolDatabase__Group__11139);
            rule__SchoolDatabase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__1"


    // $ANTLR start "rule__SchoolDatabase__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:562:1: rule__SchoolDatabase__Group__1__Impl : ( '{' ) ;
    public final void rule__SchoolDatabase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:566:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:567:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:567:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:568:1: '{'
            {
             before(grammarAccess.getSchoolDatabaseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__SchoolDatabase__Group__1__Impl1167); 
             after(grammarAccess.getSchoolDatabaseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__1__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:581:1: rule__SchoolDatabase__Group__2 : rule__SchoolDatabase__Group__2__Impl rule__SchoolDatabase__Group__3 ;
    public final void rule__SchoolDatabase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:585:1: ( rule__SchoolDatabase__Group__2__Impl rule__SchoolDatabase__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:586:2: rule__SchoolDatabase__Group__2__Impl rule__SchoolDatabase__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__2__Impl_in_rule__SchoolDatabase__Group__21198);
            rule__SchoolDatabase__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__3_in_rule__SchoolDatabase__Group__21201);
            rule__SchoolDatabase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__2"


    // $ANTLR start "rule__SchoolDatabase__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:593:1: rule__SchoolDatabase__Group__2__Impl : ( 'school' ) ;
    public final void rule__SchoolDatabase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:597:1: ( ( 'school' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:598:1: ( 'school' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:598:1: ( 'school' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:599:1: 'school'
            {
             before(grammarAccess.getSchoolDatabaseAccess().getSchoolKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SchoolDatabase__Group__2__Impl1229); 
             after(grammarAccess.getSchoolDatabaseAccess().getSchoolKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__2__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:612:1: rule__SchoolDatabase__Group__3 : rule__SchoolDatabase__Group__3__Impl rule__SchoolDatabase__Group__4 ;
    public final void rule__SchoolDatabase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:616:1: ( rule__SchoolDatabase__Group__3__Impl rule__SchoolDatabase__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:617:2: rule__SchoolDatabase__Group__3__Impl rule__SchoolDatabase__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__3__Impl_in_rule__SchoolDatabase__Group__31260);
            rule__SchoolDatabase__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__4_in_rule__SchoolDatabase__Group__31263);
            rule__SchoolDatabase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__3"


    // $ANTLR start "rule__SchoolDatabase__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:624:1: rule__SchoolDatabase__Group__3__Impl : ( ( rule__SchoolDatabase__SchoolAssignment_3 ) ) ;
    public final void rule__SchoolDatabase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:628:1: ( ( ( rule__SchoolDatabase__SchoolAssignment_3 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:629:1: ( ( rule__SchoolDatabase__SchoolAssignment_3 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:629:1: ( ( rule__SchoolDatabase__SchoolAssignment_3 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:630:1: ( rule__SchoolDatabase__SchoolAssignment_3 )
            {
             before(grammarAccess.getSchoolDatabaseAccess().getSchoolAssignment_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:631:1: ( rule__SchoolDatabase__SchoolAssignment_3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:631:2: rule__SchoolDatabase__SchoolAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__SchoolAssignment_3_in_rule__SchoolDatabase__Group__3__Impl1290);
            rule__SchoolDatabase__SchoolAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSchoolDatabaseAccess().getSchoolAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__3__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:641:1: rule__SchoolDatabase__Group__4 : rule__SchoolDatabase__Group__4__Impl rule__SchoolDatabase__Group__5 ;
    public final void rule__SchoolDatabase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:645:1: ( rule__SchoolDatabase__Group__4__Impl rule__SchoolDatabase__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:646:2: rule__SchoolDatabase__Group__4__Impl rule__SchoolDatabase__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__4__Impl_in_rule__SchoolDatabase__Group__41320);
            rule__SchoolDatabase__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__5_in_rule__SchoolDatabase__Group__41323);
            rule__SchoolDatabase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__4"


    // $ANTLR start "rule__SchoolDatabase__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:653:1: rule__SchoolDatabase__Group__4__Impl : ( ( rule__SchoolDatabase__Group_4__0 )? ) ;
    public final void rule__SchoolDatabase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:657:1: ( ( ( rule__SchoolDatabase__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:658:1: ( ( rule__SchoolDatabase__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:658:1: ( ( rule__SchoolDatabase__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:659:1: ( rule__SchoolDatabase__Group_4__0 )?
            {
             before(grammarAccess.getSchoolDatabaseAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:660:1: ( rule__SchoolDatabase__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:660:2: rule__SchoolDatabase__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__0_in_rule__SchoolDatabase__Group__4__Impl1350);
                    rule__SchoolDatabase__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolDatabaseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__4__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:670:1: rule__SchoolDatabase__Group__5 : rule__SchoolDatabase__Group__5__Impl ;
    public final void rule__SchoolDatabase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:674:1: ( rule__SchoolDatabase__Group__5__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:675:2: rule__SchoolDatabase__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group__5__Impl_in_rule__SchoolDatabase__Group__51381);
            rule__SchoolDatabase__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__5"


    // $ANTLR start "rule__SchoolDatabase__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:681:1: rule__SchoolDatabase__Group__5__Impl : ( '}' ) ;
    public final void rule__SchoolDatabase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:685:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:686:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:686:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:687:1: '}'
            {
             before(grammarAccess.getSchoolDatabaseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__SchoolDatabase__Group__5__Impl1409); 
             after(grammarAccess.getSchoolDatabaseAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group__5__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:712:1: rule__SchoolDatabase__Group_4__0 : rule__SchoolDatabase__Group_4__0__Impl rule__SchoolDatabase__Group_4__1 ;
    public final void rule__SchoolDatabase__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:716:1: ( rule__SchoolDatabase__Group_4__0__Impl rule__SchoolDatabase__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:717:2: rule__SchoolDatabase__Group_4__0__Impl rule__SchoolDatabase__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__0__Impl_in_rule__SchoolDatabase__Group_4__01452);
            rule__SchoolDatabase__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__1_in_rule__SchoolDatabase__Group_4__01455);
            rule__SchoolDatabase__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__0"


    // $ANTLR start "rule__SchoolDatabase__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:724:1: rule__SchoolDatabase__Group_4__0__Impl : ( 'queries' ) ;
    public final void rule__SchoolDatabase__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:728:1: ( ( 'queries' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:729:1: ( 'queries' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:729:1: ( 'queries' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:730:1: 'queries'
            {
             before(grammarAccess.getSchoolDatabaseAccess().getQueriesKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__SchoolDatabase__Group_4__0__Impl1483); 
             after(grammarAccess.getSchoolDatabaseAccess().getQueriesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__0__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:743:1: rule__SchoolDatabase__Group_4__1 : rule__SchoolDatabase__Group_4__1__Impl rule__SchoolDatabase__Group_4__2 ;
    public final void rule__SchoolDatabase__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:747:1: ( rule__SchoolDatabase__Group_4__1__Impl rule__SchoolDatabase__Group_4__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:748:2: rule__SchoolDatabase__Group_4__1__Impl rule__SchoolDatabase__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__1__Impl_in_rule__SchoolDatabase__Group_4__11514);
            rule__SchoolDatabase__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__2_in_rule__SchoolDatabase__Group_4__11517);
            rule__SchoolDatabase__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__1"


    // $ANTLR start "rule__SchoolDatabase__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:755:1: rule__SchoolDatabase__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SchoolDatabase__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:759:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:760:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:760:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:761:1: '{'
            {
             before(grammarAccess.getSchoolDatabaseAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__SchoolDatabase__Group_4__1__Impl1545); 
             after(grammarAccess.getSchoolDatabaseAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__1__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group_4__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:774:1: rule__SchoolDatabase__Group_4__2 : rule__SchoolDatabase__Group_4__2__Impl rule__SchoolDatabase__Group_4__3 ;
    public final void rule__SchoolDatabase__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:778:1: ( rule__SchoolDatabase__Group_4__2__Impl rule__SchoolDatabase__Group_4__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:779:2: rule__SchoolDatabase__Group_4__2__Impl rule__SchoolDatabase__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__2__Impl_in_rule__SchoolDatabase__Group_4__21576);
            rule__SchoolDatabase__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__3_in_rule__SchoolDatabase__Group_4__21579);
            rule__SchoolDatabase__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__2"


    // $ANTLR start "rule__SchoolDatabase__Group_4__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:786:1: rule__SchoolDatabase__Group_4__2__Impl : ( ( rule__SchoolDatabase__QueryAssignment_4_2 ) ) ;
    public final void rule__SchoolDatabase__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:790:1: ( ( ( rule__SchoolDatabase__QueryAssignment_4_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:791:1: ( ( rule__SchoolDatabase__QueryAssignment_4_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:791:1: ( ( rule__SchoolDatabase__QueryAssignment_4_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:792:1: ( rule__SchoolDatabase__QueryAssignment_4_2 )
            {
             before(grammarAccess.getSchoolDatabaseAccess().getQueryAssignment_4_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:793:1: ( rule__SchoolDatabase__QueryAssignment_4_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:793:2: rule__SchoolDatabase__QueryAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__QueryAssignment_4_2_in_rule__SchoolDatabase__Group_4__2__Impl1606);
            rule__SchoolDatabase__QueryAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolDatabaseAccess().getQueryAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__2__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group_4__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:803:1: rule__SchoolDatabase__Group_4__3 : rule__SchoolDatabase__Group_4__3__Impl rule__SchoolDatabase__Group_4__4 ;
    public final void rule__SchoolDatabase__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:807:1: ( rule__SchoolDatabase__Group_4__3__Impl rule__SchoolDatabase__Group_4__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:808:2: rule__SchoolDatabase__Group_4__3__Impl rule__SchoolDatabase__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__3__Impl_in_rule__SchoolDatabase__Group_4__31636);
            rule__SchoolDatabase__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__4_in_rule__SchoolDatabase__Group_4__31639);
            rule__SchoolDatabase__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__3"


    // $ANTLR start "rule__SchoolDatabase__Group_4__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:815:1: rule__SchoolDatabase__Group_4__3__Impl : ( ( rule__SchoolDatabase__Group_4_3__0 )* ) ;
    public final void rule__SchoolDatabase__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:819:1: ( ( ( rule__SchoolDatabase__Group_4_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:820:1: ( ( rule__SchoolDatabase__Group_4_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:820:1: ( ( rule__SchoolDatabase__Group_4_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:821:1: ( rule__SchoolDatabase__Group_4_3__0 )*
            {
             before(grammarAccess.getSchoolDatabaseAccess().getGroup_4_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:822:1: ( rule__SchoolDatabase__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:822:2: rule__SchoolDatabase__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4_3__0_in_rule__SchoolDatabase__Group_4__3__Impl1666);
            	    rule__SchoolDatabase__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSchoolDatabaseAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__3__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group_4__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:832:1: rule__SchoolDatabase__Group_4__4 : rule__SchoolDatabase__Group_4__4__Impl ;
    public final void rule__SchoolDatabase__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:836:1: ( rule__SchoolDatabase__Group_4__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:837:2: rule__SchoolDatabase__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4__4__Impl_in_rule__SchoolDatabase__Group_4__41697);
            rule__SchoolDatabase__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__4"


    // $ANTLR start "rule__SchoolDatabase__Group_4__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:843:1: rule__SchoolDatabase__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SchoolDatabase__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:847:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:848:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:848:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:849:1: '}'
            {
             before(grammarAccess.getSchoolDatabaseAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__SchoolDatabase__Group_4__4__Impl1725); 
             after(grammarAccess.getSchoolDatabaseAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4__4__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group_4_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:872:1: rule__SchoolDatabase__Group_4_3__0 : rule__SchoolDatabase__Group_4_3__0__Impl rule__SchoolDatabase__Group_4_3__1 ;
    public final void rule__SchoolDatabase__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:876:1: ( rule__SchoolDatabase__Group_4_3__0__Impl rule__SchoolDatabase__Group_4_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:877:2: rule__SchoolDatabase__Group_4_3__0__Impl rule__SchoolDatabase__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4_3__0__Impl_in_rule__SchoolDatabase__Group_4_3__01766);
            rule__SchoolDatabase__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4_3__1_in_rule__SchoolDatabase__Group_4_3__01769);
            rule__SchoolDatabase__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4_3__0"


    // $ANTLR start "rule__SchoolDatabase__Group_4_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:884:1: rule__SchoolDatabase__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__SchoolDatabase__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:888:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:889:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:889:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:890:1: ','
            {
             before(grammarAccess.getSchoolDatabaseAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SchoolDatabase__Group_4_3__0__Impl1797); 
             after(grammarAccess.getSchoolDatabaseAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4_3__0__Impl"


    // $ANTLR start "rule__SchoolDatabase__Group_4_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:903:1: rule__SchoolDatabase__Group_4_3__1 : rule__SchoolDatabase__Group_4_3__1__Impl ;
    public final void rule__SchoolDatabase__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:907:1: ( rule__SchoolDatabase__Group_4_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:908:2: rule__SchoolDatabase__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__Group_4_3__1__Impl_in_rule__SchoolDatabase__Group_4_3__11828);
            rule__SchoolDatabase__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4_3__1"


    // $ANTLR start "rule__SchoolDatabase__Group_4_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:914:1: rule__SchoolDatabase__Group_4_3__1__Impl : ( ( rule__SchoolDatabase__QueryAssignment_4_3_1 ) ) ;
    public final void rule__SchoolDatabase__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:918:1: ( ( ( rule__SchoolDatabase__QueryAssignment_4_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:919:1: ( ( rule__SchoolDatabase__QueryAssignment_4_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:919:1: ( ( rule__SchoolDatabase__QueryAssignment_4_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:920:1: ( rule__SchoolDatabase__QueryAssignment_4_3_1 )
            {
             before(grammarAccess.getSchoolDatabaseAccess().getQueryAssignment_4_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:921:1: ( rule__SchoolDatabase__QueryAssignment_4_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:921:2: rule__SchoolDatabase__QueryAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SchoolDatabase__QueryAssignment_4_3_1_in_rule__SchoolDatabase__Group_4_3__1__Impl1855);
            rule__SchoolDatabase__QueryAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolDatabaseAccess().getQueryAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__Group_4_3__1__Impl"


    // $ANTLR start "rule__School__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:935:1: rule__School__Group__0 : rule__School__Group__0__Impl rule__School__Group__1 ;
    public final void rule__School__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:939:1: ( rule__School__Group__0__Impl rule__School__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:940:2: rule__School__Group__0__Impl rule__School__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__0__Impl_in_rule__School__Group__01889);
            rule__School__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__1_in_rule__School__Group__01892);
            rule__School__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__0"


    // $ANTLR start "rule__School__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:947:1: rule__School__Group__0__Impl : ( () ) ;
    public final void rule__School__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:951:1: ( ( () ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:952:1: ( () )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:952:1: ( () )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:953:1: ()
            {
             before(grammarAccess.getSchoolAccess().getSchoolAction_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:954:1: ()
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:956:1: 
            {
            }

             after(grammarAccess.getSchoolAccess().getSchoolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__0__Impl"


    // $ANTLR start "rule__School__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:966:1: rule__School__Group__1 : rule__School__Group__1__Impl rule__School__Group__2 ;
    public final void rule__School__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:970:1: ( rule__School__Group__1__Impl rule__School__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:971:2: rule__School__Group__1__Impl rule__School__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__1__Impl_in_rule__School__Group__11950);
            rule__School__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__2_in_rule__School__Group__11953);
            rule__School__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__1"


    // $ANTLR start "rule__School__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:978:1: rule__School__Group__1__Impl : ( ( rule__School__NameAssignment_1 ) ) ;
    public final void rule__School__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:982:1: ( ( ( rule__School__NameAssignment_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:983:1: ( ( rule__School__NameAssignment_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:983:1: ( ( rule__School__NameAssignment_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:984:1: ( rule__School__NameAssignment_1 )
            {
             before(grammarAccess.getSchoolAccess().getNameAssignment_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:985:1: ( rule__School__NameAssignment_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:985:2: rule__School__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__NameAssignment_1_in_rule__School__Group__1__Impl1980);
            rule__School__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__1__Impl"


    // $ANTLR start "rule__School__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:995:1: rule__School__Group__2 : rule__School__Group__2__Impl rule__School__Group__3 ;
    public final void rule__School__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:999:1: ( rule__School__Group__2__Impl rule__School__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1000:2: rule__School__Group__2__Impl rule__School__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__2__Impl_in_rule__School__Group__22010);
            rule__School__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__3_in_rule__School__Group__22013);
            rule__School__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__2"


    // $ANTLR start "rule__School__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1007:1: rule__School__Group__2__Impl : ( '{' ) ;
    public final void rule__School__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1011:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1012:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1012:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1013:1: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__School__Group__2__Impl2041); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__2__Impl"


    // $ANTLR start "rule__School__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1026:1: rule__School__Group__3 : rule__School__Group__3__Impl rule__School__Group__4 ;
    public final void rule__School__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1030:1: ( rule__School__Group__3__Impl rule__School__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1031:2: rule__School__Group__3__Impl rule__School__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__3__Impl_in_rule__School__Group__32072);
            rule__School__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__4_in_rule__School__Group__32075);
            rule__School__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__3"


    // $ANTLR start "rule__School__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1038:1: rule__School__Group__3__Impl : ( ( rule__School__Group_3__0 )? ) ;
    public final void rule__School__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1042:1: ( ( ( rule__School__Group_3__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1043:1: ( ( rule__School__Group_3__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1043:1: ( ( rule__School__Group_3__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1044:1: ( rule__School__Group_3__0 )?
            {
             before(grammarAccess.getSchoolAccess().getGroup_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1045:1: ( rule__School__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1045:2: rule__School__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__0_in_rule__School__Group__3__Impl2102);
                    rule__School__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__3__Impl"


    // $ANTLR start "rule__School__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1055:1: rule__School__Group__4 : rule__School__Group__4__Impl rule__School__Group__5 ;
    public final void rule__School__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1059:1: ( rule__School__Group__4__Impl rule__School__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1060:2: rule__School__Group__4__Impl rule__School__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__4__Impl_in_rule__School__Group__42133);
            rule__School__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__5_in_rule__School__Group__42136);
            rule__School__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__4"


    // $ANTLR start "rule__School__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1067:1: rule__School__Group__4__Impl : ( ( rule__School__Group_4__0 )? ) ;
    public final void rule__School__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1071:1: ( ( ( rule__School__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1072:1: ( ( rule__School__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1072:1: ( ( rule__School__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1073:1: ( rule__School__Group_4__0 )?
            {
             before(grammarAccess.getSchoolAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1074:1: ( rule__School__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1074:2: rule__School__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__0_in_rule__School__Group__4__Impl2163);
                    rule__School__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__4__Impl"


    // $ANTLR start "rule__School__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1084:1: rule__School__Group__5 : rule__School__Group__5__Impl rule__School__Group__6 ;
    public final void rule__School__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1088:1: ( rule__School__Group__5__Impl rule__School__Group__6 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1089:2: rule__School__Group__5__Impl rule__School__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__5__Impl_in_rule__School__Group__52194);
            rule__School__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__6_in_rule__School__Group__52197);
            rule__School__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__5"


    // $ANTLR start "rule__School__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1096:1: rule__School__Group__5__Impl : ( ( rule__School__Group_5__0 )? ) ;
    public final void rule__School__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1100:1: ( ( ( rule__School__Group_5__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1101:1: ( ( rule__School__Group_5__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1101:1: ( ( rule__School__Group_5__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1102:1: ( rule__School__Group_5__0 )?
            {
             before(grammarAccess.getSchoolAccess().getGroup_5()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1103:1: ( rule__School__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1103:2: rule__School__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__0_in_rule__School__Group__5__Impl2224);
                    rule__School__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__5__Impl"


    // $ANTLR start "rule__School__Group__6"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1113:1: rule__School__Group__6 : rule__School__Group__6__Impl rule__School__Group__7 ;
    public final void rule__School__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1117:1: ( rule__School__Group__6__Impl rule__School__Group__7 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1118:2: rule__School__Group__6__Impl rule__School__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__6__Impl_in_rule__School__Group__62255);
            rule__School__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__7_in_rule__School__Group__62258);
            rule__School__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__6"


    // $ANTLR start "rule__School__Group__6__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1125:1: rule__School__Group__6__Impl : ( ( rule__School__Group_6__0 )? ) ;
    public final void rule__School__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1129:1: ( ( ( rule__School__Group_6__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1130:1: ( ( rule__School__Group_6__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1130:1: ( ( rule__School__Group_6__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1131:1: ( rule__School__Group_6__0 )?
            {
             before(grammarAccess.getSchoolAccess().getGroup_6()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1132:1: ( rule__School__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1132:2: rule__School__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__0_in_rule__School__Group__6__Impl2285);
                    rule__School__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__6__Impl"


    // $ANTLR start "rule__School__Group__7"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1142:1: rule__School__Group__7 : rule__School__Group__7__Impl rule__School__Group__8 ;
    public final void rule__School__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1146:1: ( rule__School__Group__7__Impl rule__School__Group__8 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1147:2: rule__School__Group__7__Impl rule__School__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__7__Impl_in_rule__School__Group__72316);
            rule__School__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group__8_in_rule__School__Group__72319);
            rule__School__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__7"


    // $ANTLR start "rule__School__Group__7__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1154:1: rule__School__Group__7__Impl : ( ( rule__School__Group_7__0 )? ) ;
    public final void rule__School__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1158:1: ( ( ( rule__School__Group_7__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1159:1: ( ( rule__School__Group_7__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1159:1: ( ( rule__School__Group_7__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1160:1: ( rule__School__Group_7__0 )?
            {
             before(grammarAccess.getSchoolAccess().getGroup_7()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1161:1: ( rule__School__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1161:2: rule__School__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__0_in_rule__School__Group__7__Impl2346);
                    rule__School__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchoolAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__7__Impl"


    // $ANTLR start "rule__School__Group__8"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1171:1: rule__School__Group__8 : rule__School__Group__8__Impl ;
    public final void rule__School__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1175:1: ( rule__School__Group__8__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1176:2: rule__School__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group__8__Impl_in_rule__School__Group__82377);
            rule__School__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__8"


    // $ANTLR start "rule__School__Group__8__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1182:1: rule__School__Group__8__Impl : ( '}' ) ;
    public final void rule__School__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1186:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1187:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1187:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1188:1: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__School__Group__8__Impl2405); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group__8__Impl"


    // $ANTLR start "rule__School__Group_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1219:1: rule__School__Group_3__0 : rule__School__Group_3__0__Impl rule__School__Group_3__1 ;
    public final void rule__School__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1223:1: ( rule__School__Group_3__0__Impl rule__School__Group_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1224:2: rule__School__Group_3__0__Impl rule__School__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__0__Impl_in_rule__School__Group_3__02454);
            rule__School__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__1_in_rule__School__Group_3__02457);
            rule__School__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__0"


    // $ANTLR start "rule__School__Group_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1231:1: rule__School__Group_3__0__Impl : ( 'faculties' ) ;
    public final void rule__School__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1235:1: ( ( 'faculties' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1236:1: ( 'faculties' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1236:1: ( 'faculties' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1237:1: 'faculties'
            {
             before(grammarAccess.getSchoolAccess().getFacultiesKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__School__Group_3__0__Impl2485); 
             after(grammarAccess.getSchoolAccess().getFacultiesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__0__Impl"


    // $ANTLR start "rule__School__Group_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1250:1: rule__School__Group_3__1 : rule__School__Group_3__1__Impl rule__School__Group_3__2 ;
    public final void rule__School__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1254:1: ( rule__School__Group_3__1__Impl rule__School__Group_3__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1255:2: rule__School__Group_3__1__Impl rule__School__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__1__Impl_in_rule__School__Group_3__12516);
            rule__School__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__2_in_rule__School__Group_3__12519);
            rule__School__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__1"


    // $ANTLR start "rule__School__Group_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1262:1: rule__School__Group_3__1__Impl : ( '{' ) ;
    public final void rule__School__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1266:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1267:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1267:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1268:1: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__School__Group_3__1__Impl2547); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__1__Impl"


    // $ANTLR start "rule__School__Group_3__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1281:1: rule__School__Group_3__2 : rule__School__Group_3__2__Impl rule__School__Group_3__3 ;
    public final void rule__School__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1285:1: ( rule__School__Group_3__2__Impl rule__School__Group_3__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1286:2: rule__School__Group_3__2__Impl rule__School__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__2__Impl_in_rule__School__Group_3__22578);
            rule__School__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__3_in_rule__School__Group_3__22581);
            rule__School__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__2"


    // $ANTLR start "rule__School__Group_3__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1293:1: rule__School__Group_3__2__Impl : ( ( rule__School__FacultyAssignment_3_2 ) ) ;
    public final void rule__School__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1297:1: ( ( ( rule__School__FacultyAssignment_3_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1298:1: ( ( rule__School__FacultyAssignment_3_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1298:1: ( ( rule__School__FacultyAssignment_3_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1299:1: ( rule__School__FacultyAssignment_3_2 )
            {
             before(grammarAccess.getSchoolAccess().getFacultyAssignment_3_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1300:1: ( rule__School__FacultyAssignment_3_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1300:2: rule__School__FacultyAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__FacultyAssignment_3_2_in_rule__School__Group_3__2__Impl2608);
            rule__School__FacultyAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getFacultyAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__2__Impl"


    // $ANTLR start "rule__School__Group_3__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1310:1: rule__School__Group_3__3 : rule__School__Group_3__3__Impl rule__School__Group_3__4 ;
    public final void rule__School__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1314:1: ( rule__School__Group_3__3__Impl rule__School__Group_3__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1315:2: rule__School__Group_3__3__Impl rule__School__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__3__Impl_in_rule__School__Group_3__32638);
            rule__School__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__4_in_rule__School__Group_3__32641);
            rule__School__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__3"


    // $ANTLR start "rule__School__Group_3__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1322:1: rule__School__Group_3__3__Impl : ( ( rule__School__Group_3_3__0 )* ) ;
    public final void rule__School__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1326:1: ( ( ( rule__School__Group_3_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1327:1: ( ( rule__School__Group_3_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1327:1: ( ( rule__School__Group_3_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1328:1: ( rule__School__Group_3_3__0 )*
            {
             before(grammarAccess.getSchoolAccess().getGroup_3_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1329:1: ( rule__School__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1329:2: rule__School__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__School__Group_3_3__0_in_rule__School__Group_3__3__Impl2668);
            	    rule__School__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSchoolAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__3__Impl"


    // $ANTLR start "rule__School__Group_3__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1339:1: rule__School__Group_3__4 : rule__School__Group_3__4__Impl ;
    public final void rule__School__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1343:1: ( rule__School__Group_3__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1344:2: rule__School__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3__4__Impl_in_rule__School__Group_3__42699);
            rule__School__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__4"


    // $ANTLR start "rule__School__Group_3__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1350:1: rule__School__Group_3__4__Impl : ( '}' ) ;
    public final void rule__School__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1354:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1355:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1355:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1356:1: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__School__Group_3__4__Impl2727); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3__4__Impl"


    // $ANTLR start "rule__School__Group_3_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1379:1: rule__School__Group_3_3__0 : rule__School__Group_3_3__0__Impl rule__School__Group_3_3__1 ;
    public final void rule__School__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1383:1: ( rule__School__Group_3_3__0__Impl rule__School__Group_3_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1384:2: rule__School__Group_3_3__0__Impl rule__School__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3_3__0__Impl_in_rule__School__Group_3_3__02768);
            rule__School__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3_3__1_in_rule__School__Group_3_3__02771);
            rule__School__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3_3__0"


    // $ANTLR start "rule__School__Group_3_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1391:1: rule__School__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__School__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1395:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1396:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1396:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1397:1: ','
            {
             before(grammarAccess.getSchoolAccess().getCommaKeyword_3_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__School__Group_3_3__0__Impl2799); 
             after(grammarAccess.getSchoolAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3_3__0__Impl"


    // $ANTLR start "rule__School__Group_3_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1410:1: rule__School__Group_3_3__1 : rule__School__Group_3_3__1__Impl ;
    public final void rule__School__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1414:1: ( rule__School__Group_3_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1415:2: rule__School__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_3_3__1__Impl_in_rule__School__Group_3_3__12830);
            rule__School__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3_3__1"


    // $ANTLR start "rule__School__Group_3_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1421:1: rule__School__Group_3_3__1__Impl : ( ( rule__School__FacultyAssignment_3_3_1 ) ) ;
    public final void rule__School__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1425:1: ( ( ( rule__School__FacultyAssignment_3_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1426:1: ( ( rule__School__FacultyAssignment_3_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1426:1: ( ( rule__School__FacultyAssignment_3_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1427:1: ( rule__School__FacultyAssignment_3_3_1 )
            {
             before(grammarAccess.getSchoolAccess().getFacultyAssignment_3_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1428:1: ( rule__School__FacultyAssignment_3_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1428:2: rule__School__FacultyAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__FacultyAssignment_3_3_1_in_rule__School__Group_3_3__1__Impl2857);
            rule__School__FacultyAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getFacultyAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_3_3__1__Impl"


    // $ANTLR start "rule__School__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1442:1: rule__School__Group_4__0 : rule__School__Group_4__0__Impl rule__School__Group_4__1 ;
    public final void rule__School__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1446:1: ( rule__School__Group_4__0__Impl rule__School__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1447:2: rule__School__Group_4__0__Impl rule__School__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__0__Impl_in_rule__School__Group_4__02891);
            rule__School__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__1_in_rule__School__Group_4__02894);
            rule__School__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__0"


    // $ANTLR start "rule__School__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1454:1: rule__School__Group_4__0__Impl : ( 'coursesofstudy' ) ;
    public final void rule__School__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1458:1: ( ( 'coursesofstudy' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1459:1: ( 'coursesofstudy' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1459:1: ( 'coursesofstudy' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1460:1: 'coursesofstudy'
            {
             before(grammarAccess.getSchoolAccess().getCoursesofstudyKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__School__Group_4__0__Impl2922); 
             after(grammarAccess.getSchoolAccess().getCoursesofstudyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__0__Impl"


    // $ANTLR start "rule__School__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1473:1: rule__School__Group_4__1 : rule__School__Group_4__1__Impl rule__School__Group_4__2 ;
    public final void rule__School__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1477:1: ( rule__School__Group_4__1__Impl rule__School__Group_4__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1478:2: rule__School__Group_4__1__Impl rule__School__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__1__Impl_in_rule__School__Group_4__12953);
            rule__School__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__2_in_rule__School__Group_4__12956);
            rule__School__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__1"


    // $ANTLR start "rule__School__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1485:1: rule__School__Group_4__1__Impl : ( '{' ) ;
    public final void rule__School__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1489:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1490:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1490:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1491:1: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__School__Group_4__1__Impl2984); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__1__Impl"


    // $ANTLR start "rule__School__Group_4__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1504:1: rule__School__Group_4__2 : rule__School__Group_4__2__Impl rule__School__Group_4__3 ;
    public final void rule__School__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1508:1: ( rule__School__Group_4__2__Impl rule__School__Group_4__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1509:2: rule__School__Group_4__2__Impl rule__School__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__2__Impl_in_rule__School__Group_4__23015);
            rule__School__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__3_in_rule__School__Group_4__23018);
            rule__School__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__2"


    // $ANTLR start "rule__School__Group_4__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1516:1: rule__School__Group_4__2__Impl : ( ( rule__School__CourseofstudyAssignment_4_2 ) ) ;
    public final void rule__School__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1520:1: ( ( ( rule__School__CourseofstudyAssignment_4_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1521:1: ( ( rule__School__CourseofstudyAssignment_4_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1521:1: ( ( rule__School__CourseofstudyAssignment_4_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1522:1: ( rule__School__CourseofstudyAssignment_4_2 )
            {
             before(grammarAccess.getSchoolAccess().getCourseofstudyAssignment_4_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1523:1: ( rule__School__CourseofstudyAssignment_4_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1523:2: rule__School__CourseofstudyAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__CourseofstudyAssignment_4_2_in_rule__School__Group_4__2__Impl3045);
            rule__School__CourseofstudyAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getCourseofstudyAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__2__Impl"


    // $ANTLR start "rule__School__Group_4__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1533:1: rule__School__Group_4__3 : rule__School__Group_4__3__Impl rule__School__Group_4__4 ;
    public final void rule__School__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1537:1: ( rule__School__Group_4__3__Impl rule__School__Group_4__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1538:2: rule__School__Group_4__3__Impl rule__School__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__3__Impl_in_rule__School__Group_4__33075);
            rule__School__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__4_in_rule__School__Group_4__33078);
            rule__School__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__3"


    // $ANTLR start "rule__School__Group_4__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1545:1: rule__School__Group_4__3__Impl : ( ( rule__School__Group_4_3__0 )* ) ;
    public final void rule__School__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1549:1: ( ( ( rule__School__Group_4_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1550:1: ( ( rule__School__Group_4_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1550:1: ( ( rule__School__Group_4_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1551:1: ( rule__School__Group_4_3__0 )*
            {
             before(grammarAccess.getSchoolAccess().getGroup_4_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1552:1: ( rule__School__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1552:2: rule__School__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__School__Group_4_3__0_in_rule__School__Group_4__3__Impl3105);
            	    rule__School__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSchoolAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__3__Impl"


    // $ANTLR start "rule__School__Group_4__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1562:1: rule__School__Group_4__4 : rule__School__Group_4__4__Impl ;
    public final void rule__School__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1566:1: ( rule__School__Group_4__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1567:2: rule__School__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4__4__Impl_in_rule__School__Group_4__43136);
            rule__School__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__4"


    // $ANTLR start "rule__School__Group_4__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1573:1: rule__School__Group_4__4__Impl : ( '}' ) ;
    public final void rule__School__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1577:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1578:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1578:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1579:1: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__School__Group_4__4__Impl3164); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4__4__Impl"


    // $ANTLR start "rule__School__Group_4_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1602:1: rule__School__Group_4_3__0 : rule__School__Group_4_3__0__Impl rule__School__Group_4_3__1 ;
    public final void rule__School__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1606:1: ( rule__School__Group_4_3__0__Impl rule__School__Group_4_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1607:2: rule__School__Group_4_3__0__Impl rule__School__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4_3__0__Impl_in_rule__School__Group_4_3__03205);
            rule__School__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4_3__1_in_rule__School__Group_4_3__03208);
            rule__School__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4_3__0"


    // $ANTLR start "rule__School__Group_4_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1614:1: rule__School__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__School__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1618:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1619:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1619:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1620:1: ','
            {
             before(grammarAccess.getSchoolAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__School__Group_4_3__0__Impl3236); 
             after(grammarAccess.getSchoolAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4_3__0__Impl"


    // $ANTLR start "rule__School__Group_4_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1633:1: rule__School__Group_4_3__1 : rule__School__Group_4_3__1__Impl ;
    public final void rule__School__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1637:1: ( rule__School__Group_4_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1638:2: rule__School__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_4_3__1__Impl_in_rule__School__Group_4_3__13267);
            rule__School__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4_3__1"


    // $ANTLR start "rule__School__Group_4_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1644:1: rule__School__Group_4_3__1__Impl : ( ( rule__School__CourseofstudyAssignment_4_3_1 ) ) ;
    public final void rule__School__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1648:1: ( ( ( rule__School__CourseofstudyAssignment_4_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1649:1: ( ( rule__School__CourseofstudyAssignment_4_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1649:1: ( ( rule__School__CourseofstudyAssignment_4_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1650:1: ( rule__School__CourseofstudyAssignment_4_3_1 )
            {
             before(grammarAccess.getSchoolAccess().getCourseofstudyAssignment_4_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1651:1: ( rule__School__CourseofstudyAssignment_4_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1651:2: rule__School__CourseofstudyAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__CourseofstudyAssignment_4_3_1_in_rule__School__Group_4_3__1__Impl3294);
            rule__School__CourseofstudyAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getCourseofstudyAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_4_3__1__Impl"


    // $ANTLR start "rule__School__Group_5__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1665:1: rule__School__Group_5__0 : rule__School__Group_5__0__Impl rule__School__Group_5__1 ;
    public final void rule__School__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1669:1: ( rule__School__Group_5__0__Impl rule__School__Group_5__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1670:2: rule__School__Group_5__0__Impl rule__School__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__0__Impl_in_rule__School__Group_5__03328);
            rule__School__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__1_in_rule__School__Group_5__03331);
            rule__School__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__0"


    // $ANTLR start "rule__School__Group_5__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1677:1: rule__School__Group_5__0__Impl : ( 'courses' ) ;
    public final void rule__School__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1681:1: ( ( 'courses' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1682:1: ( 'courses' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1682:1: ( 'courses' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1683:1: 'courses'
            {
             before(grammarAccess.getSchoolAccess().getCoursesKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__School__Group_5__0__Impl3359); 
             after(grammarAccess.getSchoolAccess().getCoursesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__0__Impl"


    // $ANTLR start "rule__School__Group_5__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1696:1: rule__School__Group_5__1 : rule__School__Group_5__1__Impl rule__School__Group_5__2 ;
    public final void rule__School__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1700:1: ( rule__School__Group_5__1__Impl rule__School__Group_5__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1701:2: rule__School__Group_5__1__Impl rule__School__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__1__Impl_in_rule__School__Group_5__13390);
            rule__School__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__2_in_rule__School__Group_5__13393);
            rule__School__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__1"


    // $ANTLR start "rule__School__Group_5__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1708:1: rule__School__Group_5__1__Impl : ( '{' ) ;
    public final void rule__School__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1712:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1713:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1713:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1714:1: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__School__Group_5__1__Impl3421); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__1__Impl"


    // $ANTLR start "rule__School__Group_5__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1727:1: rule__School__Group_5__2 : rule__School__Group_5__2__Impl rule__School__Group_5__3 ;
    public final void rule__School__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1731:1: ( rule__School__Group_5__2__Impl rule__School__Group_5__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1732:2: rule__School__Group_5__2__Impl rule__School__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__2__Impl_in_rule__School__Group_5__23452);
            rule__School__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__3_in_rule__School__Group_5__23455);
            rule__School__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__2"


    // $ANTLR start "rule__School__Group_5__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1739:1: rule__School__Group_5__2__Impl : ( ( rule__School__CourseAssignment_5_2 ) ) ;
    public final void rule__School__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1743:1: ( ( ( rule__School__CourseAssignment_5_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1744:1: ( ( rule__School__CourseAssignment_5_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1744:1: ( ( rule__School__CourseAssignment_5_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1745:1: ( rule__School__CourseAssignment_5_2 )
            {
             before(grammarAccess.getSchoolAccess().getCourseAssignment_5_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1746:1: ( rule__School__CourseAssignment_5_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1746:2: rule__School__CourseAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__CourseAssignment_5_2_in_rule__School__Group_5__2__Impl3482);
            rule__School__CourseAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getCourseAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__2__Impl"


    // $ANTLR start "rule__School__Group_5__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1756:1: rule__School__Group_5__3 : rule__School__Group_5__3__Impl rule__School__Group_5__4 ;
    public final void rule__School__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1760:1: ( rule__School__Group_5__3__Impl rule__School__Group_5__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1761:2: rule__School__Group_5__3__Impl rule__School__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__3__Impl_in_rule__School__Group_5__33512);
            rule__School__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__4_in_rule__School__Group_5__33515);
            rule__School__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__3"


    // $ANTLR start "rule__School__Group_5__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1768:1: rule__School__Group_5__3__Impl : ( ( rule__School__Group_5_3__0 )* ) ;
    public final void rule__School__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1772:1: ( ( ( rule__School__Group_5_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1773:1: ( ( rule__School__Group_5_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1773:1: ( ( rule__School__Group_5_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1774:1: ( rule__School__Group_5_3__0 )*
            {
             before(grammarAccess.getSchoolAccess().getGroup_5_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1775:1: ( rule__School__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1775:2: rule__School__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__School__Group_5_3__0_in_rule__School__Group_5__3__Impl3542);
            	    rule__School__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSchoolAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__3__Impl"


    // $ANTLR start "rule__School__Group_5__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1785:1: rule__School__Group_5__4 : rule__School__Group_5__4__Impl ;
    public final void rule__School__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1789:1: ( rule__School__Group_5__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1790:2: rule__School__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5__4__Impl_in_rule__School__Group_5__43573);
            rule__School__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__4"


    // $ANTLR start "rule__School__Group_5__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1796:1: rule__School__Group_5__4__Impl : ( '}' ) ;
    public final void rule__School__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1800:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1801:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1801:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1802:1: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__School__Group_5__4__Impl3601); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5__4__Impl"


    // $ANTLR start "rule__School__Group_5_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1825:1: rule__School__Group_5_3__0 : rule__School__Group_5_3__0__Impl rule__School__Group_5_3__1 ;
    public final void rule__School__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1829:1: ( rule__School__Group_5_3__0__Impl rule__School__Group_5_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1830:2: rule__School__Group_5_3__0__Impl rule__School__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5_3__0__Impl_in_rule__School__Group_5_3__03642);
            rule__School__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5_3__1_in_rule__School__Group_5_3__03645);
            rule__School__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5_3__0"


    // $ANTLR start "rule__School__Group_5_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1837:1: rule__School__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__School__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1841:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1842:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1842:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1843:1: ','
            {
             before(grammarAccess.getSchoolAccess().getCommaKeyword_5_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__School__Group_5_3__0__Impl3673); 
             after(grammarAccess.getSchoolAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5_3__0__Impl"


    // $ANTLR start "rule__School__Group_5_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1856:1: rule__School__Group_5_3__1 : rule__School__Group_5_3__1__Impl ;
    public final void rule__School__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1860:1: ( rule__School__Group_5_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1861:2: rule__School__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_5_3__1__Impl_in_rule__School__Group_5_3__13704);
            rule__School__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5_3__1"


    // $ANTLR start "rule__School__Group_5_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1867:1: rule__School__Group_5_3__1__Impl : ( ( rule__School__CourseAssignment_5_3_1 ) ) ;
    public final void rule__School__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1871:1: ( ( ( rule__School__CourseAssignment_5_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1872:1: ( ( rule__School__CourseAssignment_5_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1872:1: ( ( rule__School__CourseAssignment_5_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1873:1: ( rule__School__CourseAssignment_5_3_1 )
            {
             before(grammarAccess.getSchoolAccess().getCourseAssignment_5_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1874:1: ( rule__School__CourseAssignment_5_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1874:2: rule__School__CourseAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__CourseAssignment_5_3_1_in_rule__School__Group_5_3__1__Impl3731);
            rule__School__CourseAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getCourseAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_5_3__1__Impl"


    // $ANTLR start "rule__School__Group_6__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1888:1: rule__School__Group_6__0 : rule__School__Group_6__0__Impl rule__School__Group_6__1 ;
    public final void rule__School__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1892:1: ( rule__School__Group_6__0__Impl rule__School__Group_6__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1893:2: rule__School__Group_6__0__Impl rule__School__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__0__Impl_in_rule__School__Group_6__03765);
            rule__School__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__1_in_rule__School__Group_6__03768);
            rule__School__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__0"


    // $ANTLR start "rule__School__Group_6__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1900:1: rule__School__Group_6__0__Impl : ( 'students' ) ;
    public final void rule__School__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1904:1: ( ( 'students' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1905:1: ( 'students' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1905:1: ( 'students' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1906:1: 'students'
            {
             before(grammarAccess.getSchoolAccess().getStudentsKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__School__Group_6__0__Impl3796); 
             after(grammarAccess.getSchoolAccess().getStudentsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__0__Impl"


    // $ANTLR start "rule__School__Group_6__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1919:1: rule__School__Group_6__1 : rule__School__Group_6__1__Impl rule__School__Group_6__2 ;
    public final void rule__School__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1923:1: ( rule__School__Group_6__1__Impl rule__School__Group_6__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1924:2: rule__School__Group_6__1__Impl rule__School__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__1__Impl_in_rule__School__Group_6__13827);
            rule__School__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__2_in_rule__School__Group_6__13830);
            rule__School__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__1"


    // $ANTLR start "rule__School__Group_6__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1931:1: rule__School__Group_6__1__Impl : ( '{' ) ;
    public final void rule__School__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1935:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1936:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1936:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1937:1: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__School__Group_6__1__Impl3858); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__1__Impl"


    // $ANTLR start "rule__School__Group_6__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1950:1: rule__School__Group_6__2 : rule__School__Group_6__2__Impl rule__School__Group_6__3 ;
    public final void rule__School__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1954:1: ( rule__School__Group_6__2__Impl rule__School__Group_6__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1955:2: rule__School__Group_6__2__Impl rule__School__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__2__Impl_in_rule__School__Group_6__23889);
            rule__School__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__3_in_rule__School__Group_6__23892);
            rule__School__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__2"


    // $ANTLR start "rule__School__Group_6__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1962:1: rule__School__Group_6__2__Impl : ( ( rule__School__StudentAssignment_6_2 ) ) ;
    public final void rule__School__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1966:1: ( ( ( rule__School__StudentAssignment_6_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1967:1: ( ( rule__School__StudentAssignment_6_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1967:1: ( ( rule__School__StudentAssignment_6_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1968:1: ( rule__School__StudentAssignment_6_2 )
            {
             before(grammarAccess.getSchoolAccess().getStudentAssignment_6_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1969:1: ( rule__School__StudentAssignment_6_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1969:2: rule__School__StudentAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__StudentAssignment_6_2_in_rule__School__Group_6__2__Impl3919);
            rule__School__StudentAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getStudentAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__2__Impl"


    // $ANTLR start "rule__School__Group_6__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1979:1: rule__School__Group_6__3 : rule__School__Group_6__3__Impl rule__School__Group_6__4 ;
    public final void rule__School__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1983:1: ( rule__School__Group_6__3__Impl rule__School__Group_6__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1984:2: rule__School__Group_6__3__Impl rule__School__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__3__Impl_in_rule__School__Group_6__33949);
            rule__School__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__4_in_rule__School__Group_6__33952);
            rule__School__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__3"


    // $ANTLR start "rule__School__Group_6__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1991:1: rule__School__Group_6__3__Impl : ( ( rule__School__Group_6_3__0 )* ) ;
    public final void rule__School__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1995:1: ( ( ( rule__School__Group_6_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1996:1: ( ( rule__School__Group_6_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1996:1: ( ( rule__School__Group_6_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1997:1: ( rule__School__Group_6_3__0 )*
            {
             before(grammarAccess.getSchoolAccess().getGroup_6_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1998:1: ( rule__School__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:1998:2: rule__School__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__School__Group_6_3__0_in_rule__School__Group_6__3__Impl3979);
            	    rule__School__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSchoolAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__3__Impl"


    // $ANTLR start "rule__School__Group_6__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2008:1: rule__School__Group_6__4 : rule__School__Group_6__4__Impl ;
    public final void rule__School__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2012:1: ( rule__School__Group_6__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2013:2: rule__School__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6__4__Impl_in_rule__School__Group_6__44010);
            rule__School__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__4"


    // $ANTLR start "rule__School__Group_6__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2019:1: rule__School__Group_6__4__Impl : ( '}' ) ;
    public final void rule__School__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2023:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2024:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2024:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2025:1: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__School__Group_6__4__Impl4038); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6__4__Impl"


    // $ANTLR start "rule__School__Group_6_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2048:1: rule__School__Group_6_3__0 : rule__School__Group_6_3__0__Impl rule__School__Group_6_3__1 ;
    public final void rule__School__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2052:1: ( rule__School__Group_6_3__0__Impl rule__School__Group_6_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2053:2: rule__School__Group_6_3__0__Impl rule__School__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6_3__0__Impl_in_rule__School__Group_6_3__04079);
            rule__School__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6_3__1_in_rule__School__Group_6_3__04082);
            rule__School__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6_3__0"


    // $ANTLR start "rule__School__Group_6_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2060:1: rule__School__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__School__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2064:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2065:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2065:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2066:1: ','
            {
             before(grammarAccess.getSchoolAccess().getCommaKeyword_6_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__School__Group_6_3__0__Impl4110); 
             after(grammarAccess.getSchoolAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6_3__0__Impl"


    // $ANTLR start "rule__School__Group_6_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2079:1: rule__School__Group_6_3__1 : rule__School__Group_6_3__1__Impl ;
    public final void rule__School__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2083:1: ( rule__School__Group_6_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2084:2: rule__School__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_6_3__1__Impl_in_rule__School__Group_6_3__14141);
            rule__School__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6_3__1"


    // $ANTLR start "rule__School__Group_6_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2090:1: rule__School__Group_6_3__1__Impl : ( ( rule__School__StudentAssignment_6_3_1 ) ) ;
    public final void rule__School__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2094:1: ( ( ( rule__School__StudentAssignment_6_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2095:1: ( ( rule__School__StudentAssignment_6_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2095:1: ( ( rule__School__StudentAssignment_6_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2096:1: ( rule__School__StudentAssignment_6_3_1 )
            {
             before(grammarAccess.getSchoolAccess().getStudentAssignment_6_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2097:1: ( rule__School__StudentAssignment_6_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2097:2: rule__School__StudentAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__StudentAssignment_6_3_1_in_rule__School__Group_6_3__1__Impl4168);
            rule__School__StudentAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getStudentAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_6_3__1__Impl"


    // $ANTLR start "rule__School__Group_7__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2111:1: rule__School__Group_7__0 : rule__School__Group_7__0__Impl rule__School__Group_7__1 ;
    public final void rule__School__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2115:1: ( rule__School__Group_7__0__Impl rule__School__Group_7__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2116:2: rule__School__Group_7__0__Impl rule__School__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__0__Impl_in_rule__School__Group_7__04202);
            rule__School__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__1_in_rule__School__Group_7__04205);
            rule__School__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__0"


    // $ANTLR start "rule__School__Group_7__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2123:1: rule__School__Group_7__0__Impl : ( 'teachers' ) ;
    public final void rule__School__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2127:1: ( ( 'teachers' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2128:1: ( 'teachers' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2128:1: ( 'teachers' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2129:1: 'teachers'
            {
             before(grammarAccess.getSchoolAccess().getTeachersKeyword_7_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__School__Group_7__0__Impl4233); 
             after(grammarAccess.getSchoolAccess().getTeachersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__0__Impl"


    // $ANTLR start "rule__School__Group_7__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2142:1: rule__School__Group_7__1 : rule__School__Group_7__1__Impl rule__School__Group_7__2 ;
    public final void rule__School__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2146:1: ( rule__School__Group_7__1__Impl rule__School__Group_7__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2147:2: rule__School__Group_7__1__Impl rule__School__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__1__Impl_in_rule__School__Group_7__14264);
            rule__School__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__2_in_rule__School__Group_7__14267);
            rule__School__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__1"


    // $ANTLR start "rule__School__Group_7__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2154:1: rule__School__Group_7__1__Impl : ( '{' ) ;
    public final void rule__School__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2158:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2159:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2159:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2160:1: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__School__Group_7__1__Impl4295); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__1__Impl"


    // $ANTLR start "rule__School__Group_7__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2173:1: rule__School__Group_7__2 : rule__School__Group_7__2__Impl rule__School__Group_7__3 ;
    public final void rule__School__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2177:1: ( rule__School__Group_7__2__Impl rule__School__Group_7__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2178:2: rule__School__Group_7__2__Impl rule__School__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__2__Impl_in_rule__School__Group_7__24326);
            rule__School__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__3_in_rule__School__Group_7__24329);
            rule__School__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__2"


    // $ANTLR start "rule__School__Group_7__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2185:1: rule__School__Group_7__2__Impl : ( ( rule__School__TeacherAssignment_7_2 ) ) ;
    public final void rule__School__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2189:1: ( ( ( rule__School__TeacherAssignment_7_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2190:1: ( ( rule__School__TeacherAssignment_7_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2190:1: ( ( rule__School__TeacherAssignment_7_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2191:1: ( rule__School__TeacherAssignment_7_2 )
            {
             before(grammarAccess.getSchoolAccess().getTeacherAssignment_7_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2192:1: ( rule__School__TeacherAssignment_7_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2192:2: rule__School__TeacherAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__TeacherAssignment_7_2_in_rule__School__Group_7__2__Impl4356);
            rule__School__TeacherAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getTeacherAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__2__Impl"


    // $ANTLR start "rule__School__Group_7__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2202:1: rule__School__Group_7__3 : rule__School__Group_7__3__Impl rule__School__Group_7__4 ;
    public final void rule__School__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2206:1: ( rule__School__Group_7__3__Impl rule__School__Group_7__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2207:2: rule__School__Group_7__3__Impl rule__School__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__3__Impl_in_rule__School__Group_7__34386);
            rule__School__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__4_in_rule__School__Group_7__34389);
            rule__School__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__3"


    // $ANTLR start "rule__School__Group_7__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2214:1: rule__School__Group_7__3__Impl : ( ( rule__School__Group_7_3__0 )* ) ;
    public final void rule__School__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2218:1: ( ( ( rule__School__Group_7_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2219:1: ( ( rule__School__Group_7_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2219:1: ( ( rule__School__Group_7_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2220:1: ( rule__School__Group_7_3__0 )*
            {
             before(grammarAccess.getSchoolAccess().getGroup_7_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2221:1: ( rule__School__Group_7_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2221:2: rule__School__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__School__Group_7_3__0_in_rule__School__Group_7__3__Impl4416);
            	    rule__School__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSchoolAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__3__Impl"


    // $ANTLR start "rule__School__Group_7__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2231:1: rule__School__Group_7__4 : rule__School__Group_7__4__Impl ;
    public final void rule__School__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2235:1: ( rule__School__Group_7__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2236:2: rule__School__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7__4__Impl_in_rule__School__Group_7__44447);
            rule__School__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__4"


    // $ANTLR start "rule__School__Group_7__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2242:1: rule__School__Group_7__4__Impl : ( '}' ) ;
    public final void rule__School__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2246:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2247:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2247:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2248:1: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__School__Group_7__4__Impl4475); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7__4__Impl"


    // $ANTLR start "rule__School__Group_7_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2271:1: rule__School__Group_7_3__0 : rule__School__Group_7_3__0__Impl rule__School__Group_7_3__1 ;
    public final void rule__School__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2275:1: ( rule__School__Group_7_3__0__Impl rule__School__Group_7_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2276:2: rule__School__Group_7_3__0__Impl rule__School__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7_3__0__Impl_in_rule__School__Group_7_3__04516);
            rule__School__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7_3__1_in_rule__School__Group_7_3__04519);
            rule__School__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7_3__0"


    // $ANTLR start "rule__School__Group_7_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2283:1: rule__School__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__School__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2287:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2288:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2288:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2289:1: ','
            {
             before(grammarAccess.getSchoolAccess().getCommaKeyword_7_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__School__Group_7_3__0__Impl4547); 
             after(grammarAccess.getSchoolAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7_3__0__Impl"


    // $ANTLR start "rule__School__Group_7_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2302:1: rule__School__Group_7_3__1 : rule__School__Group_7_3__1__Impl ;
    public final void rule__School__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2306:1: ( rule__School__Group_7_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2307:2: rule__School__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__Group_7_3__1__Impl_in_rule__School__Group_7_3__14578);
            rule__School__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7_3__1"


    // $ANTLR start "rule__School__Group_7_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2313:1: rule__School__Group_7_3__1__Impl : ( ( rule__School__TeacherAssignment_7_3_1 ) ) ;
    public final void rule__School__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2317:1: ( ( ( rule__School__TeacherAssignment_7_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2318:1: ( ( rule__School__TeacherAssignment_7_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2318:1: ( ( rule__School__TeacherAssignment_7_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2319:1: ( rule__School__TeacherAssignment_7_3_1 )
            {
             before(grammarAccess.getSchoolAccess().getTeacherAssignment_7_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2320:1: ( rule__School__TeacherAssignment_7_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2320:2: rule__School__TeacherAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__School__TeacherAssignment_7_3_1_in_rule__School__Group_7_3__1__Impl4605);
            rule__School__TeacherAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getTeacherAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__Group_7_3__1__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2334:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2338:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2339:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__04639);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__1_in_rule__Query__Group__04642);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2346:1: rule__Query__Group__0__Impl : ( () ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2350:1: ( ( () ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2351:1: ( () )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2351:1: ( () )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2352:1: ()
            {
             before(grammarAccess.getQueryAccess().getQueryAction_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2353:1: ()
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2355:1: 
            {
            }

             after(grammarAccess.getQueryAccess().getQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2365:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2369:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2370:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__14700);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__2_in_rule__Query__Group__14703);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2377:1: rule__Query__Group__1__Impl : ( 'Query' ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2381:1: ( ( 'Query' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2382:1: ( 'Query' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2382:1: ( 'Query' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2383:1: 'Query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Query__Group__1__Impl4731); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2396:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2400:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2401:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__24762);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__3_in_rule__Query__Group__24765);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2408:1: rule__Query__Group__2__Impl : ( '{' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2412:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2413:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2413:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2414:1: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Query__Group__2__Impl4793); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2427:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2431:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2432:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__34824);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__4_in_rule__Query__Group__34827);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2439:1: rule__Query__Group__3__Impl : ( ( rule__Query__TypeAssignment_3 )? ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2443:1: ( ( ( rule__Query__TypeAssignment_3 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2444:1: ( ( rule__Query__TypeAssignment_3 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2444:1: ( ( rule__Query__TypeAssignment_3 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2445:1: ( rule__Query__TypeAssignment_3 )?
            {
             before(grammarAccess.getQueryAccess().getTypeAssignment_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2446:1: ( rule__Query__TypeAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=16)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2446:2: rule__Query__TypeAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Query__TypeAssignment_3_in_rule__Query__Group__3__Impl4854);
                    rule__Query__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2456:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2460:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2461:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__44885);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__5_in_rule__Query__Group__44888);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2468:1: rule__Query__Group__4__Impl : ( ( rule__Query__Group_4__0 )? ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2472:1: ( ( ( rule__Query__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2473:1: ( ( rule__Query__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2473:1: ( ( rule__Query__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2474:1: ( rule__Query__Group_4__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2475:1: ( rule__Query__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2475:2: rule__Query__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Query__Group_4__0_in_rule__Query__Group__4__Impl4915);
                    rule__Query__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2485:1: rule__Query__Group__5 : rule__Query__Group__5__Impl ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2489:1: ( rule__Query__Group__5__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2490:2: rule__Query__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group__5__Impl_in_rule__Query__Group__54946);
            rule__Query__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2496:1: rule__Query__Group__5__Impl : ( '}' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2500:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2501:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2501:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2502:1: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Query__Group__5__Impl4974); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2527:1: rule__Query__Group_4__0 : rule__Query__Group_4__0__Impl rule__Query__Group_4__1 ;
    public final void rule__Query__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2531:1: ( rule__Query__Group_4__0__Impl rule__Query__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2532:2: rule__Query__Group_4__0__Impl rule__Query__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group_4__0__Impl_in_rule__Query__Group_4__05017);
            rule__Query__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Query__Group_4__1_in_rule__Query__Group_4__05020);
            rule__Query__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__0"


    // $ANTLR start "rule__Query__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2539:1: rule__Query__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Query__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2543:1: ( ( 'where' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2544:1: ( 'where' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2544:1: ( 'where' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2545:1: 'where'
            {
             before(grammarAccess.getQueryAccess().getWhereKeyword_4_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Query__Group_4__0__Impl5048); 
             after(grammarAccess.getQueryAccess().getWhereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__0__Impl"


    // $ANTLR start "rule__Query__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2558:1: rule__Query__Group_4__1 : rule__Query__Group_4__1__Impl ;
    public final void rule__Query__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2562:1: ( rule__Query__Group_4__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2563:2: rule__Query__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__Group_4__1__Impl_in_rule__Query__Group_4__15079);
            rule__Query__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__1"


    // $ANTLR start "rule__Query__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2569:1: rule__Query__Group_4__1__Impl : ( ( rule__Query__WhereAssignment_4_1 ) ) ;
    public final void rule__Query__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2573:1: ( ( ( rule__Query__WhereAssignment_4_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2574:1: ( ( rule__Query__WhereAssignment_4_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2574:1: ( ( rule__Query__WhereAssignment_4_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2575:1: ( rule__Query__WhereAssignment_4_1 )
            {
             before(grammarAccess.getQueryAccess().getWhereAssignment_4_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2576:1: ( rule__Query__WhereAssignment_4_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2576:2: rule__Query__WhereAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Query__WhereAssignment_4_1_in_rule__Query__Group_4__1__Impl5106);
            rule__Query__WhereAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getWhereAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__1__Impl"


    // $ANTLR start "rule__Faculty__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2590:1: rule__Faculty__Group__0 : rule__Faculty__Group__0__Impl rule__Faculty__Group__1 ;
    public final void rule__Faculty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2594:1: ( rule__Faculty__Group__0__Impl rule__Faculty__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2595:2: rule__Faculty__Group__0__Impl rule__Faculty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__0__Impl_in_rule__Faculty__Group__05140);
            rule__Faculty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__1_in_rule__Faculty__Group__05143);
            rule__Faculty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__0"


    // $ANTLR start "rule__Faculty__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2602:1: rule__Faculty__Group__0__Impl : ( () ) ;
    public final void rule__Faculty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2606:1: ( ( () ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2607:1: ( () )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2607:1: ( () )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2608:1: ()
            {
             before(grammarAccess.getFacultyAccess().getFacultyAction_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2609:1: ()
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2611:1: 
            {
            }

             after(grammarAccess.getFacultyAccess().getFacultyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__0__Impl"


    // $ANTLR start "rule__Faculty__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2621:1: rule__Faculty__Group__1 : rule__Faculty__Group__1__Impl rule__Faculty__Group__2 ;
    public final void rule__Faculty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2625:1: ( rule__Faculty__Group__1__Impl rule__Faculty__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2626:2: rule__Faculty__Group__1__Impl rule__Faculty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__1__Impl_in_rule__Faculty__Group__15201);
            rule__Faculty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__2_in_rule__Faculty__Group__15204);
            rule__Faculty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__1"


    // $ANTLR start "rule__Faculty__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2633:1: rule__Faculty__Group__1__Impl : ( 'Faculty' ) ;
    public final void rule__Faculty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2637:1: ( ( 'Faculty' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2638:1: ( 'Faculty' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2638:1: ( 'Faculty' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2639:1: 'Faculty'
            {
             before(grammarAccess.getFacultyAccess().getFacultyKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Faculty__Group__1__Impl5232); 
             after(grammarAccess.getFacultyAccess().getFacultyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__1__Impl"


    // $ANTLR start "rule__Faculty__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2652:1: rule__Faculty__Group__2 : rule__Faculty__Group__2__Impl rule__Faculty__Group__3 ;
    public final void rule__Faculty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2656:1: ( rule__Faculty__Group__2__Impl rule__Faculty__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2657:2: rule__Faculty__Group__2__Impl rule__Faculty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__2__Impl_in_rule__Faculty__Group__25263);
            rule__Faculty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__3_in_rule__Faculty__Group__25266);
            rule__Faculty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__2"


    // $ANTLR start "rule__Faculty__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2664:1: rule__Faculty__Group__2__Impl : ( ( rule__Faculty__NameAssignment_2 ) ) ;
    public final void rule__Faculty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2668:1: ( ( ( rule__Faculty__NameAssignment_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2669:1: ( ( rule__Faculty__NameAssignment_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2669:1: ( ( rule__Faculty__NameAssignment_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2670:1: ( rule__Faculty__NameAssignment_2 )
            {
             before(grammarAccess.getFacultyAccess().getNameAssignment_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2671:1: ( rule__Faculty__NameAssignment_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2671:2: rule__Faculty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__NameAssignment_2_in_rule__Faculty__Group__2__Impl5293);
            rule__Faculty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFacultyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__2__Impl"


    // $ANTLR start "rule__Faculty__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2681:1: rule__Faculty__Group__3 : rule__Faculty__Group__3__Impl rule__Faculty__Group__4 ;
    public final void rule__Faculty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2685:1: ( rule__Faculty__Group__3__Impl rule__Faculty__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2686:2: rule__Faculty__Group__3__Impl rule__Faculty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__3__Impl_in_rule__Faculty__Group__35323);
            rule__Faculty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__4_in_rule__Faculty__Group__35326);
            rule__Faculty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__3"


    // $ANTLR start "rule__Faculty__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2693:1: rule__Faculty__Group__3__Impl : ( '{' ) ;
    public final void rule__Faculty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2697:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2698:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2698:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2699:1: '{'
            {
             before(grammarAccess.getFacultyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Faculty__Group__3__Impl5354); 
             after(grammarAccess.getFacultyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__3__Impl"


    // $ANTLR start "rule__Faculty__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2712:1: rule__Faculty__Group__4 : rule__Faculty__Group__4__Impl rule__Faculty__Group__5 ;
    public final void rule__Faculty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2716:1: ( rule__Faculty__Group__4__Impl rule__Faculty__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2717:2: rule__Faculty__Group__4__Impl rule__Faculty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__4__Impl_in_rule__Faculty__Group__45385);
            rule__Faculty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__5_in_rule__Faculty__Group__45388);
            rule__Faculty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__4"


    // $ANTLR start "rule__Faculty__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2724:1: rule__Faculty__Group__4__Impl : ( ( rule__Faculty__Group_4__0 )? ) ;
    public final void rule__Faculty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2728:1: ( ( ( rule__Faculty__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2729:1: ( ( rule__Faculty__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2729:1: ( ( rule__Faculty__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2730:1: ( rule__Faculty__Group_4__0 )?
            {
             before(grammarAccess.getFacultyAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2731:1: ( rule__Faculty__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2731:2: rule__Faculty__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__0_in_rule__Faculty__Group__4__Impl5415);
                    rule__Faculty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFacultyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__4__Impl"


    // $ANTLR start "rule__Faculty__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2741:1: rule__Faculty__Group__5 : rule__Faculty__Group__5__Impl ;
    public final void rule__Faculty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2745:1: ( rule__Faculty__Group__5__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2746:2: rule__Faculty__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group__5__Impl_in_rule__Faculty__Group__55446);
            rule__Faculty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__5"


    // $ANTLR start "rule__Faculty__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2752:1: rule__Faculty__Group__5__Impl : ( '}' ) ;
    public final void rule__Faculty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2756:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2757:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2757:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2758:1: '}'
            {
             before(grammarAccess.getFacultyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Faculty__Group__5__Impl5474); 
             after(grammarAccess.getFacultyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group__5__Impl"


    // $ANTLR start "rule__Faculty__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2783:1: rule__Faculty__Group_4__0 : rule__Faculty__Group_4__0__Impl rule__Faculty__Group_4__1 ;
    public final void rule__Faculty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2787:1: ( rule__Faculty__Group_4__0__Impl rule__Faculty__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2788:2: rule__Faculty__Group_4__0__Impl rule__Faculty__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__0__Impl_in_rule__Faculty__Group_4__05517);
            rule__Faculty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__1_in_rule__Faculty__Group_4__05520);
            rule__Faculty__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__0"


    // $ANTLR start "rule__Faculty__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2795:1: rule__Faculty__Group_4__0__Impl : ( 'coursesofstudy' ) ;
    public final void rule__Faculty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2799:1: ( ( 'coursesofstudy' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2800:1: ( 'coursesofstudy' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2800:1: ( 'coursesofstudy' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2801:1: 'coursesofstudy'
            {
             before(grammarAccess.getFacultyAccess().getCoursesofstudyKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Faculty__Group_4__0__Impl5548); 
             after(grammarAccess.getFacultyAccess().getCoursesofstudyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__0__Impl"


    // $ANTLR start "rule__Faculty__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2814:1: rule__Faculty__Group_4__1 : rule__Faculty__Group_4__1__Impl rule__Faculty__Group_4__2 ;
    public final void rule__Faculty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2818:1: ( rule__Faculty__Group_4__1__Impl rule__Faculty__Group_4__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2819:2: rule__Faculty__Group_4__1__Impl rule__Faculty__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__1__Impl_in_rule__Faculty__Group_4__15579);
            rule__Faculty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__2_in_rule__Faculty__Group_4__15582);
            rule__Faculty__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__1"


    // $ANTLR start "rule__Faculty__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2826:1: rule__Faculty__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Faculty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2830:1: ( ( '(' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2831:1: ( '(' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2831:1: ( '(' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2832:1: '('
            {
             before(grammarAccess.getFacultyAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Faculty__Group_4__1__Impl5610); 
             after(grammarAccess.getFacultyAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__1__Impl"


    // $ANTLR start "rule__Faculty__Group_4__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2845:1: rule__Faculty__Group_4__2 : rule__Faculty__Group_4__2__Impl rule__Faculty__Group_4__3 ;
    public final void rule__Faculty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2849:1: ( rule__Faculty__Group_4__2__Impl rule__Faculty__Group_4__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2850:2: rule__Faculty__Group_4__2__Impl rule__Faculty__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__2__Impl_in_rule__Faculty__Group_4__25641);
            rule__Faculty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__3_in_rule__Faculty__Group_4__25644);
            rule__Faculty__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__2"


    // $ANTLR start "rule__Faculty__Group_4__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2857:1: rule__Faculty__Group_4__2__Impl : ( ( rule__Faculty__CourseofstudyAssignment_4_2 ) ) ;
    public final void rule__Faculty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2861:1: ( ( ( rule__Faculty__CourseofstudyAssignment_4_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2862:1: ( ( rule__Faculty__CourseofstudyAssignment_4_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2862:1: ( ( rule__Faculty__CourseofstudyAssignment_4_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2863:1: ( rule__Faculty__CourseofstudyAssignment_4_2 )
            {
             before(grammarAccess.getFacultyAccess().getCourseofstudyAssignment_4_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2864:1: ( rule__Faculty__CourseofstudyAssignment_4_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2864:2: rule__Faculty__CourseofstudyAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__CourseofstudyAssignment_4_2_in_rule__Faculty__Group_4__2__Impl5671);
            rule__Faculty__CourseofstudyAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFacultyAccess().getCourseofstudyAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__2__Impl"


    // $ANTLR start "rule__Faculty__Group_4__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2874:1: rule__Faculty__Group_4__3 : rule__Faculty__Group_4__3__Impl rule__Faculty__Group_4__4 ;
    public final void rule__Faculty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2878:1: ( rule__Faculty__Group_4__3__Impl rule__Faculty__Group_4__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2879:2: rule__Faculty__Group_4__3__Impl rule__Faculty__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__3__Impl_in_rule__Faculty__Group_4__35701);
            rule__Faculty__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__4_in_rule__Faculty__Group_4__35704);
            rule__Faculty__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__3"


    // $ANTLR start "rule__Faculty__Group_4__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2886:1: rule__Faculty__Group_4__3__Impl : ( ( rule__Faculty__Group_4_3__0 )* ) ;
    public final void rule__Faculty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2890:1: ( ( ( rule__Faculty__Group_4_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2891:1: ( ( rule__Faculty__Group_4_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2891:1: ( ( rule__Faculty__Group_4_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2892:1: ( rule__Faculty__Group_4_3__0 )*
            {
             before(grammarAccess.getFacultyAccess().getGroup_4_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2893:1: ( rule__Faculty__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2893:2: rule__Faculty__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4_3__0_in_rule__Faculty__Group_4__3__Impl5731);
            	    rule__Faculty__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFacultyAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__3__Impl"


    // $ANTLR start "rule__Faculty__Group_4__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2903:1: rule__Faculty__Group_4__4 : rule__Faculty__Group_4__4__Impl ;
    public final void rule__Faculty__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2907:1: ( rule__Faculty__Group_4__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2908:2: rule__Faculty__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4__4__Impl_in_rule__Faculty__Group_4__45762);
            rule__Faculty__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__4"


    // $ANTLR start "rule__Faculty__Group_4__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2914:1: rule__Faculty__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Faculty__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2918:1: ( ( ')' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2919:1: ( ')' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2919:1: ( ')' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2920:1: ')'
            {
             before(grammarAccess.getFacultyAccess().getRightParenthesisKeyword_4_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Faculty__Group_4__4__Impl5790); 
             after(grammarAccess.getFacultyAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4__4__Impl"


    // $ANTLR start "rule__Faculty__Group_4_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2943:1: rule__Faculty__Group_4_3__0 : rule__Faculty__Group_4_3__0__Impl rule__Faculty__Group_4_3__1 ;
    public final void rule__Faculty__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2947:1: ( rule__Faculty__Group_4_3__0__Impl rule__Faculty__Group_4_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2948:2: rule__Faculty__Group_4_3__0__Impl rule__Faculty__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4_3__0__Impl_in_rule__Faculty__Group_4_3__05831);
            rule__Faculty__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4_3__1_in_rule__Faculty__Group_4_3__05834);
            rule__Faculty__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4_3__0"


    // $ANTLR start "rule__Faculty__Group_4_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2955:1: rule__Faculty__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Faculty__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2959:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2960:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2960:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2961:1: ','
            {
             before(grammarAccess.getFacultyAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Faculty__Group_4_3__0__Impl5862); 
             after(grammarAccess.getFacultyAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4_3__0__Impl"


    // $ANTLR start "rule__Faculty__Group_4_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2974:1: rule__Faculty__Group_4_3__1 : rule__Faculty__Group_4_3__1__Impl ;
    public final void rule__Faculty__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2978:1: ( rule__Faculty__Group_4_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2979:2: rule__Faculty__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__Group_4_3__1__Impl_in_rule__Faculty__Group_4_3__15893);
            rule__Faculty__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4_3__1"


    // $ANTLR start "rule__Faculty__Group_4_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2985:1: rule__Faculty__Group_4_3__1__Impl : ( ( rule__Faculty__CourseofstudyAssignment_4_3_1 ) ) ;
    public final void rule__Faculty__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2989:1: ( ( ( rule__Faculty__CourseofstudyAssignment_4_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2990:1: ( ( rule__Faculty__CourseofstudyAssignment_4_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2990:1: ( ( rule__Faculty__CourseofstudyAssignment_4_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2991:1: ( rule__Faculty__CourseofstudyAssignment_4_3_1 )
            {
             before(grammarAccess.getFacultyAccess().getCourseofstudyAssignment_4_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2992:1: ( rule__Faculty__CourseofstudyAssignment_4_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:2992:2: rule__Faculty__CourseofstudyAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Faculty__CourseofstudyAssignment_4_3_1_in_rule__Faculty__Group_4_3__1__Impl5920);
            rule__Faculty__CourseofstudyAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFacultyAccess().getCourseofstudyAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__Group_4_3__1__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3006:1: rule__CourseOfStudy__Group__0 : rule__CourseOfStudy__Group__0__Impl rule__CourseOfStudy__Group__1 ;
    public final void rule__CourseOfStudy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3010:1: ( rule__CourseOfStudy__Group__0__Impl rule__CourseOfStudy__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3011:2: rule__CourseOfStudy__Group__0__Impl rule__CourseOfStudy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__0__Impl_in_rule__CourseOfStudy__Group__05954);
            rule__CourseOfStudy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__1_in_rule__CourseOfStudy__Group__05957);
            rule__CourseOfStudy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__0"


    // $ANTLR start "rule__CourseOfStudy__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3018:1: rule__CourseOfStudy__Group__0__Impl : ( 'CourseOfStudy' ) ;
    public final void rule__CourseOfStudy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3022:1: ( ( 'CourseOfStudy' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3023:1: ( 'CourseOfStudy' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3023:1: ( 'CourseOfStudy' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3024:1: 'CourseOfStudy'
            {
             before(grammarAccess.getCourseOfStudyAccess().getCourseOfStudyKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__CourseOfStudy__Group__0__Impl5985); 
             after(grammarAccess.getCourseOfStudyAccess().getCourseOfStudyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__0__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3037:1: rule__CourseOfStudy__Group__1 : rule__CourseOfStudy__Group__1__Impl rule__CourseOfStudy__Group__2 ;
    public final void rule__CourseOfStudy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3041:1: ( rule__CourseOfStudy__Group__1__Impl rule__CourseOfStudy__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3042:2: rule__CourseOfStudy__Group__1__Impl rule__CourseOfStudy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__1__Impl_in_rule__CourseOfStudy__Group__16016);
            rule__CourseOfStudy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__2_in_rule__CourseOfStudy__Group__16019);
            rule__CourseOfStudy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__1"


    // $ANTLR start "rule__CourseOfStudy__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3049:1: rule__CourseOfStudy__Group__1__Impl : ( ( rule__CourseOfStudy__NameAssignment_1 ) ) ;
    public final void rule__CourseOfStudy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3053:1: ( ( ( rule__CourseOfStudy__NameAssignment_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3054:1: ( ( rule__CourseOfStudy__NameAssignment_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3054:1: ( ( rule__CourseOfStudy__NameAssignment_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3055:1: ( rule__CourseOfStudy__NameAssignment_1 )
            {
             before(grammarAccess.getCourseOfStudyAccess().getNameAssignment_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3056:1: ( rule__CourseOfStudy__NameAssignment_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3056:2: rule__CourseOfStudy__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__NameAssignment_1_in_rule__CourseOfStudy__Group__1__Impl6046);
            rule__CourseOfStudy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseOfStudyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__1__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3066:1: rule__CourseOfStudy__Group__2 : rule__CourseOfStudy__Group__2__Impl rule__CourseOfStudy__Group__3 ;
    public final void rule__CourseOfStudy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3070:1: ( rule__CourseOfStudy__Group__2__Impl rule__CourseOfStudy__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3071:2: rule__CourseOfStudy__Group__2__Impl rule__CourseOfStudy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__2__Impl_in_rule__CourseOfStudy__Group__26076);
            rule__CourseOfStudy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__3_in_rule__CourseOfStudy__Group__26079);
            rule__CourseOfStudy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__2"


    // $ANTLR start "rule__CourseOfStudy__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3078:1: rule__CourseOfStudy__Group__2__Impl : ( '{' ) ;
    public final void rule__CourseOfStudy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3082:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3083:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3083:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3084:1: '{'
            {
             before(grammarAccess.getCourseOfStudyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__CourseOfStudy__Group__2__Impl6107); 
             after(grammarAccess.getCourseOfStudyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__2__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3097:1: rule__CourseOfStudy__Group__3 : rule__CourseOfStudy__Group__3__Impl rule__CourseOfStudy__Group__4 ;
    public final void rule__CourseOfStudy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3101:1: ( rule__CourseOfStudy__Group__3__Impl rule__CourseOfStudy__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3102:2: rule__CourseOfStudy__Group__3__Impl rule__CourseOfStudy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__3__Impl_in_rule__CourseOfStudy__Group__36138);
            rule__CourseOfStudy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__4_in_rule__CourseOfStudy__Group__36141);
            rule__CourseOfStudy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__3"


    // $ANTLR start "rule__CourseOfStudy__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3109:1: rule__CourseOfStudy__Group__3__Impl : ( ( rule__CourseOfStudy__Group_3__0 )? ) ;
    public final void rule__CourseOfStudy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3113:1: ( ( ( rule__CourseOfStudy__Group_3__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3114:1: ( ( rule__CourseOfStudy__Group_3__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3114:1: ( ( rule__CourseOfStudy__Group_3__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3115:1: ( rule__CourseOfStudy__Group_3__0 )?
            {
             before(grammarAccess.getCourseOfStudyAccess().getGroup_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3116:1: ( rule__CourseOfStudy__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3116:2: rule__CourseOfStudy__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__0_in_rule__CourseOfStudy__Group__3__Impl6168);
                    rule__CourseOfStudy__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseOfStudyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__3__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3126:1: rule__CourseOfStudy__Group__4 : rule__CourseOfStudy__Group__4__Impl rule__CourseOfStudy__Group__5 ;
    public final void rule__CourseOfStudy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3130:1: ( rule__CourseOfStudy__Group__4__Impl rule__CourseOfStudy__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3131:2: rule__CourseOfStudy__Group__4__Impl rule__CourseOfStudy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__4__Impl_in_rule__CourseOfStudy__Group__46199);
            rule__CourseOfStudy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__5_in_rule__CourseOfStudy__Group__46202);
            rule__CourseOfStudy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__4"


    // $ANTLR start "rule__CourseOfStudy__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3138:1: rule__CourseOfStudy__Group__4__Impl : ( 'faculty' ) ;
    public final void rule__CourseOfStudy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3142:1: ( ( 'faculty' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3143:1: ( 'faculty' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3143:1: ( 'faculty' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3144:1: 'faculty'
            {
             before(grammarAccess.getCourseOfStudyAccess().getFacultyKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__CourseOfStudy__Group__4__Impl6230); 
             after(grammarAccess.getCourseOfStudyAccess().getFacultyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__4__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3157:1: rule__CourseOfStudy__Group__5 : rule__CourseOfStudy__Group__5__Impl rule__CourseOfStudy__Group__6 ;
    public final void rule__CourseOfStudy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3161:1: ( rule__CourseOfStudy__Group__5__Impl rule__CourseOfStudy__Group__6 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3162:2: rule__CourseOfStudy__Group__5__Impl rule__CourseOfStudy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__5__Impl_in_rule__CourseOfStudy__Group__56261);
            rule__CourseOfStudy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__6_in_rule__CourseOfStudy__Group__56264);
            rule__CourseOfStudy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__5"


    // $ANTLR start "rule__CourseOfStudy__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3169:1: rule__CourseOfStudy__Group__5__Impl : ( ( rule__CourseOfStudy__FacultyAssignment_5 ) ) ;
    public final void rule__CourseOfStudy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3173:1: ( ( ( rule__CourseOfStudy__FacultyAssignment_5 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3174:1: ( ( rule__CourseOfStudy__FacultyAssignment_5 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3174:1: ( ( rule__CourseOfStudy__FacultyAssignment_5 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3175:1: ( rule__CourseOfStudy__FacultyAssignment_5 )
            {
             before(grammarAccess.getCourseOfStudyAccess().getFacultyAssignment_5()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3176:1: ( rule__CourseOfStudy__FacultyAssignment_5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3176:2: rule__CourseOfStudy__FacultyAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__FacultyAssignment_5_in_rule__CourseOfStudy__Group__5__Impl6291);
            rule__CourseOfStudy__FacultyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCourseOfStudyAccess().getFacultyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__5__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__6"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3186:1: rule__CourseOfStudy__Group__6 : rule__CourseOfStudy__Group__6__Impl rule__CourseOfStudy__Group__7 ;
    public final void rule__CourseOfStudy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3190:1: ( rule__CourseOfStudy__Group__6__Impl rule__CourseOfStudy__Group__7 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3191:2: rule__CourseOfStudy__Group__6__Impl rule__CourseOfStudy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__6__Impl_in_rule__CourseOfStudy__Group__66321);
            rule__CourseOfStudy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__7_in_rule__CourseOfStudy__Group__66324);
            rule__CourseOfStudy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__6"


    // $ANTLR start "rule__CourseOfStudy__Group__6__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3198:1: rule__CourseOfStudy__Group__6__Impl : ( ( rule__CourseOfStudy__Group_6__0 )? ) ;
    public final void rule__CourseOfStudy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3202:1: ( ( ( rule__CourseOfStudy__Group_6__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3203:1: ( ( rule__CourseOfStudy__Group_6__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3203:1: ( ( rule__CourseOfStudy__Group_6__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3204:1: ( rule__CourseOfStudy__Group_6__0 )?
            {
             before(grammarAccess.getCourseOfStudyAccess().getGroup_6()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3205:1: ( rule__CourseOfStudy__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3205:2: rule__CourseOfStudy__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__0_in_rule__CourseOfStudy__Group__6__Impl6351);
                    rule__CourseOfStudy__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseOfStudyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__6__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group__7"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3215:1: rule__CourseOfStudy__Group__7 : rule__CourseOfStudy__Group__7__Impl ;
    public final void rule__CourseOfStudy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3219:1: ( rule__CourseOfStudy__Group__7__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3220:2: rule__CourseOfStudy__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group__7__Impl_in_rule__CourseOfStudy__Group__76382);
            rule__CourseOfStudy__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__7"


    // $ANTLR start "rule__CourseOfStudy__Group__7__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3226:1: rule__CourseOfStudy__Group__7__Impl : ( '}' ) ;
    public final void rule__CourseOfStudy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3230:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3231:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3231:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3232:1: '}'
            {
             before(grammarAccess.getCourseOfStudyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__CourseOfStudy__Group__7__Impl6410); 
             after(grammarAccess.getCourseOfStudyAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group__7__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3261:1: rule__CourseOfStudy__Group_3__0 : rule__CourseOfStudy__Group_3__0__Impl rule__CourseOfStudy__Group_3__1 ;
    public final void rule__CourseOfStudy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3265:1: ( rule__CourseOfStudy__Group_3__0__Impl rule__CourseOfStudy__Group_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3266:2: rule__CourseOfStudy__Group_3__0__Impl rule__CourseOfStudy__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__0__Impl_in_rule__CourseOfStudy__Group_3__06457);
            rule__CourseOfStudy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__1_in_rule__CourseOfStudy__Group_3__06460);
            rule__CourseOfStudy__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__0"


    // $ANTLR start "rule__CourseOfStudy__Group_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3273:1: rule__CourseOfStudy__Group_3__0__Impl : ( 'courses' ) ;
    public final void rule__CourseOfStudy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3277:1: ( ( 'courses' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3278:1: ( 'courses' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3278:1: ( 'courses' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3279:1: 'courses'
            {
             before(grammarAccess.getCourseOfStudyAccess().getCoursesKeyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__CourseOfStudy__Group_3__0__Impl6488); 
             after(grammarAccess.getCourseOfStudyAccess().getCoursesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__0__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3292:1: rule__CourseOfStudy__Group_3__1 : rule__CourseOfStudy__Group_3__1__Impl rule__CourseOfStudy__Group_3__2 ;
    public final void rule__CourseOfStudy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3296:1: ( rule__CourseOfStudy__Group_3__1__Impl rule__CourseOfStudy__Group_3__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3297:2: rule__CourseOfStudy__Group_3__1__Impl rule__CourseOfStudy__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__1__Impl_in_rule__CourseOfStudy__Group_3__16519);
            rule__CourseOfStudy__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__2_in_rule__CourseOfStudy__Group_3__16522);
            rule__CourseOfStudy__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__1"


    // $ANTLR start "rule__CourseOfStudy__Group_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3304:1: rule__CourseOfStudy__Group_3__1__Impl : ( '(' ) ;
    public final void rule__CourseOfStudy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3308:1: ( ( '(' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3309:1: ( '(' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3309:1: ( '(' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3310:1: '('
            {
             before(grammarAccess.getCourseOfStudyAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__CourseOfStudy__Group_3__1__Impl6550); 
             after(grammarAccess.getCourseOfStudyAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__1__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_3__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3323:1: rule__CourseOfStudy__Group_3__2 : rule__CourseOfStudy__Group_3__2__Impl rule__CourseOfStudy__Group_3__3 ;
    public final void rule__CourseOfStudy__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3327:1: ( rule__CourseOfStudy__Group_3__2__Impl rule__CourseOfStudy__Group_3__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3328:2: rule__CourseOfStudy__Group_3__2__Impl rule__CourseOfStudy__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__2__Impl_in_rule__CourseOfStudy__Group_3__26581);
            rule__CourseOfStudy__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__3_in_rule__CourseOfStudy__Group_3__26584);
            rule__CourseOfStudy__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__2"


    // $ANTLR start "rule__CourseOfStudy__Group_3__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3335:1: rule__CourseOfStudy__Group_3__2__Impl : ( ( rule__CourseOfStudy__CourseAssignment_3_2 ) ) ;
    public final void rule__CourseOfStudy__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3339:1: ( ( ( rule__CourseOfStudy__CourseAssignment_3_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3340:1: ( ( rule__CourseOfStudy__CourseAssignment_3_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3340:1: ( ( rule__CourseOfStudy__CourseAssignment_3_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3341:1: ( rule__CourseOfStudy__CourseAssignment_3_2 )
            {
             before(grammarAccess.getCourseOfStudyAccess().getCourseAssignment_3_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3342:1: ( rule__CourseOfStudy__CourseAssignment_3_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3342:2: rule__CourseOfStudy__CourseAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__CourseAssignment_3_2_in_rule__CourseOfStudy__Group_3__2__Impl6611);
            rule__CourseOfStudy__CourseAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseOfStudyAccess().getCourseAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__2__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_3__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3352:1: rule__CourseOfStudy__Group_3__3 : rule__CourseOfStudy__Group_3__3__Impl rule__CourseOfStudy__Group_3__4 ;
    public final void rule__CourseOfStudy__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3356:1: ( rule__CourseOfStudy__Group_3__3__Impl rule__CourseOfStudy__Group_3__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3357:2: rule__CourseOfStudy__Group_3__3__Impl rule__CourseOfStudy__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__3__Impl_in_rule__CourseOfStudy__Group_3__36641);
            rule__CourseOfStudy__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__4_in_rule__CourseOfStudy__Group_3__36644);
            rule__CourseOfStudy__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__3"


    // $ANTLR start "rule__CourseOfStudy__Group_3__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3364:1: rule__CourseOfStudy__Group_3__3__Impl : ( ( rule__CourseOfStudy__Group_3_3__0 )* ) ;
    public final void rule__CourseOfStudy__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3368:1: ( ( ( rule__CourseOfStudy__Group_3_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3369:1: ( ( rule__CourseOfStudy__Group_3_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3369:1: ( ( rule__CourseOfStudy__Group_3_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3370:1: ( rule__CourseOfStudy__Group_3_3__0 )*
            {
             before(grammarAccess.getCourseOfStudyAccess().getGroup_3_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3371:1: ( rule__CourseOfStudy__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3371:2: rule__CourseOfStudy__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3_3__0_in_rule__CourseOfStudy__Group_3__3__Impl6671);
            	    rule__CourseOfStudy__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCourseOfStudyAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__3__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_3__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3381:1: rule__CourseOfStudy__Group_3__4 : rule__CourseOfStudy__Group_3__4__Impl ;
    public final void rule__CourseOfStudy__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3385:1: ( rule__CourseOfStudy__Group_3__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3386:2: rule__CourseOfStudy__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3__4__Impl_in_rule__CourseOfStudy__Group_3__46702);
            rule__CourseOfStudy__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__4"


    // $ANTLR start "rule__CourseOfStudy__Group_3__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3392:1: rule__CourseOfStudy__Group_3__4__Impl : ( ')' ) ;
    public final void rule__CourseOfStudy__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3396:1: ( ( ')' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3397:1: ( ')' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3397:1: ( ')' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3398:1: ')'
            {
             before(grammarAccess.getCourseOfStudyAccess().getRightParenthesisKeyword_3_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__CourseOfStudy__Group_3__4__Impl6730); 
             after(grammarAccess.getCourseOfStudyAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3__4__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_3_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3421:1: rule__CourseOfStudy__Group_3_3__0 : rule__CourseOfStudy__Group_3_3__0__Impl rule__CourseOfStudy__Group_3_3__1 ;
    public final void rule__CourseOfStudy__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3425:1: ( rule__CourseOfStudy__Group_3_3__0__Impl rule__CourseOfStudy__Group_3_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3426:2: rule__CourseOfStudy__Group_3_3__0__Impl rule__CourseOfStudy__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3_3__0__Impl_in_rule__CourseOfStudy__Group_3_3__06771);
            rule__CourseOfStudy__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3_3__1_in_rule__CourseOfStudy__Group_3_3__06774);
            rule__CourseOfStudy__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3_3__0"


    // $ANTLR start "rule__CourseOfStudy__Group_3_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3433:1: rule__CourseOfStudy__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CourseOfStudy__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3437:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3438:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3438:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3439:1: ','
            {
             before(grammarAccess.getCourseOfStudyAccess().getCommaKeyword_3_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CourseOfStudy__Group_3_3__0__Impl6802); 
             after(grammarAccess.getCourseOfStudyAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3_3__0__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_3_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3452:1: rule__CourseOfStudy__Group_3_3__1 : rule__CourseOfStudy__Group_3_3__1__Impl ;
    public final void rule__CourseOfStudy__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3456:1: ( rule__CourseOfStudy__Group_3_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3457:2: rule__CourseOfStudy__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_3_3__1__Impl_in_rule__CourseOfStudy__Group_3_3__16833);
            rule__CourseOfStudy__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3_3__1"


    // $ANTLR start "rule__CourseOfStudy__Group_3_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3463:1: rule__CourseOfStudy__Group_3_3__1__Impl : ( ( rule__CourseOfStudy__CourseAssignment_3_3_1 ) ) ;
    public final void rule__CourseOfStudy__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3467:1: ( ( ( rule__CourseOfStudy__CourseAssignment_3_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3468:1: ( ( rule__CourseOfStudy__CourseAssignment_3_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3468:1: ( ( rule__CourseOfStudy__CourseAssignment_3_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3469:1: ( rule__CourseOfStudy__CourseAssignment_3_3_1 )
            {
             before(grammarAccess.getCourseOfStudyAccess().getCourseAssignment_3_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3470:1: ( rule__CourseOfStudy__CourseAssignment_3_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3470:2: rule__CourseOfStudy__CourseAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__CourseAssignment_3_3_1_in_rule__CourseOfStudy__Group_3_3__1__Impl6860);
            rule__CourseOfStudy__CourseAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseOfStudyAccess().getCourseAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_3_3__1__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_6__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3484:1: rule__CourseOfStudy__Group_6__0 : rule__CourseOfStudy__Group_6__0__Impl rule__CourseOfStudy__Group_6__1 ;
    public final void rule__CourseOfStudy__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3488:1: ( rule__CourseOfStudy__Group_6__0__Impl rule__CourseOfStudy__Group_6__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3489:2: rule__CourseOfStudy__Group_6__0__Impl rule__CourseOfStudy__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__0__Impl_in_rule__CourseOfStudy__Group_6__06894);
            rule__CourseOfStudy__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__1_in_rule__CourseOfStudy__Group_6__06897);
            rule__CourseOfStudy__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__0"


    // $ANTLR start "rule__CourseOfStudy__Group_6__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3496:1: rule__CourseOfStudy__Group_6__0__Impl : ( 'students' ) ;
    public final void rule__CourseOfStudy__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3500:1: ( ( 'students' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3501:1: ( 'students' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3501:1: ( 'students' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3502:1: 'students'
            {
             before(grammarAccess.getCourseOfStudyAccess().getStudentsKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CourseOfStudy__Group_6__0__Impl6925); 
             after(grammarAccess.getCourseOfStudyAccess().getStudentsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__0__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_6__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3515:1: rule__CourseOfStudy__Group_6__1 : rule__CourseOfStudy__Group_6__1__Impl rule__CourseOfStudy__Group_6__2 ;
    public final void rule__CourseOfStudy__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3519:1: ( rule__CourseOfStudy__Group_6__1__Impl rule__CourseOfStudy__Group_6__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3520:2: rule__CourseOfStudy__Group_6__1__Impl rule__CourseOfStudy__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__1__Impl_in_rule__CourseOfStudy__Group_6__16956);
            rule__CourseOfStudy__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__2_in_rule__CourseOfStudy__Group_6__16959);
            rule__CourseOfStudy__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__1"


    // $ANTLR start "rule__CourseOfStudy__Group_6__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3527:1: rule__CourseOfStudy__Group_6__1__Impl : ( '(' ) ;
    public final void rule__CourseOfStudy__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3531:1: ( ( '(' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3532:1: ( '(' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3532:1: ( '(' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3533:1: '('
            {
             before(grammarAccess.getCourseOfStudyAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__CourseOfStudy__Group_6__1__Impl6987); 
             after(grammarAccess.getCourseOfStudyAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__1__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_6__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3546:1: rule__CourseOfStudy__Group_6__2 : rule__CourseOfStudy__Group_6__2__Impl rule__CourseOfStudy__Group_6__3 ;
    public final void rule__CourseOfStudy__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3550:1: ( rule__CourseOfStudy__Group_6__2__Impl rule__CourseOfStudy__Group_6__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3551:2: rule__CourseOfStudy__Group_6__2__Impl rule__CourseOfStudy__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__2__Impl_in_rule__CourseOfStudy__Group_6__27018);
            rule__CourseOfStudy__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__3_in_rule__CourseOfStudy__Group_6__27021);
            rule__CourseOfStudy__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__2"


    // $ANTLR start "rule__CourseOfStudy__Group_6__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3558:1: rule__CourseOfStudy__Group_6__2__Impl : ( ( rule__CourseOfStudy__StudentAssignment_6_2 ) ) ;
    public final void rule__CourseOfStudy__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3562:1: ( ( ( rule__CourseOfStudy__StudentAssignment_6_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3563:1: ( ( rule__CourseOfStudy__StudentAssignment_6_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3563:1: ( ( rule__CourseOfStudy__StudentAssignment_6_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3564:1: ( rule__CourseOfStudy__StudentAssignment_6_2 )
            {
             before(grammarAccess.getCourseOfStudyAccess().getStudentAssignment_6_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3565:1: ( rule__CourseOfStudy__StudentAssignment_6_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3565:2: rule__CourseOfStudy__StudentAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__StudentAssignment_6_2_in_rule__CourseOfStudy__Group_6__2__Impl7048);
            rule__CourseOfStudy__StudentAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseOfStudyAccess().getStudentAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__2__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_6__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3575:1: rule__CourseOfStudy__Group_6__3 : rule__CourseOfStudy__Group_6__3__Impl rule__CourseOfStudy__Group_6__4 ;
    public final void rule__CourseOfStudy__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3579:1: ( rule__CourseOfStudy__Group_6__3__Impl rule__CourseOfStudy__Group_6__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3580:2: rule__CourseOfStudy__Group_6__3__Impl rule__CourseOfStudy__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__3__Impl_in_rule__CourseOfStudy__Group_6__37078);
            rule__CourseOfStudy__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__4_in_rule__CourseOfStudy__Group_6__37081);
            rule__CourseOfStudy__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__3"


    // $ANTLR start "rule__CourseOfStudy__Group_6__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3587:1: rule__CourseOfStudy__Group_6__3__Impl : ( ( rule__CourseOfStudy__Group_6_3__0 )* ) ;
    public final void rule__CourseOfStudy__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3591:1: ( ( ( rule__CourseOfStudy__Group_6_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3592:1: ( ( rule__CourseOfStudy__Group_6_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3592:1: ( ( rule__CourseOfStudy__Group_6_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3593:1: ( rule__CourseOfStudy__Group_6_3__0 )*
            {
             before(grammarAccess.getCourseOfStudyAccess().getGroup_6_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3594:1: ( rule__CourseOfStudy__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3594:2: rule__CourseOfStudy__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6_3__0_in_rule__CourseOfStudy__Group_6__3__Impl7108);
            	    rule__CourseOfStudy__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCourseOfStudyAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__3__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_6__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3604:1: rule__CourseOfStudy__Group_6__4 : rule__CourseOfStudy__Group_6__4__Impl ;
    public final void rule__CourseOfStudy__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3608:1: ( rule__CourseOfStudy__Group_6__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3609:2: rule__CourseOfStudy__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6__4__Impl_in_rule__CourseOfStudy__Group_6__47139);
            rule__CourseOfStudy__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__4"


    // $ANTLR start "rule__CourseOfStudy__Group_6__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3615:1: rule__CourseOfStudy__Group_6__4__Impl : ( ')' ) ;
    public final void rule__CourseOfStudy__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3619:1: ( ( ')' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3620:1: ( ')' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3620:1: ( ')' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3621:1: ')'
            {
             before(grammarAccess.getCourseOfStudyAccess().getRightParenthesisKeyword_6_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__CourseOfStudy__Group_6__4__Impl7167); 
             after(grammarAccess.getCourseOfStudyAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6__4__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_6_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3644:1: rule__CourseOfStudy__Group_6_3__0 : rule__CourseOfStudy__Group_6_3__0__Impl rule__CourseOfStudy__Group_6_3__1 ;
    public final void rule__CourseOfStudy__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3648:1: ( rule__CourseOfStudy__Group_6_3__0__Impl rule__CourseOfStudy__Group_6_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3649:2: rule__CourseOfStudy__Group_6_3__0__Impl rule__CourseOfStudy__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6_3__0__Impl_in_rule__CourseOfStudy__Group_6_3__07208);
            rule__CourseOfStudy__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6_3__1_in_rule__CourseOfStudy__Group_6_3__07211);
            rule__CourseOfStudy__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6_3__0"


    // $ANTLR start "rule__CourseOfStudy__Group_6_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3656:1: rule__CourseOfStudy__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__CourseOfStudy__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3660:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3661:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3661:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3662:1: ','
            {
             before(grammarAccess.getCourseOfStudyAccess().getCommaKeyword_6_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CourseOfStudy__Group_6_3__0__Impl7239); 
             after(grammarAccess.getCourseOfStudyAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6_3__0__Impl"


    // $ANTLR start "rule__CourseOfStudy__Group_6_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3675:1: rule__CourseOfStudy__Group_6_3__1 : rule__CourseOfStudy__Group_6_3__1__Impl ;
    public final void rule__CourseOfStudy__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3679:1: ( rule__CourseOfStudy__Group_6_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3680:2: rule__CourseOfStudy__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__Group_6_3__1__Impl_in_rule__CourseOfStudy__Group_6_3__17270);
            rule__CourseOfStudy__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6_3__1"


    // $ANTLR start "rule__CourseOfStudy__Group_6_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3686:1: rule__CourseOfStudy__Group_6_3__1__Impl : ( ( rule__CourseOfStudy__StudentAssignment_6_3_1 ) ) ;
    public final void rule__CourseOfStudy__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3690:1: ( ( ( rule__CourseOfStudy__StudentAssignment_6_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3691:1: ( ( rule__CourseOfStudy__StudentAssignment_6_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3691:1: ( ( rule__CourseOfStudy__StudentAssignment_6_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3692:1: ( rule__CourseOfStudy__StudentAssignment_6_3_1 )
            {
             before(grammarAccess.getCourseOfStudyAccess().getStudentAssignment_6_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3693:1: ( rule__CourseOfStudy__StudentAssignment_6_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3693:2: rule__CourseOfStudy__StudentAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseOfStudy__StudentAssignment_6_3_1_in_rule__CourseOfStudy__Group_6_3__1__Impl7297);
            rule__CourseOfStudy__StudentAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseOfStudyAccess().getStudentAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__Group_6_3__1__Impl"


    // $ANTLR start "rule__Course__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3707:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3711:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3712:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__07331);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1_in_rule__Course__Group__07334);
            rule__Course__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3719:1: rule__Course__Group__0__Impl : ( 'Course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3723:1: ( ( 'Course' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3724:1: ( 'Course' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3724:1: ( 'Course' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3725:1: 'Course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Course__Group__0__Impl7362); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3738:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3742:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3743:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__17393);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2_in_rule__Course__Group__17396);
            rule__Course__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3750:1: rule__Course__Group__1__Impl : ( ( rule__Course__NameAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3754:1: ( ( ( rule__Course__NameAssignment_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3755:1: ( ( rule__Course__NameAssignment_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3755:1: ( ( rule__Course__NameAssignment_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3756:1: ( rule__Course__NameAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3757:1: ( rule__Course__NameAssignment_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3757:2: rule__Course__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl7423);
            rule__Course__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3767:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3771:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3772:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__27453);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3_in_rule__Course__Group__27456);
            rule__Course__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3779:1: rule__Course__Group__2__Impl : ( '{' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3783:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3784:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3784:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3785:1: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Course__Group__2__Impl7484); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3798:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3802:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3803:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__37515);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4_in_rule__Course__Group__37518);
            rule__Course__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3810:1: rule__Course__Group__3__Impl : ( ( rule__Course__Group_3__0 )? ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3814:1: ( ( ( rule__Course__Group_3__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3815:1: ( ( rule__Course__Group_3__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3815:1: ( ( rule__Course__Group_3__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3816:1: ( rule__Course__Group_3__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3817:1: ( rule__Course__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3817:2: rule__Course__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Course__Group_3__0_in_rule__Course__Group__3__Impl7545);
                    rule__Course__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3827:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3831:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3832:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__47576);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__5_in_rule__Course__Group__47579);
            rule__Course__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3839:1: rule__Course__Group__4__Impl : ( ( rule__Course__Group_4__0 )? ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3843:1: ( ( ( rule__Course__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3844:1: ( ( rule__Course__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3844:1: ( ( rule__Course__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3845:1: ( rule__Course__Group_4__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3846:1: ( rule__Course__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3846:2: rule__Course__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__0_in_rule__Course__Group__4__Impl7606);
                    rule__Course__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3856:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3860:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3861:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__5__Impl_in_rule__Course__Group__57637);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__6_in_rule__Course__Group__57640);
            rule__Course__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3868:1: rule__Course__Group__5__Impl : ( 'taughtBy' ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3872:1: ( ( 'taughtBy' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3873:1: ( 'taughtBy' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3873:1: ( 'taughtBy' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3874:1: 'taughtBy'
            {
             before(grammarAccess.getCourseAccess().getTaughtByKeyword_5()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Course__Group__5__Impl7668); 
             after(grammarAccess.getCourseAccess().getTaughtByKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3887:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3891:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3892:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__6__Impl_in_rule__Course__Group__67699);
            rule__Course__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__7_in_rule__Course__Group__67702);
            rule__Course__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3899:1: rule__Course__Group__6__Impl : ( ( rule__Course__TaughtByAssignment_6 ) ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3903:1: ( ( ( rule__Course__TaughtByAssignment_6 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3904:1: ( ( rule__Course__TaughtByAssignment_6 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3904:1: ( ( rule__Course__TaughtByAssignment_6 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3905:1: ( rule__Course__TaughtByAssignment_6 )
            {
             before(grammarAccess.getCourseAccess().getTaughtByAssignment_6()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3906:1: ( rule__Course__TaughtByAssignment_6 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3906:2: rule__Course__TaughtByAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__TaughtByAssignment_6_in_rule__Course__Group__6__Impl7729);
            rule__Course__TaughtByAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTaughtByAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group__7"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3916:1: rule__Course__Group__7 : rule__Course__Group__7__Impl rule__Course__Group__8 ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3920:1: ( rule__Course__Group__7__Impl rule__Course__Group__8 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3921:2: rule__Course__Group__7__Impl rule__Course__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__7__Impl_in_rule__Course__Group__77759);
            rule__Course__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__8_in_rule__Course__Group__77762);
            rule__Course__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7"


    // $ANTLR start "rule__Course__Group__7__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3928:1: rule__Course__Group__7__Impl : ( ( rule__Course__Group_7__0 )? ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3932:1: ( ( ( rule__Course__Group_7__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3933:1: ( ( rule__Course__Group_7__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3933:1: ( ( rule__Course__Group_7__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3934:1: ( rule__Course__Group_7__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_7()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3935:1: ( rule__Course__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3935:2: rule__Course__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__0_in_rule__Course__Group__7__Impl7789);
                    rule__Course__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7__Impl"


    // $ANTLR start "rule__Course__Group__8"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3945:1: rule__Course__Group__8 : rule__Course__Group__8__Impl ;
    public final void rule__Course__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3949:1: ( rule__Course__Group__8__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3950:2: rule__Course__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__8__Impl_in_rule__Course__Group__87820);
            rule__Course__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__8"


    // $ANTLR start "rule__Course__Group__8__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3956:1: rule__Course__Group__8__Impl : ( '}' ) ;
    public final void rule__Course__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3960:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3961:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3961:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3962:1: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Course__Group__8__Impl7848); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__8__Impl"


    // $ANTLR start "rule__Course__Group_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3993:1: rule__Course__Group_3__0 : rule__Course__Group_3__0__Impl rule__Course__Group_3__1 ;
    public final void rule__Course__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3997:1: ( rule__Course__Group_3__0__Impl rule__Course__Group_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:3998:2: rule__Course__Group_3__0__Impl rule__Course__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_3__0__Impl_in_rule__Course__Group_3__07897);
            rule__Course__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_3__1_in_rule__Course__Group_3__07900);
            rule__Course__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_3__0"


    // $ANTLR start "rule__Course__Group_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4005:1: rule__Course__Group_3__0__Impl : ( 'courseNumber' ) ;
    public final void rule__Course__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4009:1: ( ( 'courseNumber' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4010:1: ( 'courseNumber' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4010:1: ( 'courseNumber' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4011:1: 'courseNumber'
            {
             before(grammarAccess.getCourseAccess().getCourseNumberKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Course__Group_3__0__Impl7928); 
             after(grammarAccess.getCourseAccess().getCourseNumberKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_3__0__Impl"


    // $ANTLR start "rule__Course__Group_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4024:1: rule__Course__Group_3__1 : rule__Course__Group_3__1__Impl ;
    public final void rule__Course__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4028:1: ( rule__Course__Group_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4029:2: rule__Course__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_3__1__Impl_in_rule__Course__Group_3__17959);
            rule__Course__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_3__1"


    // $ANTLR start "rule__Course__Group_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4035:1: rule__Course__Group_3__1__Impl : ( ( rule__Course__CourseNumberAssignment_3_1 ) ) ;
    public final void rule__Course__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4039:1: ( ( ( rule__Course__CourseNumberAssignment_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4040:1: ( ( rule__Course__CourseNumberAssignment_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4040:1: ( ( rule__Course__CourseNumberAssignment_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4041:1: ( rule__Course__CourseNumberAssignment_3_1 )
            {
             before(grammarAccess.getCourseAccess().getCourseNumberAssignment_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4042:1: ( rule__Course__CourseNumberAssignment_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4042:2: rule__Course__CourseNumberAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__CourseNumberAssignment_3_1_in_rule__Course__Group_3__1__Impl7986);
            rule__Course__CourseNumberAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseNumberAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_3__1__Impl"


    // $ANTLR start "rule__Course__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4056:1: rule__Course__Group_4__0 : rule__Course__Group_4__0__Impl rule__Course__Group_4__1 ;
    public final void rule__Course__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4060:1: ( rule__Course__Group_4__0__Impl rule__Course__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4061:2: rule__Course__Group_4__0__Impl rule__Course__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__0__Impl_in_rule__Course__Group_4__08020);
            rule__Course__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__1_in_rule__Course__Group_4__08023);
            rule__Course__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__0"


    // $ANTLR start "rule__Course__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4068:1: rule__Course__Group_4__0__Impl : ( 'enrolledStudents' ) ;
    public final void rule__Course__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4072:1: ( ( 'enrolledStudents' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4073:1: ( 'enrolledStudents' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4073:1: ( 'enrolledStudents' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4074:1: 'enrolledStudents'
            {
             before(grammarAccess.getCourseAccess().getEnrolledStudentsKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Course__Group_4__0__Impl8051); 
             after(grammarAccess.getCourseAccess().getEnrolledStudentsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__0__Impl"


    // $ANTLR start "rule__Course__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4087:1: rule__Course__Group_4__1 : rule__Course__Group_4__1__Impl rule__Course__Group_4__2 ;
    public final void rule__Course__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4091:1: ( rule__Course__Group_4__1__Impl rule__Course__Group_4__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4092:2: rule__Course__Group_4__1__Impl rule__Course__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__1__Impl_in_rule__Course__Group_4__18082);
            rule__Course__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__2_in_rule__Course__Group_4__18085);
            rule__Course__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__1"


    // $ANTLR start "rule__Course__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4099:1: rule__Course__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Course__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4103:1: ( ( '(' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4104:1: ( '(' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4104:1: ( '(' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4105:1: '('
            {
             before(grammarAccess.getCourseAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Course__Group_4__1__Impl8113); 
             after(grammarAccess.getCourseAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__1__Impl"


    // $ANTLR start "rule__Course__Group_4__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4118:1: rule__Course__Group_4__2 : rule__Course__Group_4__2__Impl rule__Course__Group_4__3 ;
    public final void rule__Course__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4122:1: ( rule__Course__Group_4__2__Impl rule__Course__Group_4__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4123:2: rule__Course__Group_4__2__Impl rule__Course__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__2__Impl_in_rule__Course__Group_4__28144);
            rule__Course__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__3_in_rule__Course__Group_4__28147);
            rule__Course__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__2"


    // $ANTLR start "rule__Course__Group_4__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4130:1: rule__Course__Group_4__2__Impl : ( ( rule__Course__EnrolledStudentAssignment_4_2 ) ) ;
    public final void rule__Course__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4134:1: ( ( ( rule__Course__EnrolledStudentAssignment_4_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4135:1: ( ( rule__Course__EnrolledStudentAssignment_4_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4135:1: ( ( rule__Course__EnrolledStudentAssignment_4_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4136:1: ( rule__Course__EnrolledStudentAssignment_4_2 )
            {
             before(grammarAccess.getCourseAccess().getEnrolledStudentAssignment_4_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4137:1: ( rule__Course__EnrolledStudentAssignment_4_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4137:2: rule__Course__EnrolledStudentAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__EnrolledStudentAssignment_4_2_in_rule__Course__Group_4__2__Impl8174);
            rule__Course__EnrolledStudentAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getEnrolledStudentAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__2__Impl"


    // $ANTLR start "rule__Course__Group_4__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4147:1: rule__Course__Group_4__3 : rule__Course__Group_4__3__Impl rule__Course__Group_4__4 ;
    public final void rule__Course__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4151:1: ( rule__Course__Group_4__3__Impl rule__Course__Group_4__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4152:2: rule__Course__Group_4__3__Impl rule__Course__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__3__Impl_in_rule__Course__Group_4__38204);
            rule__Course__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__4_in_rule__Course__Group_4__38207);
            rule__Course__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__3"


    // $ANTLR start "rule__Course__Group_4__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4159:1: rule__Course__Group_4__3__Impl : ( ( rule__Course__Group_4_3__0 )* ) ;
    public final void rule__Course__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4163:1: ( ( ( rule__Course__Group_4_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4164:1: ( ( rule__Course__Group_4_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4164:1: ( ( rule__Course__Group_4_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4165:1: ( rule__Course__Group_4_3__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_4_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4166:1: ( rule__Course__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4166:2: rule__Course__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4_3__0_in_rule__Course__Group_4__3__Impl8234);
            	    rule__Course__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__3__Impl"


    // $ANTLR start "rule__Course__Group_4__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4176:1: rule__Course__Group_4__4 : rule__Course__Group_4__4__Impl ;
    public final void rule__Course__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4180:1: ( rule__Course__Group_4__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4181:2: rule__Course__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4__4__Impl_in_rule__Course__Group_4__48265);
            rule__Course__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__4"


    // $ANTLR start "rule__Course__Group_4__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4187:1: rule__Course__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Course__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4191:1: ( ( ')' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4192:1: ( ')' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4192:1: ( ')' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4193:1: ')'
            {
             before(grammarAccess.getCourseAccess().getRightParenthesisKeyword_4_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Course__Group_4__4__Impl8293); 
             after(grammarAccess.getCourseAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__4__Impl"


    // $ANTLR start "rule__Course__Group_4_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4216:1: rule__Course__Group_4_3__0 : rule__Course__Group_4_3__0__Impl rule__Course__Group_4_3__1 ;
    public final void rule__Course__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4220:1: ( rule__Course__Group_4_3__0__Impl rule__Course__Group_4_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4221:2: rule__Course__Group_4_3__0__Impl rule__Course__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4_3__0__Impl_in_rule__Course__Group_4_3__08334);
            rule__Course__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4_3__1_in_rule__Course__Group_4_3__08337);
            rule__Course__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__0"


    // $ANTLR start "rule__Course__Group_4_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4228:1: rule__Course__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4232:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4233:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4233:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4234:1: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Course__Group_4_3__0__Impl8365); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__0__Impl"


    // $ANTLR start "rule__Course__Group_4_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4247:1: rule__Course__Group_4_3__1 : rule__Course__Group_4_3__1__Impl ;
    public final void rule__Course__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4251:1: ( rule__Course__Group_4_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4252:2: rule__Course__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_4_3__1__Impl_in_rule__Course__Group_4_3__18396);
            rule__Course__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__1"


    // $ANTLR start "rule__Course__Group_4_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4258:1: rule__Course__Group_4_3__1__Impl : ( ( rule__Course__EnrolledStudentAssignment_4_3_1 ) ) ;
    public final void rule__Course__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4262:1: ( ( ( rule__Course__EnrolledStudentAssignment_4_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4263:1: ( ( rule__Course__EnrolledStudentAssignment_4_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4263:1: ( ( rule__Course__EnrolledStudentAssignment_4_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4264:1: ( rule__Course__EnrolledStudentAssignment_4_3_1 )
            {
             before(grammarAccess.getCourseAccess().getEnrolledStudentAssignment_4_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4265:1: ( rule__Course__EnrolledStudentAssignment_4_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4265:2: rule__Course__EnrolledStudentAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__EnrolledStudentAssignment_4_3_1_in_rule__Course__Group_4_3__1__Impl8423);
            rule__Course__EnrolledStudentAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getEnrolledStudentAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__1__Impl"


    // $ANTLR start "rule__Course__Group_7__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4279:1: rule__Course__Group_7__0 : rule__Course__Group_7__0__Impl rule__Course__Group_7__1 ;
    public final void rule__Course__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4283:1: ( rule__Course__Group_7__0__Impl rule__Course__Group_7__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4284:2: rule__Course__Group_7__0__Impl rule__Course__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__0__Impl_in_rule__Course__Group_7__08457);
            rule__Course__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__1_in_rule__Course__Group_7__08460);
            rule__Course__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__0"


    // $ANTLR start "rule__Course__Group_7__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4291:1: rule__Course__Group_7__0__Impl : ( 'courseresults' ) ;
    public final void rule__Course__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4295:1: ( ( 'courseresults' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4296:1: ( 'courseresults' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4296:1: ( 'courseresults' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4297:1: 'courseresults'
            {
             before(grammarAccess.getCourseAccess().getCourseresultsKeyword_7_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Course__Group_7__0__Impl8488); 
             after(grammarAccess.getCourseAccess().getCourseresultsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__0__Impl"


    // $ANTLR start "rule__Course__Group_7__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4310:1: rule__Course__Group_7__1 : rule__Course__Group_7__1__Impl rule__Course__Group_7__2 ;
    public final void rule__Course__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4314:1: ( rule__Course__Group_7__1__Impl rule__Course__Group_7__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4315:2: rule__Course__Group_7__1__Impl rule__Course__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__1__Impl_in_rule__Course__Group_7__18519);
            rule__Course__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__2_in_rule__Course__Group_7__18522);
            rule__Course__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__1"


    // $ANTLR start "rule__Course__Group_7__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4322:1: rule__Course__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Course__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4326:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4327:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4327:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4328:1: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Course__Group_7__1__Impl8550); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__1__Impl"


    // $ANTLR start "rule__Course__Group_7__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4341:1: rule__Course__Group_7__2 : rule__Course__Group_7__2__Impl rule__Course__Group_7__3 ;
    public final void rule__Course__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4345:1: ( rule__Course__Group_7__2__Impl rule__Course__Group_7__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4346:2: rule__Course__Group_7__2__Impl rule__Course__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__2__Impl_in_rule__Course__Group_7__28581);
            rule__Course__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__3_in_rule__Course__Group_7__28584);
            rule__Course__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__2"


    // $ANTLR start "rule__Course__Group_7__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4353:1: rule__Course__Group_7__2__Impl : ( ( rule__Course__CourseresultAssignment_7_2 ) ) ;
    public final void rule__Course__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4357:1: ( ( ( rule__Course__CourseresultAssignment_7_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4358:1: ( ( rule__Course__CourseresultAssignment_7_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4358:1: ( ( rule__Course__CourseresultAssignment_7_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4359:1: ( rule__Course__CourseresultAssignment_7_2 )
            {
             before(grammarAccess.getCourseAccess().getCourseresultAssignment_7_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4360:1: ( rule__Course__CourseresultAssignment_7_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4360:2: rule__Course__CourseresultAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__CourseresultAssignment_7_2_in_rule__Course__Group_7__2__Impl8611);
            rule__Course__CourseresultAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseresultAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__2__Impl"


    // $ANTLR start "rule__Course__Group_7__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4370:1: rule__Course__Group_7__3 : rule__Course__Group_7__3__Impl rule__Course__Group_7__4 ;
    public final void rule__Course__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4374:1: ( rule__Course__Group_7__3__Impl rule__Course__Group_7__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4375:2: rule__Course__Group_7__3__Impl rule__Course__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__3__Impl_in_rule__Course__Group_7__38641);
            rule__Course__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__4_in_rule__Course__Group_7__38644);
            rule__Course__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__3"


    // $ANTLR start "rule__Course__Group_7__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4382:1: rule__Course__Group_7__3__Impl : ( ( rule__Course__Group_7_3__0 )* ) ;
    public final void rule__Course__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4386:1: ( ( ( rule__Course__Group_7_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4387:1: ( ( rule__Course__Group_7_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4387:1: ( ( rule__Course__Group_7_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4388:1: ( rule__Course__Group_7_3__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_7_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4389:1: ( rule__Course__Group_7_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4389:2: rule__Course__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7_3__0_in_rule__Course__Group_7__3__Impl8671);
            	    rule__Course__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__3__Impl"


    // $ANTLR start "rule__Course__Group_7__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4399:1: rule__Course__Group_7__4 : rule__Course__Group_7__4__Impl ;
    public final void rule__Course__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4403:1: ( rule__Course__Group_7__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4404:2: rule__Course__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7__4__Impl_in_rule__Course__Group_7__48702);
            rule__Course__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__4"


    // $ANTLR start "rule__Course__Group_7__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4410:1: rule__Course__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Course__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4414:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4415:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4415:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4416:1: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Course__Group_7__4__Impl8730); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7__4__Impl"


    // $ANTLR start "rule__Course__Group_7_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4439:1: rule__Course__Group_7_3__0 : rule__Course__Group_7_3__0__Impl rule__Course__Group_7_3__1 ;
    public final void rule__Course__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4443:1: ( rule__Course__Group_7_3__0__Impl rule__Course__Group_7_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4444:2: rule__Course__Group_7_3__0__Impl rule__Course__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7_3__0__Impl_in_rule__Course__Group_7_3__08771);
            rule__Course__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7_3__1_in_rule__Course__Group_7_3__08774);
            rule__Course__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7_3__0"


    // $ANTLR start "rule__Course__Group_7_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4451:1: rule__Course__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4455:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4456:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4456:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4457:1: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_7_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Course__Group_7_3__0__Impl8802); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7_3__0__Impl"


    // $ANTLR start "rule__Course__Group_7_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4470:1: rule__Course__Group_7_3__1 : rule__Course__Group_7_3__1__Impl ;
    public final void rule__Course__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4474:1: ( rule__Course__Group_7_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4475:2: rule__Course__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_7_3__1__Impl_in_rule__Course__Group_7_3__18833);
            rule__Course__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7_3__1"


    // $ANTLR start "rule__Course__Group_7_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4481:1: rule__Course__Group_7_3__1__Impl : ( ( rule__Course__CourseresultAssignment_7_3_1 ) ) ;
    public final void rule__Course__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4485:1: ( ( ( rule__Course__CourseresultAssignment_7_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4486:1: ( ( rule__Course__CourseresultAssignment_7_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4486:1: ( ( rule__Course__CourseresultAssignment_7_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4487:1: ( rule__Course__CourseresultAssignment_7_3_1 )
            {
             before(grammarAccess.getCourseAccess().getCourseresultAssignment_7_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4488:1: ( rule__Course__CourseresultAssignment_7_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4488:2: rule__Course__CourseresultAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__CourseresultAssignment_7_3_1_in_rule__Course__Group_7_3__1__Impl8860);
            rule__Course__CourseresultAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCourseresultAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_7_3__1__Impl"


    // $ANTLR start "rule__Student__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4502:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4506:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4507:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__0__Impl_in_rule__Student__Group__08894);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__1_in_rule__Student__Group__08897);
            rule__Student__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4514:1: rule__Student__Group__0__Impl : ( 'Student' ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4518:1: ( ( 'Student' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4519:1: ( 'Student' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4519:1: ( 'Student' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4520:1: 'Student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Student__Group__0__Impl8925); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4533:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4537:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4538:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__1__Impl_in_rule__Student__Group__18956);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__2_in_rule__Student__Group__18959);
            rule__Student__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4545:1: rule__Student__Group__1__Impl : ( ( rule__Student__NameAssignment_1 ) ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4549:1: ( ( ( rule__Student__NameAssignment_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4550:1: ( ( rule__Student__NameAssignment_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4550:1: ( ( rule__Student__NameAssignment_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4551:1: ( rule__Student__NameAssignment_1 )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4552:1: ( rule__Student__NameAssignment_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4552:2: rule__Student__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__NameAssignment_1_in_rule__Student__Group__1__Impl8986);
            rule__Student__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4562:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4566:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4567:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__2__Impl_in_rule__Student__Group__29016);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__3_in_rule__Student__Group__29019);
            rule__Student__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4574:1: rule__Student__Group__2__Impl : ( '{' ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4578:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4579:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4579:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4580:1: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Student__Group__2__Impl9047); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4593:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4597:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4598:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__3__Impl_in_rule__Student__Group__39078);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__4_in_rule__Student__Group__39081);
            rule__Student__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4605:1: rule__Student__Group__3__Impl : ( ( rule__Student__Group_3__0 )? ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4609:1: ( ( ( rule__Student__Group_3__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4610:1: ( ( rule__Student__Group_3__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4610:1: ( ( rule__Student__Group_3__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4611:1: ( rule__Student__Group_3__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4612:1: ( rule__Student__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4612:2: rule__Student__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Student__Group_3__0_in_rule__Student__Group__3__Impl9108);
                    rule__Student__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4622:1: rule__Student__Group__4 : rule__Student__Group__4__Impl rule__Student__Group__5 ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4626:1: ( rule__Student__Group__4__Impl rule__Student__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4627:2: rule__Student__Group__4__Impl rule__Student__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__4__Impl_in_rule__Student__Group__49139);
            rule__Student__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__5_in_rule__Student__Group__49142);
            rule__Student__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4634:1: rule__Student__Group__4__Impl : ( ( rule__Student__Group_4__0 )? ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4638:1: ( ( ( rule__Student__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4639:1: ( ( rule__Student__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4639:1: ( ( rule__Student__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4640:1: ( rule__Student__Group_4__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4641:1: ( rule__Student__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4641:2: rule__Student__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__0_in_rule__Student__Group__4__Impl9169);
                    rule__Student__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4651:1: rule__Student__Group__5 : rule__Student__Group__5__Impl rule__Student__Group__6 ;
    public final void rule__Student__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4655:1: ( rule__Student__Group__5__Impl rule__Student__Group__6 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4656:2: rule__Student__Group__5__Impl rule__Student__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__5__Impl_in_rule__Student__Group__59200);
            rule__Student__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__6_in_rule__Student__Group__59203);
            rule__Student__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5"


    // $ANTLR start "rule__Student__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4663:1: rule__Student__Group__5__Impl : ( 'courseofstudy' ) ;
    public final void rule__Student__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4667:1: ( ( 'courseofstudy' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4668:1: ( 'courseofstudy' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4668:1: ( 'courseofstudy' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4669:1: 'courseofstudy'
            {
             before(grammarAccess.getStudentAccess().getCourseofstudyKeyword_5()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Student__Group__5__Impl9231); 
             after(grammarAccess.getStudentAccess().getCourseofstudyKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5__Impl"


    // $ANTLR start "rule__Student__Group__6"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4682:1: rule__Student__Group__6 : rule__Student__Group__6__Impl rule__Student__Group__7 ;
    public final void rule__Student__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4686:1: ( rule__Student__Group__6__Impl rule__Student__Group__7 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4687:2: rule__Student__Group__6__Impl rule__Student__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__6__Impl_in_rule__Student__Group__69262);
            rule__Student__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__7_in_rule__Student__Group__69265);
            rule__Student__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6"


    // $ANTLR start "rule__Student__Group__6__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4694:1: rule__Student__Group__6__Impl : ( ( rule__Student__CourseofstudyAssignment_6 ) ) ;
    public final void rule__Student__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4698:1: ( ( ( rule__Student__CourseofstudyAssignment_6 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4699:1: ( ( rule__Student__CourseofstudyAssignment_6 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4699:1: ( ( rule__Student__CourseofstudyAssignment_6 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4700:1: ( rule__Student__CourseofstudyAssignment_6 )
            {
             before(grammarAccess.getStudentAccess().getCourseofstudyAssignment_6()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4701:1: ( rule__Student__CourseofstudyAssignment_6 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4701:2: rule__Student__CourseofstudyAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__CourseofstudyAssignment_6_in_rule__Student__Group__6__Impl9292);
            rule__Student__CourseofstudyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getCourseofstudyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6__Impl"


    // $ANTLR start "rule__Student__Group__7"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4711:1: rule__Student__Group__7 : rule__Student__Group__7__Impl ;
    public final void rule__Student__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4715:1: ( rule__Student__Group__7__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4716:2: rule__Student__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group__7__Impl_in_rule__Student__Group__79322);
            rule__Student__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__7"


    // $ANTLR start "rule__Student__Group__7__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4722:1: rule__Student__Group__7__Impl : ( '}' ) ;
    public final void rule__Student__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4726:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4727:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4727:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4728:1: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Student__Group__7__Impl9350); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__7__Impl"


    // $ANTLR start "rule__Student__Group_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4757:1: rule__Student__Group_3__0 : rule__Student__Group_3__0__Impl rule__Student__Group_3__1 ;
    public final void rule__Student__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4761:1: ( rule__Student__Group_3__0__Impl rule__Student__Group_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4762:2: rule__Student__Group_3__0__Impl rule__Student__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_3__0__Impl_in_rule__Student__Group_3__09397);
            rule__Student__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_3__1_in_rule__Student__Group_3__09400);
            rule__Student__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__0"


    // $ANTLR start "rule__Student__Group_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4769:1: rule__Student__Group_3__0__Impl : ( 'studentNumber' ) ;
    public final void rule__Student__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4773:1: ( ( 'studentNumber' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4774:1: ( 'studentNumber' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4774:1: ( 'studentNumber' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4775:1: 'studentNumber'
            {
             before(grammarAccess.getStudentAccess().getStudentNumberKeyword_3_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Student__Group_3__0__Impl9428); 
             after(grammarAccess.getStudentAccess().getStudentNumberKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__0__Impl"


    // $ANTLR start "rule__Student__Group_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4788:1: rule__Student__Group_3__1 : rule__Student__Group_3__1__Impl ;
    public final void rule__Student__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4792:1: ( rule__Student__Group_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4793:2: rule__Student__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_3__1__Impl_in_rule__Student__Group_3__19459);
            rule__Student__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__1"


    // $ANTLR start "rule__Student__Group_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4799:1: rule__Student__Group_3__1__Impl : ( ( rule__Student__StudentNumberAssignment_3_1 ) ) ;
    public final void rule__Student__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4803:1: ( ( ( rule__Student__StudentNumberAssignment_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4804:1: ( ( rule__Student__StudentNumberAssignment_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4804:1: ( ( rule__Student__StudentNumberAssignment_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4805:1: ( rule__Student__StudentNumberAssignment_3_1 )
            {
             before(grammarAccess.getStudentAccess().getStudentNumberAssignment_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4806:1: ( rule__Student__StudentNumberAssignment_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4806:2: rule__Student__StudentNumberAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__StudentNumberAssignment_3_1_in_rule__Student__Group_3__1__Impl9486);
            rule__Student__StudentNumberAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getStudentNumberAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_3__1__Impl"


    // $ANTLR start "rule__Student__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4820:1: rule__Student__Group_4__0 : rule__Student__Group_4__0__Impl rule__Student__Group_4__1 ;
    public final void rule__Student__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4824:1: ( rule__Student__Group_4__0__Impl rule__Student__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4825:2: rule__Student__Group_4__0__Impl rule__Student__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__0__Impl_in_rule__Student__Group_4__09520);
            rule__Student__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__1_in_rule__Student__Group_4__09523);
            rule__Student__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__0"


    // $ANTLR start "rule__Student__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4832:1: rule__Student__Group_4__0__Impl : ( 'enrolledIn' ) ;
    public final void rule__Student__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4836:1: ( ( 'enrolledIn' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4837:1: ( 'enrolledIn' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4837:1: ( 'enrolledIn' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4838:1: 'enrolledIn'
            {
             before(grammarAccess.getStudentAccess().getEnrolledInKeyword_4_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Student__Group_4__0__Impl9551); 
             after(grammarAccess.getStudentAccess().getEnrolledInKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__0__Impl"


    // $ANTLR start "rule__Student__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4851:1: rule__Student__Group_4__1 : rule__Student__Group_4__1__Impl rule__Student__Group_4__2 ;
    public final void rule__Student__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4855:1: ( rule__Student__Group_4__1__Impl rule__Student__Group_4__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4856:2: rule__Student__Group_4__1__Impl rule__Student__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__1__Impl_in_rule__Student__Group_4__19582);
            rule__Student__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__2_in_rule__Student__Group_4__19585);
            rule__Student__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__1"


    // $ANTLR start "rule__Student__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4863:1: rule__Student__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Student__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4867:1: ( ( '(' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4868:1: ( '(' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4868:1: ( '(' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4869:1: '('
            {
             before(grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Student__Group_4__1__Impl9613); 
             after(grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__1__Impl"


    // $ANTLR start "rule__Student__Group_4__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4882:1: rule__Student__Group_4__2 : rule__Student__Group_4__2__Impl rule__Student__Group_4__3 ;
    public final void rule__Student__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4886:1: ( rule__Student__Group_4__2__Impl rule__Student__Group_4__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4887:2: rule__Student__Group_4__2__Impl rule__Student__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__2__Impl_in_rule__Student__Group_4__29644);
            rule__Student__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__3_in_rule__Student__Group_4__29647);
            rule__Student__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__2"


    // $ANTLR start "rule__Student__Group_4__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4894:1: rule__Student__Group_4__2__Impl : ( ( rule__Student__EnrolledInAssignment_4_2 ) ) ;
    public final void rule__Student__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4898:1: ( ( ( rule__Student__EnrolledInAssignment_4_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4899:1: ( ( rule__Student__EnrolledInAssignment_4_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4899:1: ( ( rule__Student__EnrolledInAssignment_4_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4900:1: ( rule__Student__EnrolledInAssignment_4_2 )
            {
             before(grammarAccess.getStudentAccess().getEnrolledInAssignment_4_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4901:1: ( rule__Student__EnrolledInAssignment_4_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4901:2: rule__Student__EnrolledInAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__EnrolledInAssignment_4_2_in_rule__Student__Group_4__2__Impl9674);
            rule__Student__EnrolledInAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getEnrolledInAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__2__Impl"


    // $ANTLR start "rule__Student__Group_4__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4911:1: rule__Student__Group_4__3 : rule__Student__Group_4__3__Impl rule__Student__Group_4__4 ;
    public final void rule__Student__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4915:1: ( rule__Student__Group_4__3__Impl rule__Student__Group_4__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4916:2: rule__Student__Group_4__3__Impl rule__Student__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__3__Impl_in_rule__Student__Group_4__39704);
            rule__Student__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__4_in_rule__Student__Group_4__39707);
            rule__Student__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__3"


    // $ANTLR start "rule__Student__Group_4__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4923:1: rule__Student__Group_4__3__Impl : ( ( rule__Student__Group_4_3__0 )* ) ;
    public final void rule__Student__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4927:1: ( ( ( rule__Student__Group_4_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4928:1: ( ( rule__Student__Group_4_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4928:1: ( ( rule__Student__Group_4_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4929:1: ( rule__Student__Group_4_3__0 )*
            {
             before(grammarAccess.getStudentAccess().getGroup_4_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4930:1: ( rule__Student__Group_4_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4930:2: rule__Student__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4_3__0_in_rule__Student__Group_4__3__Impl9734);
            	    rule__Student__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getStudentAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__3__Impl"


    // $ANTLR start "rule__Student__Group_4__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4940:1: rule__Student__Group_4__4 : rule__Student__Group_4__4__Impl ;
    public final void rule__Student__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4944:1: ( rule__Student__Group_4__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4945:2: rule__Student__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4__4__Impl_in_rule__Student__Group_4__49765);
            rule__Student__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__4"


    // $ANTLR start "rule__Student__Group_4__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4951:1: rule__Student__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Student__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4955:1: ( ( ')' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4956:1: ( ')' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4956:1: ( ')' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4957:1: ')'
            {
             before(grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Student__Group_4__4__Impl9793); 
             after(grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__4__Impl"


    // $ANTLR start "rule__Student__Group_4_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4980:1: rule__Student__Group_4_3__0 : rule__Student__Group_4_3__0__Impl rule__Student__Group_4_3__1 ;
    public final void rule__Student__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4984:1: ( rule__Student__Group_4_3__0__Impl rule__Student__Group_4_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4985:2: rule__Student__Group_4_3__0__Impl rule__Student__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4_3__0__Impl_in_rule__Student__Group_4_3__09834);
            rule__Student__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4_3__1_in_rule__Student__Group_4_3__09837);
            rule__Student__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__0"


    // $ANTLR start "rule__Student__Group_4_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4992:1: rule__Student__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Student__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4996:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4997:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4997:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:4998:1: ','
            {
             before(grammarAccess.getStudentAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Student__Group_4_3__0__Impl9865); 
             after(grammarAccess.getStudentAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__0__Impl"


    // $ANTLR start "rule__Student__Group_4_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5011:1: rule__Student__Group_4_3__1 : rule__Student__Group_4_3__1__Impl ;
    public final void rule__Student__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5015:1: ( rule__Student__Group_4_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5016:2: rule__Student__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__Group_4_3__1__Impl_in_rule__Student__Group_4_3__19896);
            rule__Student__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__1"


    // $ANTLR start "rule__Student__Group_4_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5022:1: rule__Student__Group_4_3__1__Impl : ( ( rule__Student__EnrolledInAssignment_4_3_1 ) ) ;
    public final void rule__Student__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5026:1: ( ( ( rule__Student__EnrolledInAssignment_4_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5027:1: ( ( rule__Student__EnrolledInAssignment_4_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5027:1: ( ( rule__Student__EnrolledInAssignment_4_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5028:1: ( rule__Student__EnrolledInAssignment_4_3_1 )
            {
             before(grammarAccess.getStudentAccess().getEnrolledInAssignment_4_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5029:1: ( rule__Student__EnrolledInAssignment_4_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5029:2: rule__Student__EnrolledInAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Student__EnrolledInAssignment_4_3_1_in_rule__Student__Group_4_3__1__Impl9923);
            rule__Student__EnrolledInAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getEnrolledInAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__1__Impl"


    // $ANTLR start "rule__Teacher__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5043:1: rule__Teacher__Group__0 : rule__Teacher__Group__0__Impl rule__Teacher__Group__1 ;
    public final void rule__Teacher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5047:1: ( rule__Teacher__Group__0__Impl rule__Teacher__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5048:2: rule__Teacher__Group__0__Impl rule__Teacher__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__0__Impl_in_rule__Teacher__Group__09957);
            rule__Teacher__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__1_in_rule__Teacher__Group__09960);
            rule__Teacher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0"


    // $ANTLR start "rule__Teacher__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5055:1: rule__Teacher__Group__0__Impl : ( () ) ;
    public final void rule__Teacher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5059:1: ( ( () ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5060:1: ( () )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5060:1: ( () )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5061:1: ()
            {
             before(grammarAccess.getTeacherAccess().getTeacherAction_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5062:1: ()
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5064:1: 
            {
            }

             after(grammarAccess.getTeacherAccess().getTeacherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0__Impl"


    // $ANTLR start "rule__Teacher__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5074:1: rule__Teacher__Group__1 : rule__Teacher__Group__1__Impl rule__Teacher__Group__2 ;
    public final void rule__Teacher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5078:1: ( rule__Teacher__Group__1__Impl rule__Teacher__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5079:2: rule__Teacher__Group__1__Impl rule__Teacher__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__1__Impl_in_rule__Teacher__Group__110018);
            rule__Teacher__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__2_in_rule__Teacher__Group__110021);
            rule__Teacher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__1"


    // $ANTLR start "rule__Teacher__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5086:1: rule__Teacher__Group__1__Impl : ( 'Teacher' ) ;
    public final void rule__Teacher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5090:1: ( ( 'Teacher' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5091:1: ( 'Teacher' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5091:1: ( 'Teacher' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5092:1: 'Teacher'
            {
             before(grammarAccess.getTeacherAccess().getTeacherKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Teacher__Group__1__Impl10049); 
             after(grammarAccess.getTeacherAccess().getTeacherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__1__Impl"


    // $ANTLR start "rule__Teacher__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5105:1: rule__Teacher__Group__2 : rule__Teacher__Group__2__Impl rule__Teacher__Group__3 ;
    public final void rule__Teacher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5109:1: ( rule__Teacher__Group__2__Impl rule__Teacher__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5110:2: rule__Teacher__Group__2__Impl rule__Teacher__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__2__Impl_in_rule__Teacher__Group__210080);
            rule__Teacher__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__3_in_rule__Teacher__Group__210083);
            rule__Teacher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__2"


    // $ANTLR start "rule__Teacher__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5117:1: rule__Teacher__Group__2__Impl : ( ( rule__Teacher__NameAssignment_2 ) ) ;
    public final void rule__Teacher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5121:1: ( ( ( rule__Teacher__NameAssignment_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5122:1: ( ( rule__Teacher__NameAssignment_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5122:1: ( ( rule__Teacher__NameAssignment_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5123:1: ( rule__Teacher__NameAssignment_2 )
            {
             before(grammarAccess.getTeacherAccess().getNameAssignment_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5124:1: ( rule__Teacher__NameAssignment_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5124:2: rule__Teacher__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__NameAssignment_2_in_rule__Teacher__Group__2__Impl10110);
            rule__Teacher__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__2__Impl"


    // $ANTLR start "rule__Teacher__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5134:1: rule__Teacher__Group__3 : rule__Teacher__Group__3__Impl rule__Teacher__Group__4 ;
    public final void rule__Teacher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5138:1: ( rule__Teacher__Group__3__Impl rule__Teacher__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5139:2: rule__Teacher__Group__3__Impl rule__Teacher__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__3__Impl_in_rule__Teacher__Group__310140);
            rule__Teacher__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__4_in_rule__Teacher__Group__310143);
            rule__Teacher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__3"


    // $ANTLR start "rule__Teacher__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5146:1: rule__Teacher__Group__3__Impl : ( '{' ) ;
    public final void rule__Teacher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5150:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5151:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5151:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5152:1: '{'
            {
             before(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Teacher__Group__3__Impl10171); 
             after(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__3__Impl"


    // $ANTLR start "rule__Teacher__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5165:1: rule__Teacher__Group__4 : rule__Teacher__Group__4__Impl rule__Teacher__Group__5 ;
    public final void rule__Teacher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5169:1: ( rule__Teacher__Group__4__Impl rule__Teacher__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5170:2: rule__Teacher__Group__4__Impl rule__Teacher__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__4__Impl_in_rule__Teacher__Group__410202);
            rule__Teacher__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__5_in_rule__Teacher__Group__410205);
            rule__Teacher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__4"


    // $ANTLR start "rule__Teacher__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5177:1: rule__Teacher__Group__4__Impl : ( ( rule__Teacher__Group_4__0 )? ) ;
    public final void rule__Teacher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5181:1: ( ( ( rule__Teacher__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5182:1: ( ( rule__Teacher__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5182:1: ( ( rule__Teacher__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5183:1: ( rule__Teacher__Group_4__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5184:1: ( rule__Teacher__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5184:2: rule__Teacher__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__0_in_rule__Teacher__Group__4__Impl10232);
                    rule__Teacher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__4__Impl"


    // $ANTLR start "rule__Teacher__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5194:1: rule__Teacher__Group__5 : rule__Teacher__Group__5__Impl ;
    public final void rule__Teacher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5198:1: ( rule__Teacher__Group__5__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5199:2: rule__Teacher__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group__5__Impl_in_rule__Teacher__Group__510263);
            rule__Teacher__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__5"


    // $ANTLR start "rule__Teacher__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5205:1: rule__Teacher__Group__5__Impl : ( '}' ) ;
    public final void rule__Teacher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5209:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5210:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5210:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5211:1: '}'
            {
             before(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Teacher__Group__5__Impl10291); 
             after(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__5__Impl"


    // $ANTLR start "rule__Teacher__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5236:1: rule__Teacher__Group_4__0 : rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 ;
    public final void rule__Teacher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5240:1: ( rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5241:2: rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__0__Impl_in_rule__Teacher__Group_4__010334);
            rule__Teacher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__1_in_rule__Teacher__Group_4__010337);
            rule__Teacher__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__0"


    // $ANTLR start "rule__Teacher__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5248:1: rule__Teacher__Group_4__0__Impl : ( 'teaches' ) ;
    public final void rule__Teacher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5252:1: ( ( 'teaches' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5253:1: ( 'teaches' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5253:1: ( 'teaches' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5254:1: 'teaches'
            {
             before(grammarAccess.getTeacherAccess().getTeachesKeyword_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Teacher__Group_4__0__Impl10365); 
             after(grammarAccess.getTeacherAccess().getTeachesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__0__Impl"


    // $ANTLR start "rule__Teacher__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5267:1: rule__Teacher__Group_4__1 : rule__Teacher__Group_4__1__Impl rule__Teacher__Group_4__2 ;
    public final void rule__Teacher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5271:1: ( rule__Teacher__Group_4__1__Impl rule__Teacher__Group_4__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5272:2: rule__Teacher__Group_4__1__Impl rule__Teacher__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__1__Impl_in_rule__Teacher__Group_4__110396);
            rule__Teacher__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__2_in_rule__Teacher__Group_4__110399);
            rule__Teacher__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__1"


    // $ANTLR start "rule__Teacher__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5279:1: rule__Teacher__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Teacher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5283:1: ( ( '(' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5284:1: ( '(' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5284:1: ( '(' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5285:1: '('
            {
             before(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Teacher__Group_4__1__Impl10427); 
             after(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__1__Impl"


    // $ANTLR start "rule__Teacher__Group_4__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5298:1: rule__Teacher__Group_4__2 : rule__Teacher__Group_4__2__Impl rule__Teacher__Group_4__3 ;
    public final void rule__Teacher__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5302:1: ( rule__Teacher__Group_4__2__Impl rule__Teacher__Group_4__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5303:2: rule__Teacher__Group_4__2__Impl rule__Teacher__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__2__Impl_in_rule__Teacher__Group_4__210458);
            rule__Teacher__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__3_in_rule__Teacher__Group_4__210461);
            rule__Teacher__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__2"


    // $ANTLR start "rule__Teacher__Group_4__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5310:1: rule__Teacher__Group_4__2__Impl : ( ( rule__Teacher__TeachesAssignment_4_2 ) ) ;
    public final void rule__Teacher__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5314:1: ( ( ( rule__Teacher__TeachesAssignment_4_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5315:1: ( ( rule__Teacher__TeachesAssignment_4_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5315:1: ( ( rule__Teacher__TeachesAssignment_4_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5316:1: ( rule__Teacher__TeachesAssignment_4_2 )
            {
             before(grammarAccess.getTeacherAccess().getTeachesAssignment_4_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5317:1: ( rule__Teacher__TeachesAssignment_4_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5317:2: rule__Teacher__TeachesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__TeachesAssignment_4_2_in_rule__Teacher__Group_4__2__Impl10488);
            rule__Teacher__TeachesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getTeachesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__2__Impl"


    // $ANTLR start "rule__Teacher__Group_4__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5327:1: rule__Teacher__Group_4__3 : rule__Teacher__Group_4__3__Impl rule__Teacher__Group_4__4 ;
    public final void rule__Teacher__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5331:1: ( rule__Teacher__Group_4__3__Impl rule__Teacher__Group_4__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5332:2: rule__Teacher__Group_4__3__Impl rule__Teacher__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__3__Impl_in_rule__Teacher__Group_4__310518);
            rule__Teacher__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__4_in_rule__Teacher__Group_4__310521);
            rule__Teacher__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__3"


    // $ANTLR start "rule__Teacher__Group_4__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5339:1: rule__Teacher__Group_4__3__Impl : ( ( rule__Teacher__Group_4_3__0 )* ) ;
    public final void rule__Teacher__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5343:1: ( ( ( rule__Teacher__Group_4_3__0 )* ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5344:1: ( ( rule__Teacher__Group_4_3__0 )* )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5344:1: ( ( rule__Teacher__Group_4_3__0 )* )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5345:1: ( rule__Teacher__Group_4_3__0 )*
            {
             before(grammarAccess.getTeacherAccess().getGroup_4_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5346:1: ( rule__Teacher__Group_4_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==22) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5346:2: rule__Teacher__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4_3__0_in_rule__Teacher__Group_4__3__Impl10548);
            	    rule__Teacher__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTeacherAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__3__Impl"


    // $ANTLR start "rule__Teacher__Group_4__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5356:1: rule__Teacher__Group_4__4 : rule__Teacher__Group_4__4__Impl ;
    public final void rule__Teacher__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5360:1: ( rule__Teacher__Group_4__4__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5361:2: rule__Teacher__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4__4__Impl_in_rule__Teacher__Group_4__410579);
            rule__Teacher__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__4"


    // $ANTLR start "rule__Teacher__Group_4__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5367:1: rule__Teacher__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Teacher__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5371:1: ( ( ')' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5372:1: ( ')' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5372:1: ( ')' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5373:1: ')'
            {
             before(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Teacher__Group_4__4__Impl10607); 
             after(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__4__Impl"


    // $ANTLR start "rule__Teacher__Group_4_3__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5396:1: rule__Teacher__Group_4_3__0 : rule__Teacher__Group_4_3__0__Impl rule__Teacher__Group_4_3__1 ;
    public final void rule__Teacher__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5400:1: ( rule__Teacher__Group_4_3__0__Impl rule__Teacher__Group_4_3__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5401:2: rule__Teacher__Group_4_3__0__Impl rule__Teacher__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4_3__0__Impl_in_rule__Teacher__Group_4_3__010648);
            rule__Teacher__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4_3__1_in_rule__Teacher__Group_4_3__010651);
            rule__Teacher__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__0"


    // $ANTLR start "rule__Teacher__Group_4_3__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5408:1: rule__Teacher__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Teacher__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5412:1: ( ( ',' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5413:1: ( ',' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5413:1: ( ',' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5414:1: ','
            {
             before(grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Teacher__Group_4_3__0__Impl10679); 
             after(grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__0__Impl"


    // $ANTLR start "rule__Teacher__Group_4_3__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5427:1: rule__Teacher__Group_4_3__1 : rule__Teacher__Group_4_3__1__Impl ;
    public final void rule__Teacher__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5431:1: ( rule__Teacher__Group_4_3__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5432:2: rule__Teacher__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__Group_4_3__1__Impl_in_rule__Teacher__Group_4_3__110710);
            rule__Teacher__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__1"


    // $ANTLR start "rule__Teacher__Group_4_3__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5438:1: rule__Teacher__Group_4_3__1__Impl : ( ( rule__Teacher__TeachesAssignment_4_3_1 ) ) ;
    public final void rule__Teacher__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5442:1: ( ( ( rule__Teacher__TeachesAssignment_4_3_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5443:1: ( ( rule__Teacher__TeachesAssignment_4_3_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5443:1: ( ( rule__Teacher__TeachesAssignment_4_3_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5444:1: ( rule__Teacher__TeachesAssignment_4_3_1 )
            {
             before(grammarAccess.getTeacherAccess().getTeachesAssignment_4_3_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5445:1: ( rule__Teacher__TeachesAssignment_4_3_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5445:2: rule__Teacher__TeachesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Teacher__TeachesAssignment_4_3_1_in_rule__Teacher__Group_4_3__1__Impl10737);
            rule__Teacher__TeachesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getTeachesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__1__Impl"


    // $ANTLR start "rule__CourseResult__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5459:1: rule__CourseResult__Group__0 : rule__CourseResult__Group__0__Impl rule__CourseResult__Group__1 ;
    public final void rule__CourseResult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5463:1: ( rule__CourseResult__Group__0__Impl rule__CourseResult__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5464:2: rule__CourseResult__Group__0__Impl rule__CourseResult__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__0__Impl_in_rule__CourseResult__Group__010771);
            rule__CourseResult__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__1_in_rule__CourseResult__Group__010774);
            rule__CourseResult__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__0"


    // $ANTLR start "rule__CourseResult__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5471:1: rule__CourseResult__Group__0__Impl : ( 'CourseResult' ) ;
    public final void rule__CourseResult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5475:1: ( ( 'CourseResult' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5476:1: ( 'CourseResult' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5476:1: ( 'CourseResult' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5477:1: 'CourseResult'
            {
             before(grammarAccess.getCourseResultAccess().getCourseResultKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__CourseResult__Group__0__Impl10802); 
             after(grammarAccess.getCourseResultAccess().getCourseResultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__0__Impl"


    // $ANTLR start "rule__CourseResult__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5490:1: rule__CourseResult__Group__1 : rule__CourseResult__Group__1__Impl rule__CourseResult__Group__2 ;
    public final void rule__CourseResult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5494:1: ( rule__CourseResult__Group__1__Impl rule__CourseResult__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5495:2: rule__CourseResult__Group__1__Impl rule__CourseResult__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__1__Impl_in_rule__CourseResult__Group__110833);
            rule__CourseResult__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__2_in_rule__CourseResult__Group__110836);
            rule__CourseResult__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__1"


    // $ANTLR start "rule__CourseResult__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5502:1: rule__CourseResult__Group__1__Impl : ( '{' ) ;
    public final void rule__CourseResult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5506:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5507:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5507:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5508:1: '{'
            {
             before(grammarAccess.getCourseResultAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__CourseResult__Group__1__Impl10864); 
             after(grammarAccess.getCourseResultAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__1__Impl"


    // $ANTLR start "rule__CourseResult__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5521:1: rule__CourseResult__Group__2 : rule__CourseResult__Group__2__Impl rule__CourseResult__Group__3 ;
    public final void rule__CourseResult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5525:1: ( rule__CourseResult__Group__2__Impl rule__CourseResult__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5526:2: rule__CourseResult__Group__2__Impl rule__CourseResult__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__2__Impl_in_rule__CourseResult__Group__210895);
            rule__CourseResult__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__3_in_rule__CourseResult__Group__210898);
            rule__CourseResult__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__2"


    // $ANTLR start "rule__CourseResult__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5533:1: rule__CourseResult__Group__2__Impl : ( ( rule__CourseResult__Group_2__0 )? ) ;
    public final void rule__CourseResult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5537:1: ( ( ( rule__CourseResult__Group_2__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5538:1: ( ( rule__CourseResult__Group_2__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5538:1: ( ( rule__CourseResult__Group_2__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5539:1: ( rule__CourseResult__Group_2__0 )?
            {
             before(grammarAccess.getCourseResultAccess().getGroup_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5540:1: ( rule__CourseResult__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5540:2: rule__CourseResult__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group_2__0_in_rule__CourseResult__Group__2__Impl10925);
                    rule__CourseResult__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseResultAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__2__Impl"


    // $ANTLR start "rule__CourseResult__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5550:1: rule__CourseResult__Group__3 : rule__CourseResult__Group__3__Impl rule__CourseResult__Group__4 ;
    public final void rule__CourseResult__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5554:1: ( rule__CourseResult__Group__3__Impl rule__CourseResult__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5555:2: rule__CourseResult__Group__3__Impl rule__CourseResult__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__3__Impl_in_rule__CourseResult__Group__310956);
            rule__CourseResult__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__4_in_rule__CourseResult__Group__310959);
            rule__CourseResult__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__3"


    // $ANTLR start "rule__CourseResult__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5562:1: rule__CourseResult__Group__3__Impl : ( 'student' ) ;
    public final void rule__CourseResult__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5566:1: ( ( 'student' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5567:1: ( 'student' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5567:1: ( 'student' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5568:1: 'student'
            {
             before(grammarAccess.getCourseResultAccess().getStudentKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__CourseResult__Group__3__Impl10987); 
             after(grammarAccess.getCourseResultAccess().getStudentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__3__Impl"


    // $ANTLR start "rule__CourseResult__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5581:1: rule__CourseResult__Group__4 : rule__CourseResult__Group__4__Impl rule__CourseResult__Group__5 ;
    public final void rule__CourseResult__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5585:1: ( rule__CourseResult__Group__4__Impl rule__CourseResult__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5586:2: rule__CourseResult__Group__4__Impl rule__CourseResult__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__4__Impl_in_rule__CourseResult__Group__411018);
            rule__CourseResult__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__5_in_rule__CourseResult__Group__411021);
            rule__CourseResult__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__4"


    // $ANTLR start "rule__CourseResult__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5593:1: rule__CourseResult__Group__4__Impl : ( ( rule__CourseResult__StudentAssignment_4 ) ) ;
    public final void rule__CourseResult__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5597:1: ( ( ( rule__CourseResult__StudentAssignment_4 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5598:1: ( ( rule__CourseResult__StudentAssignment_4 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5598:1: ( ( rule__CourseResult__StudentAssignment_4 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5599:1: ( rule__CourseResult__StudentAssignment_4 )
            {
             before(grammarAccess.getCourseResultAccess().getStudentAssignment_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5600:1: ( rule__CourseResult__StudentAssignment_4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5600:2: rule__CourseResult__StudentAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__StudentAssignment_4_in_rule__CourseResult__Group__4__Impl11048);
            rule__CourseResult__StudentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCourseResultAccess().getStudentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__4__Impl"


    // $ANTLR start "rule__CourseResult__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5610:1: rule__CourseResult__Group__5 : rule__CourseResult__Group__5__Impl ;
    public final void rule__CourseResult__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5614:1: ( rule__CourseResult__Group__5__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5615:2: rule__CourseResult__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group__5__Impl_in_rule__CourseResult__Group__511078);
            rule__CourseResult__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__5"


    // $ANTLR start "rule__CourseResult__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5621:1: rule__CourseResult__Group__5__Impl : ( '}' ) ;
    public final void rule__CourseResult__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5625:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5626:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5626:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5627:1: '}'
            {
             before(grammarAccess.getCourseResultAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__CourseResult__Group__5__Impl11106); 
             after(grammarAccess.getCourseResultAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group__5__Impl"


    // $ANTLR start "rule__CourseResult__Group_2__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5652:1: rule__CourseResult__Group_2__0 : rule__CourseResult__Group_2__0__Impl rule__CourseResult__Group_2__1 ;
    public final void rule__CourseResult__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5656:1: ( rule__CourseResult__Group_2__0__Impl rule__CourseResult__Group_2__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5657:2: rule__CourseResult__Group_2__0__Impl rule__CourseResult__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group_2__0__Impl_in_rule__CourseResult__Group_2__011149);
            rule__CourseResult__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group_2__1_in_rule__CourseResult__Group_2__011152);
            rule__CourseResult__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group_2__0"


    // $ANTLR start "rule__CourseResult__Group_2__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5664:1: rule__CourseResult__Group_2__0__Impl : ( 'grade' ) ;
    public final void rule__CourseResult__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5668:1: ( ( 'grade' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5669:1: ( 'grade' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5669:1: ( 'grade' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5670:1: 'grade'
            {
             before(grammarAccess.getCourseResultAccess().getGradeKeyword_2_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__CourseResult__Group_2__0__Impl11180); 
             after(grammarAccess.getCourseResultAccess().getGradeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group_2__0__Impl"


    // $ANTLR start "rule__CourseResult__Group_2__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5683:1: rule__CourseResult__Group_2__1 : rule__CourseResult__Group_2__1__Impl ;
    public final void rule__CourseResult__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5687:1: ( rule__CourseResult__Group_2__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5688:2: rule__CourseResult__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__Group_2__1__Impl_in_rule__CourseResult__Group_2__111211);
            rule__CourseResult__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group_2__1"


    // $ANTLR start "rule__CourseResult__Group_2__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5694:1: rule__CourseResult__Group_2__1__Impl : ( ( rule__CourseResult__GradeAssignment_2_1 ) ) ;
    public final void rule__CourseResult__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5698:1: ( ( ( rule__CourseResult__GradeAssignment_2_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5699:1: ( ( rule__CourseResult__GradeAssignment_2_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5699:1: ( ( rule__CourseResult__GradeAssignment_2_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5700:1: ( rule__CourseResult__GradeAssignment_2_1 )
            {
             before(grammarAccess.getCourseResultAccess().getGradeAssignment_2_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5701:1: ( rule__CourseResult__GradeAssignment_2_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5701:2: rule__CourseResult__GradeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseResult__GradeAssignment_2_1_in_rule__CourseResult__Group_2__1__Impl11238);
            rule__CourseResult__GradeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseResultAccess().getGradeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__Group_2__1__Impl"


    // $ANTLR start "rule__EBigInteger__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5715:1: rule__EBigInteger__Group__0 : rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 ;
    public final void rule__EBigInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5719:1: ( rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5720:2: rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__0__Impl_in_rule__EBigInteger__Group__011272);
            rule__EBigInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__1_in_rule__EBigInteger__Group__011275);
            rule__EBigInteger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__0"


    // $ANTLR start "rule__EBigInteger__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5727:1: rule__EBigInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EBigInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5731:1: ( ( ( '-' )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5732:1: ( ( '-' )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5732:1: ( ( '-' )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5733:1: ( '-' )?
            {
             before(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5734:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5735:2: '-'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_rule__EBigInteger__Group__0__Impl11304); 

                    }
                    break;

            }

             after(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__0__Impl"


    // $ANTLR start "rule__EBigInteger__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5746:1: rule__EBigInteger__Group__1 : rule__EBigInteger__Group__1__Impl ;
    public final void rule__EBigInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5750:1: ( rule__EBigInteger__Group__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5751:2: rule__EBigInteger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__1__Impl_in_rule__EBigInteger__Group__111337);
            rule__EBigInteger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__1"


    // $ANTLR start "rule__EBigInteger__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5757:1: rule__EBigInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EBigInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5761:1: ( ( RULE_INT ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5762:1: ( RULE_INT )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5762:1: ( RULE_INT )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5763:1: RULE_INT
            {
             before(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigInteger__Group__1__Impl11364); 
             after(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5778:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5782:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5783:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Where__Group__0__Impl_in_rule__Where__Group__011397);
            rule__Where__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Where__Group__1_in_rule__Where__Group__011400);
            rule__Where__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0"


    // $ANTLR start "rule__Where__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5790:1: rule__Where__Group__0__Impl : ( '{' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5794:1: ( ( '{' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5795:1: ( '{' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5795:1: ( '{' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5796:1: '{'
            {
             before(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Where__Group__0__Impl11428); 
             after(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5809:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5813:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5814:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Where__Group__1__Impl_in_rule__Where__Group__111459);
            rule__Where__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Where__Group__2_in_rule__Where__Group__111462);
            rule__Where__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1"


    // $ANTLR start "rule__Where__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5821:1: rule__Where__Group__1__Impl : ( ( rule__Where__BooleanexprAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5825:1: ( ( ( rule__Where__BooleanexprAssignment_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5826:1: ( ( rule__Where__BooleanexprAssignment_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5826:1: ( ( rule__Where__BooleanexprAssignment_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5827:1: ( rule__Where__BooleanexprAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getBooleanexprAssignment_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5828:1: ( rule__Where__BooleanexprAssignment_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5828:2: rule__Where__BooleanexprAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Where__BooleanexprAssignment_1_in_rule__Where__Group__1__Impl11489);
            rule__Where__BooleanexprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getBooleanexprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5838:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5842:1: ( rule__Where__Group__2__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5843:2: rule__Where__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Where__Group__2__Impl_in_rule__Where__Group__211519);
            rule__Where__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2"


    // $ANTLR start "rule__Where__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5849:1: rule__Where__Group__2__Impl : ( '}' ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5853:1: ( ( '}' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5854:1: ( '}' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5854:1: ( '}' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5855:1: '}'
            {
             before(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Where__Group__2__Impl11547); 
             after(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpr__Group__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5874:1: rule__BooleanExpr__Group__0 : rule__BooleanExpr__Group__0__Impl rule__BooleanExpr__Group__1 ;
    public final void rule__BooleanExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5878:1: ( rule__BooleanExpr__Group__0__Impl rule__BooleanExpr__Group__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5879:2: rule__BooleanExpr__Group__0__Impl rule__BooleanExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__0__Impl_in_rule__BooleanExpr__Group__011584);
            rule__BooleanExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__1_in_rule__BooleanExpr__Group__011587);
            rule__BooleanExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__0"


    // $ANTLR start "rule__BooleanExpr__Group__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5886:1: rule__BooleanExpr__Group__0__Impl : ( () ) ;
    public final void rule__BooleanExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5890:1: ( ( () ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5891:1: ( () )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5891:1: ( () )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5892:1: ()
            {
             before(grammarAccess.getBooleanExprAccess().getBooleanExprAction_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5893:1: ()
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5895:1: 
            {
            }

             after(grammarAccess.getBooleanExprAccess().getBooleanExprAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpr__Group__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5905:1: rule__BooleanExpr__Group__1 : rule__BooleanExpr__Group__1__Impl rule__BooleanExpr__Group__2 ;
    public final void rule__BooleanExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5909:1: ( rule__BooleanExpr__Group__1__Impl rule__BooleanExpr__Group__2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5910:2: rule__BooleanExpr__Group__1__Impl rule__BooleanExpr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__1__Impl_in_rule__BooleanExpr__Group__111645);
            rule__BooleanExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__2_in_rule__BooleanExpr__Group__111648);
            rule__BooleanExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__1"


    // $ANTLR start "rule__BooleanExpr__Group__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5917:1: rule__BooleanExpr__Group__1__Impl : ( ( rule__BooleanExpr__LhsAssignment_1 ) ) ;
    public final void rule__BooleanExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5921:1: ( ( ( rule__BooleanExpr__LhsAssignment_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5922:1: ( ( rule__BooleanExpr__LhsAssignment_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5922:1: ( ( rule__BooleanExpr__LhsAssignment_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5923:1: ( rule__BooleanExpr__LhsAssignment_1 )
            {
             before(grammarAccess.getBooleanExprAccess().getLhsAssignment_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5924:1: ( rule__BooleanExpr__LhsAssignment_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5924:2: rule__BooleanExpr__LhsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__LhsAssignment_1_in_rule__BooleanExpr__Group__1__Impl11675);
            rule__BooleanExpr__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExprAccess().getLhsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpr__Group__2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5934:1: rule__BooleanExpr__Group__2 : rule__BooleanExpr__Group__2__Impl rule__BooleanExpr__Group__3 ;
    public final void rule__BooleanExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5938:1: ( rule__BooleanExpr__Group__2__Impl rule__BooleanExpr__Group__3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5939:2: rule__BooleanExpr__Group__2__Impl rule__BooleanExpr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__2__Impl_in_rule__BooleanExpr__Group__211705);
            rule__BooleanExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__3_in_rule__BooleanExpr__Group__211708);
            rule__BooleanExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__2"


    // $ANTLR start "rule__BooleanExpr__Group__2__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5946:1: rule__BooleanExpr__Group__2__Impl : ( ( rule__BooleanExpr__OperatorAssignment_2 ) ) ;
    public final void rule__BooleanExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5950:1: ( ( ( rule__BooleanExpr__OperatorAssignment_2 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5951:1: ( ( rule__BooleanExpr__OperatorAssignment_2 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5951:1: ( ( rule__BooleanExpr__OperatorAssignment_2 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5952:1: ( rule__BooleanExpr__OperatorAssignment_2 )
            {
             before(grammarAccess.getBooleanExprAccess().getOperatorAssignment_2()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5953:1: ( rule__BooleanExpr__OperatorAssignment_2 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5953:2: rule__BooleanExpr__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__OperatorAssignment_2_in_rule__BooleanExpr__Group__2__Impl11735);
            rule__BooleanExpr__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExprAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpr__Group__3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5963:1: rule__BooleanExpr__Group__3 : rule__BooleanExpr__Group__3__Impl rule__BooleanExpr__Group__4 ;
    public final void rule__BooleanExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5967:1: ( rule__BooleanExpr__Group__3__Impl rule__BooleanExpr__Group__4 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5968:2: rule__BooleanExpr__Group__3__Impl rule__BooleanExpr__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__3__Impl_in_rule__BooleanExpr__Group__311765);
            rule__BooleanExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__4_in_rule__BooleanExpr__Group__311768);
            rule__BooleanExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__3"


    // $ANTLR start "rule__BooleanExpr__Group__3__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5975:1: rule__BooleanExpr__Group__3__Impl : ( ( rule__BooleanExpr__RhsAssignment_3 ) ) ;
    public final void rule__BooleanExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5979:1: ( ( ( rule__BooleanExpr__RhsAssignment_3 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5980:1: ( ( rule__BooleanExpr__RhsAssignment_3 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5980:1: ( ( rule__BooleanExpr__RhsAssignment_3 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5981:1: ( rule__BooleanExpr__RhsAssignment_3 )
            {
             before(grammarAccess.getBooleanExprAccess().getRhsAssignment_3()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5982:1: ( rule__BooleanExpr__RhsAssignment_3 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5982:2: rule__BooleanExpr__RhsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__RhsAssignment_3_in_rule__BooleanExpr__Group__3__Impl11795);
            rule__BooleanExpr__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExprAccess().getRhsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpr__Group__4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5992:1: rule__BooleanExpr__Group__4 : rule__BooleanExpr__Group__4__Impl rule__BooleanExpr__Group__5 ;
    public final void rule__BooleanExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5996:1: ( rule__BooleanExpr__Group__4__Impl rule__BooleanExpr__Group__5 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:5997:2: rule__BooleanExpr__Group__4__Impl rule__BooleanExpr__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__4__Impl_in_rule__BooleanExpr__Group__411825);
            rule__BooleanExpr__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__5_in_rule__BooleanExpr__Group__411828);
            rule__BooleanExpr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__4"


    // $ANTLR start "rule__BooleanExpr__Group__4__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6004:1: rule__BooleanExpr__Group__4__Impl : ( ( rule__BooleanExpr__Group_4__0 )? ) ;
    public final void rule__BooleanExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6008:1: ( ( ( rule__BooleanExpr__Group_4__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6009:1: ( ( rule__BooleanExpr__Group_4__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6009:1: ( ( rule__BooleanExpr__Group_4__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6010:1: ( rule__BooleanExpr__Group_4__0 )?
            {
             before(grammarAccess.getBooleanExprAccess().getGroup_4()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6011:1: ( rule__BooleanExpr__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6011:2: rule__BooleanExpr__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_4__0_in_rule__BooleanExpr__Group__4__Impl11855);
                    rule__BooleanExpr__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanExprAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__4__Impl"


    // $ANTLR start "rule__BooleanExpr__Group__5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6021:1: rule__BooleanExpr__Group__5 : rule__BooleanExpr__Group__5__Impl ;
    public final void rule__BooleanExpr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6025:1: ( rule__BooleanExpr__Group__5__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6026:2: rule__BooleanExpr__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group__5__Impl_in_rule__BooleanExpr__Group__511886);
            rule__BooleanExpr__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__5"


    // $ANTLR start "rule__BooleanExpr__Group__5__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6032:1: rule__BooleanExpr__Group__5__Impl : ( ( rule__BooleanExpr__Group_5__0 )? ) ;
    public final void rule__BooleanExpr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6036:1: ( ( ( rule__BooleanExpr__Group_5__0 )? ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6037:1: ( ( rule__BooleanExpr__Group_5__0 )? )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6037:1: ( ( rule__BooleanExpr__Group_5__0 )? )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6038:1: ( rule__BooleanExpr__Group_5__0 )?
            {
             before(grammarAccess.getBooleanExprAccess().getGroup_5()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6039:1: ( rule__BooleanExpr__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6039:2: rule__BooleanExpr__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_5__0_in_rule__BooleanExpr__Group__5__Impl11913);
                    rule__BooleanExpr__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanExprAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group__5__Impl"


    // $ANTLR start "rule__BooleanExpr__Group_4__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6061:1: rule__BooleanExpr__Group_4__0 : rule__BooleanExpr__Group_4__0__Impl rule__BooleanExpr__Group_4__1 ;
    public final void rule__BooleanExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6065:1: ( rule__BooleanExpr__Group_4__0__Impl rule__BooleanExpr__Group_4__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6066:2: rule__BooleanExpr__Group_4__0__Impl rule__BooleanExpr__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_4__0__Impl_in_rule__BooleanExpr__Group_4__011956);
            rule__BooleanExpr__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_4__1_in_rule__BooleanExpr__Group_4__011959);
            rule__BooleanExpr__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_4__0"


    // $ANTLR start "rule__BooleanExpr__Group_4__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6073:1: rule__BooleanExpr__Group_4__0__Impl : ( 'and' ) ;
    public final void rule__BooleanExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6077:1: ( ( 'and' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6078:1: ( 'and' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6078:1: ( 'and' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6079:1: 'and'
            {
             before(grammarAccess.getBooleanExprAccess().getAndKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__BooleanExpr__Group_4__0__Impl11987); 
             after(grammarAccess.getBooleanExprAccess().getAndKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_4__0__Impl"


    // $ANTLR start "rule__BooleanExpr__Group_4__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6092:1: rule__BooleanExpr__Group_4__1 : rule__BooleanExpr__Group_4__1__Impl ;
    public final void rule__BooleanExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6096:1: ( rule__BooleanExpr__Group_4__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6097:2: rule__BooleanExpr__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_4__1__Impl_in_rule__BooleanExpr__Group_4__112018);
            rule__BooleanExpr__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_4__1"


    // $ANTLR start "rule__BooleanExpr__Group_4__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6103:1: rule__BooleanExpr__Group_4__1__Impl : ( ( rule__BooleanExpr__AndAssignment_4_1 ) ) ;
    public final void rule__BooleanExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6107:1: ( ( ( rule__BooleanExpr__AndAssignment_4_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6108:1: ( ( rule__BooleanExpr__AndAssignment_4_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6108:1: ( ( rule__BooleanExpr__AndAssignment_4_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6109:1: ( rule__BooleanExpr__AndAssignment_4_1 )
            {
             before(grammarAccess.getBooleanExprAccess().getAndAssignment_4_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6110:1: ( rule__BooleanExpr__AndAssignment_4_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6110:2: rule__BooleanExpr__AndAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__AndAssignment_4_1_in_rule__BooleanExpr__Group_4__1__Impl12045);
            rule__BooleanExpr__AndAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExprAccess().getAndAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_4__1__Impl"


    // $ANTLR start "rule__BooleanExpr__Group_5__0"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6124:1: rule__BooleanExpr__Group_5__0 : rule__BooleanExpr__Group_5__0__Impl rule__BooleanExpr__Group_5__1 ;
    public final void rule__BooleanExpr__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6128:1: ( rule__BooleanExpr__Group_5__0__Impl rule__BooleanExpr__Group_5__1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6129:2: rule__BooleanExpr__Group_5__0__Impl rule__BooleanExpr__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_5__0__Impl_in_rule__BooleanExpr__Group_5__012079);
            rule__BooleanExpr__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_5__1_in_rule__BooleanExpr__Group_5__012082);
            rule__BooleanExpr__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_5__0"


    // $ANTLR start "rule__BooleanExpr__Group_5__0__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6136:1: rule__BooleanExpr__Group_5__0__Impl : ( 'or' ) ;
    public final void rule__BooleanExpr__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6140:1: ( ( 'or' ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6141:1: ( 'or' )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6141:1: ( 'or' )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6142:1: 'or'
            {
             before(grammarAccess.getBooleanExprAccess().getOrKeyword_5_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__BooleanExpr__Group_5__0__Impl12110); 
             after(grammarAccess.getBooleanExprAccess().getOrKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_5__0__Impl"


    // $ANTLR start "rule__BooleanExpr__Group_5__1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6155:1: rule__BooleanExpr__Group_5__1 : rule__BooleanExpr__Group_5__1__Impl ;
    public final void rule__BooleanExpr__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6159:1: ( rule__BooleanExpr__Group_5__1__Impl )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6160:2: rule__BooleanExpr__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__Group_5__1__Impl_in_rule__BooleanExpr__Group_5__112141);
            rule__BooleanExpr__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_5__1"


    // $ANTLR start "rule__BooleanExpr__Group_5__1__Impl"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6166:1: rule__BooleanExpr__Group_5__1__Impl : ( ( rule__BooleanExpr__OrAssignment_5_1 ) ) ;
    public final void rule__BooleanExpr__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6170:1: ( ( ( rule__BooleanExpr__OrAssignment_5_1 ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6171:1: ( ( rule__BooleanExpr__OrAssignment_5_1 ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6171:1: ( ( rule__BooleanExpr__OrAssignment_5_1 ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6172:1: ( rule__BooleanExpr__OrAssignment_5_1 )
            {
             before(grammarAccess.getBooleanExprAccess().getOrAssignment_5_1()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6173:1: ( rule__BooleanExpr__OrAssignment_5_1 )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6173:2: rule__BooleanExpr__OrAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanExpr__OrAssignment_5_1_in_rule__BooleanExpr__Group_5__1__Impl12168);
            rule__BooleanExpr__OrAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExprAccess().getOrAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__Group_5__1__Impl"


    // $ANTLR start "rule__SchoolDatabase__SchoolAssignment_3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6188:1: rule__SchoolDatabase__SchoolAssignment_3 : ( ruleSchool ) ;
    public final void rule__SchoolDatabase__SchoolAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6192:1: ( ( ruleSchool ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6193:1: ( ruleSchool )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6193:1: ( ruleSchool )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6194:1: ruleSchool
            {
             before(grammarAccess.getSchoolDatabaseAccess().getSchoolSchoolParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchool_in_rule__SchoolDatabase__SchoolAssignment_312207);
            ruleSchool();

            state._fsp--;

             after(grammarAccess.getSchoolDatabaseAccess().getSchoolSchoolParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__SchoolAssignment_3"


    // $ANTLR start "rule__SchoolDatabase__QueryAssignment_4_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6203:1: rule__SchoolDatabase__QueryAssignment_4_2 : ( ruleQuery ) ;
    public final void rule__SchoolDatabase__QueryAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6207:1: ( ( ruleQuery ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6208:1: ( ruleQuery )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6208:1: ( ruleQuery )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6209:1: ruleQuery
            {
             before(grammarAccess.getSchoolDatabaseAccess().getQueryQueryParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuery_in_rule__SchoolDatabase__QueryAssignment_4_212238);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getSchoolDatabaseAccess().getQueryQueryParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__QueryAssignment_4_2"


    // $ANTLR start "rule__SchoolDatabase__QueryAssignment_4_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6218:1: rule__SchoolDatabase__QueryAssignment_4_3_1 : ( ruleQuery ) ;
    public final void rule__SchoolDatabase__QueryAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6222:1: ( ( ruleQuery ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6223:1: ( ruleQuery )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6223:1: ( ruleQuery )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6224:1: ruleQuery
            {
             before(grammarAccess.getSchoolDatabaseAccess().getQueryQueryParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuery_in_rule__SchoolDatabase__QueryAssignment_4_3_112269);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getSchoolDatabaseAccess().getQueryQueryParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchoolDatabase__QueryAssignment_4_3_1"


    // $ANTLR start "rule__School__NameAssignment_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6233:1: rule__School__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__School__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6237:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6238:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6238:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6239:1: ruleEString
            {
             before(grammarAccess.getSchoolAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__School__NameAssignment_112300);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__NameAssignment_1"


    // $ANTLR start "rule__School__FacultyAssignment_3_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6248:1: rule__School__FacultyAssignment_3_2 : ( ruleFaculty ) ;
    public final void rule__School__FacultyAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6252:1: ( ( ruleFaculty ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6253:1: ( ruleFaculty )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6253:1: ( ruleFaculty )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6254:1: ruleFaculty
            {
             before(grammarAccess.getSchoolAccess().getFacultyFacultyParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFaculty_in_rule__School__FacultyAssignment_3_212331);
            ruleFaculty();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getFacultyFacultyParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__FacultyAssignment_3_2"


    // $ANTLR start "rule__School__FacultyAssignment_3_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6263:1: rule__School__FacultyAssignment_3_3_1 : ( ruleFaculty ) ;
    public final void rule__School__FacultyAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6267:1: ( ( ruleFaculty ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6268:1: ( ruleFaculty )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6268:1: ( ruleFaculty )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6269:1: ruleFaculty
            {
             before(grammarAccess.getSchoolAccess().getFacultyFacultyParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFaculty_in_rule__School__FacultyAssignment_3_3_112362);
            ruleFaculty();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getFacultyFacultyParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__FacultyAssignment_3_3_1"


    // $ANTLR start "rule__School__CourseofstudyAssignment_4_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6278:1: rule__School__CourseofstudyAssignment_4_2 : ( ruleCourseOfStudy ) ;
    public final void rule__School__CourseofstudyAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6282:1: ( ( ruleCourseOfStudy ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6283:1: ( ruleCourseOfStudy )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6283:1: ( ruleCourseOfStudy )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6284:1: ruleCourseOfStudy
            {
             before(grammarAccess.getSchoolAccess().getCourseofstudyCourseOfStudyParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseOfStudy_in_rule__School__CourseofstudyAssignment_4_212393);
            ruleCourseOfStudy();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getCourseofstudyCourseOfStudyParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__CourseofstudyAssignment_4_2"


    // $ANTLR start "rule__School__CourseofstudyAssignment_4_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6293:1: rule__School__CourseofstudyAssignment_4_3_1 : ( ruleCourseOfStudy ) ;
    public final void rule__School__CourseofstudyAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6297:1: ( ( ruleCourseOfStudy ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6298:1: ( ruleCourseOfStudy )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6298:1: ( ruleCourseOfStudy )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6299:1: ruleCourseOfStudy
            {
             before(grammarAccess.getSchoolAccess().getCourseofstudyCourseOfStudyParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseOfStudy_in_rule__School__CourseofstudyAssignment_4_3_112424);
            ruleCourseOfStudy();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getCourseofstudyCourseOfStudyParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__CourseofstudyAssignment_4_3_1"


    // $ANTLR start "rule__School__CourseAssignment_5_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6308:1: rule__School__CourseAssignment_5_2 : ( ruleCourse ) ;
    public final void rule__School__CourseAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6312:1: ( ( ruleCourse ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6313:1: ( ruleCourse )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6313:1: ( ruleCourse )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6314:1: ruleCourse
            {
             before(grammarAccess.getSchoolAccess().getCourseCourseParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_rule__School__CourseAssignment_5_212455);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getCourseCourseParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__CourseAssignment_5_2"


    // $ANTLR start "rule__School__CourseAssignment_5_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6323:1: rule__School__CourseAssignment_5_3_1 : ( ruleCourse ) ;
    public final void rule__School__CourseAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6327:1: ( ( ruleCourse ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6328:1: ( ruleCourse )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6328:1: ( ruleCourse )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6329:1: ruleCourse
            {
             before(grammarAccess.getSchoolAccess().getCourseCourseParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_rule__School__CourseAssignment_5_3_112486);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getCourseCourseParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__CourseAssignment_5_3_1"


    // $ANTLR start "rule__School__StudentAssignment_6_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6338:1: rule__School__StudentAssignment_6_2 : ( ruleStudent ) ;
    public final void rule__School__StudentAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6342:1: ( ( ruleStudent ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6343:1: ( ruleStudent )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6343:1: ( ruleStudent )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6344:1: ruleStudent
            {
             before(grammarAccess.getSchoolAccess().getStudentStudentParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStudent_in_rule__School__StudentAssignment_6_212517);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getStudentStudentParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__StudentAssignment_6_2"


    // $ANTLR start "rule__School__StudentAssignment_6_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6353:1: rule__School__StudentAssignment_6_3_1 : ( ruleStudent ) ;
    public final void rule__School__StudentAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6357:1: ( ( ruleStudent ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6358:1: ( ruleStudent )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6358:1: ( ruleStudent )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6359:1: ruleStudent
            {
             before(grammarAccess.getSchoolAccess().getStudentStudentParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStudent_in_rule__School__StudentAssignment_6_3_112548);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getStudentStudentParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__StudentAssignment_6_3_1"


    // $ANTLR start "rule__School__TeacherAssignment_7_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6368:1: rule__School__TeacherAssignment_7_2 : ( ruleTeacher ) ;
    public final void rule__School__TeacherAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6372:1: ( ( ruleTeacher ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6373:1: ( ruleTeacher )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6373:1: ( ruleTeacher )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6374:1: ruleTeacher
            {
             before(grammarAccess.getSchoolAccess().getTeacherTeacherParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTeacher_in_rule__School__TeacherAssignment_7_212579);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getTeacherTeacherParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__TeacherAssignment_7_2"


    // $ANTLR start "rule__School__TeacherAssignment_7_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6383:1: rule__School__TeacherAssignment_7_3_1 : ( ruleTeacher ) ;
    public final void rule__School__TeacherAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6387:1: ( ( ruleTeacher ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6388:1: ( ruleTeacher )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6388:1: ( ruleTeacher )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6389:1: ruleTeacher
            {
             before(grammarAccess.getSchoolAccess().getTeacherTeacherParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTeacher_in_rule__School__TeacherAssignment_7_3_112610);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getTeacherTeacherParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__School__TeacherAssignment_7_3_1"


    // $ANTLR start "rule__Query__TypeAssignment_3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6398:1: rule__Query__TypeAssignment_3 : ( ruleSchoolElement ) ;
    public final void rule__Query__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6402:1: ( ( ruleSchoolElement ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6403:1: ( ruleSchoolElement )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6403:1: ( ruleSchoolElement )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6404:1: ruleSchoolElement
            {
             before(grammarAccess.getQueryAccess().getTypeSchoolElementEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSchoolElement_in_rule__Query__TypeAssignment_312641);
            ruleSchoolElement();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getTypeSchoolElementEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__TypeAssignment_3"


    // $ANTLR start "rule__Query__WhereAssignment_4_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6413:1: rule__Query__WhereAssignment_4_1 : ( ruleWhere ) ;
    public final void rule__Query__WhereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6417:1: ( ( ruleWhere ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6418:1: ( ruleWhere )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6418:1: ( ruleWhere )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6419:1: ruleWhere
            {
             before(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhere_in_rule__Query__WhereAssignment_4_112672);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__WhereAssignment_4_1"


    // $ANTLR start "rule__Faculty__NameAssignment_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6428:1: rule__Faculty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Faculty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6432:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6433:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6433:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6434:1: ruleEString
            {
             before(grammarAccess.getFacultyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Faculty__NameAssignment_212703);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFacultyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__NameAssignment_2"


    // $ANTLR start "rule__Faculty__CourseofstudyAssignment_4_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6443:1: rule__Faculty__CourseofstudyAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Faculty__CourseofstudyAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6447:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6448:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6448:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6449:1: ( ruleEString )
            {
             before(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyCrossReference_4_2_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6450:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6451:1: ruleEString
            {
             before(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Faculty__CourseofstudyAssignment_4_212738);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__CourseofstudyAssignment_4_2"


    // $ANTLR start "rule__Faculty__CourseofstudyAssignment_4_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6462:1: rule__Faculty__CourseofstudyAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Faculty__CourseofstudyAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6466:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6467:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6467:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6468:1: ( ruleEString )
            {
             before(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyCrossReference_4_3_1_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6469:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6470:1: ruleEString
            {
             before(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Faculty__CourseofstudyAssignment_4_3_112777);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getFacultyAccess().getCourseofstudyCourseOfStudyCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculty__CourseofstudyAssignment_4_3_1"


    // $ANTLR start "rule__CourseOfStudy__NameAssignment_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6481:1: rule__CourseOfStudy__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CourseOfStudy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6485:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6486:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6486:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6487:1: ruleEString
            {
             before(grammarAccess.getCourseOfStudyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseOfStudy__NameAssignment_112812);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseOfStudyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__NameAssignment_1"


    // $ANTLR start "rule__CourseOfStudy__CourseAssignment_3_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6496:1: rule__CourseOfStudy__CourseAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__CourseOfStudy__CourseAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6500:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6501:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6501:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6502:1: ( ruleEString )
            {
             before(grammarAccess.getCourseOfStudyAccess().getCourseCourseCrossReference_3_2_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6503:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6504:1: ruleEString
            {
             before(grammarAccess.getCourseOfStudyAccess().getCourseCourseEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseOfStudy__CourseAssignment_3_212847);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseOfStudyAccess().getCourseCourseEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getCourseOfStudyAccess().getCourseCourseCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__CourseAssignment_3_2"


    // $ANTLR start "rule__CourseOfStudy__CourseAssignment_3_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6515:1: rule__CourseOfStudy__CourseAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CourseOfStudy__CourseAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6519:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6520:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6520:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6521:1: ( ruleEString )
            {
             before(grammarAccess.getCourseOfStudyAccess().getCourseCourseCrossReference_3_3_1_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6522:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6523:1: ruleEString
            {
             before(grammarAccess.getCourseOfStudyAccess().getCourseCourseEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseOfStudy__CourseAssignment_3_3_112886);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseOfStudyAccess().getCourseCourseEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getCourseOfStudyAccess().getCourseCourseCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__CourseAssignment_3_3_1"


    // $ANTLR start "rule__CourseOfStudy__FacultyAssignment_5"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6534:1: rule__CourseOfStudy__FacultyAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__CourseOfStudy__FacultyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6538:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6539:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6539:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6540:1: ( ruleEString )
            {
             before(grammarAccess.getCourseOfStudyAccess().getFacultyFacultyCrossReference_5_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6541:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6542:1: ruleEString
            {
             before(grammarAccess.getCourseOfStudyAccess().getFacultyFacultyEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseOfStudy__FacultyAssignment_512925);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseOfStudyAccess().getFacultyFacultyEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCourseOfStudyAccess().getFacultyFacultyCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__FacultyAssignment_5"


    // $ANTLR start "rule__CourseOfStudy__StudentAssignment_6_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6553:1: rule__CourseOfStudy__StudentAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__CourseOfStudy__StudentAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6557:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6558:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6558:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6559:1: ( ruleEString )
            {
             before(grammarAccess.getCourseOfStudyAccess().getStudentStudentCrossReference_6_2_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6560:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6561:1: ruleEString
            {
             before(grammarAccess.getCourseOfStudyAccess().getStudentStudentEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseOfStudy__StudentAssignment_6_212964);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseOfStudyAccess().getStudentStudentEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getCourseOfStudyAccess().getStudentStudentCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__StudentAssignment_6_2"


    // $ANTLR start "rule__CourseOfStudy__StudentAssignment_6_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6572:1: rule__CourseOfStudy__StudentAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CourseOfStudy__StudentAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6576:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6577:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6577:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6578:1: ( ruleEString )
            {
             before(grammarAccess.getCourseOfStudyAccess().getStudentStudentCrossReference_6_3_1_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6579:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6580:1: ruleEString
            {
             before(grammarAccess.getCourseOfStudyAccess().getStudentStudentEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseOfStudy__StudentAssignment_6_3_113003);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseOfStudyAccess().getStudentStudentEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getCourseOfStudyAccess().getStudentStudentCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseOfStudy__StudentAssignment_6_3_1"


    // $ANTLR start "rule__Course__NameAssignment_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6591:1: rule__Course__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Course__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6595:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6596:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6596:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6597:1: ruleEString
            {
             before(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Course__NameAssignment_113038);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__NameAssignment_1"


    // $ANTLR start "rule__Course__CourseNumberAssignment_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6606:1: rule__Course__CourseNumberAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Course__CourseNumberAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6610:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6611:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6611:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6612:1: ruleEString
            {
             before(grammarAccess.getCourseAccess().getCourseNumberEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Course__CourseNumberAssignment_3_113069);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getCourseNumberEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CourseNumberAssignment_3_1"


    // $ANTLR start "rule__Course__EnrolledStudentAssignment_4_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6621:1: rule__Course__EnrolledStudentAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Course__EnrolledStudentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6625:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6626:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6626:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6627:1: ( ruleEString )
            {
             before(grammarAccess.getCourseAccess().getEnrolledStudentStudentCrossReference_4_2_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6628:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6629:1: ruleEString
            {
             before(grammarAccess.getCourseAccess().getEnrolledStudentStudentEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Course__EnrolledStudentAssignment_4_213104);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getEnrolledStudentStudentEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getEnrolledStudentStudentCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__EnrolledStudentAssignment_4_2"


    // $ANTLR start "rule__Course__EnrolledStudentAssignment_4_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6640:1: rule__Course__EnrolledStudentAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Course__EnrolledStudentAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6644:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6645:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6645:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6646:1: ( ruleEString )
            {
             before(grammarAccess.getCourseAccess().getEnrolledStudentStudentCrossReference_4_3_1_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6647:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6648:1: ruleEString
            {
             before(grammarAccess.getCourseAccess().getEnrolledStudentStudentEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Course__EnrolledStudentAssignment_4_3_113143);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getEnrolledStudentStudentEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getEnrolledStudentStudentCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__EnrolledStudentAssignment_4_3_1"


    // $ANTLR start "rule__Course__TaughtByAssignment_6"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6659:1: rule__Course__TaughtByAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Course__TaughtByAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6663:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6664:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6664:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6665:1: ( ruleEString )
            {
             before(grammarAccess.getCourseAccess().getTaughtByTeacherCrossReference_6_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6666:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6667:1: ruleEString
            {
             before(grammarAccess.getCourseAccess().getTaughtByTeacherEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Course__TaughtByAssignment_613182);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getTaughtByTeacherEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getTaughtByTeacherCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__TaughtByAssignment_6"


    // $ANTLR start "rule__Course__CourseresultAssignment_7_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6678:1: rule__Course__CourseresultAssignment_7_2 : ( ruleCourseResult ) ;
    public final void rule__Course__CourseresultAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6682:1: ( ( ruleCourseResult ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6683:1: ( ruleCourseResult )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6683:1: ( ruleCourseResult )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6684:1: ruleCourseResult
            {
             before(grammarAccess.getCourseAccess().getCourseresultCourseResultParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseResult_in_rule__Course__CourseresultAssignment_7_213217);
            ruleCourseResult();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getCourseresultCourseResultParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CourseresultAssignment_7_2"


    // $ANTLR start "rule__Course__CourseresultAssignment_7_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6693:1: rule__Course__CourseresultAssignment_7_3_1 : ( ruleCourseResult ) ;
    public final void rule__Course__CourseresultAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6697:1: ( ( ruleCourseResult ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6698:1: ( ruleCourseResult )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6698:1: ( ruleCourseResult )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6699:1: ruleCourseResult
            {
             before(grammarAccess.getCourseAccess().getCourseresultCourseResultParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseResult_in_rule__Course__CourseresultAssignment_7_3_113248);
            ruleCourseResult();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getCourseresultCourseResultParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CourseresultAssignment_7_3_1"


    // $ANTLR start "rule__Student__NameAssignment_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6708:1: rule__Student__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Student__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6712:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6713:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6713:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6714:1: ruleEString
            {
             before(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Student__NameAssignment_113279);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__NameAssignment_1"


    // $ANTLR start "rule__Student__StudentNumberAssignment_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6723:1: rule__Student__StudentNumberAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Student__StudentNumberAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6727:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6728:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6728:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6729:1: ruleEString
            {
             before(grammarAccess.getStudentAccess().getStudentNumberEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Student__StudentNumberAssignment_3_113310);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getStudentNumberEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__StudentNumberAssignment_3_1"


    // $ANTLR start "rule__Student__EnrolledInAssignment_4_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6738:1: rule__Student__EnrolledInAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Student__EnrolledInAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6742:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6743:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6743:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6744:1: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getEnrolledInCourseCrossReference_4_2_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6745:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6746:1: ruleEString
            {
             before(grammarAccess.getStudentAccess().getEnrolledInCourseEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Student__EnrolledInAssignment_4_213345);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getEnrolledInCourseEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getEnrolledInCourseCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__EnrolledInAssignment_4_2"


    // $ANTLR start "rule__Student__EnrolledInAssignment_4_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6757:1: rule__Student__EnrolledInAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Student__EnrolledInAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6761:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6762:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6762:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6763:1: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getEnrolledInCourseCrossReference_4_3_1_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6764:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6765:1: ruleEString
            {
             before(grammarAccess.getStudentAccess().getEnrolledInCourseEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Student__EnrolledInAssignment_4_3_113384);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getEnrolledInCourseEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getEnrolledInCourseCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__EnrolledInAssignment_4_3_1"


    // $ANTLR start "rule__Student__CourseofstudyAssignment_6"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6776:1: rule__Student__CourseofstudyAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Student__CourseofstudyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6780:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6781:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6781:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6782:1: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getCourseofstudyCourseOfStudyCrossReference_6_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6783:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6784:1: ruleEString
            {
             before(grammarAccess.getStudentAccess().getCourseofstudyCourseOfStudyEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Student__CourseofstudyAssignment_613423);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getCourseofstudyCourseOfStudyEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getCourseofstudyCourseOfStudyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__CourseofstudyAssignment_6"


    // $ANTLR start "rule__Teacher__NameAssignment_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6795:1: rule__Teacher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Teacher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6799:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6800:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6800:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6801:1: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Teacher__NameAssignment_213458);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__NameAssignment_2"


    // $ANTLR start "rule__Teacher__TeachesAssignment_4_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6810:1: rule__Teacher__TeachesAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__TeachesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6814:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6815:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6815:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6816:1: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getTeachesCourseCrossReference_4_2_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6817:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6818:1: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getTeachesCourseEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Teacher__TeachesAssignment_4_213493);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getTeachesCourseEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getTeachesCourseCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__TeachesAssignment_4_2"


    // $ANTLR start "rule__Teacher__TeachesAssignment_4_3_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6829:1: rule__Teacher__TeachesAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__TeachesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6833:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6834:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6834:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6835:1: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getTeachesCourseCrossReference_4_3_1_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6836:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6837:1: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getTeachesCourseEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Teacher__TeachesAssignment_4_3_113532);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getTeachesCourseEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getTeachesCourseCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__TeachesAssignment_4_3_1"


    // $ANTLR start "rule__CourseResult__GradeAssignment_2_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6848:1: rule__CourseResult__GradeAssignment_2_1 : ( ruleEBigInteger ) ;
    public final void rule__CourseResult__GradeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6852:1: ( ( ruleEBigInteger ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6853:1: ( ruleEBigInteger )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6853:1: ( ruleEBigInteger )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6854:1: ruleEBigInteger
            {
             before(grammarAccess.getCourseResultAccess().getGradeEBigIntegerParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_rule__CourseResult__GradeAssignment_2_113567);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getCourseResultAccess().getGradeEBigIntegerParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__GradeAssignment_2_1"


    // $ANTLR start "rule__CourseResult__StudentAssignment_4"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6863:1: rule__CourseResult__StudentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__CourseResult__StudentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6867:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6868:1: ( ( ruleEString ) )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6868:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6869:1: ( ruleEString )
            {
             before(grammarAccess.getCourseResultAccess().getStudentStudentCrossReference_4_0()); 
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6870:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6871:1: ruleEString
            {
             before(grammarAccess.getCourseResultAccess().getStudentStudentEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseResult__StudentAssignment_413602);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseResultAccess().getStudentStudentEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCourseResultAccess().getStudentStudentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseResult__StudentAssignment_4"


    // $ANTLR start "rule__Where__BooleanexprAssignment_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6882:1: rule__Where__BooleanexprAssignment_1 : ( ruleBooleanExpr ) ;
    public final void rule__Where__BooleanexprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6886:1: ( ( ruleBooleanExpr ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6887:1: ( ruleBooleanExpr )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6887:1: ( ruleBooleanExpr )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6888:1: ruleBooleanExpr
            {
             before(grammarAccess.getWhereAccess().getBooleanexprBooleanExprParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_rule__Where__BooleanexprAssignment_113637);
            ruleBooleanExpr();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getBooleanexprBooleanExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__BooleanexprAssignment_1"


    // $ANTLR start "rule__BooleanExpr__LhsAssignment_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6897:1: rule__BooleanExpr__LhsAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanExpr__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6901:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6902:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6902:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6903:1: ruleEString
            {
             before(grammarAccess.getBooleanExprAccess().getLhsEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanExpr__LhsAssignment_113668);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanExprAccess().getLhsEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__LhsAssignment_1"


    // $ANTLR start "rule__BooleanExpr__OperatorAssignment_2"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6912:1: rule__BooleanExpr__OperatorAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanExpr__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6916:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6917:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6917:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6918:1: ruleEString
            {
             before(grammarAccess.getBooleanExprAccess().getOperatorEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanExpr__OperatorAssignment_213699);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanExprAccess().getOperatorEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__OperatorAssignment_2"


    // $ANTLR start "rule__BooleanExpr__RhsAssignment_3"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6927:1: rule__BooleanExpr__RhsAssignment_3 : ( ruleEString ) ;
    public final void rule__BooleanExpr__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6931:1: ( ( ruleEString ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6932:1: ( ruleEString )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6932:1: ( ruleEString )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6933:1: ruleEString
            {
             before(grammarAccess.getBooleanExprAccess().getRhsEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanExpr__RhsAssignment_313730);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanExprAccess().getRhsEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__RhsAssignment_3"


    // $ANTLR start "rule__BooleanExpr__AndAssignment_4_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6942:1: rule__BooleanExpr__AndAssignment_4_1 : ( ruleBooleanExpr ) ;
    public final void rule__BooleanExpr__AndAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6946:1: ( ( ruleBooleanExpr ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6947:1: ( ruleBooleanExpr )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6947:1: ( ruleBooleanExpr )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6948:1: ruleBooleanExpr
            {
             before(grammarAccess.getBooleanExprAccess().getAndBooleanExprParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_rule__BooleanExpr__AndAssignment_4_113761);
            ruleBooleanExpr();

            state._fsp--;

             after(grammarAccess.getBooleanExprAccess().getAndBooleanExprParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__AndAssignment_4_1"


    // $ANTLR start "rule__BooleanExpr__OrAssignment_5_1"
    // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6957:1: rule__BooleanExpr__OrAssignment_5_1 : ( ruleBooleanExpr ) ;
    public final void rule__BooleanExpr__OrAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6961:1: ( ( ruleBooleanExpr ) )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6962:1: ( ruleBooleanExpr )
            {
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6962:1: ( ruleBooleanExpr )
            // ../org.xtext.ps3.school.ui/src-gen/org/xtext/ps3/school/ui/contentassist/antlr/internal/InternalSchooldsl.g:6963:1: ruleBooleanExpr
            {
             before(grammarAccess.getBooleanExprAccess().getOrBooleanExprParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpr_in_rule__BooleanExpr__OrAssignment_5_113792);
            ruleBooleanExpr();

            state._fsp--;

             after(grammarAccess.getBooleanExprAccess().getOrBooleanExprParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpr__OrAssignment_5_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSchoolDatabase_in_entryRuleSchoolDatabase61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSchoolDatabase68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__0_in_ruleSchoolDatabase94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSchool_in_entryRuleSchool121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSchool128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__0_in_ruleSchool154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuery188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFaculty_in_entryRuleFaculty241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFaculty248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group__0_in_ruleFaculty274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseOfStudy_in_entryRuleCourseOfStudy301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseOfStudy308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__0_in_ruleCourseOfStudy334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0_in_ruleCourse394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStudent_in_entryRuleStudent421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStudent428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__0_in_ruleStudent454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTeacher_in_entryRuleTeacher481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTeacher488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group__0_in_ruleTeacher514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseResult_in_entryRuleCourseResult601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseResult608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__0_in_ruleCourseResult634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigInteger668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__0_in_ruleEBigInteger694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhere_in_entryRuleWhere721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhere728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Where__Group__0_in_ruleWhere754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_entryRuleBooleanExpr781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpr788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__0_in_ruleBooleanExpr814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolElement__Alternatives_in_ruleSchoolElement851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__SchoolElement__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SchoolElement__Alternatives957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SchoolElement__Alternatives978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SchoolElement__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SchoolElement__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__SchoolElement__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__0__Impl_in_rule__SchoolDatabase__Group__01074 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__1_in_rule__SchoolDatabase__Group__01077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SchoolDatabase__Group__0__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__1__Impl_in_rule__SchoolDatabase__Group__11136 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__2_in_rule__SchoolDatabase__Group__11139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SchoolDatabase__Group__1__Impl1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__2__Impl_in_rule__SchoolDatabase__Group__21198 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__3_in_rule__SchoolDatabase__Group__21201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SchoolDatabase__Group__2__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__3__Impl_in_rule__SchoolDatabase__Group__31260 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__4_in_rule__SchoolDatabase__Group__31263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__SchoolAssignment_3_in_rule__SchoolDatabase__Group__3__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__4__Impl_in_rule__SchoolDatabase__Group__41320 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__5_in_rule__SchoolDatabase__Group__41323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__0_in_rule__SchoolDatabase__Group__4__Impl1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group__5__Impl_in_rule__SchoolDatabase__Group__51381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__SchoolDatabase__Group__5__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__0__Impl_in_rule__SchoolDatabase__Group_4__01452 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__1_in_rule__SchoolDatabase__Group_4__01455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__SchoolDatabase__Group_4__0__Impl1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__1__Impl_in_rule__SchoolDatabase__Group_4__11514 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__2_in_rule__SchoolDatabase__Group_4__11517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SchoolDatabase__Group_4__1__Impl1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__2__Impl_in_rule__SchoolDatabase__Group_4__21576 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__3_in_rule__SchoolDatabase__Group_4__21579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__QueryAssignment_4_2_in_rule__SchoolDatabase__Group_4__2__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__3__Impl_in_rule__SchoolDatabase__Group_4__31636 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__4_in_rule__SchoolDatabase__Group_4__31639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4_3__0_in_rule__SchoolDatabase__Group_4__3__Impl1666 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4__4__Impl_in_rule__SchoolDatabase__Group_4__41697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__SchoolDatabase__Group_4__4__Impl1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4_3__0__Impl_in_rule__SchoolDatabase__Group_4_3__01766 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4_3__1_in_rule__SchoolDatabase__Group_4_3__01769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SchoolDatabase__Group_4_3__0__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__Group_4_3__1__Impl_in_rule__SchoolDatabase__Group_4_3__11828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SchoolDatabase__QueryAssignment_4_3_1_in_rule__SchoolDatabase__Group_4_3__1__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__0__Impl_in_rule__School__Group__01889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__School__Group__1_in_rule__School__Group__01892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__1__Impl_in_rule__School__Group__11950 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__School__Group__2_in_rule__School__Group__11953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__NameAssignment_1_in_rule__School__Group__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__2__Impl_in_rule__School__Group__22010 = new BitSet(new long[]{0x000000000F900000L});
        public static final BitSet FOLLOW_rule__School__Group__3_in_rule__School__Group__22013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__School__Group__2__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__3__Impl_in_rule__School__Group__32072 = new BitSet(new long[]{0x000000000F900000L});
        public static final BitSet FOLLOW_rule__School__Group__4_in_rule__School__Group__32075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3__0_in_rule__School__Group__3__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__4__Impl_in_rule__School__Group__42133 = new BitSet(new long[]{0x000000000F900000L});
        public static final BitSet FOLLOW_rule__School__Group__5_in_rule__School__Group__42136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4__0_in_rule__School__Group__4__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__5__Impl_in_rule__School__Group__52194 = new BitSet(new long[]{0x000000000F900000L});
        public static final BitSet FOLLOW_rule__School__Group__6_in_rule__School__Group__52197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5__0_in_rule__School__Group__5__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__6__Impl_in_rule__School__Group__62255 = new BitSet(new long[]{0x000000000F900000L});
        public static final BitSet FOLLOW_rule__School__Group__7_in_rule__School__Group__62258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6__0_in_rule__School__Group__6__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__7__Impl_in_rule__School__Group__72316 = new BitSet(new long[]{0x000000000F900000L});
        public static final BitSet FOLLOW_rule__School__Group__8_in_rule__School__Group__72319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7__0_in_rule__School__Group__7__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group__8__Impl_in_rule__School__Group__82377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__School__Group__8__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3__0__Impl_in_rule__School__Group_3__02454 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__School__Group_3__1_in_rule__School__Group_3__02457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__School__Group_3__0__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3__1__Impl_in_rule__School__Group_3__12516 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__School__Group_3__2_in_rule__School__Group_3__12519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__School__Group_3__1__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3__2__Impl_in_rule__School__Group_3__22578 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_3__3_in_rule__School__Group_3__22581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__FacultyAssignment_3_2_in_rule__School__Group_3__2__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3__3__Impl_in_rule__School__Group_3__32638 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_3__4_in_rule__School__Group_3__32641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3_3__0_in_rule__School__Group_3__3__Impl2668 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__School__Group_3__4__Impl_in_rule__School__Group_3__42699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__School__Group_3__4__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3_3__0__Impl_in_rule__School__Group_3_3__02768 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__School__Group_3_3__1_in_rule__School__Group_3_3__02771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__School__Group_3_3__0__Impl2799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_3_3__1__Impl_in_rule__School__Group_3_3__12830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__FacultyAssignment_3_3_1_in_rule__School__Group_3_3__1__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4__0__Impl_in_rule__School__Group_4__02891 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__School__Group_4__1_in_rule__School__Group_4__02894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__School__Group_4__0__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4__1__Impl_in_rule__School__Group_4__12953 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__School__Group_4__2_in_rule__School__Group_4__12956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__School__Group_4__1__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4__2__Impl_in_rule__School__Group_4__23015 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_4__3_in_rule__School__Group_4__23018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__CourseofstudyAssignment_4_2_in_rule__School__Group_4__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4__3__Impl_in_rule__School__Group_4__33075 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_4__4_in_rule__School__Group_4__33078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4_3__0_in_rule__School__Group_4__3__Impl3105 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__School__Group_4__4__Impl_in_rule__School__Group_4__43136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__School__Group_4__4__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4_3__0__Impl_in_rule__School__Group_4_3__03205 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__School__Group_4_3__1_in_rule__School__Group_4_3__03208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__School__Group_4_3__0__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_4_3__1__Impl_in_rule__School__Group_4_3__13267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__CourseofstudyAssignment_4_3_1_in_rule__School__Group_4_3__1__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5__0__Impl_in_rule__School__Group_5__03328 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__School__Group_5__1_in_rule__School__Group_5__03331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__School__Group_5__0__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5__1__Impl_in_rule__School__Group_5__13390 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__School__Group_5__2_in_rule__School__Group_5__13393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__School__Group_5__1__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5__2__Impl_in_rule__School__Group_5__23452 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_5__3_in_rule__School__Group_5__23455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__CourseAssignment_5_2_in_rule__School__Group_5__2__Impl3482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5__3__Impl_in_rule__School__Group_5__33512 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_5__4_in_rule__School__Group_5__33515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5_3__0_in_rule__School__Group_5__3__Impl3542 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__School__Group_5__4__Impl_in_rule__School__Group_5__43573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__School__Group_5__4__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5_3__0__Impl_in_rule__School__Group_5_3__03642 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__School__Group_5_3__1_in_rule__School__Group_5_3__03645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__School__Group_5_3__0__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_5_3__1__Impl_in_rule__School__Group_5_3__13704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__CourseAssignment_5_3_1_in_rule__School__Group_5_3__1__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6__0__Impl_in_rule__School__Group_6__03765 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__School__Group_6__1_in_rule__School__Group_6__03768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__School__Group_6__0__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6__1__Impl_in_rule__School__Group_6__13827 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__School__Group_6__2_in_rule__School__Group_6__13830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__School__Group_6__1__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6__2__Impl_in_rule__School__Group_6__23889 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_6__3_in_rule__School__Group_6__23892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__StudentAssignment_6_2_in_rule__School__Group_6__2__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6__3__Impl_in_rule__School__Group_6__33949 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_6__4_in_rule__School__Group_6__33952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6_3__0_in_rule__School__Group_6__3__Impl3979 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__School__Group_6__4__Impl_in_rule__School__Group_6__44010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__School__Group_6__4__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6_3__0__Impl_in_rule__School__Group_6_3__04079 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__School__Group_6_3__1_in_rule__School__Group_6_3__04082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__School__Group_6_3__0__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_6_3__1__Impl_in_rule__School__Group_6_3__14141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__StudentAssignment_6_3_1_in_rule__School__Group_6_3__1__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7__0__Impl_in_rule__School__Group_7__04202 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__School__Group_7__1_in_rule__School__Group_7__04205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__School__Group_7__0__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7__1__Impl_in_rule__School__Group_7__14264 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__School__Group_7__2_in_rule__School__Group_7__14267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__School__Group_7__1__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7__2__Impl_in_rule__School__Group_7__24326 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_7__3_in_rule__School__Group_7__24329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__TeacherAssignment_7_2_in_rule__School__Group_7__2__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7__3__Impl_in_rule__School__Group_7__34386 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__School__Group_7__4_in_rule__School__Group_7__34389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7_3__0_in_rule__School__Group_7__3__Impl4416 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__School__Group_7__4__Impl_in_rule__School__Group_7__44447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__School__Group_7__4__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7_3__0__Impl_in_rule__School__Group_7_3__04516 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__School__Group_7_3__1_in_rule__School__Group_7_3__04519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__School__Group_7_3__0__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__Group_7_3__1__Impl_in_rule__School__Group_7_3__14578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__School__TeacherAssignment_7_3_1_in_rule__School__Group_7_3__1__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__04639 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__04642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__14700 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Query__Group__2_in_rule__Query__Group__14703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Query__Group__1__Impl4731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group__2__Impl_in_rule__Query__Group__24762 = new BitSet(new long[]{0x000000002011F800L});
        public static final BitSet FOLLOW_rule__Query__Group__3_in_rule__Query__Group__24765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Query__Group__2__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group__3__Impl_in_rule__Query__Group__34824 = new BitSet(new long[]{0x000000002011F800L});
        public static final BitSet FOLLOW_rule__Query__Group__4_in_rule__Query__Group__34827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__TypeAssignment_3_in_rule__Query__Group__3__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group__4__Impl_in_rule__Query__Group__44885 = new BitSet(new long[]{0x000000002011F800L});
        public static final BitSet FOLLOW_rule__Query__Group__5_in_rule__Query__Group__44888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group_4__0_in_rule__Query__Group__4__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group__5__Impl_in_rule__Query__Group__54946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Query__Group__5__Impl4974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group_4__0__Impl_in_rule__Query__Group_4__05017 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Query__Group_4__1_in_rule__Query__Group_4__05020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Query__Group_4__0__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__Group_4__1__Impl_in_rule__Query__Group_4__15079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Query__WhereAssignment_4_1_in_rule__Query__Group_4__1__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group__0__Impl_in_rule__Faculty__Group__05140 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Faculty__Group__1_in_rule__Faculty__Group__05143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group__1__Impl_in_rule__Faculty__Group__15201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Faculty__Group__2_in_rule__Faculty__Group__15204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Faculty__Group__1__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group__2__Impl_in_rule__Faculty__Group__25263 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Faculty__Group__3_in_rule__Faculty__Group__25266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__NameAssignment_2_in_rule__Faculty__Group__2__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group__3__Impl_in_rule__Faculty__Group__35323 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__Faculty__Group__4_in_rule__Faculty__Group__35326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Faculty__Group__3__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group__4__Impl_in_rule__Faculty__Group__45385 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__Faculty__Group__5_in_rule__Faculty__Group__45388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__0_in_rule__Faculty__Group__4__Impl5415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group__5__Impl_in_rule__Faculty__Group__55446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Faculty__Group__5__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__0__Impl_in_rule__Faculty__Group_4__05517 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__1_in_rule__Faculty__Group_4__05520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Faculty__Group_4__0__Impl5548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__1__Impl_in_rule__Faculty__Group_4__15579 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__2_in_rule__Faculty__Group_4__15582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Faculty__Group_4__1__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__2__Impl_in_rule__Faculty__Group_4__25641 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__3_in_rule__Faculty__Group_4__25644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__CourseofstudyAssignment_4_2_in_rule__Faculty__Group_4__2__Impl5671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__3__Impl_in_rule__Faculty__Group_4__35701 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__4_in_rule__Faculty__Group_4__35704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4_3__0_in_rule__Faculty__Group_4__3__Impl5731 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4__4__Impl_in_rule__Faculty__Group_4__45762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Faculty__Group_4__4__Impl5790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4_3__0__Impl_in_rule__Faculty__Group_4_3__05831 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4_3__1_in_rule__Faculty__Group_4_3__05834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Faculty__Group_4_3__0__Impl5862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__Group_4_3__1__Impl_in_rule__Faculty__Group_4_3__15893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Faculty__CourseofstudyAssignment_4_3_1_in_rule__Faculty__Group_4_3__1__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__0__Impl_in_rule__CourseOfStudy__Group__05954 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__1_in_rule__CourseOfStudy__Group__05957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__CourseOfStudy__Group__0__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__1__Impl_in_rule__CourseOfStudy__Group__16016 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__2_in_rule__CourseOfStudy__Group__16019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__NameAssignment_1_in_rule__CourseOfStudy__Group__1__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__2__Impl_in_rule__CourseOfStudy__Group__26076 = new BitSet(new long[]{0x0000000102000000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__3_in_rule__CourseOfStudy__Group__26079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__CourseOfStudy__Group__2__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__3__Impl_in_rule__CourseOfStudy__Group__36138 = new BitSet(new long[]{0x0000000102000000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__4_in_rule__CourseOfStudy__Group__36141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__0_in_rule__CourseOfStudy__Group__3__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__4__Impl_in_rule__CourseOfStudy__Group__46199 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__5_in_rule__CourseOfStudy__Group__46202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__CourseOfStudy__Group__4__Impl6230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__5__Impl_in_rule__CourseOfStudy__Group__56261 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__6_in_rule__CourseOfStudy__Group__56264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__FacultyAssignment_5_in_rule__CourseOfStudy__Group__5__Impl6291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__6__Impl_in_rule__CourseOfStudy__Group__66321 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__7_in_rule__CourseOfStudy__Group__66324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__0_in_rule__CourseOfStudy__Group__6__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group__7__Impl_in_rule__CourseOfStudy__Group__76382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CourseOfStudy__Group__7__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__0__Impl_in_rule__CourseOfStudy__Group_3__06457 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__1_in_rule__CourseOfStudy__Group_3__06460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CourseOfStudy__Group_3__0__Impl6488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__1__Impl_in_rule__CourseOfStudy__Group_3__16519 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__2_in_rule__CourseOfStudy__Group_3__16522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CourseOfStudy__Group_3__1__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__2__Impl_in_rule__CourseOfStudy__Group_3__26581 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__3_in_rule__CourseOfStudy__Group_3__26584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__CourseAssignment_3_2_in_rule__CourseOfStudy__Group_3__2__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__3__Impl_in_rule__CourseOfStudy__Group_3__36641 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__4_in_rule__CourseOfStudy__Group_3__36644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3_3__0_in_rule__CourseOfStudy__Group_3__3__Impl6671 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3__4__Impl_in_rule__CourseOfStudy__Group_3__46702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CourseOfStudy__Group_3__4__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3_3__0__Impl_in_rule__CourseOfStudy__Group_3_3__06771 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3_3__1_in_rule__CourseOfStudy__Group_3_3__06774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CourseOfStudy__Group_3_3__0__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_3_3__1__Impl_in_rule__CourseOfStudy__Group_3_3__16833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__CourseAssignment_3_3_1_in_rule__CourseOfStudy__Group_3_3__1__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__0__Impl_in_rule__CourseOfStudy__Group_6__06894 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__1_in_rule__CourseOfStudy__Group_6__06897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CourseOfStudy__Group_6__0__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__1__Impl_in_rule__CourseOfStudy__Group_6__16956 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__2_in_rule__CourseOfStudy__Group_6__16959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CourseOfStudy__Group_6__1__Impl6987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__2__Impl_in_rule__CourseOfStudy__Group_6__27018 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__3_in_rule__CourseOfStudy__Group_6__27021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__StudentAssignment_6_2_in_rule__CourseOfStudy__Group_6__2__Impl7048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__3__Impl_in_rule__CourseOfStudy__Group_6__37078 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__4_in_rule__CourseOfStudy__Group_6__37081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6_3__0_in_rule__CourseOfStudy__Group_6__3__Impl7108 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6__4__Impl_in_rule__CourseOfStudy__Group_6__47139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CourseOfStudy__Group_6__4__Impl7167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6_3__0__Impl_in_rule__CourseOfStudy__Group_6_3__07208 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6_3__1_in_rule__CourseOfStudy__Group_6_3__07211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CourseOfStudy__Group_6_3__0__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__Group_6_3__1__Impl_in_rule__CourseOfStudy__Group_6_3__17270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseOfStudy__StudentAssignment_6_3_1_in_rule__CourseOfStudy__Group_6_3__1__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__07331 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Course__Group__1_in_rule__Course__Group__07334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Course__Group__0__Impl7362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__17393 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Course__Group__2_in_rule__Course__Group__17396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__27453 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rule__Course__Group__3_in_rule__Course__Group__27456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Course__Group__2__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__37515 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rule__Course__Group__4_in_rule__Course__Group__37518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_3__0_in_rule__Course__Group__3__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__47576 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rule__Course__Group__5_in_rule__Course__Group__47579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4__0_in_rule__Course__Group__4__Impl7606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__5__Impl_in_rule__Course__Group__57637 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Course__Group__6_in_rule__Course__Group__57640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Course__Group__5__Impl7668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__6__Impl_in_rule__Course__Group__67699 = new BitSet(new long[]{0x0000001000100000L});
        public static final BitSet FOLLOW_rule__Course__Group__7_in_rule__Course__Group__67702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__TaughtByAssignment_6_in_rule__Course__Group__6__Impl7729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__7__Impl_in_rule__Course__Group__77759 = new BitSet(new long[]{0x0000001000100000L});
        public static final BitSet FOLLOW_rule__Course__Group__8_in_rule__Course__Group__77762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7__0_in_rule__Course__Group__7__Impl7789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__8__Impl_in_rule__Course__Group__87820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Course__Group__8__Impl7848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_3__0__Impl_in_rule__Course__Group_3__07897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Course__Group_3__1_in_rule__Course__Group_3__07900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Course__Group_3__0__Impl7928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_3__1__Impl_in_rule__Course__Group_3__17959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__CourseNumberAssignment_3_1_in_rule__Course__Group_3__1__Impl7986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4__0__Impl_in_rule__Course__Group_4__08020 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Course__Group_4__1_in_rule__Course__Group_4__08023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Course__Group_4__0__Impl8051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4__1__Impl_in_rule__Course__Group_4__18082 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Course__Group_4__2_in_rule__Course__Group_4__18085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Course__Group_4__1__Impl8113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4__2__Impl_in_rule__Course__Group_4__28144 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Course__Group_4__3_in_rule__Course__Group_4__28147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__EnrolledStudentAssignment_4_2_in_rule__Course__Group_4__2__Impl8174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4__3__Impl_in_rule__Course__Group_4__38204 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Course__Group_4__4_in_rule__Course__Group_4__38207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4_3__0_in_rule__Course__Group_4__3__Impl8234 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Course__Group_4__4__Impl_in_rule__Course__Group_4__48265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Course__Group_4__4__Impl8293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4_3__0__Impl_in_rule__Course__Group_4_3__08334 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Course__Group_4_3__1_in_rule__Course__Group_4_3__08337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Course__Group_4_3__0__Impl8365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_4_3__1__Impl_in_rule__Course__Group_4_3__18396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__EnrolledStudentAssignment_4_3_1_in_rule__Course__Group_4_3__1__Impl8423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7__0__Impl_in_rule__Course__Group_7__08457 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Course__Group_7__1_in_rule__Course__Group_7__08460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Course__Group_7__0__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7__1__Impl_in_rule__Course__Group_7__18519 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Course__Group_7__2_in_rule__Course__Group_7__18522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Course__Group_7__1__Impl8550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7__2__Impl_in_rule__Course__Group_7__28581 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__Course__Group_7__3_in_rule__Course__Group_7__28584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__CourseresultAssignment_7_2_in_rule__Course__Group_7__2__Impl8611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7__3__Impl_in_rule__Course__Group_7__38641 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__Course__Group_7__4_in_rule__Course__Group_7__38644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7_3__0_in_rule__Course__Group_7__3__Impl8671 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Course__Group_7__4__Impl_in_rule__Course__Group_7__48702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Course__Group_7__4__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7_3__0__Impl_in_rule__Course__Group_7_3__08771 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Course__Group_7_3__1_in_rule__Course__Group_7_3__08774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Course__Group_7_3__0__Impl8802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_7_3__1__Impl_in_rule__Course__Group_7_3__18833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__CourseresultAssignment_7_3_1_in_rule__Course__Group_7_3__1__Impl8860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__0__Impl_in_rule__Student__Group__08894 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Student__Group__1_in_rule__Student__Group__08897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Student__Group__0__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__1__Impl_in_rule__Student__Group__18956 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Student__Group__2_in_rule__Student__Group__18959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__NameAssignment_1_in_rule__Student__Group__1__Impl8986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__2__Impl_in_rule__Student__Group__29016 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_rule__Student__Group__3_in_rule__Student__Group__29019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Student__Group__2__Impl9047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__3__Impl_in_rule__Student__Group__39078 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_rule__Student__Group__4_in_rule__Student__Group__39081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_3__0_in_rule__Student__Group__3__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__4__Impl_in_rule__Student__Group__49139 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_rule__Student__Group__5_in_rule__Student__Group__49142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4__0_in_rule__Student__Group__4__Impl9169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__5__Impl_in_rule__Student__Group__59200 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Student__Group__6_in_rule__Student__Group__59203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Student__Group__5__Impl9231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__6__Impl_in_rule__Student__Group__69262 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Student__Group__7_in_rule__Student__Group__69265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__CourseofstudyAssignment_6_in_rule__Student__Group__6__Impl9292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group__7__Impl_in_rule__Student__Group__79322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Student__Group__7__Impl9350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_3__0__Impl_in_rule__Student__Group_3__09397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Student__Group_3__1_in_rule__Student__Group_3__09400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Student__Group_3__0__Impl9428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_3__1__Impl_in_rule__Student__Group_3__19459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__StudentNumberAssignment_3_1_in_rule__Student__Group_3__1__Impl9486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4__0__Impl_in_rule__Student__Group_4__09520 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Student__Group_4__1_in_rule__Student__Group_4__09523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Student__Group_4__0__Impl9551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4__1__Impl_in_rule__Student__Group_4__19582 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Student__Group_4__2_in_rule__Student__Group_4__19585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Student__Group_4__1__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4__2__Impl_in_rule__Student__Group_4__29644 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Student__Group_4__3_in_rule__Student__Group_4__29647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__EnrolledInAssignment_4_2_in_rule__Student__Group_4__2__Impl9674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4__3__Impl_in_rule__Student__Group_4__39704 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Student__Group_4__4_in_rule__Student__Group_4__39707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4_3__0_in_rule__Student__Group_4__3__Impl9734 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Student__Group_4__4__Impl_in_rule__Student__Group_4__49765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Student__Group_4__4__Impl9793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4_3__0__Impl_in_rule__Student__Group_4_3__09834 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Student__Group_4_3__1_in_rule__Student__Group_4_3__09837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Student__Group_4_3__0__Impl9865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__Group_4_3__1__Impl_in_rule__Student__Group_4_3__19896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Student__EnrolledInAssignment_4_3_1_in_rule__Student__Group_4_3__1__Impl9923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group__0__Impl_in_rule__Teacher__Group__09957 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Teacher__Group__1_in_rule__Teacher__Group__09960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group__1__Impl_in_rule__Teacher__Group__110018 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Teacher__Group__2_in_rule__Teacher__Group__110021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Teacher__Group__1__Impl10049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group__2__Impl_in_rule__Teacher__Group__210080 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Teacher__Group__3_in_rule__Teacher__Group__210083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__NameAssignment_2_in_rule__Teacher__Group__2__Impl10110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group__3__Impl_in_rule__Teacher__Group__310140 = new BitSet(new long[]{0x0000010000100000L});
        public static final BitSet FOLLOW_rule__Teacher__Group__4_in_rule__Teacher__Group__310143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Teacher__Group__3__Impl10171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group__4__Impl_in_rule__Teacher__Group__410202 = new BitSet(new long[]{0x0000010000100000L});
        public static final BitSet FOLLOW_rule__Teacher__Group__5_in_rule__Teacher__Group__410205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__0_in_rule__Teacher__Group__4__Impl10232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group__5__Impl_in_rule__Teacher__Group__510263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Teacher__Group__5__Impl10291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__0__Impl_in_rule__Teacher__Group_4__010334 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__1_in_rule__Teacher__Group_4__010337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Teacher__Group_4__0__Impl10365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__1__Impl_in_rule__Teacher__Group_4__110396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__2_in_rule__Teacher__Group_4__110399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Teacher__Group_4__1__Impl10427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__2__Impl_in_rule__Teacher__Group_4__210458 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__3_in_rule__Teacher__Group_4__210461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__TeachesAssignment_4_2_in_rule__Teacher__Group_4__2__Impl10488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__3__Impl_in_rule__Teacher__Group_4__310518 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__4_in_rule__Teacher__Group_4__310521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4_3__0_in_rule__Teacher__Group_4__3__Impl10548 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4__4__Impl_in_rule__Teacher__Group_4__410579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Teacher__Group_4__4__Impl10607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4_3__0__Impl_in_rule__Teacher__Group_4_3__010648 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4_3__1_in_rule__Teacher__Group_4_3__010651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Teacher__Group_4_3__0__Impl10679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__Group_4_3__1__Impl_in_rule__Teacher__Group_4_3__110710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Teacher__TeachesAssignment_4_3_1_in_rule__Teacher__Group_4_3__1__Impl10737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__0__Impl_in_rule__CourseResult__Group__010771 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__1_in_rule__CourseResult__Group__010774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__CourseResult__Group__0__Impl10802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__1__Impl_in_rule__CourseResult__Group__110833 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__2_in_rule__CourseResult__Group__110836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__CourseResult__Group__1__Impl10864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__2__Impl_in_rule__CourseResult__Group__210895 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__3_in_rule__CourseResult__Group__210898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group_2__0_in_rule__CourseResult__Group__2__Impl10925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__3__Impl_in_rule__CourseResult__Group__310956 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__4_in_rule__CourseResult__Group__310959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__CourseResult__Group__3__Impl10987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__4__Impl_in_rule__CourseResult__Group__411018 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__5_in_rule__CourseResult__Group__411021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__StudentAssignment_4_in_rule__CourseResult__Group__4__Impl11048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group__5__Impl_in_rule__CourseResult__Group__511078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CourseResult__Group__5__Impl11106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group_2__0__Impl_in_rule__CourseResult__Group_2__011149 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__CourseResult__Group_2__1_in_rule__CourseResult__Group_2__011152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__CourseResult__Group_2__0__Impl11180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__Group_2__1__Impl_in_rule__CourseResult__Group_2__111211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseResult__GradeAssignment_2_1_in_rule__CourseResult__Group_2__1__Impl11238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__0__Impl_in_rule__EBigInteger__Group__011272 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__1_in_rule__EBigInteger__Group__011275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__EBigInteger__Group__0__Impl11304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__1__Impl_in_rule__EBigInteger__Group__111337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigInteger__Group__1__Impl11364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Where__Group__0__Impl_in_rule__Where__Group__011397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Where__Group__1_in_rule__Where__Group__011400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Where__Group__0__Impl11428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Where__Group__1__Impl_in_rule__Where__Group__111459 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Where__Group__2_in_rule__Where__Group__111462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Where__BooleanexprAssignment_1_in_rule__Where__Group__1__Impl11489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Where__Group__2__Impl_in_rule__Where__Group__211519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Where__Group__2__Impl11547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__0__Impl_in_rule__BooleanExpr__Group__011584 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__1_in_rule__BooleanExpr__Group__011587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__1__Impl_in_rule__BooleanExpr__Group__111645 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__2_in_rule__BooleanExpr__Group__111648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__LhsAssignment_1_in_rule__BooleanExpr__Group__1__Impl11675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__2__Impl_in_rule__BooleanExpr__Group__211705 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__3_in_rule__BooleanExpr__Group__211708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__OperatorAssignment_2_in_rule__BooleanExpr__Group__2__Impl11735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__3__Impl_in_rule__BooleanExpr__Group__311765 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__4_in_rule__BooleanExpr__Group__311768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__RhsAssignment_3_in_rule__BooleanExpr__Group__3__Impl11795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__4__Impl_in_rule__BooleanExpr__Group__411825 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__5_in_rule__BooleanExpr__Group__411828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_4__0_in_rule__BooleanExpr__Group__4__Impl11855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group__5__Impl_in_rule__BooleanExpr__Group__511886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_5__0_in_rule__BooleanExpr__Group__5__Impl11913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_4__0__Impl_in_rule__BooleanExpr__Group_4__011956 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_4__1_in_rule__BooleanExpr__Group_4__011959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__BooleanExpr__Group_4__0__Impl11987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_4__1__Impl_in_rule__BooleanExpr__Group_4__112018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__AndAssignment_4_1_in_rule__BooleanExpr__Group_4__1__Impl12045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_5__0__Impl_in_rule__BooleanExpr__Group_5__012079 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_5__1_in_rule__BooleanExpr__Group_5__012082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__BooleanExpr__Group_5__0__Impl12110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__Group_5__1__Impl_in_rule__BooleanExpr__Group_5__112141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanExpr__OrAssignment_5_1_in_rule__BooleanExpr__Group_5__1__Impl12168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSchool_in_rule__SchoolDatabase__SchoolAssignment_312207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuery_in_rule__SchoolDatabase__QueryAssignment_4_212238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuery_in_rule__SchoolDatabase__QueryAssignment_4_3_112269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__School__NameAssignment_112300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFaculty_in_rule__School__FacultyAssignment_3_212331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFaculty_in_rule__School__FacultyAssignment_3_3_112362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseOfStudy_in_rule__School__CourseofstudyAssignment_4_212393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseOfStudy_in_rule__School__CourseofstudyAssignment_4_3_112424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_rule__School__CourseAssignment_5_212455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_rule__School__CourseAssignment_5_3_112486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStudent_in_rule__School__StudentAssignment_6_212517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStudent_in_rule__School__StudentAssignment_6_3_112548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTeacher_in_rule__School__TeacherAssignment_7_212579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTeacher_in_rule__School__TeacherAssignment_7_3_112610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSchoolElement_in_rule__Query__TypeAssignment_312641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhere_in_rule__Query__WhereAssignment_4_112672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Faculty__NameAssignment_212703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Faculty__CourseofstudyAssignment_4_212738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Faculty__CourseofstudyAssignment_4_3_112777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseOfStudy__NameAssignment_112812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseOfStudy__CourseAssignment_3_212847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseOfStudy__CourseAssignment_3_3_112886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseOfStudy__FacultyAssignment_512925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseOfStudy__StudentAssignment_6_212964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseOfStudy__StudentAssignment_6_3_113003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Course__NameAssignment_113038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Course__CourseNumberAssignment_3_113069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Course__EnrolledStudentAssignment_4_213104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Course__EnrolledStudentAssignment_4_3_113143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Course__TaughtByAssignment_613182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseResult_in_rule__Course__CourseresultAssignment_7_213217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseResult_in_rule__Course__CourseresultAssignment_7_3_113248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Student__NameAssignment_113279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Student__StudentNumberAssignment_3_113310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Student__EnrolledInAssignment_4_213345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Student__EnrolledInAssignment_4_3_113384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Student__CourseofstudyAssignment_613423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Teacher__NameAssignment_213458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Teacher__TeachesAssignment_4_213493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Teacher__TeachesAssignment_4_3_113532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_rule__CourseResult__GradeAssignment_2_113567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseResult__StudentAssignment_413602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_rule__Where__BooleanexprAssignment_113637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanExpr__LhsAssignment_113668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanExpr__OperatorAssignment_213699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanExpr__RhsAssignment_313730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_rule__BooleanExpr__AndAssignment_4_113761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpr_in_rule__BooleanExpr__OrAssignment_5_113792 = new BitSet(new long[]{0x0000000000000002L});
    }


}