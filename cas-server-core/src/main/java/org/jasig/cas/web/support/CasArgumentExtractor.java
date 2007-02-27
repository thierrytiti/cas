/*
 * Copyright 2005 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.ja-sig.org/products/cas/overview/license/
 */
package org.jasig.cas.web.support;

import javax.servlet.http.HttpServletRequest;

import org.jasig.cas.authentication.principal.SimpleWebApplicationServiceImpl;
import org.jasig.cas.authentication.principal.WebApplicationService;

/**
 * Implements the traditional CAS2 protocol.
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.1
 */
public final class CasArgumentExtractor extends AbstractArgumentExtractor {

    public final WebApplicationService extractService(final HttpServletRequest request) {
        return SimpleWebApplicationServiceImpl.createServiceFrom(request);
    }

    protected String getArtifactParameterName() {
        return SimpleWebApplicationServiceImpl.getArtifactParameterName();
    }
}
