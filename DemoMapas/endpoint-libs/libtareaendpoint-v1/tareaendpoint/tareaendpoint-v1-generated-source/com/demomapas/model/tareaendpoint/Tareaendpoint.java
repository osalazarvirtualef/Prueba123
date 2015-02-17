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
 * on 2015-02-16 at 20:23:08 UTC 
 * Modify at your own risk.
 */

package com.demomapas.model.tareaendpoint;

/**
 * Service definition for Tareaendpoint (v1).
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
 * This service uses {@link TareaendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Tareaendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the tareaendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "tareaendpoint/v1/";

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
  public Tareaendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Tareaendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getTarea".
   *
   * This request holds the parameters needed by the tareaendpoint server.  After setting any optional
   * parameters, call the {@link GetTarea#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetTarea getTarea(java.lang.Long id) throws java.io.IOException {
    GetTarea result = new GetTarea(id);
    initialize(result);
    return result;
  }

  public class GetTarea extends TareaendpointRequest<com.demomapas.model.tareaendpoint.model.Tarea> {

    private static final String REST_PATH = "tarea/{id}";

    /**
     * Create a request for the method "getTarea".
     *
     * This request holds the parameters needed by the the tareaendpoint server.  After setting any
     * optional parameters, call the {@link GetTarea#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetTarea#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetTarea(java.lang.Long id) {
      super(Tareaendpoint.this, "GET", REST_PATH, null, com.demomapas.model.tareaendpoint.model.Tarea.class);
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
    public GetTarea setAlt(java.lang.String alt) {
      return (GetTarea) super.setAlt(alt);
    }

    @Override
    public GetTarea setFields(java.lang.String fields) {
      return (GetTarea) super.setFields(fields);
    }

    @Override
    public GetTarea setKey(java.lang.String key) {
      return (GetTarea) super.setKey(key);
    }

    @Override
    public GetTarea setOauthToken(java.lang.String oauthToken) {
      return (GetTarea) super.setOauthToken(oauthToken);
    }

    @Override
    public GetTarea setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetTarea) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetTarea setQuotaUser(java.lang.String quotaUser) {
      return (GetTarea) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetTarea setUserIp(java.lang.String userIp) {
      return (GetTarea) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetTarea setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetTarea set(String parameterName, Object value) {
      return (GetTarea) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertTarea".
   *
   * This request holds the parameters needed by the tareaendpoint server.  After setting any optional
   * parameters, call the {@link InsertTarea#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.demomapas.model.tareaendpoint.model.Tarea}
   * @return the request
   */
  public InsertTarea insertTarea(com.demomapas.model.tareaendpoint.model.Tarea content) throws java.io.IOException {
    InsertTarea result = new InsertTarea(content);
    initialize(result);
    return result;
  }

  public class InsertTarea extends TareaendpointRequest<com.demomapas.model.tareaendpoint.model.Tarea> {

    private static final String REST_PATH = "tarea";

    /**
     * Create a request for the method "insertTarea".
     *
     * This request holds the parameters needed by the the tareaendpoint server.  After setting any
     * optional parameters, call the {@link InsertTarea#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertTarea#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.tareaendpoint.model.Tarea}
     * @since 1.13
     */
    protected InsertTarea(com.demomapas.model.tareaendpoint.model.Tarea content) {
      super(Tareaendpoint.this, "POST", REST_PATH, content, com.demomapas.model.tareaendpoint.model.Tarea.class);
    }

    @Override
    public InsertTarea setAlt(java.lang.String alt) {
      return (InsertTarea) super.setAlt(alt);
    }

    @Override
    public InsertTarea setFields(java.lang.String fields) {
      return (InsertTarea) super.setFields(fields);
    }

    @Override
    public InsertTarea setKey(java.lang.String key) {
      return (InsertTarea) super.setKey(key);
    }

    @Override
    public InsertTarea setOauthToken(java.lang.String oauthToken) {
      return (InsertTarea) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertTarea setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertTarea) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertTarea setQuotaUser(java.lang.String quotaUser) {
      return (InsertTarea) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertTarea setUserIp(java.lang.String userIp) {
      return (InsertTarea) super.setUserIp(userIp);
    }

    @Override
    public InsertTarea set(String parameterName, Object value) {
      return (InsertTarea) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listTarea".
   *
   * This request holds the parameters needed by the tareaendpoint server.  After setting any optional
   * parameters, call the {@link ListTarea#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListTarea listTarea() throws java.io.IOException {
    ListTarea result = new ListTarea();
    initialize(result);
    return result;
  }

  public class ListTarea extends TareaendpointRequest<com.demomapas.model.tareaendpoint.model.CollectionResponseTarea> {

    private static final String REST_PATH = "tarea";

    /**
     * Create a request for the method "listTarea".
     *
     * This request holds the parameters needed by the the tareaendpoint server.  After setting any
     * optional parameters, call the {@link ListTarea#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListTarea#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListTarea() {
      super(Tareaendpoint.this, "GET", REST_PATH, null, com.demomapas.model.tareaendpoint.model.CollectionResponseTarea.class);
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
    public ListTarea setAlt(java.lang.String alt) {
      return (ListTarea) super.setAlt(alt);
    }

    @Override
    public ListTarea setFields(java.lang.String fields) {
      return (ListTarea) super.setFields(fields);
    }

    @Override
    public ListTarea setKey(java.lang.String key) {
      return (ListTarea) super.setKey(key);
    }

    @Override
    public ListTarea setOauthToken(java.lang.String oauthToken) {
      return (ListTarea) super.setOauthToken(oauthToken);
    }

    @Override
    public ListTarea setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListTarea) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListTarea setQuotaUser(java.lang.String quotaUser) {
      return (ListTarea) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListTarea setUserIp(java.lang.String userIp) {
      return (ListTarea) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListTarea setCursor(java.lang.String cursor) {
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

    public ListTarea setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListTarea set(String parameterName, Object value) {
      return (ListTarea) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeTarea".
   *
   * This request holds the parameters needed by the tareaendpoint server.  After setting any optional
   * parameters, call the {@link RemoveTarea#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveTarea removeTarea(java.lang.Long id) throws java.io.IOException {
    RemoveTarea result = new RemoveTarea(id);
    initialize(result);
    return result;
  }

  public class RemoveTarea extends TareaendpointRequest<Void> {

    private static final String REST_PATH = "tarea/{id}";

    /**
     * Create a request for the method "removeTarea".
     *
     * This request holds the parameters needed by the the tareaendpoint server.  After setting any
     * optional parameters, call the {@link RemoveTarea#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveTarea#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveTarea(java.lang.Long id) {
      super(Tareaendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveTarea setAlt(java.lang.String alt) {
      return (RemoveTarea) super.setAlt(alt);
    }

    @Override
    public RemoveTarea setFields(java.lang.String fields) {
      return (RemoveTarea) super.setFields(fields);
    }

    @Override
    public RemoveTarea setKey(java.lang.String key) {
      return (RemoveTarea) super.setKey(key);
    }

    @Override
    public RemoveTarea setOauthToken(java.lang.String oauthToken) {
      return (RemoveTarea) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveTarea setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveTarea) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveTarea setQuotaUser(java.lang.String quotaUser) {
      return (RemoveTarea) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveTarea setUserIp(java.lang.String userIp) {
      return (RemoveTarea) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveTarea setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveTarea set(String parameterName, Object value) {
      return (RemoveTarea) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateTarea".
   *
   * This request holds the parameters needed by the tareaendpoint server.  After setting any optional
   * parameters, call the {@link UpdateTarea#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.demomapas.model.tareaendpoint.model.Tarea}
   * @return the request
   */
  public UpdateTarea updateTarea(com.demomapas.model.tareaendpoint.model.Tarea content) throws java.io.IOException {
    UpdateTarea result = new UpdateTarea(content);
    initialize(result);
    return result;
  }

  public class UpdateTarea extends TareaendpointRequest<com.demomapas.model.tareaendpoint.model.Tarea> {

    private static final String REST_PATH = "tarea";

    /**
     * Create a request for the method "updateTarea".
     *
     * This request holds the parameters needed by the the tareaendpoint server.  After setting any
     * optional parameters, call the {@link UpdateTarea#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateTarea#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.tareaendpoint.model.Tarea}
     * @since 1.13
     */
    protected UpdateTarea(com.demomapas.model.tareaendpoint.model.Tarea content) {
      super(Tareaendpoint.this, "PUT", REST_PATH, content, com.demomapas.model.tareaendpoint.model.Tarea.class);
    }

    @Override
    public UpdateTarea setAlt(java.lang.String alt) {
      return (UpdateTarea) super.setAlt(alt);
    }

    @Override
    public UpdateTarea setFields(java.lang.String fields) {
      return (UpdateTarea) super.setFields(fields);
    }

    @Override
    public UpdateTarea setKey(java.lang.String key) {
      return (UpdateTarea) super.setKey(key);
    }

    @Override
    public UpdateTarea setOauthToken(java.lang.String oauthToken) {
      return (UpdateTarea) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateTarea setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateTarea) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateTarea setQuotaUser(java.lang.String quotaUser) {
      return (UpdateTarea) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateTarea setUserIp(java.lang.String userIp) {
      return (UpdateTarea) super.setUserIp(userIp);
    }

    @Override
    public UpdateTarea set(String parameterName, Object value) {
      return (UpdateTarea) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Tareaendpoint}.
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

    /** Builds a new instance of {@link Tareaendpoint}. */
    @Override
    public Tareaendpoint build() {
      return new Tareaendpoint(this);
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
     * Set the {@link TareaendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTareaendpointRequestInitializer(
        TareaendpointRequestInitializer tareaendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(tareaendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
