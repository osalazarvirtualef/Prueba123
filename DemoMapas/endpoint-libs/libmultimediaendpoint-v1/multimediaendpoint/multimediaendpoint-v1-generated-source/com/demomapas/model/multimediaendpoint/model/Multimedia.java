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
 * (build: 2015-01-14 17:53:03 UTC)
 * on 2015-02-16 at 20:22:58 UTC 
 * Modify at your own risk.
 */

package com.demomapas.model.multimediaendpoint.model;

/**
 * Model definition for Multimedia.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the multimediaendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Multimedia extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idTarea;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Multimedia setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdTarea() {
    return idTarea;
  }

  /**
   * @param idTarea idTarea or {@code null} for none
   */
  public Multimedia setIdTarea(java.lang.Long idTarea) {
    this.idTarea = idTarea;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * @param path path or {@code null} for none
   */
  public Multimedia setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public Multimedia set(String fieldName, Object value) {
    return (Multimedia) super.set(fieldName, value);
  }

  @Override
  public Multimedia clone() {
    return (Multimedia) super.clone();
  }

}
