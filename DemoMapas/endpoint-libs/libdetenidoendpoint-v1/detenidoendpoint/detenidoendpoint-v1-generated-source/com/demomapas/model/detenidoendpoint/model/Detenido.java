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
 * on 2015-02-11 at 22:49:50 UTC 
 * Modify at your own risk.
 */

package com.demomapas.model.detenidoendpoint.model;

/**
 * Model definition for Detenido.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the detenidoendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Detenido extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apm;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String app;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cargo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String delito;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long edad;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sexo;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getApm() {
    return apm;
  }

  /**
   * @param apm apm or {@code null} for none
   */
  public Detenido setApm(java.lang.String apm) {
    this.apm = apm;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getApp() {
    return app;
  }

  /**
   * @param app app or {@code null} for none
   */
  public Detenido setApp(java.lang.String app) {
    this.app = app;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCargo() {
    return cargo;
  }

  /**
   * @param cargo cargo or {@code null} for none
   */
  public Detenido setCargo(java.lang.String cargo) {
    this.cargo = cargo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDelito() {
    return delito;
  }

  /**
   * @param delito delito or {@code null} for none
   */
  public Detenido setDelito(java.lang.String delito) {
    this.delito = delito;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getEdad() {
    return edad;
  }

  /**
   * @param edad edad or {@code null} for none
   */
  public Detenido setEdad(java.lang.Long edad) {
    this.edad = edad;
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
  public Detenido setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Detenido setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSexo() {
    return sexo;
  }

  /**
   * @param sexo sexo or {@code null} for none
   */
  public Detenido setSexo(java.lang.String sexo) {
    this.sexo = sexo;
    return this;
  }

  @Override
  public Detenido set(String fieldName, Object value) {
    return (Detenido) super.set(fieldName, value);
  }

  @Override
  public Detenido clone() {
    return (Detenido) super.clone();
  }

}
