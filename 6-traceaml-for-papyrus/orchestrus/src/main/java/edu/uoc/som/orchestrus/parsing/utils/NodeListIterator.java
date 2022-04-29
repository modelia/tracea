/*****************************************************************************
* Copyright (c) 2015, 2022 CEA-LIST & SOM-UOC, Edouard Batot
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
* UOC-SOM - Initial API and implementation
*  -> Edouard Batot (UOC SOM) ebatot@uoc.edu 
*****************************************************************************/


// Copyright 2008-2012 severally by the contributors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package edu.uoc.som.orchestrus.parsing.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 *  A wrapper for {@link org.w3c.dom.NodeList} that provides full iterator
 *  behavior. See {@link net.sf.practicalxml.util.NodeListIterable} if all
 *  you want to do is use the NodeList in a JDK 1.5 <code>for</code> loop.
 *  <p>
 *  Because a <code>NodeList</code> is a view on a DOM tree, this iterator has
 *  slightly different semantics than a typical <code>java.util</code> iterator.
 *  First, it is not "fail fast": the DOM consists of independent nodes, and we
 *  have no way to track when changes to the DOM may have made the nodelist
 *  invalid.
 *  <p>
 *  Second, and more important, removal via the iterator changes the DOM, not
 *  just the underlying list.
 */
public class NodeListIterator
implements Iterator<Node>
{
    // implementation note:
    //    if we can determine that the nodelist represents the return from
    //    Node.getChildNodes(), then we'll iterate using the nextSibling link
    //    rather than NodeList.item()

    private Class<?> _klass;            // filter - set to Node by default
    private boolean _isSiblingList;     // do we iterate by sibling or index?
    private Node _pointer;              // used for sibling iteration
    private NodeList _list;             // used for indexed iteration
    private int _pos;                   // ditto
    private Node _next;                 // filled by hasNext(), used by next()
    private Node _current;              // filled by next(), used by remove()


    /**
     *  Creates an iterator that returns all nodes from the passed list.
     */
    public NodeListIterator(NodeList nodelist)
    {
        this(nodelist, Node.class);
    }


    /**
     *  Creates an iterator that returns only the nodes of a specific class
     *  from the passed list.
     *
     *  @since 1.1.2
     */
    public NodeListIterator(NodeList nodelist, Class<?> klass)
    {
        _klass = klass;
        if (nodelist instanceof Node)
        {
            _isSiblingList = true;
            _pointer = ((Node)nodelist).getFirstChild();
        }
        else
        {
            _isSiblingList = false;
            _list = nodelist;
        }
    }


    public boolean hasNext()
    {
        while (_next == null)
        {
            if (_isSiblingList)
            {
                if (_pointer == null)
                    return false;
                _next = _pointer;
                _pointer = _pointer.getNextSibling();
            }
            else
            {
                if (_pos >= _list.getLength())
                    return false;
                _next = _list.item(_pos++);
            }

            if (!_klass.isInstance(_next))
                _next = null;
        }
        return true;
    }


    public Node next()
    {
        if (hasNext())
        {
            _current = _next;
            _next = null;
            return _current;
        }

        throw new NoSuchElementException("invalid index: " + _pos);
    }


    public void remove()
    {
        if (_current == null)
            throw new IllegalStateException("no current node");

        Node _parent = _current.getParentNode();
        _parent.removeChild(_current);
        _pos--;
        _current = null;
    }
}
