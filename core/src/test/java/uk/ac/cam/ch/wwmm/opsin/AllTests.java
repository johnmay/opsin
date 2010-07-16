package uk.ac.cam.ch.wwmm.opsin;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AtomTest.class,
	BondTest.class,
	CMLFragmentBuilderTest.class,
	DtdTest.class,
	FragmentManagerTest.class,
	FragmentTest.class,
	FusedRingNumbererTest.class,
	HeteroAtomReplacementTest.class,
	NameToStructureConfigurationsTest.class,
	NameToStructureTest.class,
	SMILESFragmentBuilderTest.class,
	SSSRTest.class,
	StereochemistryTest.class,
	StructureBuilderTest.class,
	TokenizerTest.class,
	VerifyFragmentsTest.class
})
public class AllTests {

}
