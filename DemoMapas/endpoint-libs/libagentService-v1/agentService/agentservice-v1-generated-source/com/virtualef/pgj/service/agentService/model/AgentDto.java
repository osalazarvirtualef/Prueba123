/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-03-31 at 04:56:06 UTC 
 * Modify at your own risk.
 */

package com.virtualef.pgj.service.agentService.model;

/**
 * Model definition for AgentDto.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the agentService. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AgentDto extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alias;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aliasP;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key key;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float latitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float longitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PersonDto person;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tuition;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAlias() {
    return alias;
  }

  /**
   * @param alias alias or {@code null} for none
   */
  public AgentDto setAlias(java.lang.String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAliasP() {
    return aliasP;
  }

  /**
   * @param aliasP aliasP or {@code null} for none
   */
  public AgentDto setAliasP(java.lang.String aliasP) {
    this.aliasP = aliasP;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getKey() {
    return key;
  }

  /**
   * @param key key or {@code null} for none
   */
  public AgentDto setKey(Key key) {
    this.key = key;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getLatitude() {
    return latitude;
  }

  /**
   * @param latitude latitude or {@code null} for none
   */
  public AgentDto setLatitude(java.lang.Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getLongitude() {
    return longitude;
  }

  /**
   * @param longitude longitude or {@code null} for none
   */
  public AgentDto setLongitude(java.lang.Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public PersonDto getPerson() {
    return person;
  }

  /**
   * @param person person or {@code null} for none
   */
  public AgentDto setPerson(PersonDto person) {
    this.person = person;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTuition() {
    return tuition;
  }

  /**
   * @param tuition tuition or {@code null} for none
   */
  public AgentDto setTuition(java.lang.String tuition) {
    this.tuition = tuition;
    return this;
  }

  @Override
  public AgentDto set(String fieldName, Object value) {
    return (AgentDto) super.set(fieldName, value);
  }

  @Override
  public AgentDto clone() {
    return (AgentDto) super.clone();
  }

}
