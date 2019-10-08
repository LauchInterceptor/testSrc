package org.wickedsource.dependencytree;

//These imports shouldn't matter to the DependencyTree
//Wildcard imports should add all classes contained in the package as dependencies
import org.wickedsource.dependencytree.wildcardpackage.*;

import org.wickedsource.dependencytree.somepackage.FullyClassifiedDependencyTest;
import org.wickedsource.dependencytree.somepackage.NotADependencyTest;


//Test code for dependencyTree
public class CoreTest{

    FullyClassifiedDependencyTest fullyClassifiedDependencyTest;

    private NotADependencyTest notADependencyTest;

    public CoreTest() {

    }

}