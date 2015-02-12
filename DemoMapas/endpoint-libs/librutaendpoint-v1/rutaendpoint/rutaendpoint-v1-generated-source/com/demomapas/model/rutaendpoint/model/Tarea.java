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
 * on 2015-02-12 at 02:33:31 UTC 
 * Modify at your own risk.
 */

package com.demomapas.model.rutaendpoint.model;

/**
 * Model definition for Tarea.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the rutaendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Tarea extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String calle;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String colonia;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String estado;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String longitud;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String municipio;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCalle() {
    return calle;
  }

  /**
   * @param calle calle or {@code null} for none
   */
  public Tarea setCalle(java.lang.String calle) {
    this.calle = calle;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getColonia() {
    return colonia;
  }

  /**
   * @param colonia colonia or {@code null} for none
   */
  public Tarea setColonia(java.lang.String colonia) {
    this.colonia = colonia;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCp() {
    return cp;
  }

  /**
   * @param cp cp or {@code null} for none
   */
  public Tarea setCp(java.lang.String cp) {
    this.cp = cp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEstado() {
    return estado;
  }

  /**
   * @param estado estado or {@code null} for none
   */
  public Tarea setEstado(java.lang.String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Tarea setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLat() {
    return lat;
  }

  /**
   * @param lat lat or {@code null} for none
   */
  public Tarea setLat(java.lang.String lat) {
    this.lat = lat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLongitud() {
    return longitud;
  }

  /**
   * @param longitud longitud or {@code null} for none
   */
  public Tarea setLongitud(java.lang.String longitud) {
    this.longitud = longitud;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMunicipio() {
    return municipio;
  }

  /**
   * @param municipio municipio or {@code null} for none
   */
  public Tarea setMunicipio(java.lang.String municipio) {
    this.municipio = municipio;
    return this;
  }

  @Override
  public Tarea set(String fieldName, Object value) {
    return (Tarea) super.set(fieldName, value);
  }

  @Override
  public Tarea clone() {
    return (Tarea) super.clone();
  }

}
