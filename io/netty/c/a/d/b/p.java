/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.d;
import io.netty.c.a.d.b.e;
import io.netty.c.a.d.b.f;
import io.netty.c.a.d.b.i;
import io.netty.c.a.d.b.j;
import io.netty.c.a.d.b.k;
import io.netty.c.a.d.b.l;
import io.netty.c.a.d.b.m;
import io.netty.c.a.d.b.n;
import io.netty.c.a.d.b.o;
import io.netty.c.a.d.b.r;
import io.netty.c.a.d.b.s;
import io.netty.c.a.d.b.t;
import io.netty.c.a.d.b.u;
import io.netty.c.a.d.b.v;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.bu;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class p {
    private static final int a = 0xA00000;
    private final k b;
    private final bj c;
    private final Charset d;
    private boolean e;
    private boolean f;
    private final List g = new ArrayList();
    private final Map h = new TreeMap(io.netty.c.a.d.b.e.a);
    private g i;
    private boolean j;
    private int k;
    private String l;
    private String m;
    private u n = u.a;
    private Map o;
    private i p;
    private d q;
    private boolean r;
    private int s = 0xA00000;

    public p(bj bj2) {
        this(new f(16384L), bj2, io.netty.c.a.d.ac.j);
    }

    public p(k k2, bj bj2) {
        this(k2, bj2, io.netty.c.a.d.ac.j);
    }

    public p(k k2, bj bj2, Charset charset) {
        if (k2 == null) {
            throw new NullPointerException("factory");
        }
        if (bj2 == null) {
            throw new NullPointerException("request");
        }
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        this.c = bj2;
        aw aw2 = bj2.s();
        if (aw2.equals(aw.d) || aw2.equals(aw.e) || aw2.equals(aw.f)) {
            this.e = true;
        }
        this.d = charset;
        this.b = k2;
        String string = this.c.q().b("Content-Type");
        if (string != null) {
            this.d(string);
        } else {
            this.j = false;
        }
        if (!this.e) {
            throw new t("No Body to decode");
        }
        if (bj2 instanceof ad) {
            this.a((ad)((Object)bj2));
        } else {
            this.i = bi.a();
            this.k();
        }
    }

    private void d(String string) {
        String[] arrstring = io.netty.c.a.d.b.p.l(string);
        if (arrstring[0].toLowerCase().startsWith("multipart/form-data") && arrstring[1].toLowerCase().startsWith("boundary")) {
            int n2;
            String string2;
            String[] arrstring2 = io.netty.util.c.ad.a(arrstring[1], '=');
            if (arrstring2.length != 2) {
                throw new s("Needs a boundary value");
            }
            if (arrstring2[1].charAt(0) == '\"' && (string2 = arrstring2[1].trim()).charAt(n2 = string2.length() - 1) == '\"') {
                arrstring2[1] = string2.substring(1, n2);
            }
            this.l = "--" + arrstring2[1];
            this.j = true;
            this.n = u.c;
        } else {
            this.j = false;
        }
    }

    private void j() {
        if (this.r) {
            throw new IllegalStateException(p.class.getSimpleName() + " was destroyed already");
        }
    }

    public boolean a() {
        this.j();
        return this.j;
    }

    public void a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("discardThreshold must be >= 0");
        }
        this.s = n2;
    }

    public int b() {
        return this.s;
    }

    public List c() {
        this.j();
        if (!this.f) {
            throw new v();
        }
        return this.g;
    }

    public List a(String string) {
        this.j();
        if (!this.f) {
            throw new v();
        }
        return (List)this.h.get(string);
    }

    public ac b(String string) {
        this.j();
        if (!this.f) {
            throw new v();
        }
        List list = (List)this.h.get(string);
        if (list != null) {
            return (ac)list.get(0);
        }
        return null;
    }

    public p a(ad ad2) {
        this.j();
        g g2 = ad2.a();
        if (this.i == null) {
            this.i = g2.Q();
        } else {
            this.i.b(g2);
        }
        if (ad2 instanceof bs) {
            this.f = true;
        }
        this.k();
        if (this.i != null && this.i.q() > this.s) {
            this.i.B();
        }
        return this;
    }

    public boolean d() {
        this.j();
        if (this.n == u.n && this.k >= this.g.size()) {
            throw new r();
        }
        return !this.g.isEmpty() && this.k < this.g.size();
    }

    public ac e() {
        this.j();
        if (this.d()) {
            return (ac)this.g.get(this.k++);
        }
        return null;
    }

    private void k() {
        if (this.n == u.m || this.n == u.n) {
            if (this.f) {
                this.n = u.n;
            }
            return;
        }
        if (this.j) {
            this.n();
        } else {
            this.m();
        }
    }

    protected void a(ac ac2) {
        if (ac2 == null) {
            return;
        }
        ArrayList<ac> arrayList = (ArrayList<ac>)this.h.get(ac2.p());
        if (arrayList == null) {
            arrayList = new ArrayList<ac>(1);
            this.h.put(ac2.p(), arrayList);
        }
        arrayList.add(ac2);
        this.g.add(ac2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l() {
        int n2;
        int n3 = n2 = this.i.p();
        if (this.n == u.a) {
            this.n = u.d;
        }
        boolean bl2 = true;
        try {
            int n4;
            block7: while (this.i.u() && bl2) {
                char c2 = (char)this.i.F();
                ++n3;
                switch (this.n) {
                    case d: {
                        String string;
                        if (c2 == '=') {
                            this.n = u.e;
                            int n5 = n3 - 1;
                            string = io.netty.c.a.d.b.p.a(this.i.a(n2, n5 - n2, this.d), this.d);
                            this.q = this.b.a(this.c, string);
                            n2 = n3;
                            continue block7;
                        }
                        if (c2 != '&') continue block7;
                        this.n = u.d;
                        n4 = n3 - 1;
                        string = io.netty.c.a.d.b.p.a(this.i.a(n2, n4 - n2, this.d), this.d);
                        this.q = this.b.a(this.c, string);
                        this.q.a("");
                        this.a(this.q);
                        this.q = null;
                        n2 = n3;
                        bl2 = true;
                        continue block7;
                    }
                    case e: {
                        if (c2 == '&') {
                            this.n = u.d;
                            n4 = n3 - 1;
                            this.a(this.i.h(n2, n4 - n2));
                            n2 = n3;
                            bl2 = true;
                            continue block7;
                        }
                        if (c2 == '\r') {
                            if (this.i.u()) {
                                c2 = (char)this.i.F();
                                if (c2 != '\n') throw new s("Bad end of line");
                                this.n = u.m;
                                n4 = ++n3 - 2;
                                this.a(this.i.h(n2, n4 - n2));
                                n2 = n3;
                                bl2 = false;
                                continue block7;
                            }
                            --n3;
                            continue block7;
                        }
                        if (c2 != '\n') continue block7;
                        this.n = u.m;
                        n4 = n3 - 1;
                        this.a(this.i.h(n2, n4 - n2));
                        n2 = n3;
                        bl2 = false;
                        continue block7;
                    }
                }
                bl2 = false;
            }
            if (this.f && this.q != null) {
                n4 = n3;
                if (n4 > n2) {
                    this.a(this.i.h(n2, n4 - n2));
                } else if (!this.q.q()) {
                    this.a(bi.c);
                }
                n2 = n3;
                this.n = u.n;
                this.i.g(n2);
                return;
            }
            if (bl2 && this.q != null) {
                if (this.n == u.e) {
                    this.q.a(this.i.h(n2, n3 - n2), false);
                    n2 = n3;
                }
                this.i.g(n2);
                return;
            }
            this.i.g(n2);
            return;
        }
        catch (s s2) {
            this.i.g(n2);
            throw s2;
        }
        catch (IOException iOException) {
            this.i.g(n2);
            throw new s(iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m() {
        int n2;
        n n3;
        try {
            n3 = new n(this.i);
        }
        catch (m m2) {
            this.l();
            return;
        }
        int n4 = n2 = this.i.p();
        if (this.n == u.a) {
            this.n = u.d;
        }
        boolean bl2 = true;
        try {
            int n5;
            block9: while (n3.c < n3.e) {
                char c2 = (char)(n3.a[n3.c++] & 0xFF);
                ++n4;
                switch (this.n) {
                    case d: {
                        String string;
                        if (c2 == '=') {
                            this.n = u.e;
                            int n6 = n4 - 1;
                            string = io.netty.c.a.d.b.p.a(this.i.a(n2, n6 - n2, this.d), this.d);
                            this.q = this.b.a(this.c, string);
                            n2 = n4;
                            continue block9;
                        }
                        if (c2 != '&') continue block9;
                        this.n = u.d;
                        n5 = n4 - 1;
                        string = io.netty.c.a.d.b.p.a(this.i.a(n2, n5 - n2, this.d), this.d);
                        this.q = this.b.a(this.c, string);
                        this.q.a("");
                        this.a(this.q);
                        this.q = null;
                        n2 = n4;
                        bl2 = true;
                        continue block9;
                    }
                    case e: {
                        if (c2 == '&') {
                            this.n = u.d;
                            n5 = n4 - 1;
                            this.a(this.i.h(n2, n5 - n2));
                            n2 = n4;
                            bl2 = true;
                            continue block9;
                        }
                        if (c2 == '\r') {
                            if (n3.c < n3.e) {
                                c2 = (char)(n3.a[n3.c++] & 0xFF);
                                ++n4;
                                if (c2 != '\n') {
                                    n3.a(0);
                                    throw new s("Bad end of line");
                                }
                                this.n = u.m;
                                n5 = n4 - 2;
                                n3.a(0);
                                this.a(this.i.h(n2, n5 - n2));
                                n2 = n4;
                                bl2 = false;
                                break block9;
                            }
                            if (n3.e <= 0) continue block9;
                            --n4;
                            continue block9;
                        }
                        if (c2 != '\n') continue block9;
                        this.n = u.m;
                        n5 = n4 - 1;
                        n3.a(0);
                        this.a(this.i.h(n2, n5 - n2));
                        n2 = n4;
                        bl2 = false;
                        break block9;
                    }
                }
                n3.a(0);
                bl2 = false;
                break;
            }
            if (this.f && this.q != null) {
                n5 = n4;
                if (n5 > n2) {
                    this.a(this.i.h(n2, n5 - n2));
                } else if (!this.q.q()) {
                    this.a(bi.c);
                }
                n2 = n4;
                this.n = u.n;
                this.i.g(n2);
                return;
            }
            if (bl2 && this.q != null) {
                if (this.n == u.e) {
                    this.q.a(this.i.h(n2, n4 - n2), false);
                    n2 = n4;
                }
                this.i.g(n2);
                return;
            }
            this.i.g(n2);
            return;
        }
        catch (s s2) {
            this.i.g(n2);
            throw s2;
        }
        catch (IOException iOException) {
            this.i.g(n2);
            throw new s(iOException);
        }
    }

    private void a(g g2) {
        this.q.a(g2, true);
        String string = io.netty.c.a.d.b.p.a(this.q.l().a(this.d), this.d);
        this.q.a(string);
        this.a(this.q);
        this.q = null;
    }

    private static String a(String string, Charset charset) {
        try {
            return bu.a(string, charset);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new s("Bad string: '" + string + '\'', illegalArgumentException);
        }
    }

    private void n() {
        if (this.i == null || this.i.r() == 0) {
            return;
        }
        ac ac2 = this.a(this.n);
        while (ac2 != null) {
            this.a(ac2);
            if (this.n == u.m || this.n == u.n) break;
            ac2 = this.a(this.n);
        }
    }

    private ac a(u u2) {
        switch (u2) {
            case a: {
                throw new s("Should not be called with the current getStatus");
            }
            case b: {
                throw new s("Should not be called with the current getStatus");
            }
            case c: {
                return this.a(this.l, u.d, u.m);
            }
            case d: {
                return this.o();
            }
            case e: {
                Charset charset = null;
                d d2 = (d)this.o.get("charset");
                if (d2 != null) {
                    try {
                        charset = Charset.forName(d2.u());
                    }
                    catch (IOException iOException) {
                        throw new s(iOException);
                    }
                }
                d d3 = (d)this.o.get("name");
                if (this.q == null) {
                    try {
                        this.q = this.b.a(this.c, io.netty.c.a.d.b.p.k(d3.u()));
                    }
                    catch (NullPointerException nullPointerException) {
                        throw new s(nullPointerException);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new s(illegalArgumentException);
                    }
                    catch (IOException iOException) {
                        throw new s(iOException);
                    }
                    if (charset != null) {
                        this.q.b(charset);
                    }
                }
                try {
                    this.j(this.l);
                }
                catch (v v2) {
                    return null;
                }
                d d4 = this.q;
                this.q = null;
                this.o = null;
                this.n = u.c;
                return d4;
            }
            case f: {
                return this.c(this.l);
            }
            case h: {
                return this.a(this.m, u.i, u.c);
            }
            case i: {
                return this.o();
            }
            case j: {
                return this.c(this.m);
            }
            case m: {
                return null;
            }
            case n: {
                return null;
            }
        }
        throw new s("Shouldn't reach here.");
    }

    void f() {
        n n2;
        try {
            n2 = new n(this.i);
        }
        catch (m m2) {
            try {
                this.g();
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new v(indexOutOfBoundsException);
            }
            return;
        }
        while (n2.c < n2.e) {
            char c2;
            if (Character.isISOControl(c2 = (char)(n2.a[n2.c++] & 0xFF)) || Character.isWhitespace(c2)) continue;
            n2.a(1);
            return;
        }
        throw new v("Access out of bounds");
    }

    void g() {
        char c2;
        while (Character.isISOControl(c2 = (char)this.i.F()) || Character.isWhitespace(c2)) {
        }
        this.i.g(this.i.p() - 1);
    }

    private ac a(String string, u u2, u u3) {
        String string2;
        int n2 = this.i.p();
        try {
            this.f();
        }
        catch (v v2) {
            this.i.g(n2);
            return null;
        }
        this.s();
        try {
            string2 = this.f(string);
        }
        catch (v v3) {
            this.i.g(n2);
            return null;
        }
        if (string2.equals(string)) {
            this.n = u2;
            return this.a(u2);
        }
        if (string2.equals(string + "--")) {
            this.n = u3;
            if (this.n == u.c) {
                this.o = null;
                return this.a(u.c);
            }
            return null;
        }
        this.i.g(n2);
        throw new s("No Multipart delimiter found");
    }

    private ac o() {
        Object object;
        int n2 = this.i.p();
        if (this.n == u.d) {
            this.o = new TreeMap(io.netty.c.a.d.b.e.a);
        }
        while (!this.s()) {
            Object object2;
            try {
                this.f();
                object = this.r();
            }
            catch (v v2) {
                this.i.g(n2);
                return null;
            }
            String[] arrstring = io.netty.c.a.d.b.p.m((String)object);
            if (arrstring[0].equalsIgnoreCase("Content-Disposition")) {
                boolean bl2;
                if (this.n == u.d) {
                    bl2 = arrstring[1].equalsIgnoreCase("form-data");
                } else {
                    boolean bl3 = bl2 = arrstring[1].equalsIgnoreCase("attachment") || arrstring[1].equalsIgnoreCase("file");
                }
                if (!bl2) continue;
                for (int i2 = 2; i2 < arrstring.length; ++i2) {
                    d d2;
                    object2 = io.netty.util.c.ad.a(arrstring[i2], '=');
                    try {
                        String string = io.netty.c.a.d.b.p.k(object2[0]);
                        String string2 = object2[1];
                        string2 = "filename".equals(string) ? string2.substring(1, string2.length() - 1) : io.netty.c.a.d.b.p.k(string2);
                        d2 = this.b.a(this.c, string, string2);
                    }
                    catch (NullPointerException nullPointerException) {
                        throw new s(nullPointerException);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new s(illegalArgumentException);
                    }
                    this.o.put(d2.p(), d2);
                }
                continue;
            }
            if (arrstring[0].equalsIgnoreCase("Content-Transfer-Encoding")) {
                d d3;
                try {
                    d3 = this.b.a(this.c, "Content-Transfer-Encoding", io.netty.c.a.d.b.p.k(arrstring[1]));
                }
                catch (NullPointerException nullPointerException) {
                    throw new s(nullPointerException);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new s(illegalArgumentException);
                }
                this.o.put("Content-Transfer-Encoding", d3);
                continue;
            }
            if (arrstring[0].equalsIgnoreCase("Content-Length")) {
                d d4;
                try {
                    d4 = this.b.a(this.c, "Content-Length", io.netty.c.a.d.b.p.k(arrstring[1]));
                }
                catch (NullPointerException nullPointerException) {
                    throw new s(nullPointerException);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new s(illegalArgumentException);
                }
                this.o.put("Content-Length", d4);
                continue;
            }
            if (arrstring[0].equalsIgnoreCase("Content-Type")) {
                if (arrstring[1].equalsIgnoreCase("multipart/mixed")) {
                    if (this.n == u.d) {
                        String[] arrstring2 = io.netty.util.c.ad.a(arrstring[2], '=');
                        this.m = "--" + arrstring2[1];
                        this.n = u.h;
                        return this.a(u.h);
                    }
                    throw new s("Mixed Multipart found in a previous Mixed Multipart");
                }
                for (int i3 = 1; i3 < arrstring.length; ++i3) {
                    Object object3;
                    if (arrstring[i3].toLowerCase().startsWith("charset")) {
                        object3 = io.netty.util.c.ad.a(arrstring[i3], '=');
                        try {
                            object2 = this.b.a(this.c, "charset", io.netty.c.a.d.b.p.k(object3[1]));
                        }
                        catch (NullPointerException nullPointerException) {
                            throw new s(nullPointerException);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw new s(illegalArgumentException);
                        }
                        this.o.put("charset", object2);
                        continue;
                    }
                    try {
                        object3 = this.b.a(this.c, io.netty.c.a.d.b.p.k(arrstring[0]), arrstring[i3]);
                    }
                    catch (NullPointerException nullPointerException) {
                        throw new s(nullPointerException);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new s(illegalArgumentException);
                    }
                    this.o.put(object3.p(), object3);
                }
                continue;
            }
            throw new s("Unknown Params: " + (String)object);
        }
        object = (d)this.o.get("filename");
        if (this.n == u.d) {
            if (object != null) {
                this.n = u.f;
                return this.a(u.f);
            }
            this.n = u.e;
            return this.a(u.e);
        }
        if (object != null) {
            this.n = u.j;
            return this.a(u.j);
        }
        throw new s("Filename not found");
    }

    protected ac c(String string) {
        j j2;
        Object object;
        d d2 = (d)this.o.get("Content-Transfer-Encoding");
        Charset charset = this.d;
        o o2 = io.netty.c.a.d.b.o.a;
        if (d2 != null) {
            try {
                object = d2.u().toLowerCase();
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
            if (((String)object).equals(io.netty.c.a.d.b.o.a.a())) {
                charset = io.netty.c.a.d.b.l.j;
            } else if (((String)object).equals(io.netty.c.a.d.b.o.b.a())) {
                charset = io.netty.c.a.d.b.l.i;
                o2 = io.netty.c.a.d.b.o.b;
            } else if (((String)object).equals(io.netty.c.a.d.b.o.c.a())) {
                o2 = io.netty.c.a.d.b.o.c;
            } else {
                throw new s("TransferEncoding Unknown: " + (String)object);
            }
        }
        if ((object = (d)this.o.get("charset")) != null) {
            try {
                charset = Charset.forName(object.u());
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
        }
        if (this.p == null) {
            long l2;
            j2 = (d)this.o.get("filename");
            d d3 = (d)this.o.get("name");
            d d4 = (d)this.o.get("Content-Type");
            if (d4 == null) {
                throw new s("Content-Type is absent but required");
            }
            d d5 = (d)this.o.get("Content-Length");
            try {
                l2 = d5 != null ? Long.parseLong(d5.u()) : 0L;
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
            catch (NumberFormatException numberFormatException) {
                l2 = 0L;
            }
            try {
                this.p = this.b.a(this.c, io.netty.c.a.d.b.p.k(d3.u()), io.netty.c.a.d.b.p.k(j2.u()), d4.u(), o2.a(), charset, l2);
            }
            catch (NullPointerException nullPointerException) {
                throw new s(nullPointerException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new s(illegalArgumentException);
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
        }
        try {
            this.h(string);
        }
        catch (v v2) {
            return null;
        }
        if (this.p.q()) {
            if (this.n == u.f) {
                this.n = u.c;
                this.o = null;
            } else {
                this.n = u.h;
                this.p();
            }
            j2 = this.p;
            this.p = null;
            return j2;
        }
        return null;
    }

    public void h() {
        this.j();
        this.i();
        this.r = true;
        if (this.i != null && this.i.ac() > 0) {
            this.i.ad();
            this.i = null;
        }
        for (int i2 = this.k; i2 < this.g.size(); ++i2) {
            ((ac)this.g.get(i2)).ad();
        }
    }

    public void i() {
        this.j();
        this.b.a(this.c);
    }

    public void b(ac ac2) {
        this.j();
        this.b.a(this.c, ac2);
    }

    private void p() {
        this.o.remove("charset");
        this.o.remove("Content-Length");
        this.o.remove("Content-Transfer-Encoding");
        this.o.remove("Content-Type");
        this.o.remove("filename");
    }

    private String q() {
        int n2 = this.i.p();
        try {
            g g2 = bi.a(64);
            while (this.i.u()) {
                byte by2 = this.i.E();
                if (by2 == 13) {
                    by2 = this.i.m(this.i.p());
                    if (by2 == 10) {
                        this.i.A(1);
                        return g2.a(this.d);
                    }
                    g2.B(13);
                    continue;
                }
                if (by2 == 10) {
                    return g2.a(this.d);
                }
                g2.B(by2);
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.i.g(n2);
            throw new v(indexOutOfBoundsException);
        }
        this.i.g(n2);
        throw new v();
    }

    private String r() {
        n n2;
        try {
            n2 = new n(this.i);
        }
        catch (m m2) {
            return this.q();
        }
        int n3 = this.i.p();
        try {
            g g2 = bi.a(64);
            while (n2.c < n2.e) {
                byte by2;
                if ((by2 = n2.a[n2.c++]) == 13) {
                    if (n2.c < n2.e) {
                        if ((by2 = n2.a[n2.c++]) == 10) {
                            n2.a(0);
                            return g2.a(this.d);
                        }
                        --n2.c;
                        g2.B(13);
                        continue;
                    }
                    g2.B(by2);
                    continue;
                }
                if (by2 == 10) {
                    n2.a(0);
                    return g2.a(this.d);
                }
                g2.B(by2);
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.i.g(n3);
            throw new v(indexOutOfBoundsException);
        }
        this.i.g(n3);
        throw new v();
    }

    private String e(String string) {
        int n2 = this.i.p();
        try {
            byte by2;
            StringBuilder stringBuilder = new StringBuilder(64);
            int n3 = string.length();
            for (int i2 = 0; this.i.u() && i2 < n3; ++i2) {
                by2 = this.i.E();
                if (by2 == string.charAt(i2)) {
                    stringBuilder.append((char)by2);
                    continue;
                }
                this.i.g(n2);
                throw new v();
            }
            if (this.i.u()) {
                by2 = this.i.E();
                if (by2 == 13) {
                    by2 = this.i.E();
                    if (by2 == 10) {
                        return stringBuilder.toString();
                    }
                    this.i.g(n2);
                    throw new v();
                }
                if (by2 == 10) {
                    return stringBuilder.toString();
                }
                if (by2 == 45) {
                    stringBuilder.append('-');
                    by2 = this.i.E();
                    if (by2 == 45) {
                        stringBuilder.append('-');
                        if (this.i.u()) {
                            by2 = this.i.E();
                            if (by2 == 13) {
                                by2 = this.i.E();
                                if (by2 == 10) {
                                    return stringBuilder.toString();
                                }
                                this.i.g(n2);
                                throw new v();
                            }
                            if (by2 == 10) {
                                return stringBuilder.toString();
                            }
                            this.i.g(this.i.p() - 1);
                            return stringBuilder.toString();
                        }
                        return stringBuilder.toString();
                    }
                }
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.i.g(n2);
            throw new v(indexOutOfBoundsException);
        }
        this.i.g(n2);
        throw new v();
    }

    private String f(String string) {
        n n2;
        try {
            n2 = new n(this.i);
        }
        catch (m m2) {
            return this.e(string);
        }
        int n3 = this.i.p();
        int n4 = string.length();
        try {
            byte by2;
            StringBuilder stringBuilder = new StringBuilder(64);
            for (int i2 = 0; n2.c < n2.e && i2 < n4; ++i2) {
                if ((by2 = n2.a[n2.c++]) == string.charAt(i2)) {
                    stringBuilder.append((char)by2);
                    continue;
                }
                this.i.g(n3);
                throw new v();
            }
            if (n2.c < n2.e) {
                if ((by2 = n2.a[n2.c++]) == 13) {
                    if (n2.c < n2.e) {
                        if ((by2 = n2.a[n2.c++]) == 10) {
                            n2.a(0);
                            return stringBuilder.toString();
                        }
                        this.i.g(n3);
                        throw new v();
                    }
                    this.i.g(n3);
                    throw new v();
                }
                if (by2 == 10) {
                    n2.a(0);
                    return stringBuilder.toString();
                }
                if (by2 == 45) {
                    stringBuilder.append('-');
                    if (n2.c < n2.e && (by2 = n2.a[n2.c++]) == 45) {
                        stringBuilder.append('-');
                        if (n2.c < n2.e) {
                            if ((by2 = n2.a[n2.c++]) == 13) {
                                if (n2.c < n2.e) {
                                    if ((by2 = n2.a[n2.c++]) == 10) {
                                        n2.a(0);
                                        return stringBuilder.toString();
                                    }
                                    this.i.g(n3);
                                    throw new v();
                                }
                                this.i.g(n3);
                                throw new v();
                            }
                            if (by2 == 10) {
                                n2.a(0);
                                return stringBuilder.toString();
                            }
                            n2.a(1);
                            return stringBuilder.toString();
                        }
                        n2.a(0);
                        return stringBuilder.toString();
                    }
                }
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.i.g(n3);
            throw new v(indexOutOfBoundsException);
        }
        this.i.g(n3);
        throw new v();
    }

    private void g(String string) {
        int n2 = this.i.p();
        boolean bl2 = true;
        int n3 = 0;
        int n4 = this.i.p();
        boolean bl3 = false;
        while (this.i.u()) {
            byte by2 = this.i.E();
            if (bl2) {
                if (by2 == string.codePointAt(n3)) {
                    if (string.length() != ++n3) continue;
                    bl3 = true;
                    break;
                }
                bl2 = false;
                n3 = 0;
                if (by2 == 13) {
                    if (!this.i.u()) continue;
                    by2 = this.i.E();
                    if (by2 == 10) {
                        bl2 = true;
                        n3 = 0;
                        n4 = this.i.p() - 2;
                        continue;
                    }
                    n4 = this.i.p() - 1;
                    this.i.g(n4);
                    continue;
                }
                if (by2 == 10) {
                    bl2 = true;
                    n3 = 0;
                    n4 = this.i.p() - 1;
                    continue;
                }
                n4 = this.i.p();
                continue;
            }
            if (by2 == 13) {
                if (!this.i.u()) continue;
                by2 = this.i.E();
                if (by2 == 10) {
                    bl2 = true;
                    n3 = 0;
                    n4 = this.i.p() - 2;
                    continue;
                }
                n4 = this.i.p() - 1;
                this.i.g(n4);
                continue;
            }
            if (by2 == 10) {
                bl2 = true;
                n3 = 0;
                n4 = this.i.p() - 1;
                continue;
            }
            n4 = this.i.p();
        }
        g g2 = this.i.h(n2, n4 - n2);
        if (bl3) {
            try {
                this.p.a(g2, true);
                this.i.g(n4);
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
        } else {
            try {
                this.p.a(g2, false);
                this.i.g(n4);
                throw new v();
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
        }
    }

    private void h(String string) {
        n n2;
        try {
            n2 = new n(this.i);
        }
        catch (m m2) {
            this.g(string);
            return;
        }
        int n3 = this.i.p();
        boolean bl2 = true;
        int n4 = 0;
        int n5 = n2.c;
        boolean bl3 = false;
        while (n2.c < n2.e) {
            byte by2 = n2.a[n2.c++];
            if (bl2) {
                if (by2 == string.codePointAt(n4)) {
                    if (string.length() != ++n4) continue;
                    bl3 = true;
                    break;
                }
                bl2 = false;
                n4 = 0;
                if (by2 == 13) {
                    if (n2.c >= n2.e) continue;
                    if ((by2 = n2.a[n2.c++]) == 10) {
                        bl2 = true;
                        n4 = 0;
                        n5 = n2.c - 2;
                        continue;
                    }
                    n5 = --n2.c;
                    continue;
                }
                if (by2 == 10) {
                    bl2 = true;
                    n4 = 0;
                    n5 = n2.c - 1;
                    continue;
                }
                n5 = n2.c;
                continue;
            }
            if (by2 == 13) {
                if (n2.c >= n2.e) continue;
                if ((by2 = n2.a[n2.c++]) == 10) {
                    bl2 = true;
                    n4 = 0;
                    n5 = n2.c - 2;
                    continue;
                }
                n5 = --n2.c;
                continue;
            }
            if (by2 == 10) {
                bl2 = true;
                n4 = 0;
                n5 = n2.c - 1;
                continue;
            }
            n5 = n2.c;
        }
        int n6 = n2.b(n5);
        g g2 = this.i.h(n3, n6 - n3);
        if (bl3) {
            try {
                this.p.a(g2, true);
                this.i.g(n6);
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
        } else {
            try {
                this.p.a(g2, false);
                this.i.g(n6);
                throw new v();
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
        }
    }

    private void i(String string) {
        int n2 = this.i.p();
        try {
            boolean bl2 = true;
            int n3 = 0;
            int n4 = this.i.p();
            boolean bl3 = false;
            while (this.i.u()) {
                byte by2 = this.i.E();
                if (bl2) {
                    if (by2 == string.codePointAt(n3)) {
                        if (string.length() != ++n3) continue;
                        bl3 = true;
                        break;
                    }
                    bl2 = false;
                    n3 = 0;
                    if (by2 == 13) {
                        if (this.i.u()) {
                            by2 = this.i.E();
                            if (by2 == 10) {
                                bl2 = true;
                                n3 = 0;
                                n4 = this.i.p() - 2;
                                continue;
                            }
                            n4 = this.i.p() - 1;
                            this.i.g(n4);
                            continue;
                        }
                        n4 = this.i.p() - 1;
                        continue;
                    }
                    if (by2 == 10) {
                        bl2 = true;
                        n3 = 0;
                        n4 = this.i.p() - 1;
                        continue;
                    }
                    n4 = this.i.p();
                    continue;
                }
                if (by2 == 13) {
                    if (this.i.u()) {
                        by2 = this.i.E();
                        if (by2 == 10) {
                            bl2 = true;
                            n3 = 0;
                            n4 = this.i.p() - 2;
                            continue;
                        }
                        n4 = this.i.p() - 1;
                        this.i.g(n4);
                        continue;
                    }
                    n4 = this.i.p() - 1;
                    continue;
                }
                if (by2 == 10) {
                    bl2 = true;
                    n3 = 0;
                    n4 = this.i.p() - 1;
                    continue;
                }
                n4 = this.i.p();
            }
            if (bl3) {
                try {
                    this.q.a(this.i.h(n2, n4 - n2), true);
                }
                catch (IOException iOException) {
                    throw new s(iOException);
                }
            }
            try {
                this.q.a(this.i.h(n2, n4 - n2), false);
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
            this.i.g(n4);
            throw new v();
            this.i.g(n4);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.i.g(n2);
            throw new v(indexOutOfBoundsException);
        }
    }

    private void j(String string) {
        n n2;
        try {
            n2 = new n(this.i);
        }
        catch (m m2) {
            this.i(string);
            return;
        }
        int n3 = this.i.p();
        try {
            boolean bl2 = true;
            int n4 = 0;
            int n5 = n2.c;
            boolean bl3 = false;
            while (n2.c < n2.e) {
                byte by2 = n2.a[n2.c++];
                if (bl2) {
                    if (by2 == string.codePointAt(n4)) {
                        if (string.length() != ++n4) continue;
                        bl3 = true;
                        break;
                    }
                    bl2 = false;
                    n4 = 0;
                    if (by2 == 13) {
                        if (n2.c >= n2.e) continue;
                        if ((by2 = n2.a[n2.c++]) == 10) {
                            bl2 = true;
                            n4 = 0;
                            n5 = n2.c - 2;
                            continue;
                        }
                        n5 = --n2.c;
                        continue;
                    }
                    if (by2 == 10) {
                        bl2 = true;
                        n4 = 0;
                        n5 = n2.c - 1;
                        continue;
                    }
                    n5 = n2.c;
                    continue;
                }
                if (by2 == 13) {
                    if (n2.c >= n2.e) continue;
                    if ((by2 = n2.a[n2.c++]) == 10) {
                        bl2 = true;
                        n4 = 0;
                        n5 = n2.c - 2;
                        continue;
                    }
                    n5 = --n2.c;
                    continue;
                }
                if (by2 == 10) {
                    bl2 = true;
                    n4 = 0;
                    n5 = n2.c - 1;
                    continue;
                }
                n5 = n2.c;
            }
            int n6 = n2.b(n5);
            if (bl3) {
                try {
                    this.q.a(this.i.h(n3, n6 - n3), true);
                }
                catch (IOException iOException) {
                    throw new s(iOException);
                }
            }
            try {
                this.q.a(this.i.h(n3, n6 - n3), false);
            }
            catch (IOException iOException) {
                throw new s(iOException);
            }
            this.i.g(n6);
            throw new v();
            this.i.g(n6);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.i.g(n3);
            throw new v(indexOutOfBoundsException);
        }
    }

    private static String k(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == ':') {
                stringBuilder.append(32);
                continue;
            }
            if (c2 == ',') {
                stringBuilder.append(32);
                continue;
            }
            if (c2 == '=') {
                stringBuilder.append(32);
                continue;
            }
            if (c2 == ';') {
                stringBuilder.append(32);
                continue;
            }
            if (c2 == '\t') {
                stringBuilder.append(32);
                continue;
            }
            if (c2 == '\"') continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString().trim();
    }

    private boolean s() {
        if (!this.i.u()) {
            return false;
        }
        byte by2 = this.i.E();
        if (by2 == 13) {
            if (!this.i.u()) {
                this.i.g(this.i.p() - 1);
                return false;
            }
            by2 = this.i.E();
            if (by2 == 10) {
                return true;
            }
            this.i.g(this.i.p() - 2);
            return false;
        }
        if (by2 == 10) {
            return true;
        }
        this.i.g(this.i.p() - 1);
        return false;
    }

    private static String[] l(String string) {
        int n2 = io.netty.c.a.d.b.l.a(string, 0);
        int n3 = string.indexOf(59);
        if (n3 == -1) {
            return new String[]{string, ""};
        }
        if (string.charAt(n3 - 1) == ' ') {
            --n3;
        }
        int n4 = io.netty.c.a.d.b.l.a(string, n3 + 1);
        int n5 = io.netty.c.a.d.b.l.a(string);
        return new String[]{string.substring(n2, n3), string.substring(n4, n5)};
    }

    private static String[] m(String string) {
        int n2;
        int n3;
        char c2;
        int n4;
        ArrayList<String> arrayList = new ArrayList<String>(1);
        for (n4 = n3 = io.netty.c.a.d.b.l.a(string, 0); n4 < string.length() && (c2 = string.charAt(n4)) != ':' && !Character.isWhitespace(c2); ++n4) {
        }
        for (n2 = n4; n2 < string.length(); ++n2) {
            if (string.charAt(n2) != ':') continue;
            ++n2;
            break;
        }
        int n5 = io.netty.c.a.d.b.l.a(string, n2);
        int n6 = io.netty.c.a.d.b.l.a(string);
        arrayList.add(string.substring(n3, n4));
        String string2 = string.substring(n5, n6);
        String[] arrstring = string2.indexOf(59) >= 0 ? io.netty.util.c.ad.a(string2, ';') : io.netty.util.c.ad.a(string2, ',');
        for (String string3 : arrstring) {
            arrayList.add(string3.trim());
        }
        String[] arrstring2 = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            arrstring2[i2] = (String)arrayList.get(i2);
        }
        return arrstring2;
    }
}

