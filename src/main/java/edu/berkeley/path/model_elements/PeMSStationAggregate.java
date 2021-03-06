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

public class PeMSStationAggregate extends edu.berkeley.path.model_elements_base.PeMSStationAggregate {
  /**
   * Gets the value of the 'timeMeasured' field.
   */
  public org.joda.time.DateTime getJodaTimeMeasured() {
    return ((DateTime)getTimeMeasured()).toJoda();
  }

  /**
   * Sets the value of the 'timeMeasured' field.
   * @param value the value to set.
   */
  public void setJodaTimeMeasured(org.joda.time.DateTime value) {
    setTimeMeasured(DateTime.fromJoda(value));
  }
  
  /**
   * Set the list of aggregates by lane. Same as setByLane(), but works
   * with a list of PeMSAggregate.
   */
  @SuppressWarnings("unchecked")
public void setByLaneList(List<PeMSAggregate> value) {
    setByLane((List<edu.berkeley.path.model_elements_base.PeMSAggregate>)(List<?>)value);
  }

  /**
   * Get the list of aggregates by lane. Same as getByLane(), but works
   * with a list of PeMSAggregate.
   * 
   * Never returns null (creates the list if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
public List<PeMSAggregate> getByLaneList() {
    if (null == getByLane()) {
      setByLane(new ArrayList<edu.berkeley.path.model_elements_base.PeMSAggregate>());
    }
    return (List<PeMSAggregate>)(List<?>)getByLane();
  }
}
