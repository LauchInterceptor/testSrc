package org.wickedsource.dependencytree.somepackage;
//should not add the same dependency twice
//same for wildcard imports in order (explicit -> wildcard)
import org.wickedsource.dependencytree.CoreTest;
import org.wickedsource.dependencytree.wildcardpackage.WildcardImport1Test;
import org.wickedsource.dependencytree.wildcardpackage.*;

public class DuplicateDependenciesTest {

    private CoreTest coreTest;

    public DuplicateDependenciesTest() {

    }
}

