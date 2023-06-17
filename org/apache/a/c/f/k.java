/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.a.c.f.j;
import org.apache.a.o.a;
import org.apache.a.r;

public class k {
    public static URI a(String string, String string2, int n2, String string3, String string4, String string5) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string2 != null) {
            if (string != null) {
                stringBuilder.append(string);
                stringBuilder.append("://");
            }
            stringBuilder.append(string2);
            if (n2 > 0) {
                stringBuilder.append(':');
                stringBuilder.append(n2);
            }
        }
        if (string3 == null || !string3.startsWith("/")) {
            stringBuilder.append('/');
        }
        if (string3 != null) {
            stringBuilder.append(string3);
        }
        if (string4 != null) {
            stringBuilder.append('?');
            stringBuilder.append(string4);
        }
        if (string5 != null) {
            stringBuilder.append('#');
            stringBuilder.append(string5);
        }
        return new URI(stringBuilder.toString());
    }

    public static URI a(URI uRI, r r2, boolean bl2) {
        a.a(uRI, "URI");
        if (uRI.isOpaque()) {
            return uRI;
        }
        j j2 = new j(uRI);
        if (r2 != null) {
            j2.a(r2.c());
            j2.c(r2.a());
            j2.a(r2.b());
        } else {
            j2.a((String)null);
            j2.c((String)null);
            j2.a(-1);
        }
        if (bl2) {
            j2.g(null);
        }
        if (org.apache.a.o.k.a(j2.j())) {
            j2.d("/");
        }
        return j2.a();
    }

    public static URI a(URI uRI, r r2) {
        return k.a(uRI, r2, false);
    }

    public static URI a(URI uRI) {
        a.a(uRI, "URI");
        if (uRI.isOpaque()) {
            return uRI;
        }
        j j2 = new j(uRI);
        if (j2.g() != null) {
            j2.b((String)null);
        }
        if (org.apache.a.o.k.a(j2.j())) {
            j2.d("/");
        }
        if (j2.h() != null) {
            j2.c(j2.h().toLowerCase(Locale.ENGLISH));
        }
        j2.g(null);
        return j2.a();
    }

    public static URI a(URI uRI, String string) {
        return k.a(uRI, URI.create(string));
    }

    public static URI a(URI uRI, URI uRI2) {
        boolean bl2;
        a.a(uRI, "Base URI");
        a.a(uRI2, "Reference URI");
        URI uRI3 = uRI2;
        String string = uRI3.toString();
        if (string.startsWith("?")) {
            return k.b(uRI, uRI3);
        }
        boolean bl3 = bl2 = string.length() == 0;
        if (bl2) {
            uRI3 = URI.create("#");
        }
        URI uRI4 = uRI.resolve(uRI3);
        if (bl2) {
            String string2 = uRI4.toString();
            uRI4 = URI.create(string2.substring(0, string2.indexOf(35)));
        }
        return k.c(uRI4);
    }

    private static URI b(URI uRI, URI uRI2) {
        String string = uRI.toString();
        string = string.indexOf(63) > -1 ? string.substring(0, string.indexOf(63)) : string;
        return URI.create(string + uRI2.toString());
    }

    private static URI c(URI uRI) {
        if (uRI.isOpaque() || uRI.getAuthority() == null) {
            return uRI;
        }
        a.a(uRI.isAbsolute(), "Base URI must be absolute");
        String string = uRI.getPath() == null ? "" : uRI.getPath();
        String[] arrstring = string.split("/");
        Stack<String> stack = new Stack<String>();
        for (String object : arrstring) {
            if (object.length() == 0 || ".".equals(object)) continue;
            if ("..".equals(object)) {
                if (stack.isEmpty()) continue;
                stack.pop();
                continue;
            }
            stack.push(object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : stack) {
            stringBuilder.append('/').append(string2);
        }
        if (string.lastIndexOf(47) == string.length() - 1) {
            stringBuilder.append('/');
        }
        try {
            String string3 = uRI.getScheme().toLowerCase();
            String string4 = uRI.getAuthority().toLowerCase();
            URI uRI2 = new URI(string3, string4, stringBuilder.toString(), null, null);
            if (uRI.getQuery() == null && uRI.getFragment() == null) {
                return uRI2;
            }
            StringBuilder stringBuilder2 = new StringBuilder(uRI2.toASCIIString());
            if (uRI.getQuery() != null) {
                stringBuilder2.append('?').append(uRI.getRawQuery());
            }
            if (uRI.getFragment() != null) {
                stringBuilder2.append('#').append(uRI.getRawFragment());
            }
            return URI.create(stringBuilder2.toString());
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new IllegalArgumentException(uRISyntaxException);
        }
    }

    public static r b(URI uRI) {
        if (uRI == null) {
            return null;
        }
        r r2 = null;
        if (uRI.isAbsolute()) {
            int n2 = uRI.getPort();
            String string = uRI.getHost();
            if (string == null && (string = uRI.getAuthority()) != null) {
                int n3;
                int n4 = string.indexOf(64);
                if (n4 >= 0) {
                    string = string.length() > n4 + 1 ? string.substring(n4 + 1) : null;
                }
                if (string != null && (n3 = string.indexOf(58)) >= 0) {
                    int n5 = n3 + 1;
                    int n6 = 0;
                    for (int i2 = n5; i2 < string.length() && Character.isDigit(string.charAt(i2)); ++i2) {
                        ++n6;
                    }
                    if (n6 > 0) {
                        try {
                            n2 = Integer.parseInt(string.substring(n5, n5 + n6));
                        }
                        catch (NumberFormatException numberFormatException) {
                            // empty catch block
                        }
                    }
                    string = string.substring(0, n3);
                }
            }
            String string2 = uRI.getScheme();
            if (string != null) {
                r2 = new r(string, n2, string2);
            }
        }
        return r2;
    }

    public static URI a(URI uRI, r r2, List list) {
        j j2;
        a.a(uRI, "Request URI");
        if (list == null || list.isEmpty()) {
            j2 = new j(uRI);
        } else {
            j2 = new j((URI)list.get(list.size() - 1));
            String string = j2.l();
            for (int i2 = list.size() - 1; string == null && i2 >= 0; --i2) {
                string = ((URI)list.get(i2)).getFragment();
            }
            j2.g(string);
        }
        if (j2.l() == null) {
            j2.g(uRI.getFragment());
        }
        if (r2 != null && !j2.d()) {
            j2.a(r2.c());
            j2.c(r2.a());
            j2.a(r2.b());
        }
        return j2.a();
    }

    private k() {
    }
}

