/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.b.o;
import org.apache.a.b.r;
import org.apache.a.b.t;
import org.apache.a.i.b.i;
import org.apache.a.o.a;

public class ba
implements org.apache.a.c.i {
    private static final Map a = new ConcurrentHashMap();
    private final i b = new i();

    private static String a(String string) {
        if (string == null) {
            return null;
        }
        String string2 = (String)a.get(string);
        return string2 != null ? string2 : string;
    }

    public void a(org.apache.a.b.i i2, o o2) {
        this.b.a(i2, o2);
    }

    private static PasswordAuthentication a(org.apache.a.b.i i2, Authenticator.RequestorType requestorType) {
        String string = i2.a();
        int n2 = i2.b();
        String string2 = n2 == 443 ? "https" : "http";
        return Authenticator.requestPasswordAuthentication(string, null, n2, string2, null, ba.a(i2.d()), null, requestorType);
    }

    public o a(org.apache.a.b.i i2) {
        org.apache.a.o.a.a(i2, "Auth scope");
        o o2 = this.b.a(i2);
        if (o2 != null) {
            return o2;
        }
        if (i2.a() != null) {
            PasswordAuthentication passwordAuthentication = ba.a(i2, Authenticator.RequestorType.SERVER);
            if (passwordAuthentication == null) {
                passwordAuthentication = ba.a(i2, Authenticator.RequestorType.PROXY);
            }
            if (passwordAuthentication != null) {
                String string = System.getProperty("http.auth.ntlm.domain");
                if (string != null) {
                    return new r(passwordAuthentication.getUserName(), new String(passwordAuthentication.getPassword()), null, string);
                }
                if ("NTLM".equalsIgnoreCase(i2.d())) {
                    return new r(passwordAuthentication.getUserName(), new String(passwordAuthentication.getPassword()), null, null);
                }
                return new t(passwordAuthentication.getUserName(), new String(passwordAuthentication.getPassword()));
            }
        }
        return null;
    }

    public void a() {
        this.b.a();
    }

    static {
        a.put("Basic".toUpperCase(Locale.ENGLISH), "Basic");
        a.put("Digest".toUpperCase(Locale.ENGLISH), "Digest");
        a.put("NTLM".toUpperCase(Locale.ENGLISH), "NTLM");
        a.put("negotiate".toUpperCase(Locale.ENGLISH), "SPNEGO");
        a.put("Kerberos".toUpperCase(Locale.ENGLISH), "Kerberos");
    }
}

