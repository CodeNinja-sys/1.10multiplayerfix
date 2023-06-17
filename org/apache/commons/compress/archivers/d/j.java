/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.b;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.d.d;
import org.apache.commons.compress.archivers.d.e;
import org.apache.commons.compress.archivers.d.k;
import org.apache.commons.compress.archivers.d.l;
import org.apache.commons.compress.archivers.d.m;
import org.apache.commons.compress.archivers.d.n;
import org.apache.commons.compress.archivers.d.p;
import org.apache.commons.compress.archivers.d.r;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;

public class j
extends c {
    private l b;
    private e c;
    private boolean d;
    private boolean e;
    private long f;
    private long g;
    private int h;
    private final byte[] i = new byte[1024];
    private byte[] j;
    private int k;
    private long l;
    protected p a;
    private final Map m = new HashMap();
    private final Map n = new HashMap();
    private Queue o;
    private final am p;

    public j(InputStream inputStream) {
        this(inputStream, null);
    }

    public j(InputStream inputStream, String string) {
        Object object;
        this.a = new p(inputStream);
        this.e = false;
        this.p = an.a(string);
        try {
            object = this.a.b();
            if (!org.apache.commons.compress.archivers.d.m.b(object)) {
                throw new r();
            }
            this.b = new l((byte[])object, this.p);
            this.a.a(this.b.k(), this.b.n());
            this.j = new byte[4096];
            this.g();
            this.h();
        }
        catch (IOException iOException) {
            throw new b(iOException.getMessage(), iOException);
        }
        object = new org.apache.commons.compress.archivers.d.a(2, 2, 4, ".");
        this.m.put(2, object);
        this.o = new PriorityQueue(10, new k(this));
    }

    public int b() {
        return (int)this.c();
    }

    public long c() {
        return this.a.c();
    }

    public l d() {
        return this.b;
    }

    private void g() {
        byte[] arrby = this.a.b();
        if (!org.apache.commons.compress.archivers.d.m.b(arrby)) {
            throw new n();
        }
        this.c = org.apache.commons.compress.archivers.d.e.a(arrby);
        if (org.apache.commons.compress.archivers.d.d.f != this.c.j()) {
            throw new n();
        }
        if (this.a.skip(1024 * this.c.k()) == -1L) {
            throw new EOFException();
        }
        this.h = this.c.k();
    }

    private void h() {
        byte[] arrby = this.a.b();
        if (!org.apache.commons.compress.archivers.d.m.b(arrby)) {
            throw new n();
        }
        this.c = org.apache.commons.compress.archivers.d.e.a(arrby);
        if (org.apache.commons.compress.archivers.d.d.c != this.c.j()) {
            throw new n();
        }
        if (this.a.skip(1024 * this.c.k()) == -1L) {
            throw new EOFException();
        }
        this.h = this.c.k();
    }

    public e e() {
        return this.f();
    }

    public e f() {
        e e2 = null;
        String string = null;
        if (!this.o.isEmpty()) {
            return (e)this.o.remove();
        }
        while (e2 == null) {
            if (this.e) {
                return null;
            }
            while (this.h < this.c.k()) {
                if (this.c.d(this.h++) || this.a.skip(1024L) != -1L) continue;
                throw new EOFException();
            }
            this.h = 0;
            this.l = this.a.c();
            byte[] arrby = this.a.b();
            if (!org.apache.commons.compress.archivers.d.m.b(arrby)) {
                throw new n();
            }
            this.c = org.apache.commons.compress.archivers.d.e.a(arrby);
            while (org.apache.commons.compress.archivers.d.d.d == this.c.j()) {
                if (this.a.skip(1024 * (this.c.k() - this.c.l())) == -1L) {
                    throw new EOFException();
                }
                this.l = this.a.c();
                arrby = this.a.b();
                if (!org.apache.commons.compress.archivers.d.m.b(arrby)) {
                    throw new n();
                }
                this.c = org.apache.commons.compress.archivers.d.e.a(arrby);
            }
            if (org.apache.commons.compress.archivers.d.d.e == this.c.j()) {
                this.e = true;
                return null;
            }
            e2 = this.c;
            if (e2.isDirectory()) {
                this.a(this.c);
                this.g = 0L;
                this.f = 0L;
                this.h = this.c.k();
            } else {
                this.g = 0L;
                this.f = this.c.v();
                this.h = 0;
            }
            this.k = this.i.length;
            string = this.b(e2);
            if (string != null) continue;
            e2 = null;
        }
        e2.b(string);
        e2.a(((org.apache.commons.compress.archivers.d.a)this.m.get(e2.c())).d());
        e2.a(this.l);
        return e2;
    }

    private void a(e e2) {
        long l2 = e2.v();
        boolean bl2 = true;
        while (bl2 || org.apache.commons.compress.archivers.d.d.d == e2.j()) {
            int n2;
            if (!bl2) {
                this.a.b();
            }
            if (!this.m.containsKey(e2.c()) && org.apache.commons.compress.archivers.d.d.b == e2.j()) {
                this.n.put(e2.c(), e2);
            }
            if (this.j.length < (n2 = 1024 * e2.k())) {
                this.j = new byte[n2];
            }
            if (this.a.read(this.j, 0, n2) != n2) {
                throw new EOFException();
            }
            int n3 = 0;
            for (int i2 = 0; i2 < n2 - 8 && (long)i2 < l2 - 8L; i2 += n3) {
                int n4 = org.apache.commons.compress.archivers.d.m.b(this.j, i2);
                n3 = org.apache.commons.compress.archivers.d.m.c(this.j, i2 + 4);
                byte by2 = this.j[i2 + 6];
                String string = org.apache.commons.compress.archivers.d.m.a(this.p, this.j, i2 + 8, this.j[i2 + 7]);
                if (".".equals(string) || "..".equals(string)) continue;
                org.apache.commons.compress.archivers.d.a a2 = new org.apache.commons.compress.archivers.d.a(n4, e2.c(), by2, string);
                this.m.put(n4, a2);
                for (Map.Entry entry : this.n.entrySet()) {
                    String string2 = this.b((e)entry.getValue());
                    if (string2 == null) continue;
                    ((e)entry.getValue()).b(string2);
                    ((e)entry.getValue()).a(((org.apache.commons.compress.archivers.d.a)this.m.get(entry.getKey())).d());
                    this.o.add(entry.getValue());
                }
                for (Map.Entry entry : this.o) {
                    this.n.remove(((e)((Object)entry)).c());
                }
            }
            byte[] arrby = this.a.a();
            if (!org.apache.commons.compress.archivers.d.m.b(arrby)) {
                throw new n();
            }
            e2 = org.apache.commons.compress.archivers.d.e.a(arrby);
            bl2 = false;
            l2 -= 1024L;
        }
    }

    private String b(e e2) {
        Stack<String> stack = new Stack<String>();
        org.apache.commons.compress.archivers.d.a a2 = null;
        int n2 = e2.c();
        while (true) {
            if (!this.m.containsKey(n2)) {
                stack.clear();
                break;
            }
            a2 = (org.apache.commons.compress.archivers.d.a)this.m.get(n2);
            stack.push(a2.d());
            if (a2.a() == a2.b()) break;
            n2 = a2.b();
        }
        if (stack.isEmpty()) {
            this.n.put(e2.c(), e2);
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder((String)stack.pop());
        while (!stack.isEmpty()) {
            stringBuilder.append('/');
            stringBuilder.append((String)stack.pop());
        }
        return stringBuilder.toString();
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = 0;
        if (this.e || this.d || this.g >= this.f) {
            return -1;
        }
        if (this.c == null) {
            throw new IllegalStateException("No current dump entry");
        }
        if ((long)n3 + this.g > this.f) {
            n3 = (int)(this.f - this.g);
        }
        while (n3 > 0) {
            int n5;
            int n6 = n5 = n3 > this.i.length - this.k ? this.i.length - this.k : n3;
            if (this.k + n5 <= this.i.length) {
                System.arraycopy(this.i, this.k, arrby, n2, n5);
                n4 += n5;
                this.k += n5;
                n3 -= n5;
                n2 += n5;
            }
            if (n3 <= 0) continue;
            if (this.h >= 512) {
                byte[] arrby2 = this.a.b();
                if (!org.apache.commons.compress.archivers.d.m.b(arrby2)) {
                    throw new n();
                }
                this.c = org.apache.commons.compress.archivers.d.e.a(arrby2);
                this.h = 0;
            }
            if (!this.c.d(this.h++)) {
                int n7 = this.a.read(this.i, 0, this.i.length);
                if (n7 != this.i.length) {
                    throw new EOFException();
                }
            } else {
                Arrays.fill(this.i, (byte)0);
            }
            this.k = 0;
        }
        this.g += (long)n4;
        return n4;
    }

    public void close() {
        if (!this.d) {
            this.d = true;
            this.a.close();
        }
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < 32) {
            return false;
        }
        if (n2 >= 1024) {
            return org.apache.commons.compress.archivers.d.m.b(arrby);
        }
        return 60012 == org.apache.commons.compress.archivers.d.m.b(arrby, 24);
    }

    public /* synthetic */ a a() {
        return this.f();
    }
}

