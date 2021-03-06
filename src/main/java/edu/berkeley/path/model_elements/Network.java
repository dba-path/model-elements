/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements;

import java.util.*;

public class Network extends edu.berkeley.path.model_elements_base.Network {
  protected HashMap<Long, Link> linkById = null;
  protected HashMap<Long, Node> nodeById = null;
  
  public Network() {
    
  }
  
  public void resolveReferences() {
    linkById = new HashMap<Long, Link>();
    nodeById = new HashMap<Long, Node>();
    
    // pass 1: populate the HashMaps
    for (Node node : getNodeList()) {
      nodeById.put(node.getLongId(), node);
    }
    
    for (Link link : getLinkList()) {
      linkById.put(link.getLongId(), link);
    }
        
    // pass 2: set references
    for (Link link : getLinkList()) {
      link.resolveReferences(this);
      link.getBegin().resolveReferences(link);
      link.getEnd().resolveReferences(link);
    }
  }

  public Link getLinkById(Long id) {
    if (linkById == null) {
      resolveReferences();
    }
    
    return linkById.get(id);
  }

  public Node getNodeById(Long id) {
    if (nodeById == null) {
      resolveReferences();
    }
    
    return nodeById.get(id);
  }

  public Link getLinkById(String id) {
    return getLinkById(Long.parseLong(id));
  }

  public Node getNodeById(String id) {
    return getNodeById(Long.parseLong(id));
  }

  public Long getLongId() {
    return Long.parseLong(getId().toString());
  }
  
  public void setId(Long id) {
    setId(id.toString());
  }
  
  public Long getLongProjectId() {
    return Long.parseLong(getProjectId().toString());
  }

  // TODO methods to add, remove, set links call resolveReferences
  // TODO find a better way to expose List<Node> access.
  
  /**
   * Set the nodes. Same as setNodes(), but works with a list of Node.
   */
  @SuppressWarnings("unchecked")
public void setNodeList(List<Node> value) {
    setNodes((List<edu.berkeley.path.model_elements_base.Node>)(List<?>)value);
  }
  
  /**
   * Set the links. Same as setLinks(), but works with a list of Link.
   */
  @SuppressWarnings("unchecked")
public void setLinkList(List<Link> value) {
    setLinks((List<edu.berkeley.path.model_elements_base.Link>)(List<?>)value);
  }
  
  /**
   * Get the nodes. Same as getNodes(), but works with a list of Node.
   * Never returns null (creates the list if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
public List<Node> getNodeList() {
    if (null == getNodes()) {
      setNodes(new ArrayList<edu.berkeley.path.model_elements_base.Node>());
    }
    return (List<Node>)(List<?>)getNodes();
  }
  
  /**
   * Get the links. Same as getLinks(), but works with a list of Link.
   * Never returns null (creates the list if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
public List<Link> getLinkList() {
    if (null == getLinks()) {
      setLinks(new ArrayList<edu.berkeley.path.model_elements_base.Link>());
    }
    return (List<Link>)(List<?>)getLinks();
  }
  
	/**
	 * Get the list of links that are origin links. Creates and returns a sub-list of getLinkList.
	 * @return List of origin links
	 */
	public List<Link> createOriginLinkList() {
		List<Link> originLinks = new ArrayList<Link>();
		for (Link link : getLinkList()) {
			if (link.isOrigin())
				originLinks.add(link);
		}
		return originLinks;
	}
	
	/**
	 * Get the list of links that are sink links. Creates and returns a sub-list of getLinkList.
	 * @return List of sink links
	 */
	public List<Link> createSinkLinkList() {
		List<Link> sinkLinks = new ArrayList<Link>();
		for (Link link : getLinkList()) {
			if (link.isSinkLink())
				sinkLinks.add(link);
		}
		return sinkLinks;
	}
	
	/**
	 * Get the list of links that are normal links, i.e. neither origin links nor sink links.
	 * Creates and returns a sub-list of getLinkList.
	 * @return List of normal non-origin, non-sink links
	 */
	public List<Link> createNormalLinkList() {
		List<Link> normalLinks = new ArrayList<Link>();
		for (Link link : getLinkList()) {
			if (!link.isSinkLink() && !link.isOrigin())
				normalLinks.add(link);
		}
		return normalLinks;
	}
  
  public String getNameString() {
    return (getName() == null) ? null : getName().toString();
  }
}
