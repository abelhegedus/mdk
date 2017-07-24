/**
 * Generated from platform:/resource/mdk.querygenerator/src/gov/nasa/jpl/mbee/mdk/queries/TestQueries.vql
 */
package gov.nasa.jpl.mbee.mdk.queries.util;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import gov.nasa.jpl.mbee.mdk.queries.ClassOperationsMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the gov.nasa.jpl.mbee.mdk.queries.classOperations pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ClassOperationsProcessor implements IMatchProcessor<ClassOperationsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pClass the value of pattern parameter class in the currently processed match
   * @param pOperation the value of pattern parameter operation in the currently processed match
   * 
   */
  public abstract void process(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass, final Operation pOperation);
  
  @Override
  public void process(final ClassOperationsMatch match) {
    process(match.getValueOfClass(), match.getOperation());
  }
}
