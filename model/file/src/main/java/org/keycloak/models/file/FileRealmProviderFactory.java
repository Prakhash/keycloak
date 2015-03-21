/*
 * Copyright 2015 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.keycloak.models.file;

import org.keycloak.Config;
import org.keycloak.connections.file.FileConnectionProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.models.RealmProvider;
import org.keycloak.models.RealmProviderFactory;


/**
 * RealmProviderFactory for JSON persistence.
 *
 * @author Stan Silvert ssilvert@redhat.com (C) 2015 Red Hat Inc.
 */
public class FileRealmProviderFactory implements RealmProviderFactory {

    @Override
    public void init(Config.Scope config) {

    }

    @Override
    public String getId() {
        return "file";
    }

    @Override
    public RealmProvider create(KeycloakSession session) {
        FileConnectionProvider fcProvider = session.getProvider(FileConnectionProvider.class);
        return new FileRealmProvider(session, fcProvider);
    }

    @Override
    public void close() {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

}
