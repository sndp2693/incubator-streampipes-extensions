/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.apache.streampipes.processors.geo.jvm.processor.staticdistancecalculator;

import org.apache.streampipes.model.graph.DataProcessorInvocation;
import org.apache.streampipes.wrapper.params.binding.EventProcessorBindingParams;

public class StaticDistanceCalculatorParameters extends EventProcessorBindingParams {

  private String latitudeFieldName;
  private String longitudeFieldName;

  private Double selectedLatitude;
  private Double selectedLongitude;

  private Integer decimalPosition;
  private Integer unit;

  public StaticDistanceCalculatorParameters(DataProcessorInvocation graph,
                                            String latitudeFieldName,
                                            String longitudeFieldName,
                                            Double selectedLatitude,
                                            Double selectedLongitude,
                                            Integer decimalPosition,
                                            Integer unit) {
    super(graph);
    this.latitudeFieldName = latitudeFieldName;
    this.longitudeFieldName = longitudeFieldName;
    this.selectedLatitude = selectedLatitude;
    this.selectedLongitude = selectedLongitude;
    this.decimalPosition = decimalPosition;
    this.unit = unit;
  }

  public String getLatitudeFieldName() {
    return latitudeFieldName;
  }

  public String getLongitudeFieldName() {
    return longitudeFieldName;
  }

  public Double getSelectedLatitude() {
    return selectedLatitude;
  }

  public void setSelectedLatitude(Double selectedLatitude) {
    this.selectedLatitude = selectedLatitude;
  }

  public Double getSelectedLongitude() {
    return selectedLongitude;
  }

  public void setSelectedLongitude(Double selectedLongitude) {
    this.selectedLongitude = selectedLongitude;
  }

  public Integer getDecimalPosition() { return decimalPosition; }

  public Integer getUnit() { return unit; }
}
