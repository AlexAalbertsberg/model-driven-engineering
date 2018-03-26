/*
 * generated by Xtext
 */
package org.xtext.ps3.school.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.ps3.school.services.SchooldslGrammarAccess;
import school.BooleanExpr;
import school.Course;
import school.CourseOfStudy;
import school.CourseResult;
import school.Faculty;
import school.Query;
import school.School;
import school.SchoolDatabase;
import school.SchoolPackage;
import school.Student;
import school.Teacher;
import school.Where;

@SuppressWarnings("all")
public abstract class AbstractSchooldslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SchooldslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SchoolPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SchoolPackage.BOOLEAN_EXPR:
				sequence_BooleanExpr(context, (BooleanExpr) semanticObject); 
				return; 
			case SchoolPackage.COURSE:
				sequence_Course(context, (Course) semanticObject); 
				return; 
			case SchoolPackage.COURSE_OF_STUDY:
				sequence_CourseOfStudy(context, (CourseOfStudy) semanticObject); 
				return; 
			case SchoolPackage.COURSE_RESULT:
				sequence_CourseResult(context, (CourseResult) semanticObject); 
				return; 
			case SchoolPackage.FACULTY:
				sequence_Faculty(context, (Faculty) semanticObject); 
				return; 
			case SchoolPackage.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case SchoolPackage.SCHOOL:
				sequence_School(context, (School) semanticObject); 
				return; 
			case SchoolPackage.SCHOOL_DATABASE:
				sequence_SchoolDatabase(context, (SchoolDatabase) semanticObject); 
				return; 
			case SchoolPackage.STUDENT:
				sequence_Student(context, (Student) semanticObject); 
				return; 
			case SchoolPackage.TEACHER:
				sequence_Teacher(context, (Teacher) semanticObject); 
				return; 
			case SchoolPackage.WHERE:
				sequence_Where(context, (Where) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (lhs=EString operator=EString rhs=EString and=BooleanExpr? or=BooleanExpr?)
	 */
	protected void sequence_BooleanExpr(EObject context, BooleanExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (course+=[Course|EString] course+=[Course|EString]*)? 
	 *         faculty=[Faculty|EString] 
	 *         (student+=[Student|EString] student+=[Student|EString]*)?
	 *     )
	 */
	protected void sequence_CourseOfStudy(EObject context, CourseOfStudy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (grade=EBigInteger? student=[Student|EString])
	 */
	protected void sequence_CourseResult(EObject context, CourseResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         courseNumber=EString? 
	 *         (enrolledStudent+=[Student|EString] enrolledStudent+=[Student|EString]*)? 
	 *         taughtBy=[Teacher|EString] 
	 *         (courseresult+=CourseResult courseresult+=CourseResult*)?
	 *     )
	 */
	protected void sequence_Course(EObject context, Course semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (courseofstudy+=[CourseOfStudy|EString] courseofstudy+=[CourseOfStudy|EString]*)?)
	 */
	protected void sequence_Faculty(EObject context, Faculty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=SchoolElement? where=Where?)
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (school=School (query+=Query query+=Query*)?)
	 */
	protected void sequence_SchoolDatabase(EObject context, SchoolDatabase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (faculty+=Faculty faculty+=Faculty*)? 
	 *         (courseofstudy+=CourseOfStudy courseofstudy+=CourseOfStudy*)? 
	 *         (course+=Course course+=Course*)? 
	 *         (student+=Student student+=Student*)? 
	 *         (teacher+=Teacher teacher+=Teacher*)?
	 *     )
	 */
	protected void sequence_School(EObject context, School semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString studentNumber=EString? (enrolledIn+=[Course|EString] enrolledIn+=[Course|EString]*)? courseofstudy=[CourseOfStudy|EString])
	 */
	protected void sequence_Student(EObject context, Student semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (teaches+=[Course|EString] teaches+=[Course|EString]*)?)
	 */
	protected void sequence_Teacher(EObject context, Teacher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     booleanexpr=BooleanExpr
	 */
	protected void sequence_Where(EObject context, Where semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SchoolPackage.Literals.WHERE__BOOLEANEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchoolPackage.Literals.WHERE__BOOLEANEXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhereAccess().getBooleanexprBooleanExprParserRuleCall_1_0(), semanticObject.getBooleanexpr());
		feeder.finish();
	}
}
