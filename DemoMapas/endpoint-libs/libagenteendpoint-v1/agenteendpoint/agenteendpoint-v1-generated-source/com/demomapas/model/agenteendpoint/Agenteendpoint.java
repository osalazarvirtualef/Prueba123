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
 * on 2015-02-17 at 17:00:41 UTC 
 * Modify at your own risk.
 */

package com.demomapas.model.agenteendpoint;

/**
 * Service definition for Agenteendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AgenteendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Agenteendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the agenteendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://civic-athlete-851.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "agenteendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Agenteendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Agenteendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getAgente".
   *
   * This request holds the parameters needed by the agenteendpoint server.  After setting any
   * optional parameters, call the {@link GetAgente#execute()} method to invoke the remote operation.
   *
   * @param id
   * @param usuario
   * @param password
   * @return the request
   */
  public GetAgente getAgente(java.lang.Long id, java.lang.String usuario, java.lang.String password) throws java.io.IOException {
    GetAgente result = new GetAgente(id, usuario, password);
    initialize(result);
    return result;
  }

  public class GetAgente extends AgenteendpointRequest<com.demomapas.model.agenteendpoint.model.Agente> {

    private static final String REST_PATH = "agente/{id}/{usuario}/{password}";

    /**
     * Create a request for the method "getAgente".
     *
     * This request holds the parameters needed by the the agenteendpoint server.  After setting any
     * optional parameters, call the {@link GetAgente#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetAgente#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @param usuario
     * @param password
     * @since 1.13
     */
    protected GetAgente(java.lang.Long id, java.lang.String usuario, java.lang.String password) {
      super(Agenteendpoint.this, "GET", REST_PATH, null, com.demomapas.model.agenteendpoint.model.Agente.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      this.usuario = com.google.api.client.util.Preconditions.checkNotNull(usuario, "Required parameter usuario must be specified.");
      this.password = com.google.api.client.util.Preconditions.checkNotNull(password, "Required parameter password must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetAgente setAlt(java.lang.String alt) {
      return (GetAgente) super.setAlt(alt);
    }

    @Override
    public GetAgente setFields(java.lang.String fields) {
      return (GetAgente) super.setFields(fields);
    }

    @Override
    public GetAgente setKey(java.lang.String key) {
      return (GetAgente) super.setKey(key);
    }

    @Override
    public GetAgente setOauthToken(java.lang.String oauthToken) {
      return (GetAgente) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAgente setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAgente) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAgente setQuotaUser(java.lang.String quotaUser) {
      return (GetAgente) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAgente setUserIp(java.lang.String userIp) {
      return (GetAgente) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetAgente setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String usuario;

    /**

     */
    public java.lang.String getUsuario() {
      return usuario;
    }

    public GetAgente setUsuario(java.lang.String usuario) {
      this.usuario = usuario;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String password;

    /**

     */
    public java.lang.String getPassword() {
      return password;
    }

    public GetAgente setPassword(java.lang.String password) {
      this.password = password;
      return this;
    }

    @Override
    public GetAgente set(String parameterName, Object value) {
      return (GetAgente) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertAgente".
   *
   * This request holds the parameters needed by the agenteendpoint server.  After setting any
   * optional parameters, call the {@link InsertAgente#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.demomapas.model.agenteendpoint.model.Agente}
   * @return the request
   */
  public InsertAgente insertAgente(com.demomapas.model.agenteendpoint.model.Agente content) throws java.io.IOException {
    InsertAgente result = new InsertAgente(content);
    initialize(result);
    return result;
  }

  public class InsertAgente extends AgenteendpointRequest<com.demomapas.model.agenteendpoint.model.Agente> {

    private static final String REST_PATH = "agente";

    /**
     * Create a request for the method "insertAgente".
     *
     * This request holds the parameters needed by the the agenteendpoint server.  After setting any
     * optional parameters, call the {@link InsertAgente#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertAgente#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.agenteendpoint.model.Agente}
     * @since 1.13
     */
    protected InsertAgente(com.demomapas.model.agenteendpoint.model.Agente content) {
      super(Agenteendpoint.this, "POST", REST_PATH, content, com.demomapas.model.agenteendpoint.model.Agente.class);
    }

    @Override
    public InsertAgente setAlt(java.lang.String alt) {
      return (InsertAgente) super.setAlt(alt);
    }

    @Override
    public InsertAgente setFields(java.lang.String fields) {
      return (InsertAgente) super.setFields(fields);
    }

    @Override
    public InsertAgente setKey(java.lang.String key) {
      return (InsertAgente) super.setKey(key);
    }

    @Override
    public InsertAgente setOauthToken(java.lang.String oauthToken) {
      return (InsertAgente) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertAgente setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertAgente) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertAgente setQuotaUser(java.lang.String quotaUser) {
      return (InsertAgente) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertAgente setUserIp(java.lang.String userIp) {
      return (InsertAgente) super.setUserIp(userIp);
    }

    @Override
    public InsertAgente set(String parameterName, Object value) {
      return (InsertAgente) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listAgente".
   *
   * This request holds the parameters needed by the agenteendpoint server.  After setting any
   * optional parameters, call the {@link ListAgente#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListAgente listAgente() throws java.io.IOException {
    ListAgente result = new ListAgente();
    initialize(result);
    return result;
  }

  public class ListAgente extends AgenteendpointRequest<com.demomapas.model.agenteendpoint.model.CollectionResponseAgente> {

    private static final String REST_PATH = "agente";

    /**
     * Create a request for the method "listAgente".
     *
     * This request holds the parameters needed by the the agenteendpoint server.  After setting any
     * optional parameters, call the {@link ListAgente#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListAgente#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListAgente() {
      super(Agenteendpoint.this, "GET", REST_PATH, null, com.demomapas.model.agenteendpoint.model.CollectionResponseAgente.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListAgente setAlt(java.lang.String alt) {
      return (ListAgente) super.setAlt(alt);
    }

    @Override
    public ListAgente setFields(java.lang.String fields) {
      return (ListAgente) super.setFields(fields);
    }

    @Override
    public ListAgente setKey(java.lang.String key) {
      return (ListAgente) super.setKey(key);
    }

    @Override
    public ListAgente setOauthToken(java.lang.String oauthToken) {
      return (ListAgente) super.setOauthToken(oauthToken);
    }

    @Override
    public ListAgente setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListAgente) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListAgente setQuotaUser(java.lang.String quotaUser) {
      return (ListAgente) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListAgente setUserIp(java.lang.String userIp) {
      return (ListAgente) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListAgente setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListAgente setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListAgente set(String parameterName, Object value) {
      return (ListAgente) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeAgente".
   *
   * This request holds the parameters needed by the agenteendpoint server.  After setting any
   * optional parameters, call the {@link RemoveAgente#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveAgente removeAgente(java.lang.Long id) throws java.io.IOException {
    RemoveAgente result = new RemoveAgente(id);
    initialize(result);
    return result;
  }

  public class RemoveAgente extends AgenteendpointRequest<Void> {

    private static final String REST_PATH = "agente/{id}";

    /**
     * Create a request for the method "removeAgente".
     *
     * This request holds the parameters needed by the the agenteendpoint server.  After setting any
     * optional parameters, call the {@link RemoveAgente#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveAgente#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveAgente(java.lang.Long id) {
      super(Agenteendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveAgente setAlt(java.lang.String alt) {
      return (RemoveAgente) super.setAlt(alt);
    }

    @Override
    public RemoveAgente setFields(java.lang.String fields) {
      return (RemoveAgente) super.setFields(fields);
    }

    @Override
    public RemoveAgente setKey(java.lang.String key) {
      return (RemoveAgente) super.setKey(key);
    }

    @Override
    public RemoveAgente setOauthToken(java.lang.String oauthToken) {
      return (RemoveAgente) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveAgente setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveAgente) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveAgente setQuotaUser(java.lang.String quotaUser) {
      return (RemoveAgente) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveAgente setUserIp(java.lang.String userIp) {
      return (RemoveAgente) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveAgente setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveAgente set(String parameterName, Object value) {
      return (RemoveAgente) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateAgente".
   *
   * This request holds the parameters needed by the agenteendpoint server.  After setting any
   * optional parameters, call the {@link UpdateAgente#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.demomapas.model.agenteendpoint.model.Agente}
   * @return the request
   */
  public UpdateAgente updateAgente(com.demomapas.model.agenteendpoint.model.Agente content) throws java.io.IOException {
    UpdateAgente result = new UpdateAgente(content);
    initialize(result);
    return result;
  }

  public class UpdateAgente extends AgenteendpointRequest<com.demomapas.model.agenteendpoint.model.Agente> {

    private static final String REST_PATH = "agente";

    /**
     * Create a request for the method "updateAgente".
     *
     * This request holds the parameters needed by the the agenteendpoint server.  After setting any
     * optional parameters, call the {@link UpdateAgente#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateAgente#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.agenteendpoint.model.Agente}
     * @since 1.13
     */
    protected UpdateAgente(com.demomapas.model.agenteendpoint.model.Agente content) {
      super(Agenteendpoint.this, "PUT", REST_PATH, content, com.demomapas.model.agenteendpoint.model.Agente.class);
    }

    @Override
    public UpdateAgente setAlt(java.lang.String alt) {
      return (UpdateAgente) super.setAlt(alt);
    }

    @Override
    public UpdateAgente setFields(java.lang.String fields) {
      return (UpdateAgente) super.setFields(fields);
    }

    @Override
    public UpdateAgente setKey(java.lang.String key) {
      return (UpdateAgente) super.setKey(key);
    }

    @Override
    public UpdateAgente setOauthToken(java.lang.String oauthToken) {
      return (UpdateAgente) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateAgente setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateAgente) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateAgente setQuotaUser(java.lang.String quotaUser) {
      return (UpdateAgente) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateAgente setUserIp(java.lang.String userIp) {
      return (UpdateAgente) super.setUserIp(userIp);
    }

    @Override
    public UpdateAgente set(String parameterName, Object value) {
      return (UpdateAgente) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Agenteendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Agenteendpoint}. */
    @Override
    public Agenteendpoint build() {
      return new Agenteendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AgenteendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAgenteendpointRequestInitializer(
        AgenteendpointRequestInitializer agenteendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(agenteendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
