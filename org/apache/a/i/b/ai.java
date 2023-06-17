/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.Closeable;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.apache.a.b;
import org.apache.a.c.e.f;
import org.apache.a.c.e.j;
import org.apache.a.c.e.q;
import org.apache.a.c.g;
import org.apache.a.c.s;
import org.apache.a.f.b.d;
import org.apache.a.f.o;
import org.apache.a.f.x;
import org.apache.a.i.a.ae;
import org.apache.a.i.a.c;
import org.apache.a.i.a.e;
import org.apache.a.i.b.ab;
import org.apache.a.i.b.am;
import org.apache.a.i.b.ar;
import org.apache.a.i.b.at;
import org.apache.a.i.b.ba;
import org.apache.a.i.b.bc;
import org.apache.a.i.b.h;
import org.apache.a.i.b.m;
import org.apache.a.i.b.t;
import org.apache.a.i.c.al;
import org.apache.a.i.c.ax;
import org.apache.a.i.c.u;
import org.apache.a.i.d.aa;
import org.apache.a.i.d.af;
import org.apache.a.i.f.a;
import org.apache.a.i.f.n;
import org.apache.a.i.i;
import org.apache.a.i.p;
import org.apache.a.n.k;
import org.apache.a.n.l;
import org.apache.a.r;
import org.apache.a.w;
import org.apache.a.z;

public class ai {
    private org.apache.a.n.m b;
    private org.apache.a.f.e.p c;
    private org.apache.a.f.d.b d;
    private SSLContext e;
    private o f;
    private x g;
    private b h;
    private org.apache.a.f.h i;
    private org.apache.a.c.c j;
    private org.apache.a.c.c k;
    private org.apache.a.c.t l;
    private k m;
    private LinkedList n;
    private LinkedList o;
    private LinkedList p;
    private LinkedList q;
    private org.apache.a.c.k r;
    private d s;
    private org.apache.a.c.p t;
    private g u;
    private org.apache.a.c.d v;
    private s w;
    private org.apache.a.e.c x;
    private org.apache.a.e.c y;
    private org.apache.a.c.h z;
    private org.apache.a.c.i A;
    private String B;
    private r C;
    private Collection D;
    private org.apache.a.e.h E;
    private org.apache.a.e.a F;
    private org.apache.a.c.a.c G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int O = 0;
    private int P = 0;
    private List Q;
    static final String a;

    public static ai a() {
        return new ai();
    }

    protected ai() {
    }

    public final ai a(org.apache.a.n.m m2) {
        this.b = m2;
        return this;
    }

    public final ai a(org.apache.a.f.e.p p2) {
        this.c = p2;
        return this;
    }

    public final ai a(SSLContext sSLContext) {
        this.e = sSLContext;
        return this;
    }

    public final ai a(org.apache.a.f.d.b b2) {
        this.d = b2;
        return this;
    }

    public final ai a(int n2) {
        this.O = n2;
        return this;
    }

    public final ai b(int n2) {
        this.P = n2;
        return this;
    }

    public final ai a(org.apache.a.e.h h2) {
        this.E = h2;
        return this;
    }

    public final ai a(org.apache.a.e.a a2) {
        this.F = a2;
        return this;
    }

    public final ai a(o o2) {
        this.f = o2;
        return this;
    }

    public final ai a(b b2) {
        this.h = b2;
        return this;
    }

    public final ai a(org.apache.a.f.h h2) {
        this.i = h2;
        return this;
    }

    public final ai a(org.apache.a.c.c c2) {
        this.j = c2;
        return this;
    }

    public final ai b(org.apache.a.c.c c2) {
        this.k = c2;
        return this;
    }

    public final ai a(org.apache.a.c.t t2) {
        this.l = t2;
        return this;
    }

    public final ai b() {
        this.N = true;
        return this;
    }

    public final ai a(x x2) {
        this.g = x2;
        return this;
    }

    public final ai a(String string) {
        this.B = string;
        return this;
    }

    public final ai a(Collection collection) {
        this.D = collection;
        return this;
    }

    public final ai a(z z2) {
        if (z2 == null) {
            return this;
        }
        if (this.p == null) {
            this.p = new LinkedList();
        }
        this.p.addFirst(z2);
        return this;
    }

    public final ai b(z z2) {
        if (z2 == null) {
            return this;
        }
        if (this.q == null) {
            this.q = new LinkedList();
        }
        this.q.addLast(z2);
        return this;
    }

    public final ai a(w w2) {
        if (w2 == null) {
            return this;
        }
        if (this.n == null) {
            this.n = new LinkedList();
        }
        this.n.addFirst(w2);
        return this;
    }

    public final ai b(w w2) {
        if (w2 == null) {
            return this;
        }
        if (this.o == null) {
            this.o = new LinkedList();
        }
        this.o.addLast(w2);
        return this;
    }

    public final ai c() {
        this.L = true;
        return this;
    }

    public final ai d() {
        this.K = true;
        return this;
    }

    public final ai e() {
        this.M = true;
        return this;
    }

    public final ai a(k k2) {
        this.m = k2;
        return this;
    }

    public final ai a(org.apache.a.c.k k2) {
        this.r = k2;
        return this;
    }

    public final ai f() {
        this.J = true;
        return this;
    }

    public final ai a(r r2) {
        this.C = r2;
        return this;
    }

    public final ai a(d d2) {
        this.s = d2;
        return this;
    }

    public final ai a(org.apache.a.c.p p2) {
        this.t = p2;
        return this;
    }

    public final ai g() {
        this.I = true;
        return this;
    }

    public final ai a(g g2) {
        this.u = g2;
        return this;
    }

    public final ai a(org.apache.a.c.d d2) {
        this.v = d2;
        return this;
    }

    public final ai a(s s2) {
        this.w = s2;
        return this;
    }

    public final ai a(org.apache.a.c.h h2) {
        this.z = h2;
        return this;
    }

    public final ai a(org.apache.a.c.i i2) {
        this.A = i2;
        return this;
    }

    public final ai a(org.apache.a.e.c c2) {
        this.x = c2;
        return this;
    }

    public final ai b(org.apache.a.e.c c2) {
        this.y = c2;
        return this;
    }

    public final ai a(org.apache.a.c.a.c c2) {
        this.G = c2;
        return this;
    }

    public final ai h() {
        this.H = true;
        return this;
    }

    protected org.apache.a.i.f.b a(org.apache.a.i.f.b b2) {
        return b2;
    }

    protected org.apache.a.i.f.b b(org.apache.a.i.f.b b2) {
        return b2;
    }

    protected void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        if (this.Q == null) {
            this.Q = new ArrayList();
        }
        this.Q.add(closeable);
    }

    private static String[] b(String string) {
        if (org.apache.a.o.k.b(string)) {
            return null;
        }
        return string.split(" *, *");
    }

    public m i() {
        org.apache.a.c.i i2;
        org.apache.a.c.h h2;
        org.apache.a.e.c c2;
        org.apache.a.e.c c3;
        Object object8;
        Object object2;
        Object object3;
        org.apache.a.c.t t2;
        org.apache.a.c.c c4;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        org.apache.a.n.m m2 = this.b;
        if (m2 == null) {
            m2 = new org.apache.a.n.m();
        }
        if ((object7 = this.f) == null) {
            object6 = this.d;
            if (object6 == null) {
                object5 = this.H ? ai.b(System.getProperty("https.protocols")) : null;
                object4 = this.H ? ai.b(System.getProperty("https.cipherSuites")) : null;
                org.apache.a.f.e.p p2 = this.c;
                if (p2 == null) {
                    p2 = org.apache.a.f.e.f.e;
                }
                object6 = this.e != null ? new org.apache.a.f.e.f(this.e, (String[])object5, (String[])object4, p2) : (this.H ? new org.apache.a.f.e.f((SSLSocketFactory)SSLSocketFactory.getDefault(), (String[])object5, (String[])object4, p2) : new org.apache.a.f.e.f(org.apache.a.f.e.j.a(), p2));
            }
            object5 = new al(org.apache.a.e.g.a().a("http", org.apache.a.f.d.c.a()).a("https", object6).b());
            if (this.E != null) {
                ((al)object5).a(this.E);
            }
            if (this.F != null) {
                ((al)object5).a(this.F);
            }
            if (this.H && "true".equalsIgnoreCase((String)(object4 = System.getProperty("http.keepAlive", "true")))) {
                object4 = System.getProperty("http.maxConnections", "5");
                int n2 = Integer.parseInt((String)object4);
                ((al)object5).b(n2);
                ((al)object5).a(2 * n2);
            }
            if (this.O > 0) {
                ((al)object5).a(this.O);
            }
            if (this.P > 0) {
                ((al)object5).b(this.P);
            }
            object7 = object5;
        }
        if ((object6 = this.h) == null) {
            object6 = this.H ? ("true".equalsIgnoreCase((String)(object5 = System.getProperty("http.keepAlive", "true"))) ? org.apache.a.i.i.a : org.apache.a.i.p.a) : org.apache.a.i.i.a;
        }
        if ((object5 = this.i) == null) {
            object5 = org.apache.a.i.b.r.a;
        }
        if ((object4 = this.j) == null) {
            object4 = bc.a;
        }
        if ((c4 = this.k) == null) {
            c4 = at.a;
        }
        if ((t2 = this.l) == null) {
            t2 = !this.N ? ab.a : ar.a;
        }
        org.apache.a.i.f.b b2 = new org.apache.a.i.f.d(m2, (o)object7, (b)object6, (org.apache.a.f.h)object5, (org.apache.a.c.c)object4, c4, t2);
        b2 = this.a(b2);
        k k2 = this.m;
        if (k2 == null) {
            object3 = this.B;
            if (object3 == null) {
                if (this.H) {
                    object3 = System.getProperty("http.agent");
                }
                if (object3 == null) {
                    object3 = a;
                }
            }
            object2 = org.apache.a.n.l.a();
            if (this.n != null) {
                for (Object object8 : this.n) {
                    ((l)object2).a((w)object8);
                }
            }
            if (this.p != null) {
                for (Object object8 : this.p) {
                    ((l)object2).a((z)object8);
                }
            }
            ((l)object2).c(new j(this.D), new org.apache.a.n.x(), new org.apache.a.n.aa(), new org.apache.a.c.e.i(), new org.apache.a.n.ab((String)object3), new org.apache.a.c.e.k());
            if (!this.L) {
                ((l)object2).c((w)new org.apache.a.c.e.e());
            }
            if (!this.K) {
                ((l)object2).c((w)new org.apache.a.c.e.d());
            }
            if (!this.M) {
                ((l)object2).c((w)new f());
            }
            if (!this.L) {
                ((l)object2).c((z)new q());
            }
            if (!this.K) {
                ((l)object2).c((z)new org.apache.a.c.e.p());
            }
            if (this.o != null) {
                for (Object object8 : this.o) {
                    ((l)object2).b((w)object8);
                }
            }
            if (this.q != null) {
                for (Object object8 : this.q) {
                    ((l)object2).b((z)object8);
                }
            }
            k2 = ((l)object2).b();
        }
        b2 = new org.apache.a.i.f.f(b2, k2);
        b2 = this.b(b2);
        if (!this.J) {
            object3 = this.r;
            if (object3 == null) {
                object3 = org.apache.a.i.b.t.a;
            }
            b2 = new org.apache.a.i.f.m(b2, (org.apache.a.c.k)object3);
        }
        if ((object3 = this.s) == null) {
            object2 = this.g;
            if (object2 == null) {
                object2 = org.apache.a.i.c.u.a;
            }
            object3 = this.C != null ? new org.apache.a.i.c.r(this.C, (x)object2) : (this.H ? new ax((x)object2, ProxySelector.getDefault()) : new org.apache.a.i.c.t((x)object2));
        }
        if (!this.I) {
            object2 = this.t;
            if (object2 == null) {
                object2 = org.apache.a.i.b.w.b;
            }
            b2 = new org.apache.a.i.f.h(b2, (d)object3, (org.apache.a.c.p)object2);
        }
        if ((object2 = this.w) != null) {
            b2 = new n(b2, (s)object2);
        }
        Iterator iterator = this.v;
        object8 = this.u;
        if (iterator != null && object8 != null) {
            b2 = new a(b2, (g)object8, (org.apache.a.c.d)((Object)iterator));
        }
        if ((c3 = this.x) == null) {
            c3 = org.apache.a.e.g.a().a("Basic", new c()).a("Digest", new e()).a("NTLM", new org.apache.a.i.a.z()).a("negotiate", new ae()).a("Kerberos", new org.apache.a.i.a.m()).b();
        }
        if ((c2 = this.y) == null) {
            c2 = org.apache.a.e.g.a().a("best-match", new org.apache.a.i.d.l()).a("standard", new org.apache.a.i.d.am()).a("compatibility", new org.apache.a.i.d.p()).a("netscape", new aa()).a("ignoreCookies", new org.apache.a.i.d.w()).a("rfc2109", new af()).a("rfc2965", new org.apache.a.i.d.am()).b();
        }
        if ((h2 = this.z) == null) {
            h2 = new h();
        }
        if ((i2 = this.A) == null) {
            i2 = this.H ? new ba() : new org.apache.a.i.b.i();
        }
        return new am(b2, (o)object7, (d)object3, c2, c3, h2, i2, this.G != null ? this.G : org.apache.a.c.a.c.a, this.Q != null ? new ArrayList(this.Q) : null);
    }

    static {
        org.apache.a.o.l l2 = org.apache.a.o.l.a("org.apache.http.client", ai.class.getClassLoader());
        String string = l2 != null ? l2.c() : "UNAVAILABLE";
        a = "Apache-HttpClient/" + string + " (java 1.5)";
    }
}

