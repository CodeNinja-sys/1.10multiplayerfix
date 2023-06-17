/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.servlet.ServletContext
 */
package org.apache.logging.log4j.core.h;

import javax.servlet.ServletContext;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.core.e.a;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.g;
import org.apache.logging.log4j.core.k;

public class q
implements g {
    private static final String a = "attr.";
    private static final String b = "initParam.";

    protected ServletContext a() {
        k k2 = (k)org.apache.logging.log4j.core.e.a.a.get();
        if (k2 == null) {
            k2 = (k)c.a(false);
        }
        if (k2 != null) {
            Object object = k2.c();
            return object != null && object instanceof ServletContext ? (ServletContext)object : null;
        }
        return null;
    }

    @Override
    public String a(String string) {
        ServletContext servletContext = this.a();
        if (servletContext == null) {
            return null;
        }
        if (string.startsWith(a)) {
            String string2 = string.substring(a.length());
            Object object = servletContext.getAttribute(string2);
            return object == null ? null : object.toString();
        }
        if (string.startsWith(b)) {
            String string3 = string.substring(b.length());
            return servletContext.getInitParameter(string3);
        }
        if ("rootDir".equals(string)) {
            String string4 = servletContext.getRealPath("/");
            if (string4 == null) {
                String string5 = "failed to resolve web:rootDir -- servlet container unable to translate virtual path  to real path (probably not deployed as exploded";
                throw new RuntimeException(string5);
            }
            return string4;
        }
        if ("contextPath".equals(string)) {
            return servletContext.getContextPath();
        }
        if ("servletContextName".equals(string)) {
            return servletContext.getServletContextName();
        }
        if ("serverInfo".equals(string)) {
            return servletContext.getServerInfo();
        }
        if ("effectiveMajorVersion".equals(string)) {
            return String.valueOf(servletContext.getEffectiveMajorVersion());
        }
        if ("effectiveMinorVersion".equals(string)) {
            return String.valueOf(servletContext.getEffectiveMinorVersion());
        }
        if ("majorVersion".equals(string)) {
            return String.valueOf(servletContext.getMajorVersion());
        }
        if ("minorVersion".equals(string)) {
            return String.valueOf(servletContext.getMinorVersion());
        }
        if (servletContext.getAttribute(string) != null) {
            return servletContext.getAttribute(string).toString();
        }
        if (servletContext.getInitParameter(string) != null) {
            return servletContext.getInitParameter(string);
        }
        servletContext.log(this.getClass().getName() + " unable to resolve key '" + string + "'");
        return null;
    }

    @Override
    public String a(h h2, String string) {
        return this.a(string);
    }
}

