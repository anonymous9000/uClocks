/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2016.
 */

import harness.x10Test;
import x10.regionarray.*;

/**
 * Testing exploding syntax for local variables.
 *
 * @author vj 09/02/08
 */
public class ExplodingLocalVarTest extends x10Test {

	public def run(): boolean {
		val p[x,y] :Point  = [2 as long, 2];
		return x+y==4;
		}

	public static def main(Rail[String]){
		new ExplodingLocalVarTest().execute();
	}
}
