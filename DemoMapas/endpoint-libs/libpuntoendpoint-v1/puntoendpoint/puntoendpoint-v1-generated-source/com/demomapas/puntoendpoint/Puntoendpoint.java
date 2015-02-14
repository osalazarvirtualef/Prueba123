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
 * on 2015-02-14 at 20:45:52 UTC 
 * Modify at your own risk.
 */

package com.demomapas.puntoendpoint;

/**
 * Service definition for Puntoendpoint (v1).
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
 * This service uses {@link PuntoendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Puntoendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the puntoendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "puntoendpoint/v1/";

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
  public Puntoendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Puntoendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getPunto".
   *
   * This request holds the parameters needed by the puntoendpoint server.  After setting any optional
   * parameters, call the {@link GetPunto#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetPunto getPunto(java.lang.Long id) throws java.io.IOException {
    GetPunto result = new GetPunto(id);
    initialize(result);
    return result;
  }

  public class GetPunto extends PuntoendpointRequest<com.demomapas.puntoendpoint.model.Punto> {

    private static final String REST_PATH = "punto/{id}";

    /**
     * Create a request for the method "getPunto".
     *
     * This request holds the parameters needed by the the puntoendpoint server.  After setting any
     * optional parameters, call the {@link GetPunto#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetPunto#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetPunto(java.lang.Long id) {
      super(Puntoendpoint.this, "GET", REST_PATH, null, com.demomapas.puntoendpoint.model.Punto.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
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
    public GetPunto setAlt(java.lang.String alt) {
      return (GetPunto) super.setAlt(alt);
    }

    @Override
    public GetPunto setFields(java.lang.String fields) {
      return (GetPunto) super.setFields(fields);
    }

    @Override
    public GetPunto setKey(java.lang.String key) {
      return (GetPunto) super.setKey(key);
    }

    @Override
    public GetPunto setOauthToken(java.lang.String oauthToken) {
      return (GetPunto) super.setOauthToken(oauthToken);
    }

    @Override
    public GetPunto setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetPunto) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetPunto setQuotaUser(java.lang.String quotaUser) {
      return (GetPunto) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetPunto setUserIp(java.lang.String userIp) {
      return (GetPunto) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetPunto setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetPunto set(String parameterName, Object value) {
      return (GetPunto) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertPunto".
   *
   * This request holds the parameters needed by the puntoendpoint server.  After setting any optional
   * parameters, call the {@link InsertPunto#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.demomapas.puntoendpoint.model.Punto}
   * @return the request
   */
  public InsertPunto insertPunto(com.demomapas.puntoendpoint.model.Punto content) throws java.io.IOException {
    InsertPunto result = new InsertPunto(content);
    initialize(result);
    return result;
  }

  public class InsertPunto extends PuntoendpointRequest<com.demomapas.puntoendpoint.model.Punto> {

    private static final String REST_PATH = "punto";

    /**
     * Create a request for the method "insertPunto".
     *
     * This request holds the parameters needed by the the puntoendpoint server.  After setting any
     * optional parameters, call the {@link InsertPunto#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertPunto#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.puntoendpoint.model.Punto}
     * @since 1.13
     */
    protected InsertPunto(com.demomapas.puntoendpoint.model.Punto content) {
      super(Puntoendpoint.this, "POST", REST_PATH, content, com.demomapas.puntoendpoint.model.Punto.class);
    }

    @Override
    public InsertPunto setAlt(java.lang.String alt) {
      return (InsertPunto) super.setAlt(alt);
    }

    @Override
    public InsertPunto setFields(java.lang.String fields) {
      return (InsertPunto) super.setFields(fields);
    }

    @Override
    public InsertPunto setKey(java.lang.String key) {
      return (InsertPunto) super.setKey(key);
    }

    @Override
    public InsertPunto setOauthToken(java.lang.String oauthToken) {
      return (InsertPunto) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertPunto setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertPunto) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertPunto setQuotaUser(java.lang.String quotaUser) {
      return (InsertPunto) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertPunto setUserIp(java.lang.String userIp) {
      return (InsertPunto) super.setUserIp(userIp);
    }

    @Override
    public InsertPunto set(String parameterName, Object value) {
      return (InsertPunto) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listPunto".
   *
   * This request holds the parameters needed by the puntoendpoint server.  After setting any optional
   * parameters, call the {@link ListPunto#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListPunto listPunto() throws java.io.IOException {
    ListPunto result = new ListPunto();
    initialize(result);
    return result;
  }

  public class ListPunto extends PuntoendpointRequest<com.demomapas.puntoendpoint.model.CollectionResponsePunto> {

    private static final String REST_PATH = "punto";

    /**
     * Create a request for the method "listPunto".
     *
     * This request holds the parameters needed by the the puntoendpoint server.  After setting any
     * optional parameters, call the {@link ListPunto#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListPunto#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListPunto() {
      super(Puntoendpoint.this, "GET", REST_PATH, null, com.demomapas.puntoendpoint.model.CollectionResponsePunto.class);
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
    public ListPunto setAlt(java.lang.String alt) {
      return (ListPunto) super.setAlt(alt);
    }

    @Override
    public ListPunto setFields(java.lang.String fields) {
      return (ListPunto) super.setFields(fields);
    }

    @Override
    public ListPunto setKey(java.lang.String key) {
      return (ListPunto) super.setKey(key);
    }

    @Override
    public ListPunto setOauthToken(java.lang.String oauthToken) {
      return (ListPunto) super.setOauthToken(oauthToken);
    }

    @Override
    public ListPunto setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListPunto) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListPunto setQuotaUser(java.lang.String quotaUser) {
      return (ListPunto) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListPunto setUserIp(java.lang.String userIp) {
      return (ListPunto) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListPunto setCursor(java.lang.String cursor) {
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

    public ListPunto setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListPunto set(String parameterName, Object value) {
      return (ListPunto) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removePunto".
   *
   * This request holds the parameters needed by the puntoendpoint server.  After setting any optional
   * parameters, call the {@link RemovePunto#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemovePunto removePunto(java.lang.Long id) throws java.io.IOException {
    RemovePunto result = new RemovePunto(id);
    initialize(result);
    return result;
  }

  public class RemovePunto extends PuntoendpointRequest<Void> {

    private static final String REST_PATH = "punto/{id}";

    /**
     * Create a request for the method "removePunto".
     *
     * This request holds the parameters needed by the the puntoendpoint server.  After setting any
     * optional parameters, call the {@link RemovePunto#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemovePunto#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemovePunto(java.lang.Long id) {
      super(Puntoendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemovePunto setAlt(java.lang.String alt) {
      return (RemovePunto) super.setAlt(alt);
    }

    @Override
    public RemovePunto setFields(java.lang.String fields) {
      return (RemovePunto) super.setFields(fields);
    }

    @Override
    public RemovePunto setKey(java.lang.String key) {
      return (RemovePunto) super.setKey(key);
    }

    @Override
    public RemovePunto setOauthToken(java.lang.String oauthToken) {
      return (RemovePunto) super.setOauthToken(oauthToken);
    }

    @Override
    public RemovePunto setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemovePunto) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemovePunto setQuotaUser(java.lang.String quotaUser) {
      return (RemovePunto) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemovePunto setUserIp(java.lang.String userIp) {
      return (RemovePunto) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemovePunto setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemovePunto set(String parameterName, Object value) {
      return (RemovePunto) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updatePunto".
   *
   * This request holds the parameters needed by the puntoendpoint server.  After setting any optional
   * parameters, call the {@link UpdatePunto#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.demomapas.puntoendpoint.model.Punto}
   * @return the request
   */
  public UpdatePunto updatePunto(com.demomapas.puntoendpoint.model.Punto content) throws java.io.IOException {
    UpdatePunto result = new UpdatePunto(content);
    initialize(result);
    return result;
  }

  public class UpdatePunto extends PuntoendpointRequest<com.demomapas.puntoendpoint.model.Punto> {

    private static final String REST_PATH = "punto";

    /**
     * Create a request for the method "updatePunto".
     *
     * This request holds the parameters needed by the the puntoendpoint server.  After setting any
     * optional parameters, call the {@link UpdatePunto#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdatePunto#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.puntoendpoint.model.Punto}
     * @since 1.13
     */
    protected UpdatePunto(com.demomapas.puntoendpoint.model.Punto content) {
      super(Puntoendpoint.this, "PUT", REST_PATH, content, com.demomapas.puntoendpoint.model.Punto.class);
    }

    @Override
    public UpdatePunto setAlt(java.lang.String alt) {
      return (UpdatePunto) super.setAlt(alt);
    }

    @Override
    public UpdatePunto setFields(java.lang.String fields) {
      return (UpdatePunto) super.setFields(fields);
    }

    @Override
    public UpdatePunto setKey(java.lang.String key) {
      return (UpdatePunto) super.setKey(key);
    }

    @Override
    public UpdatePunto setOauthToken(java.lang.String oauthToken) {
      return (UpdatePunto) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdatePunto setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdatePunto) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdatePunto setQuotaUser(java.lang.String quotaUser) {
      return (UpdatePunto) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdatePunto setUserIp(java.lang.String userIp) {
      return (UpdatePunto) super.setUserIp(userIp);
    }

    @Override
    public UpdatePunto set(String parameterName, Object value) {
      return (UpdatePunto) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Puntoendpoint}.
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

    /** Builds a new instance of {@link Puntoendpoint}. */
    @Override
    public Puntoendpoint build() {
      return new Puntoendpoint(this);
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
     * Set the {@link PuntoendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPuntoendpointRequestInitializer(
        PuntoendpointRequestInitializer puntoendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(puntoendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
