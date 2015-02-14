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
 * on 2015-02-14 at 20:47:47 UTC 
 * Modify at your own risk.
 */

package com.demomapas.model.zonaendpoint;

/**
 * Service definition for Zonaendpoint (v1).
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
 * This service uses {@link ZonaendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Zonaendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the zonaendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "zonaendpoint/v1/";

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
  public Zonaendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Zonaendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getZona".
   *
   * This request holds the parameters needed by the zonaendpoint server.  After setting any optional
   * parameters, call the {@link GetZona#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetZona getZona(java.lang.Long id) throws java.io.IOException {
    GetZona result = new GetZona(id);
    initialize(result);
    return result;
  }

  public class GetZona extends ZonaendpointRequest<com.demomapas.model.zonaendpoint.model.Zona> {

    private static final String REST_PATH = "zona/{id}";

    /**
     * Create a request for the method "getZona".
     *
     * This request holds the parameters needed by the the zonaendpoint server.  After setting any
     * optional parameters, call the {@link GetZona#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetZona#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetZona(java.lang.Long id) {
      super(Zonaendpoint.this, "GET", REST_PATH, null, com.demomapas.model.zonaendpoint.model.Zona.class);
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
    public GetZona setAlt(java.lang.String alt) {
      return (GetZona) super.setAlt(alt);
    }

    @Override
    public GetZona setFields(java.lang.String fields) {
      return (GetZona) super.setFields(fields);
    }

    @Override
    public GetZona setKey(java.lang.String key) {
      return (GetZona) super.setKey(key);
    }

    @Override
    public GetZona setOauthToken(java.lang.String oauthToken) {
      return (GetZona) super.setOauthToken(oauthToken);
    }

    @Override
    public GetZona setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetZona) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetZona setQuotaUser(java.lang.String quotaUser) {
      return (GetZona) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetZona setUserIp(java.lang.String userIp) {
      return (GetZona) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetZona setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetZona set(String parameterName, Object value) {
      return (GetZona) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertZona".
   *
   * This request holds the parameters needed by the zonaendpoint server.  After setting any optional
   * parameters, call the {@link InsertZona#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.demomapas.model.zonaendpoint.model.Zona}
   * @return the request
   */
  public InsertZona insertZona(com.demomapas.model.zonaendpoint.model.Zona content) throws java.io.IOException {
    InsertZona result = new InsertZona(content);
    initialize(result);
    return result;
  }

  public class InsertZona extends ZonaendpointRequest<com.demomapas.model.zonaendpoint.model.Zona> {

    private static final String REST_PATH = "zona";

    /**
     * Create a request for the method "insertZona".
     *
     * This request holds the parameters needed by the the zonaendpoint server.  After setting any
     * optional parameters, call the {@link InsertZona#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertZona#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.zonaendpoint.model.Zona}
     * @since 1.13
     */
    protected InsertZona(com.demomapas.model.zonaendpoint.model.Zona content) {
      super(Zonaendpoint.this, "POST", REST_PATH, content, com.demomapas.model.zonaendpoint.model.Zona.class);
    }

    @Override
    public InsertZona setAlt(java.lang.String alt) {
      return (InsertZona) super.setAlt(alt);
    }

    @Override
    public InsertZona setFields(java.lang.String fields) {
      return (InsertZona) super.setFields(fields);
    }

    @Override
    public InsertZona setKey(java.lang.String key) {
      return (InsertZona) super.setKey(key);
    }

    @Override
    public InsertZona setOauthToken(java.lang.String oauthToken) {
      return (InsertZona) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertZona setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertZona) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertZona setQuotaUser(java.lang.String quotaUser) {
      return (InsertZona) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertZona setUserIp(java.lang.String userIp) {
      return (InsertZona) super.setUserIp(userIp);
    }

    @Override
    public InsertZona set(String parameterName, Object value) {
      return (InsertZona) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listZona".
   *
   * This request holds the parameters needed by the zonaendpoint server.  After setting any optional
   * parameters, call the {@link ListZona#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListZona listZona() throws java.io.IOException {
    ListZona result = new ListZona();
    initialize(result);
    return result;
  }

  public class ListZona extends ZonaendpointRequest<com.demomapas.model.zonaendpoint.model.CollectionResponseZona> {

    private static final String REST_PATH = "zona";

    /**
     * Create a request for the method "listZona".
     *
     * This request holds the parameters needed by the the zonaendpoint server.  After setting any
     * optional parameters, call the {@link ListZona#execute()} method to invoke the remote operation.
     * <p> {@link
     * ListZona#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListZona() {
      super(Zonaendpoint.this, "GET", REST_PATH, null, com.demomapas.model.zonaendpoint.model.CollectionResponseZona.class);
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
    public ListZona setAlt(java.lang.String alt) {
      return (ListZona) super.setAlt(alt);
    }

    @Override
    public ListZona setFields(java.lang.String fields) {
      return (ListZona) super.setFields(fields);
    }

    @Override
    public ListZona setKey(java.lang.String key) {
      return (ListZona) super.setKey(key);
    }

    @Override
    public ListZona setOauthToken(java.lang.String oauthToken) {
      return (ListZona) super.setOauthToken(oauthToken);
    }

    @Override
    public ListZona setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListZona) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListZona setQuotaUser(java.lang.String quotaUser) {
      return (ListZona) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListZona setUserIp(java.lang.String userIp) {
      return (ListZona) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListZona setCursor(java.lang.String cursor) {
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

    public ListZona setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListZona set(String parameterName, Object value) {
      return (ListZona) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeZona".
   *
   * This request holds the parameters needed by the zonaendpoint server.  After setting any optional
   * parameters, call the {@link RemoveZona#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveZona removeZona(java.lang.Long id) throws java.io.IOException {
    RemoveZona result = new RemoveZona(id);
    initialize(result);
    return result;
  }

  public class RemoveZona extends ZonaendpointRequest<Void> {

    private static final String REST_PATH = "zona/{id}";

    /**
     * Create a request for the method "removeZona".
     *
     * This request holds the parameters needed by the the zonaendpoint server.  After setting any
     * optional parameters, call the {@link RemoveZona#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveZona#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveZona(java.lang.Long id) {
      super(Zonaendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveZona setAlt(java.lang.String alt) {
      return (RemoveZona) super.setAlt(alt);
    }

    @Override
    public RemoveZona setFields(java.lang.String fields) {
      return (RemoveZona) super.setFields(fields);
    }

    @Override
    public RemoveZona setKey(java.lang.String key) {
      return (RemoveZona) super.setKey(key);
    }

    @Override
    public RemoveZona setOauthToken(java.lang.String oauthToken) {
      return (RemoveZona) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveZona setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveZona) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveZona setQuotaUser(java.lang.String quotaUser) {
      return (RemoveZona) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveZona setUserIp(java.lang.String userIp) {
      return (RemoveZona) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveZona setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveZona set(String parameterName, Object value) {
      return (RemoveZona) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateZona".
   *
   * This request holds the parameters needed by the zonaendpoint server.  After setting any optional
   * parameters, call the {@link UpdateZona#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.demomapas.model.zonaendpoint.model.Zona}
   * @return the request
   */
  public UpdateZona updateZona(com.demomapas.model.zonaendpoint.model.Zona content) throws java.io.IOException {
    UpdateZona result = new UpdateZona(content);
    initialize(result);
    return result;
  }

  public class UpdateZona extends ZonaendpointRequest<com.demomapas.model.zonaendpoint.model.Zona> {

    private static final String REST_PATH = "zona";

    /**
     * Create a request for the method "updateZona".
     *
     * This request holds the parameters needed by the the zonaendpoint server.  After setting any
     * optional parameters, call the {@link UpdateZona#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateZona#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.demomapas.model.zonaendpoint.model.Zona}
     * @since 1.13
     */
    protected UpdateZona(com.demomapas.model.zonaendpoint.model.Zona content) {
      super(Zonaendpoint.this, "PUT", REST_PATH, content, com.demomapas.model.zonaendpoint.model.Zona.class);
    }

    @Override
    public UpdateZona setAlt(java.lang.String alt) {
      return (UpdateZona) super.setAlt(alt);
    }

    @Override
    public UpdateZona setFields(java.lang.String fields) {
      return (UpdateZona) super.setFields(fields);
    }

    @Override
    public UpdateZona setKey(java.lang.String key) {
      return (UpdateZona) super.setKey(key);
    }

    @Override
    public UpdateZona setOauthToken(java.lang.String oauthToken) {
      return (UpdateZona) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateZona setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateZona) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateZona setQuotaUser(java.lang.String quotaUser) {
      return (UpdateZona) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateZona setUserIp(java.lang.String userIp) {
      return (UpdateZona) super.setUserIp(userIp);
    }

    @Override
    public UpdateZona set(String parameterName, Object value) {
      return (UpdateZona) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Zonaendpoint}.
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

    /** Builds a new instance of {@link Zonaendpoint}. */
    @Override
    public Zonaendpoint build() {
      return new Zonaendpoint(this);
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
     * Set the {@link ZonaendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setZonaendpointRequestInitializer(
        ZonaendpointRequestInitializer zonaendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(zonaendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
