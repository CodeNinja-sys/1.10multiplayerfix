/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.b.aa;
import io.netty.c.a.d.b.ab;
import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.ae;
import io.netty.c.a.d.b.d;
import io.netty.c.a.d.b.f;
import io.netty.c.a.d.b.i;
import io.netty.c.a.d.b.j;
import io.netty.c.a.d.b.k;
import io.netty.c.a.d.b.o;
import io.netty.c.a.d.b.y;
import io.netty.c.a.d.b.z;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.v;
import io.netty.c.d.b;
import io.netty.channel.bd;
import io.netty.util.c.ag;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;

public class w
implements b {
    private static final Map d = new HashMap();
    private final k e;
    private final bj f;
    private final Charset g;
    private boolean h;
    private final List i;
    final List a;
    private final boolean j;
    String b;
    String c;
    private boolean k;
    private final y l;
    private boolean m;
    private boolean n;
    private i o;
    private boolean p;
    private long q;
    private ListIterator r;
    private g s;
    private ac t;
    private boolean u = true;

    public w(bj bj2, boolean bl2) {
        this(new f(16384L), bj2, bl2, io.netty.c.a.d.ac.j, y.a);
    }

    public w(k k2, bj bj2, boolean bl2) {
        this(k2, bj2, bl2, io.netty.c.a.d.ac.j, y.a);
    }

    public w(k k2, bj bj2, boolean bl2, Charset charset, y y2) {
        if (k2 == null) {
            throw new NullPointerException("factory");
        }
        if (bj2 == null) {
            throw new NullPointerException("request");
        }
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        if (bj2.s() != aw.d) {
            throw new z("Cannot create a Encoder if not a POST");
        }
        this.f = bj2;
        this.g = charset;
        this.e = k2;
        this.i = new ArrayList();
        this.m = false;
        this.n = false;
        this.j = bl2;
        this.a = new ArrayList();
        this.l = y2;
        if (this.j) {
            this.h();
        }
    }

    public void c() {
        this.e.a(this.f);
    }

    public boolean d() {
        return this.j;
    }

    private void h() {
        this.b = w.j();
    }

    private void i() {
        this.c = w.j();
    }

    private static String j() {
        return Long.toHexString(ag.b().nextLong()).toLowerCase();
    }

    public List e() {
        return this.i;
    }

    public void a(List list) {
        if (list == null) {
            throw new NullPointerException("datas");
        }
        this.q = 0L;
        this.i.clear();
        this.o = null;
        this.p = false;
        this.a.clear();
        for (ac ac2 : list) {
            this.a(ac2);
        }
    }

    public void a(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        d d2 = this.e.a(this.f, string, string3);
        this.a(d2);
    }

    public void a(String string, File file, String string2, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        if (file == null) {
            throw new NullPointerException("file");
        }
        String string3 = string2;
        String string4 = null;
        if (string2 == null) {
            string3 = bl2 ? "text/plain" : "application/octet-stream";
        }
        if (!bl2) {
            string4 = io.netty.c.a.d.b.o.c.a();
        }
        i i2 = this.e.a(this.f, string, file.getName(), string3, string4, null, file.length());
        try {
            i2.a(file);
        }
        catch (IOException iOException) {
            throw new z(iOException);
        }
        this.a(i2);
    }

    public void a(String string, File[] arrfile, String[] arrstring, boolean[] arrbl) {
        if (arrfile.length != arrstring.length && arrfile.length != arrbl.length) {
            throw new NullPointerException("Different array length");
        }
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            this.a(string, arrfile[i2], arrstring[i2], arrbl[i2]);
        }
    }

    public void a(ac ac2) {
        if (this.k) {
            throw new z("Cannot add value once finalized");
        }
        if (ac2 == null) {
            throw new NullPointerException("data");
        }
        this.i.add(ac2);
        if (!this.j) {
            if (ac2 instanceof d) {
                d d2 = (d)ac2;
                try {
                    String string = this.a(d2.p(), this.g);
                    String string2 = this.a(d2.u(), this.g);
                    d d3 = this.e.a(this.f, string, string2);
                    this.a.add(d3);
                    this.q += (long)(d3.p().length() + 1) + d3.s() + 1L;
                }
                catch (IOException iOException) {
                    throw new z(iOException);
                }
            } else if (ac2 instanceof i) {
                i i2 = (i)ac2;
                String string = this.a(i2.p(), this.g);
                String string3 = this.a(i2.u(), this.g);
                d d4 = this.e.a(this.f, string, string3);
                this.a.add(d4);
                this.q += (long)(d4.p().length() + 1) + d4.s() + 1L;
            }
            return;
        }
        if (ac2 instanceof d) {
            ae ae2;
            if (this.p) {
                ae2 = new ae(this.g);
                ae2.a("\r\n--" + this.c + "--");
                this.a.add(ae2);
                this.c = null;
                this.o = null;
                this.p = false;
            }
            ae2 = new ae(this.g);
            if (!this.a.isEmpty()) {
                ae2.a("\r\n");
            }
            ae2.a("--" + this.b + "\r\n");
            d d5 = (d)ac2;
            ae2.a("Content-Disposition: form-data; name=\"" + d5.p() + "\"\r\n");
            Charset charset = d5.r();
            if (charset != null) {
                ae2.a("Content-Type: text/plain; charset=" + charset + "\r\n");
            }
            ae2.a("\r\n");
            this.a.add(ae2);
            this.a.add(ac2);
            this.q += d5.s() + (long)ae2.a();
        } else if (ac2 instanceof i) {
            Object object;
            boolean bl2;
            i i3 = (i)ac2;
            ae ae3 = new ae(this.g);
            if (!this.a.isEmpty()) {
                ae3.a("\r\n");
            }
            if (this.p) {
                if (this.o != null && this.o.p().equals(i3.p())) {
                    bl2 = true;
                } else {
                    ae3.a("--" + this.c + "--");
                    this.a.add(ae3);
                    this.c = null;
                    ae3 = new ae(this.g);
                    ae3.a("\r\n");
                    bl2 = false;
                    this.o = i3;
                    this.p = false;
                }
            } else if (this.o != null && this.o.p().equals(i3.p())) {
                this.i();
                object = (ae)this.a.get(this.a.size() - 2);
                this.q -= (long)((ae)object).a();
                StringBuilder stringBuilder = new StringBuilder(139 + this.b.length() + this.c.length() * 2 + i3.u().length() + i3.p().length());
                stringBuilder.append("--");
                stringBuilder.append(this.b);
                stringBuilder.append("\r\n");
                stringBuilder.append("Content-Disposition");
                stringBuilder.append(": ");
                stringBuilder.append("form-data");
                stringBuilder.append("; ");
                stringBuilder.append("name");
                stringBuilder.append("=\"");
                stringBuilder.append(i3.p());
                stringBuilder.append("\"\r\n");
                stringBuilder.append("Content-Type");
                stringBuilder.append(": ");
                stringBuilder.append("multipart/mixed");
                stringBuilder.append("; ");
                stringBuilder.append("boundary");
                stringBuilder.append('=');
                stringBuilder.append(this.c);
                stringBuilder.append("\r\n\r\n");
                stringBuilder.append("--");
                stringBuilder.append(this.c);
                stringBuilder.append("\r\n");
                stringBuilder.append("Content-Disposition");
                stringBuilder.append(": ");
                stringBuilder.append("attachment");
                stringBuilder.append("; ");
                stringBuilder.append("filename");
                stringBuilder.append("=\"");
                stringBuilder.append(i3.u());
                stringBuilder.append("\"\r\n");
                ((ae)object).b(stringBuilder.toString(), 1);
                ((ae)object).b("", 2);
                this.q += (long)((ae)object).a();
                bl2 = true;
                this.p = true;
            } else {
                bl2 = false;
                this.o = i3;
                this.p = false;
            }
            if (bl2) {
                ae3.a("--" + this.c + "\r\n");
                ae3.a("Content-Disposition: attachment; filename=\"" + i3.u() + "\"\r\n");
            } else {
                ae3.a("--" + this.b + "\r\n");
                ae3.a("Content-Disposition: form-data; name=\"" + i3.p() + "\"; " + "filename" + "=\"" + i3.u() + "\"\r\n");
            }
            ae3.a("Content-Type: " + i3.v());
            object = i3.w();
            if (object != null && ((String)object).equals(io.netty.c.a.d.b.o.c.a())) {
                ae3.a("\r\nContent-Transfer-Encoding: " + io.netty.c.a.d.b.o.c.a() + "\r\n\r\n");
            } else if (i3.r() != null) {
                ae3.a("; charset=" + i3.r() + "\r\n\r\n");
            } else {
                ae3.a("\r\n\r\n");
            }
            this.a.add(ae3);
            this.a.add(ac2);
            this.q += i3.s() + (long)ae3.a();
        }
    }

    public bj f() {
        Object object;
        Object object2;
        if (!this.k) {
            if (this.j) {
                object2 = new ae(this.g);
                if (this.p) {
                    ((ae)object2).a("\r\n--" + this.c + "--");
                }
                ((ae)object2).a("\r\n--" + this.b + "--\r\n");
                this.a.add(object2);
                this.c = null;
                this.o = null;
                this.p = false;
                this.q += (long)((ae)object2).a();
            }
        } else {
            throw new z("Header already encoded");
        }
        this.k = true;
        object2 = this.f.q();
        List list = ((ar)object2).c("Content-Type");
        List list2 = ((ar)object2).c("Transfer-Encoding");
        if (list != null) {
            ((ar)object2).a("Content-Type");
            for (String string : list) {
                object = string.toLowerCase();
                if (((String)object).startsWith("multipart/form-data") || ((String)object).startsWith("application/x-www-form-urlencoded")) continue;
                ((ar)object2).a("Content-Type", (Object)string);
            }
        }
        if (this.j) {
            String string = "multipart/form-data; boundary=" + this.b;
            ((ar)object2).a("Content-Type", (Object)string);
        } else {
            ((ar)object2).a("Content-Type", (Object)"application/x-www-form-urlencoded");
        }
        long l2 = this.q;
        if (this.j) {
            this.r = this.a.listIterator();
        } else {
            --l2;
            this.r = this.a.listIterator();
        }
        ((ar)object2).b("Content-Length", (Object)String.valueOf(l2));
        if (l2 > 8096L || this.j) {
            this.h = true;
            if (list2 != null) {
                ((ar)object2).a("Transfer-Encoding");
                for (String string : list2) {
                    if (string.equalsIgnoreCase("chunked")) continue;
                    ((ar)object2).a("Transfer-Encoding", (Object)string);
                }
            }
            ar.j(this.f);
            return new ab(this.f);
        }
        object = this.l();
        if (this.f instanceof v) {
            v v2 = (v)this.f;
            g g2 = object.a();
            if (v2.a() != g2) {
                v2.a().w().b(g2);
                g2.ad();
            }
            return v2;
        }
        return new aa(this.f, (ad)object, null);
    }

    public boolean g() {
        return this.h;
    }

    private String a(String string, Charset charset) {
        if (string == null) {
            return "";
        }
        try {
            String string2 = URLEncoder.encode(string, charset.name());
            if (this.l == y.b) {
                for (Map.Entry entry : d.entrySet()) {
                    String string3 = (String)entry.getValue();
                    string2 = ((Pattern)entry.getKey()).matcher(string2).replaceAll(string3);
                }
            }
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new z(charset.name(), unsupportedEncodingException);
        }
    }

    private g k() {
        int n2 = this.s.r();
        if (n2 > 8096) {
            g g2 = this.s.i(this.s.p(), 8096);
            this.s.A(8096);
            return g2;
        }
        g g3 = this.s;
        this.s = null;
        return g3;
    }

    private ad a(int n2) {
        g g2;
        if (this.t == null) {
            return null;
        }
        if (this.t instanceof ae) {
            g2 = ((ae)this.t).b();
            this.t = null;
        } else {
            if (this.t instanceof d) {
                try {
                    g2 = ((d)this.t).b(n2);
                }
                catch (IOException iOException) {
                    throw new z(iOException);
                }
            }
            try {
                g2 = ((j)this.t).b(n2);
            }
            catch (IOException iOException) {
                throw new z(iOException);
            }
            if (g2.j() == 0) {
                this.t = null;
                return null;
            }
        }
        this.s = this.s == null ? g2 : bi.a(this.s, g2);
        if (this.s.r() < 8096) {
            this.t = null;
            return null;
        }
        g2 = this.k();
        return new io.netty.c.a.d.j(g2);
    }

    private ad b(int n2) {
        g g2;
        String string;
        if (this.t == null) {
            return null;
        }
        int n3 = n2;
        if (this.u) {
            string = this.t.p();
            g2 = bi.a(string.getBytes());
            this.u = false;
            if (this.s == null) {
                this.s = bi.a(g2, bi.a("=".getBytes()));
                n3 -= g2.r() + 1;
            } else {
                this.s = bi.a(this.s, g2, bi.a("=".getBytes()));
                n3 -= g2.r() + 1;
            }
            if (this.s.r() >= 8096) {
                g2 = this.k();
                return new io.netty.c.a.d.j(g2);
            }
        }
        try {
            g2 = ((j)this.t).b(n3);
        }
        catch (IOException iOException) {
            throw new z(iOException);
        }
        string = null;
        if (g2.r() < n3) {
            this.u = true;
            String string2 = string = this.r.hasNext() ? bi.a("&".getBytes()) : null;
        }
        if (g2.j() == 0) {
            this.t = null;
            if (this.s == null) {
                this.s = string;
            } else if (string != null) {
                this.s = bi.a(new g[]{this.s, string});
            }
            if (this.s.r() >= 8096) {
                g2 = this.k();
                return new io.netty.c.a.d.j(g2);
            }
            return null;
        }
        this.s = this.s == null ? (string != null ? bi.a(new g[]{g2, string}) : g2) : (string != null ? bi.a(new g[]{this.s, g2, string}) : bi.a(this.s, g2));
        if (this.s.r() < 8096) {
            this.t = null;
            this.u = true;
            return null;
        }
        g2 = this.k();
        return new io.netty.c.a.d.j(g2);
    }

    @Override
    public void b() {
    }

    public ad a(bd bd2) {
        if (this.n) {
            return null;
        }
        return this.l();
    }

    private ad l() {
        ad ad2;
        if (this.m) {
            this.n = true;
            return bs.b;
        }
        int n2 = 8096;
        if (this.s != null) {
            n2 -= this.s.r();
        }
        if (n2 <= 0) {
            g g2 = this.k();
            return new io.netty.c.a.d.j(g2);
        }
        if (this.t != null) {
            if (this.j ? (ad2 = this.a(n2)) != null : (ad2 = this.b(n2)) != null) {
                return ad2;
            }
            n2 = 8096 - this.s.r();
        }
        if (!this.r.hasNext()) {
            this.m = true;
            g g3 = this.s;
            this.s = null;
            return new io.netty.c.a.d.j(g3);
        }
        while (n2 > 0 && this.r.hasNext()) {
            this.t = (ac)this.r.next();
            ad2 = this.j ? this.a(n2) : this.b(n2);
            if (ad2 == null) {
                n2 = 8096 - this.s.r();
                continue;
            }
            return ad2;
        }
        this.m = true;
        if (this.s == null) {
            this.n = true;
            return bs.b;
        }
        g g4 = this.s;
        this.s = null;
        return new io.netty.c.a.d.j(g4);
    }

    @Override
    public boolean a() {
        return this.n;
    }

    @Override
    public /* synthetic */ Object b(bd bd2) {
        return this.a(bd2);
    }

    static {
        d.put(Pattern.compile("\\*"), "%2A");
        d.put(Pattern.compile("\\+"), "%20");
        d.put(Pattern.compile("%7E"), "~");
    }
}

