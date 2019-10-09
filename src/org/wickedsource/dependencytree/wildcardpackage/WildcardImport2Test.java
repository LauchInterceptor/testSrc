package org.wickedsource.dependencytree.wildcardpackage;

import org.wickedsource.dependencytree.somepackage.NotADependencyTest;
import org.wickedsource.dependencytree.somepackage.RandomClass2;
import org.wickedsource.dependencytree.somepackage.extras.FullyClassifiedDependencyTest;


public class WildcardImport2Test{

    private NotADependencyTest notADependencyTest;
    private RandomClass2 randomClass2;
    private FullyClassifiedDependencyTest fullyClassifiedDependencyTest;

    public WildcardImport2Test(){
        this.notADependencyTest = new NotADependencyTest();
        this.randomClass2 = new RandomClass2();
        this.fullyClassifiedDependencyTest = new FullyClassifiedDependencyTest();
    }

}