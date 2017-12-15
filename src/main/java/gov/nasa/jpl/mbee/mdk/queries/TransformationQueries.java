/**
 * Generated from platform:/resource/mdk.querygenerator/src/gov/nasa/jpl/mbee/mdk/queries/TransformationQueries.vql
 */
package gov.nasa.jpl.mbee.mdk.queries;

import gov.nasa.jpl.mbee.mdk.queries.GeneralizedTaggedBlockPairsMatcher;
import gov.nasa.jpl.mbee.mdk.queries.TaggedBlocksMatcher;
import gov.nasa.jpl.mbee.mdk.queries.UnreferredStereotypesMatcher;
import gov.nasa.jpl.mbee.mdk.queries.util.GeneralizedTaggedBlockPairsQuerySpecification;
import gov.nasa.jpl.mbee.mdk.queries.util.TaggedBlocksQuerySpecification;
import gov.nasa.jpl.mbee.mdk.queries.util.UnreferredStereotypesQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in TransformationQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TransformationQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package gov.nasa.jpl.mbee.mdk.queries, the group contains the definition of the following patterns: <ul>
 * <li>taggedBlocks</li>
 * <li>generalizedTaggedBlockPairs</li>
 * <li>unreferredStereotypes</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueries();
    }
    return INSTANCE;
  }
  
  private static TransformationQueries INSTANCE;
  
  private TransformationQueries() {
    querySpecifications.add(TaggedBlocksQuerySpecification.instance());
    querySpecifications.add(GeneralizedTaggedBlockPairsQuerySpecification.instance());
    querySpecifications.add(UnreferredStereotypesQuerySpecification.instance());
  }
  
  public TaggedBlocksQuerySpecification getTaggedBlocks() {
    return TaggedBlocksQuerySpecification.instance();
  }
  
  public TaggedBlocksMatcher getTaggedBlocks(final ViatraQueryEngine engine) {
    return TaggedBlocksMatcher.on(engine);
  }
  
  public GeneralizedTaggedBlockPairsQuerySpecification getGeneralizedTaggedBlockPairs() {
    return GeneralizedTaggedBlockPairsQuerySpecification.instance();
  }
  
  public GeneralizedTaggedBlockPairsMatcher getGeneralizedTaggedBlockPairs(final ViatraQueryEngine engine) {
    return GeneralizedTaggedBlockPairsMatcher.on(engine);
  }
  
  public UnreferredStereotypesQuerySpecification getUnreferredStereotypes() {
    return UnreferredStereotypesQuerySpecification.instance();
  }
  
  public UnreferredStereotypesMatcher getUnreferredStereotypes(final ViatraQueryEngine engine) {
    return UnreferredStereotypesMatcher.on(engine);
  }
}
