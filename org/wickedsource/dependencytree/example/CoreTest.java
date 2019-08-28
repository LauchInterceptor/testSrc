package org.wickedsource.dependencytree.example;

//These imports shouldn't matter to the DependencyTree
import java.util.Objects;
import java.io.BufferedReader;
import org.wickedsource.dependencytree.example.somepackage.CoreDependencyTest;
//Wildcard imports should add all classes contained in the package as dependencies
import org.wickedsource.dependencytree.example.wildcardpackage.*;

import org.wickedsource.dependencytree.example.somepackage.NotADependencyTest;


//Test code for dependencyTree
public class CoreTest{

    org.wickedsource.dependencytree.example.somepackage.FullyClassifiedDependencyTest fullyClassifiedDependencyTest;

    private NotADependencyTest notADependencyTest;

    public CoreTest{

    }

}