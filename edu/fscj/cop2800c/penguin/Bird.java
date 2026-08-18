// Bird.java
// Kashari Denson
// 07/28/2026
// Represents a bird base class

package edu.fscj.cop2800c.penguin;

// Bird class implements the Comparable<Bird> interface
public class Bird implements Comparable<Bird> {
    // private fields
    private int sampleNumber;
    private double culmenLength;
    private double culmenDepth;
    private double bodyMass;
    private String sex;
    

    // Constructor
public Bird(int sampleNumber, double culmenLength,
      double culmenDepth, double bodyMass, String sex){
    this.sampleNumber = sampleNumber;
    this.bodyMass = bodyMass;
    this.culmenDepth = culmenDepth;
    this.culmenLength = culmenLength;
    this.sex = sex;
    
    
}

// Getter methods
public int getSampleNumber(){
    return sampleNumber;
}

public double getBodyMass(){
    return bodyMass;
}

public double getCulmenDepth(){
    return culmenDepth;
}

public double getCulmenLength(){
    return culmenLength;
}

public String getSex(){
    return sex;
}

   // base class toString (override)
    @Override
    public String toString() {
        String retStr = 
           "sampleNum=" + sampleNumber +
           ", culmenLength=" + culmenLength +
           ", culmenDepth=" + culmenDepth +
           ", bodyMass=" + bodyMass +
           ", sex='" + sex;
        return retStr;
    }

// base class compareTo (override)
 @Override   
  public int compareTo(Bird other){
      int result = Integer.compare(this.sampleNumber, other.sampleNumber);
      if (result != 0) return result;
      
      result = Double.compare(this.culmenLength, other.culmenLength);
      if (result != 0) return result;
      
      result = Double.compare(this.culmenDepth, other.culmenDepth);
      if (result != 0) return result;
      
      result = Double.compare(this.bodyMass, other.bodyMass);
      if (result != 0) return result;
      return this.sex.compareTo(other.sex);
  
  } 
    
    
}
   
