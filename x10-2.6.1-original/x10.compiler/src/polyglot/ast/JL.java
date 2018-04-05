/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * This file was originally derived from the Polyglot extensible compiler framework.
 *
 *  (C) Copyright 2000-2007 Polyglot project group, Cornell University
 *  (C) Copyright IBM Corporation 2007-2016.
 */

package polyglot.ast;

import polyglot.util.Copy;

/**
 * <code>JL</code> contains all methods implemented by an AST node.
 * AST nodes and delegates for AST nodes must implement this interface.
 */
public interface JL extends NodeOps, Copy
{
    /** Pointer back to the node we are delegating for, possibly this. */
    public Node node();

    /** Initialize the back pointer to the node. */
    public void init(Node node);
}
