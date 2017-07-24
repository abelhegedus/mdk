/**
 * Generated from platform:/resource/mdk.querygenerator/src/gov/nasa/jpl/mbee/mdk/queries/TestQueries.vql
 */
package gov.nasa.jpl.mbee.mdk.queries.util;

import com.google.common.collect.Sets;
import gov.nasa.jpl.mbee.mdk.queries.ClassOperationsMatch;
import gov.nasa.jpl.mbee.mdk.queries.ClassOperationsMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ClassOperationsMatcher in a type-safe way.
 * 
 * @see ClassOperationsMatcher
 * @see ClassOperationsMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassOperationsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ClassOperationsMatcher> {
  private ClassOperationsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassOperationsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ClassOperationsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ClassOperationsMatcher.on(engine);
  }
  
  @Override
  public ClassOperationsMatcher instantiate() throws ViatraQueryException {
    return ClassOperationsMatcher.create();
  }
  
  @Override
  public ClassOperationsMatch newEmptyMatch() {
    return ClassOperationsMatch.newEmptyMatch();
  }
  
  @Override
  public ClassOperationsMatch newMatch(final Object... parameters) {
    return ClassOperationsMatch.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ClassOperationsQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ClassOperationsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ClassOperationsQuerySpecification INSTANCE = new ClassOperationsQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ClassOperationsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5", "Operation")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pOperation);
    
    @Override
    public String getFullyQualifiedName() {
      return "gov.nasa.jpl.mbee.mdk.queries.classOperations";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","operation");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_class = body.getOrCreateVariableByName("class");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_block = body.getOrCreateVariableByName("block");
              PVariable var_instance = body.getOrCreateVariableByName("instance");
              new TypeConstraint(body, new FlatTuple(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Class")));
              new TypeConstraint(body, new FlatTuple(var_operation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Operation")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_class, parameter_pClass),
                 new ExportedParameter(body, var_operation, parameter_pOperation)
              ));
              // 	Classifier.name(block, "Block")
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, "Block");
              new TypeConstraint(body, new FlatTuple(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Classifier")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, new FlatTuple(var_block, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "NamedElement", "name")));
              new TypeConstraint(body, new FlatTuple(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "String")));
              new Equality(body, var__virtual_1_, var__virtual_0_);
              // 	InstanceSpecification.classifier(instance, block)
              new TypeConstraint(body, new FlatTuple(var_instance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "InstanceSpecification")));
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new TypeConstraint(body, new FlatTuple(var_instance, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "InstanceSpecification", "classifier")));
              new TypeConstraint(body, new FlatTuple(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Classifier")));
              new Equality(body, var__virtual_2_, var_block);
              // 	Class.appliedStereotypeInstance(class, instance)
              new TypeConstraint(body, new FlatTuple(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Class")));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new TypeConstraint(body, new FlatTuple(var_class, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Element", "appliedStereotypeInstance")));
              new TypeConstraint(body, new FlatTuple(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "InstanceSpecification")));
              new Equality(body, var__virtual_3_, var_instance);
              //     Class.ownedOperation(class, operation)
              new TypeConstraint(body, new FlatTuple(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Class")));
              PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
              new TypeConstraint(body, new FlatTuple(var_class, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Class", "ownedOperation")));
              new TypeConstraint(body, new FlatTuple(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Operation")));
              new Equality(body, var__virtual_4_, var_operation);
              bodies.add(body);
          }
          // to silence compiler error
          if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
