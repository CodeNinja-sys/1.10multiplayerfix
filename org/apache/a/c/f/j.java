/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.a.ag;
import org.apache.a.c;
import org.apache.a.c.f.l;
import org.apache.a.f.f.a;
import org.apache.a.k.n;

public class j {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private List k;
    private String l;
    private String m;
    private String n;

    public j() {
        this.g = -1;
    }

    public j(String string) {
        this.a(new URI(string));
    }

    public j(URI uRI) {
        this.a(uRI);
    }

    private List a(String string, Charset charset) {
        if (string != null && string.length() > 0) {
            return org.apache.a.c.f.l.a(string, charset);
        }
        return null;
    }

    public URI a() {
        return new URI(this.m());
    }

    private String m() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append(this.a).append(':');
        }
        if (this.b != null) {
            stringBuilder.append(this.b);
        } else {
            if (this.c != null) {
                stringBuilder.append("//").append(this.c);
            } else if (this.f != null) {
                stringBuilder.append("//");
                if (this.e != null) {
                    stringBuilder.append(this.e).append("@");
                } else if (this.d != null) {
                    stringBuilder.append(this.h(this.d)).append("@");
                }
                if (org.apache.a.f.f.a.e(this.f)) {
                    stringBuilder.append("[").append(this.f).append("]");
                } else {
                    stringBuilder.append(this.f);
                }
                if (this.g >= 0) {
                    stringBuilder.append(":").append(this.g);
                }
            }
            if (this.i != null) {
                stringBuilder.append(org.apache.a.c.f.j.k(this.i));
            } else if (this.h != null) {
                stringBuilder.append(this.i(org.apache.a.c.f.j.k(this.h)));
            }
            if (this.j != null) {
                stringBuilder.append("?").append(this.j);
            } else if (this.k != null) {
                stringBuilder.append("?").append(this.c(this.k));
            } else if (this.l != null) {
                stringBuilder.append("?").append(this.j(this.l));
            }
        }
        if (this.n != null) {
            stringBuilder.append("#").append(this.n);
        } else if (this.m != null) {
            stringBuilder.append("#").append(this.j(this.m));
        }
        return stringBuilder.toString();
    }

    private void a(URI uRI) {
        this.a = uRI.getScheme();
        this.b = uRI.getRawSchemeSpecificPart();
        this.c = uRI.getRawAuthority();
        this.f = uRI.getHost();
        this.g = uRI.getPort();
        this.e = uRI.getRawUserInfo();
        this.d = uRI.getUserInfo();
        this.i = uRI.getRawPath();
        this.h = uRI.getPath();
        this.j = uRI.getRawQuery();
        this.k = this.a(uRI.getRawQuery(), org.apache.a.c.e);
        this.n = uRI.getRawFragment();
        this.m = uRI.getFragment();
    }

    private String h(String string) {
        return org.apache.a.c.f.l.b(string, org.apache.a.c.e);
    }

    private String i(String string) {
        return org.apache.a.c.f.l.d(string, org.apache.a.c.e);
    }

    private String c(List list) {
        return org.apache.a.c.f.l.a((Iterable)list, org.apache.a.c.e);
    }

    private String j(String string) {
        return org.apache.a.c.f.l.c(string, org.apache.a.c.e);
    }

    public j a(String string) {
        this.a = string;
        return this;
    }

    public j b(String string) {
        this.d = string;
        this.b = null;
        this.c = null;
        this.e = null;
        return this;
    }

    public j a(String string, String string2) {
        return this.b(string + ':' + string2);
    }

    public j c(String string) {
        this.f = string;
        this.b = null;
        this.c = null;
        return this;
    }

    public j a(int n2) {
        this.g = n2 < 0 ? -1 : n2;
        this.b = null;
        this.c = null;
        return this;
    }

    public j d(String string) {
        this.h = string;
        this.b = null;
        this.i = null;
        return this;
    }

    public j b() {
        this.k = null;
        this.l = null;
        this.j = null;
        this.b = null;
        return this;
    }

    public j e(String string) {
        this.k = this.a(string, org.apache.a.c.e);
        this.l = null;
        this.j = null;
        this.b = null;
        return this;
    }

    public j a(List list) {
        if (this.k == null) {
            this.k = new ArrayList();
        } else {
            this.k.clear();
        }
        this.k.addAll(list);
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public j b(List list) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.addAll(list);
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public j a(ag ... arrag) {
        if (this.k == null) {
            this.k = new ArrayList();
        } else {
            this.k.clear();
        }
        for (ag ag2 : arrag) {
            this.k.add(ag2);
        }
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public j b(String string, String string2) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(new n(string, string2));
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public j c(String string, String string2) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (!this.k.isEmpty()) {
            Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                ag ag2 = (ag)iterator.next();
                if (!ag2.a().equals(string)) continue;
                iterator.remove();
            }
        }
        this.k.add(new n(string, string2));
        this.j = null;
        this.b = null;
        this.l = null;
        return this;
    }

    public j c() {
        this.k = null;
        this.j = null;
        this.b = null;
        return this;
    }

    public j f(String string) {
        this.l = string;
        this.j = null;
        this.b = null;
        this.k = null;
        return this;
    }

    public j g(String string) {
        this.m = string;
        this.n = null;
        return this;
    }

    public boolean d() {
        return this.a != null;
    }

    public boolean e() {
        return this.h == null;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public List k() {
        if (this.k != null) {
            return new ArrayList(this.k);
        }
        return new ArrayList();
    }

    public String l() {
        return this.m;
    }

    public String toString() {
        return this.m();
    }

    private static String k(String string) {
        int n2;
        String string2 = string;
        if (string2 == null) {
            return null;
        }
        for (n2 = 0; n2 < string2.length() && string2.charAt(n2) == '/'; ++n2) {
        }
        if (n2 > 1) {
            string2 = string2.substring(n2 - 1);
        }
        return string2;
    }
}

