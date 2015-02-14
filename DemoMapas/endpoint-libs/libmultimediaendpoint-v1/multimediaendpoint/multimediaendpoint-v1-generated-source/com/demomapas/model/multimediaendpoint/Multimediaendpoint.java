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
 * on 2015-02-13 at 00:12:56 UTC 
 * Modify at your own risk.
 */

package com.demomapas.model.multimediaendpoint;

/**
 * Service definition for Multimediaendpoint (v1).
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
 * This service uses {@link MultimediaendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Multimediaendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the multimediaendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "multimediaendpoint/v1/";

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
  public Multimediaendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Multimediaendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getMultimedia".
   *
   * This request holds the parameters needed by the multimediaendpoint server.  After setting any
   * optional parameters, call the {@link GetMultimedia#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetMultimedia getMultimedia(java.lang.Long id) throws java.io.IOException {
    GetMultimedia result = new GetMultimedia(id);
    initialize(result);
    return result;
  }

  public class GetMultimedia extends MultimediaendpointRequest<com.demomapas.model.multimediaendpoint.model.Multimedia> {

    private static final String REST_PATH = "multimedia/{id}";

    /**
     * Create a request for the method "getMultimedia".
     *
     * This request holds the parameters needed by the the multimediaendpoint server.  After setting
     * any optional parameters, call the {@link GetMultimedia#execute()} method to invoke the remote
     * operation. <p> {@link GetMultimedia#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetMultimedia(java.lang.Long id) {
      super(Multimediaendpoint.this, "GET", REST_PATH, null, com.demomapas.model.multimediaendpoint.model.Multimedia.class);
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
    public GetMultimedia setAlt(java.lang.String alt) {
      return (GetMultimedia) super.setAlt(alt);
    }

    @Override
    public GetMultimedia setFields(java.lang.String fields) {
      return (GetMultimedia) super.setFields(fields);
    }

    @Override
    public GetMultimedia setKey(java.lang.String key) {
      return (GetMultimedia) super.setKey(key);
    }

    @Override
    public GetMultimedia setOauthToken(java.lang.String oauthToken) {
      return (GetMultimedia) super.setOauthToken(oauthToken);
    }

    @Override
    public GetMultimedia setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetMultimedia) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetMultimedia setQuotaUser(java.lang.String quotaUser) {
      return (GetMultimedia) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetMultimedia setUserIp(java.lang.String userIp) {
      return (GetMultimedia) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetMultimedia setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetMultimedia set(String parameterName, Object value) {
      return (GetMultimedia) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertMultimedia".
   *
   * This request holds the parameters needed by the multimediaendpoint server.  After setting any
   * optional parameters, call the {@link InsertMultimedia#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.demomapas.model.multimediaendpoint.model.Multimedia}
   * @return the request
   */
  public InsertMultimedia insertMultimedia(com.demomapas.model.multimediaendpoint.model.Multimedia content) throws java.io.IOException {
    InsertMultimedia result = new InsertMultimedia(content);
    initialize(result);
    return result;
  }

  public class InsertMultimedia extends MultimediaendpointRequest<com.demomapas.model.multimediaendpoint.model.Multimedia> {

    private static final String REST_PATH = "multimedia";

    /**
     * Create a request for the method "insertMultimedia".
     *
     * This request holds the parameters needed by the the multimediaendpoint server.  After setting
     * any optional parameters, call the {@link InsertMultimedia#execute()} method to invoke the
     * remote operation. <p> {@link InsertMultimedia#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.multimediaendpoint.model.Multimedia}
     * @since 1.13
     */
    protected InsertMultimedia(com.demomapas.model.multimediaendpoint.model.Multimedia content) {
      super(Multimediaendpoint.this, "POST", REST_PATH, content, com.demomapas.model.multimediaendpoint.model.Multimedia.class);
    }

    @Override
    public InsertMultimedia setAlt(java.lang.String alt) {
      return (InsertMultimedia) super.setAlt(alt);
    }

    @Override
    public InsertMultimedia setFields(java.lang.String fields) {
      return (InsertMultimedia) super.setFields(fields);
    }

    @Override
    public InsertMultimedia setKey(java.lang.String key) {
      return (InsertMultimedia) super.setKey(key);
    }

    @Override
    public InsertMultimedia setOauthToken(java.lang.String oauthToken) {
      return (InsertMultimedia) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertMultimedia setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertMultimedia) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertMultimedia setQuotaUser(java.lang.String quotaUser) {
      return (InsertMultimedia) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertMultimedia setUserIp(java.lang.String userIp) {
      return (InsertMultimedia) super.setUserIp(userIp);
    }

    @Override
    public InsertMultimedia set(String parameterName, Object value) {
      return (InsertMultimedia) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listMultimedia".
   *
   * This request holds the parameters needed by the multimediaendpoint server.  After setting any
   * optional parameters, call the {@link ListMultimedia#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListMultimedia listMultimedia() throws java.io.IOException {
    ListMultimedia result = new ListMultimedia();
    initialize(result);
    return result;
  }

  public class ListMultimedia extends MultimediaendpointRequest<com.demomapas.model.multimediaendpoint.model.CollectionResponseMultimedia> {

    private static final String REST_PATH = "multimedia";

    /**
     * Create a request for the method "listMultimedia".
     *
     * This request holds the parameters needed by the the multimediaendpoint server.  After setting
     * any optional parameters, call the {@link ListMultimedia#execute()} method to invoke the remote
     * operation. <p> {@link ListMultimedia#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListMultimedia() {
      super(Multimediaendpoint.this, "GET", REST_PATH, null, com.demomapas.model.multimediaendpoint.model.CollectionResponseMultimedia.class);
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
    public ListMultimedia setAlt(java.lang.String alt) {
      return (ListMultimedia) super.setAlt(alt);
    }

    @Override
    public ListMultimedia setFields(java.lang.String fields) {
      return (ListMultimedia) super.setFields(fields);
    }

    @Override
    public ListMultimedia setKey(java.lang.String key) {
      return (ListMultimedia) super.setKey(key);
    }

    @Override
    public ListMultimedia setOauthToken(java.lang.String oauthToken) {
      return (ListMultimedia) super.setOauthToken(oauthToken);
    }

    @Override
    public ListMultimedia setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListMultimedia) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListMultimedia setQuotaUser(java.lang.String quotaUser) {
      return (ListMultimedia) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListMultimedia setUserIp(java.lang.String userIp) {
      return (ListMultimedia) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListMultimedia setCursor(java.lang.String cursor) {
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

    public ListMultimedia setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListMultimedia set(String parameterName, Object value) {
      return (ListMultimedia) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeMultimedia".
   *
   * This request holds the parameters needed by the multimediaendpoint server.  After setting any
   * optional parameters, call the {@link RemoveMultimedia#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveMultimedia removeMultimedia(java.lang.Long id) throws java.io.IOException {
    RemoveMultimedia result = new RemoveMultimedia(id);
    initialize(result);
    return result;
  }

  public class RemoveMultimedia extends MultimediaendpointRequest<Void> {

    private static final String REST_PATH = "multimedia/{id}";

    /**
     * Create a request for the method "removeMultimedia".
     *
     * This request holds the parameters needed by the the multimediaendpoint server.  After setting
     * any optional parameters, call the {@link RemoveMultimedia#execute()} method to invoke the
     * remote operation. <p> {@link RemoveMultimedia#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveMultimedia(java.lang.Long id) {
      super(Multimediaendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveMultimedia setAlt(java.lang.String alt) {
      return (RemoveMultimedia) super.setAlt(alt);
    }

    @Override
    public RemoveMultimedia setFields(java.lang.String fields) {
      return (RemoveMultimedia) super.setFields(fields);
    }

    @Override
    public RemoveMultimedia setKey(java.lang.String key) {
      return (RemoveMultimedia) super.setKey(key);
    }

    @Override
    public RemoveMultimedia setOauthToken(java.lang.String oauthToken) {
      return (RemoveMultimedia) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveMultimedia setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveMultimedia) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveMultimedia setQuotaUser(java.lang.String quotaUser) {
      return (RemoveMultimedia) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveMultimedia setUserIp(java.lang.String userIp) {
      return (RemoveMultimedia) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveMultimedia setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveMultimedia set(String parameterName, Object value) {
      return (RemoveMultimedia) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateMultimedia".
   *
   * This request holds the parameters needed by the multimediaendpoint server.  After setting any
   * optional parameters, call the {@link UpdateMultimedia#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.demomapas.model.multimediaendpoint.model.Multimedia}
   * @return the request
   */
  public UpdateMultimedia updateMultimedia(com.demomapas.model.multimediaendpoint.model.Multimedia content) throws java.io.IOException {
    UpdateMultimedia result = new UpdateMultimedia(content);
    initialize(result);
    return result;
  }

  public class UpdateMultimedia extends MultimediaendpointRequest<com.demomapas.model.multimediaendpoint.model.Multimedia> {

    private static final String REST_PATH = "multimedia";

    /**
     * Create a request for the method "updateMultimedia".
     *
     * This request holds the parameters needed by the the multimediaendpoint server.  After setting
     * any optional parameters, call the {@link UpdateMultimedia#execute()} method to invoke the
     * remote operation. <p> {@link UpdateMultimedia#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.multimediaendpoint.model.Multimedia}
     * @since 1.13
     */
    protected UpdateMultimedia(com.demomapas.model.multimediaendpoint.model.Multimedia content) {
      super(Multimediaendpoint.this, "PUT", REST_PATH, content, com.demomapas.model.multimediaendpoint.model.Multimedia.class);
    }

    @Override
    public UpdateMultimedia setAlt(java.lang.String alt) {
      return (UpdateMultimedia) super.setAlt(alt);
    }

    @Override
    public UpdateMultimedia setFields(java.lang.String fields) {
      return (UpdateMultimedia) super.setFields(fields);
    }

    @Override
    public UpdateMultimedia setKey(java.lang.String key) {
      return (UpdateMultimedia) super.setKey(key);
    }

    @Override
    public UpdateMultimedia setOauthToken(java.lang.String oauthToken) {
      return (UpdateMultimedia) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateMultimedia setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateMultimedia) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateMultimedia setQuotaUser(java.lang.String quotaUser) {
      return (UpdateMultimedia) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateMultimedia setUserIp(java.lang.String userIp) {
      return (UpdateMultimedia) super.setUserIp(userIp);
    }

    @Override
    public UpdateMultimedia set(String parameterName, Object value) {
      return (UpdateMultimedia) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Multimediaendpoint}.
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

    /** Builds a new instance of {@link Multimediaendpoint}. */
    @Override
    public Multimediaendpoint build() {
      return new Multimediaendpoint(this);
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
     * Set the {@link MultimediaendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMultimediaendpointRequestInitializer(
        MultimediaendpointRequestInitializer multimediaendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(multimediaendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
