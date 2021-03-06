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
 * on 2015-03-31 at 05:14:13 UTC 
 * Modify at your own risk.
 */

package com.virtualef.pgj.service.agentService;

/**
 * Service definition for AgentService (v1).
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
 * This service uses {@link AgentServiceRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class AgentService extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the agentService library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "agentService/v1/";

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
  public AgentService(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  AgentService(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getAgent".
   *
   * This request holds the parameters needed by the agentService server.  After setting any optional
   * parameters, call the {@link GetAgent#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetAgent getAgent(java.lang.Long id) throws java.io.IOException {
    GetAgent result = new GetAgent(id);
    initialize(result);
    return result;
  }

  public class GetAgent extends AgentServiceRequest<com.virtualef.pgj.service.agentService.model.AgentDto> {

    private static final String REST_PATH = "agentdto/{id}";

    /**
     * Create a request for the method "getAgent".
     *
     * This request holds the parameters needed by the the agentService server.  After setting any
     * optional parameters, call the {@link GetAgent#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetAgent#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetAgent(java.lang.Long id) {
      super(AgentService.this, "GET", REST_PATH, null, com.virtualef.pgj.service.agentService.model.AgentDto.class);
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
    public GetAgent setAlt(java.lang.String alt) {
      return (GetAgent) super.setAlt(alt);
    }

    @Override
    public GetAgent setFields(java.lang.String fields) {
      return (GetAgent) super.setFields(fields);
    }

    @Override
    public GetAgent setKey(java.lang.String key) {
      return (GetAgent) super.setKey(key);
    }

    @Override
    public GetAgent setOauthToken(java.lang.String oauthToken) {
      return (GetAgent) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAgent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAgent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAgent setQuotaUser(java.lang.String quotaUser) {
      return (GetAgent) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAgent setUserIp(java.lang.String userIp) {
      return (GetAgent) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetAgent setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetAgent set(String parameterName, Object value) {
      return (GetAgent) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getAgentByAlias".
   *
   * This request holds the parameters needed by the agentService server.  After setting any optional
   * parameters, call the {@link GetAgentByAlias#execute()} method to invoke the remote operation.
   *
   * @param alias
   * @param aliasP
   * @return the request
   */
  public GetAgentByAlias getAgentByAlias(java.lang.String alias, java.lang.String aliasP) throws java.io.IOException {
    GetAgentByAlias result = new GetAgentByAlias(alias, aliasP);
    initialize(result);
    return result;
  }

  public class GetAgentByAlias extends AgentServiceRequest<com.virtualef.pgj.service.agentService.model.AgentDto> {

    private static final String REST_PATH = "agentdto/{alias}/{aliasP}";

    /**
     * Create a request for the method "getAgentByAlias".
     *
     * This request holds the parameters needed by the the agentService server.  After setting any
     * optional parameters, call the {@link GetAgentByAlias#execute()} method to invoke the remote
     * operation. <p> {@link GetAgentByAlias#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param alias
     * @param aliasP
     * @since 1.13
     */
    protected GetAgentByAlias(java.lang.String alias, java.lang.String aliasP) {
      super(AgentService.this, "GET", REST_PATH, null, com.virtualef.pgj.service.agentService.model.AgentDto.class);
      this.alias = com.google.api.client.util.Preconditions.checkNotNull(alias, "Required parameter alias must be specified.");
      this.aliasP = com.google.api.client.util.Preconditions.checkNotNull(aliasP, "Required parameter aliasP must be specified.");
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
    public GetAgentByAlias setAlt(java.lang.String alt) {
      return (GetAgentByAlias) super.setAlt(alt);
    }

    @Override
    public GetAgentByAlias setFields(java.lang.String fields) {
      return (GetAgentByAlias) super.setFields(fields);
    }

    @Override
    public GetAgentByAlias setKey(java.lang.String key) {
      return (GetAgentByAlias) super.setKey(key);
    }

    @Override
    public GetAgentByAlias setOauthToken(java.lang.String oauthToken) {
      return (GetAgentByAlias) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAgentByAlias setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAgentByAlias) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAgentByAlias setQuotaUser(java.lang.String quotaUser) {
      return (GetAgentByAlias) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAgentByAlias setUserIp(java.lang.String userIp) {
      return (GetAgentByAlias) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String alias;

    /**

     */
    public java.lang.String getAlias() {
      return alias;
    }

    public GetAgentByAlias setAlias(java.lang.String alias) {
      this.alias = alias;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String aliasP;

    /**

     */
    public java.lang.String getAliasP() {
      return aliasP;
    }

    public GetAgentByAlias setAliasP(java.lang.String aliasP) {
      this.aliasP = aliasP;
      return this;
    }

    @Override
    public GetAgentByAlias set(String parameterName, Object value) {
      return (GetAgentByAlias) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getAgents".
   *
   * This request holds the parameters needed by the agentService server.  After setting any optional
   * parameters, call the {@link GetAgents#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetAgents getAgents() throws java.io.IOException {
    GetAgents result = new GetAgents();
    initialize(result);
    return result;
  }

  public class GetAgents extends AgentServiceRequest<com.virtualef.pgj.service.agentService.model.CollectionResponseAgentDto> {

    private static final String REST_PATH = "agentdto";

    /**
     * Create a request for the method "getAgents".
     *
     * This request holds the parameters needed by the the agentService server.  After setting any
     * optional parameters, call the {@link GetAgents#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetAgents#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetAgents() {
      super(AgentService.this, "GET", REST_PATH, null, com.virtualef.pgj.service.agentService.model.CollectionResponseAgentDto.class);
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
    public GetAgents setAlt(java.lang.String alt) {
      return (GetAgents) super.setAlt(alt);
    }

    @Override
    public GetAgents setFields(java.lang.String fields) {
      return (GetAgents) super.setFields(fields);
    }

    @Override
    public GetAgents setKey(java.lang.String key) {
      return (GetAgents) super.setKey(key);
    }

    @Override
    public GetAgents setOauthToken(java.lang.String oauthToken) {
      return (GetAgents) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAgents setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAgents) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAgents setQuotaUser(java.lang.String quotaUser) {
      return (GetAgents) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAgents setUserIp(java.lang.String userIp) {
      return (GetAgents) super.setUserIp(userIp);
    }

    @Override
    public GetAgents set(String parameterName, Object value) {
      return (GetAgents) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertAgent".
   *
   * This request holds the parameters needed by the agentService server.  After setting any optional
   * parameters, call the {@link InsertAgent#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.virtualef.pgj.service.agentService.model.AgentDto}
   * @return the request
   */
  public InsertAgent insertAgent(com.virtualef.pgj.service.agentService.model.AgentDto content) throws java.io.IOException {
    InsertAgent result = new InsertAgent(content);
    initialize(result);
    return result;
  }

  public class InsertAgent extends AgentServiceRequest<com.virtualef.pgj.service.agentService.model.AgentDto> {

    private static final String REST_PATH = "agentdto";

    /**
     * Create a request for the method "insertAgent".
     *
     * This request holds the parameters needed by the the agentService server.  After setting any
     * optional parameters, call the {@link InsertAgent#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertAgent#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.virtualef.pgj.service.agentService.model.AgentDto}
     * @since 1.13
     */
    protected InsertAgent(com.virtualef.pgj.service.agentService.model.AgentDto content) {
      super(AgentService.this, "POST", REST_PATH, content, com.virtualef.pgj.service.agentService.model.AgentDto.class);
    }

    @Override
    public InsertAgent setAlt(java.lang.String alt) {
      return (InsertAgent) super.setAlt(alt);
    }

    @Override
    public InsertAgent setFields(java.lang.String fields) {
      return (InsertAgent) super.setFields(fields);
    }

    @Override
    public InsertAgent setKey(java.lang.String key) {
      return (InsertAgent) super.setKey(key);
    }

    @Override
    public InsertAgent setOauthToken(java.lang.String oauthToken) {
      return (InsertAgent) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertAgent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertAgent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertAgent setQuotaUser(java.lang.String quotaUser) {
      return (InsertAgent) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertAgent setUserIp(java.lang.String userIp) {
      return (InsertAgent) super.setUserIp(userIp);
    }

    @Override
    public InsertAgent set(String parameterName, Object value) {
      return (InsertAgent) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeAgent".
   *
   * This request holds the parameters needed by the agentService server.  After setting any optional
   * parameters, call the {@link RemoveAgent#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveAgent removeAgent(java.lang.Long id) throws java.io.IOException {
    RemoveAgent result = new RemoveAgent(id);
    initialize(result);
    return result;
  }

  public class RemoveAgent extends AgentServiceRequest<Void> {

    private static final String REST_PATH = "agentdto/{id}";

    /**
     * Create a request for the method "removeAgent".
     *
     * This request holds the parameters needed by the the agentService server.  After setting any
     * optional parameters, call the {@link RemoveAgent#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveAgent#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveAgent(java.lang.Long id) {
      super(AgentService.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveAgent setAlt(java.lang.String alt) {
      return (RemoveAgent) super.setAlt(alt);
    }

    @Override
    public RemoveAgent setFields(java.lang.String fields) {
      return (RemoveAgent) super.setFields(fields);
    }

    @Override
    public RemoveAgent setKey(java.lang.String key) {
      return (RemoveAgent) super.setKey(key);
    }

    @Override
    public RemoveAgent setOauthToken(java.lang.String oauthToken) {
      return (RemoveAgent) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveAgent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveAgent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveAgent setQuotaUser(java.lang.String quotaUser) {
      return (RemoveAgent) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveAgent setUserIp(java.lang.String userIp) {
      return (RemoveAgent) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveAgent setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveAgent set(String parameterName, Object value) {
      return (RemoveAgent) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updatedAgent".
   *
   * This request holds the parameters needed by the agentService server.  After setting any optional
   * parameters, call the {@link UpdatedAgent#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.virtualef.pgj.service.agentService.model.AgentDto}
   * @return the request
   */
  public UpdatedAgent updatedAgent(com.virtualef.pgj.service.agentService.model.AgentDto content) throws java.io.IOException {
    UpdatedAgent result = new UpdatedAgent(content);
    initialize(result);
    return result;
  }

  public class UpdatedAgent extends AgentServiceRequest<com.virtualef.pgj.service.agentService.model.AgentDto> {

    private static final String REST_PATH = "agentdto";

    /**
     * Create a request for the method "updatedAgent".
     *
     * This request holds the parameters needed by the the agentService server.  After setting any
     * optional parameters, call the {@link UpdatedAgent#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdatedAgent#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.virtualef.pgj.service.agentService.model.AgentDto}
     * @since 1.13
     */
    protected UpdatedAgent(com.virtualef.pgj.service.agentService.model.AgentDto content) {
      super(AgentService.this, "PUT", REST_PATH, content, com.virtualef.pgj.service.agentService.model.AgentDto.class);
    }

    @Override
    public UpdatedAgent setAlt(java.lang.String alt) {
      return (UpdatedAgent) super.setAlt(alt);
    }

    @Override
    public UpdatedAgent setFields(java.lang.String fields) {
      return (UpdatedAgent) super.setFields(fields);
    }

    @Override
    public UpdatedAgent setKey(java.lang.String key) {
      return (UpdatedAgent) super.setKey(key);
    }

    @Override
    public UpdatedAgent setOauthToken(java.lang.String oauthToken) {
      return (UpdatedAgent) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdatedAgent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdatedAgent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdatedAgent setQuotaUser(java.lang.String quotaUser) {
      return (UpdatedAgent) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdatedAgent setUserIp(java.lang.String userIp) {
      return (UpdatedAgent) super.setUserIp(userIp);
    }

    @Override
    public UpdatedAgent set(String parameterName, Object value) {
      return (UpdatedAgent) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link AgentService}.
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

    /** Builds a new instance of {@link AgentService}. */
    @Override
    public AgentService build() {
      return new AgentService(this);
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
     * Set the {@link AgentServiceRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAgentServiceRequestInitializer(
        AgentServiceRequestInitializer agentserviceRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(agentserviceRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
