/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lightcouch.CouchDbClient
 *  org.lightcouch.CouchDbProperties
 */
package org.apache.logging.log4j.core.a.a.c.a;

import java.lang.reflect.Method;
import org.apache.logging.log4j.core.a.a.c.a.a;
import org.apache.logging.log4j.core.a.a.c.b;
import org.apache.logging.log4j.core.a.a.c.h;
import org.apache.logging.log4j.core.d.r;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.d;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;

public final class c
implements h {
    private static final int a = 80;
    private static final int b = 443;
    private static final d c = org.apache.logging.log4j.d.d.k();
    private final CouchDbClient d;
    private final String e;

    private c(CouchDbClient couchDbClient, String string) {
        this.d = couchDbClient;
        this.e = "couchDb{ " + string + " }";
    }

    public a b() {
        return new a(this.d);
    }

    @Override
    public String toString() {
        return this.e;
    }

    public static c a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        String string9;
        CouchDbClient couchDbClient;
        if (string7 != null && string7.length() > 0 && string8 != null && string8.length() > 0) {
            try {
                Class<?> class_ = Class.forName(string7);
                Method method = class_.getMethod(string8, new Class[0]);
                Object object = method.invoke(null, new Object[0]);
                if (object instanceof CouchDbClient) {
                    couchDbClient = (CouchDbClient)object;
                    string9 = "uri=" + couchDbClient.getDBUri();
                }
                if (object instanceof CouchDbProperties) {
                    CouchDbProperties couchDbProperties = (CouchDbProperties)object;
                    couchDbClient = new CouchDbClient(couchDbProperties);
                    string9 = "uri=" + couchDbClient.getDBUri() + ", username=" + couchDbProperties.getUsername() + ", passwordHash=" + r.b(string6 + c.class.getName()) + ", maxConnections=" + couchDbProperties.getMaxConnections() + ", connectionTimeout=" + couchDbProperties.getConnectionTimeout() + ", socketTimeout=" + couchDbProperties.getSocketTimeout();
                }
                if (object == null) {
                    c.b("The factory method [{}.{}()] returned null.", string7, string8);
                    return null;
                }
                c.b("The factory method [{}.{}()] returned an unsupported type [{}].", string7, string8, object.getClass().getName());
                return null;
            }
            catch (ClassNotFoundException classNotFoundException) {
                c.b("The factory class [{}] could not be loaded.", string7, classNotFoundException);
                return null;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                c.b("The factory class [{}] does not have a no-arg method named [{}].", string7, string8, noSuchMethodException);
                return null;
            }
            catch (Exception exception) {
                c.b("The factory method [{}.{}()] could not be invoked.", string7, string8, exception);
                return null;
            }
        } else if (string != null && string.length() > 0) {
            if (string2 != null && string2.length() > 0) {
                if (!(string2 = string2.toLowerCase()).equals("http") && !string2.equals("https")) {
                    c.b("Only protocols [http] and [https] are supported, [{}] specified.", string2);
                    return null;
                }
            } else {
                string2 = "http";
                c.f("No protocol specified, using default port [http].");
            }
            int n2 = org.apache.logging.log4j.core.a.a.a(string4, string2.equals("https") ? 443 : 80);
            if (v.a(string3)) {
                string3 = "localhost";
                c.f("No server specified, using default server localhost.");
            }
            if (v.a(string5) || v.a(string6)) {
                c.b("You must provide a username and password for the CouchDB provider.");
                return null;
            }
            couchDbClient = new CouchDbClient(string, false, string2, string3, n2, string5, string6);
            string9 = "uri=" + couchDbClient.getDBUri() + ", username=" + string5 + ", passwordHash=" + r.b(string6 + c.class.getName());
        } else {
            c.b("No factory method was provided so the database name is required.");
            return null;
        }
        return new c(couchDbClient, string9);
    }

    @Override
    public /* synthetic */ b a() {
        return this.b();
    }
}

