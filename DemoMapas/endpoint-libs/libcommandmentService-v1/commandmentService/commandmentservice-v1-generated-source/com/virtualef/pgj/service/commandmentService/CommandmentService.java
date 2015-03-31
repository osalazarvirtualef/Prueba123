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
 * on 2015-03-31 at 05:13:55 UTC 
 * Modify at your own risk.
 */

package com.virtualef.pgj.service.commandmentService;

/**
 * Service definition for CommandmentService (v1).
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
 * This service uses {@link CommandmentServiceRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CommandmentService extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the commandmentService library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "commandmentService/v1/";

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
  public CommandmentService(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CommandmentService(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getCommandmentByAgentId".
   *
   * This request holds the parameters needed by the commandmentService server.  After setting any
   * optional parameters, call the {@link GetCommandmentByAgentId#execute()} method to invoke the
   * remote operation.
   *
   * @param id
   * @return the request
   */
  public GetCommandmentByAgentId getCommandmentByAgentId(java.lang.Long id) throws java.io.IOException {
    GetCommandmentByAgentId result = new GetCommandmentByAgentId(id);
    initialize(result);
    return result;
  }

  public class GetCommandmentByAgentId extends CommandmentServiceRequest<com.virtualef.pgj.service.commandmentService.model.CollectionResponseCommandmentDto> {

    private static final String REST_PATH = "commandmentdto/{id}";

    /**
     * Create a request for the method "getCommandmentByAgentId".
     *
     * This request holds the parameters needed by the the commandmentService server.  After setting
     * any optional parameters, call the {@link GetCommandmentByAgentId#execute()} method to invoke
     * the remote operation. <p> {@link GetCommandmentByAgentId#initialize(com.google.api.client.googl
     * eapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetCommandmentByAgentId(java.lang.Long id) {
      super(CommandmentService.this, "GET", REST_PATH, null, com.virtualef.pgj.service.commandmentService.model.CollectionResponseCommandmentDto.class);
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
    public GetCommandmentByAgentId setAlt(java.lang.String alt) {
      return (GetCommandmentByAgentId) super.setAlt(alt);
    }

    @Override
    public GetCommandmentByAgentId setFields(java.lang.String fields) {
      return (GetCommandmentByAgentId) super.setFields(fields);
    }

    @Override
    public GetCommandmentByAgentId setKey(java.lang.String key) {
      return (GetCommandmentByAgentId) super.setKey(key);
    }

    @Override
    public GetCommandmentByAgentId setOauthToken(java.lang.String oauthToken) {
      return (GetCommandmentByAgentId) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCommandmentByAgentId setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCommandmentByAgentId) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCommandmentByAgentId setQuotaUser(java.lang.String quotaUser) {
      return (GetCommandmentByAgentId) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCommandmentByAgentId setUserIp(java.lang.String userIp) {
      return (GetCommandmentByAgentId) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetCommandmentByAgentId setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetCommandmentByAgentId set(String parameterName, Object value) {
      return (GetCommandmentByAgentId) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getCommandments".
   *
   * This request holds the parameters needed by the commandmentService server.  After setting any
   * optional parameters, call the {@link GetCommandments#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public GetCommandments getCommandments() throws java.io.IOException {
    GetCommandments result = new GetCommandments();
    initialize(result);
    return result;
  }

  public class GetCommandments extends CommandmentServiceRequest<com.virtualef.pgj.service.commandmentService.model.CollectionResponseCommandmentDto> {

    private static final String REST_PATH = "commandmentdto";

    /**
     * Create a request for the method "getCommandments".
     *
     * This request holds the parameters needed by the the commandmentService server.  After setting
     * any optional parameters, call the {@link GetCommandments#execute()} method to invoke the remote
     * operation. <p> {@link GetCommandments#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected GetCommandments() {
      super(CommandmentService.this, "GET", REST_PATH, null, com.virtualef.pgj.service.commandmentService.model.CollectionResponseCommandmentDto.class);
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
    public GetCommandments setAlt(java.lang.String alt) {
      return (GetCommandments) super.setAlt(alt);
    }

    @Override
    public GetCommandments setFields(java.lang.String fields) {
      return (GetCommandments) super.setFields(fields);
    }

    @Override
    public GetCommandments setKey(java.lang.String key) {
      return (GetCommandments) super.setKey(key);
    }

    @Override
    public GetCommandments setOauthToken(java.lang.String oauthToken) {
      return (GetCommandments) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCommandments setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCommandments) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCommandments setQuotaUser(java.lang.String quotaUser) {
      return (GetCommandments) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCommandments setUserIp(java.lang.String userIp) {
      return (GetCommandments) super.setUserIp(userIp);
    }

    @Override
    public GetCommandments set(String parameterName, Object value) {
      return (GetCommandments) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertCommandment".
   *
   * This request holds the parameters needed by the commandmentService server.  After setting any
   * optional parameters, call the {@link InsertCommandment#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.virtualef.pgj.service.commandmentService.model.CommandmentDto}
   * @return the request
   */
  public InsertCommandment insertCommandment(com.virtualef.pgj.service.commandmentService.model.CommandmentDto content) throws java.io.IOException {
    InsertCommandment result = new InsertCommandment(content);
    initialize(result);
    return result;
  }

  public class InsertCommandment extends CommandmentServiceRequest<com.virtualef.pgj.service.commandmentService.model.CommandmentDto> {

    private static final String REST_PATH = "commandmentdto";

    /**
     * Create a request for the method "insertCommandment".
     *
     * This request holds the parameters needed by the the commandmentService server.  After setting
     * any optional parameters, call the {@link InsertCommandment#execute()} method to invoke the
     * remote operation. <p> {@link InsertCommandment#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.virtualef.pgj.service.commandmentService.model.CommandmentDto}
     * @since 1.13
     */
    protected InsertCommandment(com.virtualef.pgj.service.commandmentService.model.CommandmentDto content) {
      super(CommandmentService.this, "POST", REST_PATH, content, com.virtualef.pgj.service.commandmentService.model.CommandmentDto.class);
    }

    @Override
    public InsertCommandment setAlt(java.lang.String alt) {
      return (InsertCommandment) super.setAlt(alt);
    }

    @Override
    public InsertCommandment setFields(java.lang.String fields) {
      return (InsertCommandment) super.setFields(fields);
    }

    @Override
    public InsertCommandment setKey(java.lang.String key) {
      return (InsertCommandment) super.setKey(key);
    }

    @Override
    public InsertCommandment setOauthToken(java.lang.String oauthToken) {
      return (InsertCommandment) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertCommandment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertCommandment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertCommandment setQuotaUser(java.lang.String quotaUser) {
      return (InsertCommandment) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertCommandment setUserIp(java.lang.String userIp) {
      return (InsertCommandment) super.setUserIp(userIp);
    }

    @Override
    public InsertCommandment set(String parameterName, Object value) {
      return (InsertCommandment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeCommandments".
   *
   * This request holds the parameters needed by the commandmentService server.  After setting any
   * optional parameters, call the {@link RemoveCommandments#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveCommandments removeCommandments(java.lang.Long id) throws java.io.IOException {
    RemoveCommandments result = new RemoveCommandments(id);
    initialize(result);
    return result;
  }

  public class RemoveCommandments extends CommandmentServiceRequest<Void> {

    private static final String REST_PATH = "commandmentdto/{id}";

    /**
     * Create a request for the method "removeCommandments".
     *
     * This request holds the parameters needed by the the commandmentService server.  After setting
     * any optional parameters, call the {@link RemoveCommandments#execute()} method to invoke the
     * remote operation. <p> {@link RemoveCommandments#initialize(com.google.api.client.googleapis.ser
     * vices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveCommandments(java.lang.Long id) {
      super(CommandmentService.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveCommandments setAlt(java.lang.String alt) {
      return (RemoveCommandments) super.setAlt(alt);
    }

    @Override
    public RemoveCommandments setFields(java.lang.String fields) {
      return (RemoveCommandments) super.setFields(fields);
    }

    @Override
    public RemoveCommandments setKey(java.lang.String key) {
      return (RemoveCommandments) super.setKey(key);
    }

    @Override
    public RemoveCommandments setOauthToken(java.lang.String oauthToken) {
      return (RemoveCommandments) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveCommandments setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveCommandments) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveCommandments setQuotaUser(java.lang.String quotaUser) {
      return (RemoveCommandments) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveCommandments setUserIp(java.lang.String userIp) {
      return (RemoveCommandments) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveCommandments setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveCommandments set(String parameterName, Object value) {
      return (RemoveCommandments) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateCommandments".
   *
   * This request holds the parameters needed by the commandmentService server.  After setting any
   * optional parameters, call the {@link UpdateCommandments#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.virtualef.pgj.service.commandmentService.model.CommandmentDto}
   * @return the request
   */
  public UpdateCommandments updateCommandments(com.virtualef.pgj.service.commandmentService.model.CommandmentDto content) throws java.io.IOException {
    UpdateCommandments result = new UpdateCommandments(content);
    initialize(result);
    return result;
  }

  public class UpdateCommandments extends CommandmentServiceRequest<com.virtualef.pgj.service.commandmentService.model.CommandmentDto> {

    private static final String REST_PATH = "commandmentdto";

    /**
     * Create a request for the method "updateCommandments".
     *
     * This request holds the parameters needed by the the commandmentService server.  After setting
     * any optional parameters, call the {@link UpdateCommandments#execute()} method to invoke the
     * remote operation. <p> {@link UpdateCommandments#initialize(com.google.api.client.googleapis.ser
     * vices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param content the {@link com.virtualef.pgj.service.commandmentService.model.CommandmentDto}
     * @since 1.13
     */
    protected UpdateCommandments(com.virtualef.pgj.service.commandmentService.model.CommandmentDto content) {
      super(CommandmentService.this, "PUT", REST_PATH, content, com.virtualef.pgj.service.commandmentService.model.CommandmentDto.class);
    }

    @Override
    public UpdateCommandments setAlt(java.lang.String alt) {
      return (UpdateCommandments) super.setAlt(alt);
    }

    @Override
    public UpdateCommandments setFields(java.lang.String fields) {
      return (UpdateCommandments) super.setFields(fields);
    }

    @Override
    public UpdateCommandments setKey(java.lang.String key) {
      return (UpdateCommandments) super.setKey(key);
    }

    @Override
    public UpdateCommandments setOauthToken(java.lang.String oauthToken) {
      return (UpdateCommandments) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateCommandments setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateCommandments) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateCommandments setQuotaUser(java.lang.String quotaUser) {
      return (UpdateCommandments) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateCommandments setUserIp(java.lang.String userIp) {
      return (UpdateCommandments) super.setUserIp(userIp);
    }

    @Override
    public UpdateCommandments set(String parameterName, Object value) {
      return (UpdateCommandments) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link CommandmentService}.
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

    /** Builds a new instance of {@link CommandmentService}. */
    @Override
    public CommandmentService build() {
      return new CommandmentService(this);
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
     * Set the {@link CommandmentServiceRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCommandmentServiceRequestInitializer(
        CommandmentServiceRequestInitializer commandmentserviceRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(commandmentserviceRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
