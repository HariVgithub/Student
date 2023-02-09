package org.std;

public class Student {
  String name;
  int sub;
  double[] marks;
  public Student(String name, int sub, double[] mark) {
	super();
	this.name = name;
	this.sub = sub;
	this.marks = mark;
     }
  public double getAvgMarks() {
	  double totalmarks=0;
	  for(double m:marks) {
		  totalmarks=totalmarks+m;
	  }
	  double avgmarks=totalmarks/marks.length;
	return avgmarks;
  }
 
}
