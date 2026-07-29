// Bird.java
// 
// 
// Represents a bird base class

package edu.fscj.cop2800c.penguin;

// Bird class implements the Comparable<Bird> interface
public class Bird {
    // private fields


    // Constructor


    // Getter methods
    

    // base class toString (override)
    @Override
    public String toString() {
        String retStr = 
           "sampleNum=" + sampleNum +
           ", culmenLength=" + culmenLength +
           ", culmenDepth=" + culmenDepth +
           ", bodyMass=" + bodyMass +
           ", sex='" + sex;
        return retStr;
    }
    
    // base class compareTo (override)

}