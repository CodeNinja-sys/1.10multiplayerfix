/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.aj;
import io.netty.c.a.k.e;
import io.netty.c.a.k.f;
import io.netty.c.a.k.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class c
extends aj {
    private static final int b = 17;
    private final e[] c = new e[17];
    private final e d;

    private static int e(String string) {
        int n2 = 0;
        for (int i2 = string.length() - 1; i2 >= 0; --i2) {
            char c2 = string.charAt(i2);
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char)(c2 + 32);
            }
            n2 = 31 * n2 + c2;
        }
        if (n2 > 0) {
            return n2;
        }
        if (n2 == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return -n2;
    }

    private static boolean a(String string, String string2) {
        int n2 = string.length();
        if (n2 != string2.length()) {
            return false;
        }
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            char c2;
            char c3 = string.charAt(i2);
            if (c3 == (c2 = string2.charAt(i2))) continue;
            if (c3 >= 'A' && c3 <= 'Z') {
                c3 = (char)(c3 + 32);
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char)(c2 + 32);
            }
            if (c3 == c2) continue;
            return false;
        }
        return true;
    }

    private static int a(int n2) {
        return n2 % 17;
    }

    c() {
        this.d.e = this.d.f = (this.d = new e(-1, null, null));
    }

    @Override
    public aj a(String string, Object object) {
        String string2 = string.toLowerCase();
        p.a(string2);
        String string3 = io.netty.c.a.k.c.a(object);
        p.b(string3);
        int n2 = io.netty.c.a.k.c.e(string2);
        int n3 = io.netty.c.a.k.c.a(n2);
        this.a(n2, n3, string2, string3);
        return this;
    }

    private void a(int n2, int n3, String string, String string2) {
        e e2;
        e e3 = this.c[n3];
        this.c[n3] = e2 = new e(n2, string, string2);
        e2.d = e3;
        e2.a(this.d);
    }

    @Override
    public aj a(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        String string2 = string.toLowerCase();
        int n2 = io.netty.c.a.k.c.e(string2);
        int n3 = io.netty.c.a.k.c.a(n2);
        this.a(n2, n3, string2);
        return this;
    }

    private void a(int n2, int n3, String string) {
        e e2;
        e e3 = this.c[n3];
        if (e3 == null) {
            return;
        }
        while (e3.a == n2 && io.netty.c.a.k.c.a(string, e3.b)) {
            e3.a();
            e2 = e3.d;
            if (e2 != null) {
                this.c[n3] = e2;
                e3 = e2;
                continue;
            }
            this.c[n3] = null;
            return;
        }
        while ((e2 = e3.d) != null) {
            if (e2.a == n2 && io.netty.c.a.k.c.a(string, e2.b)) {
                e3.d = e2.d;
                e2.a();
                continue;
            }
            e3 = e2;
        }
    }

    @Override
    public aj b(String string, Object object) {
        String string2 = string.toLowerCase();
        p.a(string2);
        String string3 = io.netty.c.a.k.c.a(object);
        p.b(string3);
        int n2 = io.netty.c.a.k.c.e(string2);
        int n3 = io.netty.c.a.k.c.a(n2);
        this.a(n2, n3, string2);
        this.a(n2, n3, string2, string3);
        return this;
    }

    @Override
    public aj a(String string, Iterable iterable) {
        if (iterable == null) {
            throw new NullPointerException("values");
        }
        String string2 = string.toLowerCase();
        p.a(string2);
        int n2 = io.netty.c.a.k.c.e(string2);
        int n3 = io.netty.c.a.k.c.a(n2);
        this.a(n2, n3, string2);
        for (Object t2 : iterable) {
            if (t2 == null) break;
            String string3 = io.netty.c.a.k.c.a(t2);
            p.b(string3);
            this.a(n2, n3, string2, string3);
        }
        return this;
    }

    @Override
    public aj a() {
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = null;
        }
        this.d.e = this.d.f = this.d;
        return this;
    }

    @Override
    public String b(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        int n2 = io.netty.c.a.k.c.e(string);
        int n3 = io.netty.c.a.k.c.a(n2);
        e e2 = this.c[n3];
        while (e2 != null) {
            if (e2.a == n2 && io.netty.c.a.k.c.a(string, e2.b)) {
                return e2.c;
            }
            e2 = e2.d;
        }
        return null;
    }

    @Override
    public List c(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        LinkedList<String> linkedList = new LinkedList<String>();
        int n2 = io.netty.c.a.k.c.e(string);
        int n3 = io.netty.c.a.k.c.a(n2);
        e e2 = this.c[n3];
        while (e2 != null) {
            if (e2.a == n2 && io.netty.c.a.k.c.a(string, e2.b)) {
                linkedList.addFirst(e2.c);
            }
            e2 = e2.d;
        }
        return linkedList;
    }

    @Override
    public List b() {
        LinkedList<e> linkedList = new LinkedList<e>();
        e e2 = this.d.f;
        while (e2 != this.d) {
            linkedList.add(e2);
            e2 = e2.f;
        }
        return linkedList;
    }

    @Override
    public Iterator iterator() {
        return new f(this, null);
    }

    @Override
    public boolean d(String string) {
        return this.b(string) != null;
    }

    @Override
    public Set c() {
        TreeSet<String> treeSet = new TreeSet<String>();
        e e2 = this.d.f;
        while (e2 != this.d) {
            treeSet.add(e2.b);
            e2 = e2.f;
        }
        return treeSet;
    }

    @Override
    public aj b(String string, Iterable iterable) {
        p.b(string);
        int n2 = io.netty.c.a.k.c.e(string);
        int n3 = io.netty.c.a.k.c.a(n2);
        for (Object t2 : iterable) {
            String string2 = io.netty.c.a.k.c.a(t2);
            p.b(string2);
            this.a(n2, n3, string, string2);
        }
        return this;
    }

    @Override
    public boolean d() {
        return this.d == this.d.f;
    }

    private static String a(Object object) {
        if (object == null) {
            return null;
        }
        return object.toString();
    }

    static /* synthetic */ e a(c c2) {
        return c2.d;
    }
}

