/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.servlet.DispatcherType
 *  javax.servlet.Filter
 *  javax.servlet.FilterRegistration$Dynamic
 *  javax.servlet.ServletContainerInitializer
 *  javax.servlet.ServletContext
 *  javax.servlet.UnavailableException
 */
package org.apache.logging.log4j.core.k;

import java.util.EnumSet;
import java.util.EventListener;
import java.util.Set;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.UnavailableException;
import org.apache.logging.log4j.core.k.b;
import org.apache.logging.log4j.core.k.c;
import org.apache.logging.log4j.core.k.d;
import org.apache.logging.log4j.core.k.e;

public class a
implements ServletContainerInitializer {
    public void a(Set set, ServletContext servletContext) {
        if (servletContext.getMajorVersion() > 2) {
            servletContext.log("Log4jServletContainerInitializer starting up Log4j in Servlet 3.0+ environment.");
            d d2 = e.a(servletContext);
            d2.a();
            d2.c();
            servletContext.addListener((EventListener)((Object)new b()));
            FilterRegistration.Dynamic dynamic = servletContext.addFilter("log4jServletFilter", (Filter)new c());
            if (dynamic == null) {
                throw new UnavailableException("In a Servlet 3.0+ application, you must not define a log4jServletFilter in web.xml. Log4j 2 defines this for you automatically.");
            }
            dynamic.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), false, new String[]{"/*"});
        }
    }
}

