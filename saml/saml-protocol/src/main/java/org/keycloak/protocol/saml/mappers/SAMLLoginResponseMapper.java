package org.keycloak.protocol.saml.mappers;

import org.keycloak.models.ClientSessionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.ProtocolMapperModel;
import org.keycloak.models.UserSessionModel;
import org.picketlink.identity.federation.saml.v2.protocol.ResponseType;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface SAMLLoginResponseMapper {

    ResponseType transformLoginResponse(ResponseType response, ProtocolMapperModel mappingModel, KeycloakSession session,
                                        UserSessionModel userSession, ClientSessionModel clientSession);
}
