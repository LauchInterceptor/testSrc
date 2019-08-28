package org.wickedsource.dependencytree.example.somepackage;
//Don't import this
//import org.wickedsource.dependencytree.example.somepackage.NotADependencyTest;







public class InvalidDependencyTest{

    //Don't detect imports in strings
    String importBamboozleString = "import org.wickedsource.dependencytree.example.somepackage.NotADependencyTest;";

    public InvalidDependencyTest(){
        //Don't import this
        import org.wickedsource.dependencytree.example.somepackage.NotADependencyTest;
    }

}