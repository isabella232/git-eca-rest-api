/*******************************************************************************
 * Copyright (C) 2020 Eclipse Foundation
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package org.eclipsefoundation.git.eca.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipsefoundation.git.eca.model.EclipseUser;

/**
 * Binding interface for the Eclipse Foundation user account API. Runtime
 * implementations are automatically generated by Quarkus at compile time. As
 * the API deals with sensitive information, authentication is required to
 * access this endpoint.
 * 
 * @author Martin Lowe
 *
 */
@Path("/account")
@RegisterRestClient
public interface AccountsAPI {

	/**
	 * Retrieves all user objects that match the given query parameters.
	 * 
	 * @param id   user ID of the Eclipse account to retrieve
	 * @param name the given name to match against for Eclipse accounts
	 * @param mail the email address to match against for Eclipse accounts
	 * @return all matching eclipse accounts
	 */
	@GET
	@Path("/profile")
	@Produces("application/json")
	List<EclipseUser> getUsers(@HeaderParam("Authorization") String authBearer, @QueryParam("uid") String id,
			@QueryParam("name") String name, @QueryParam("mail") String mail);
}
