/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.a.g.a;
import org.apache.a.g.o;

public class c
implements Serializable,
Cloneable,
a,
o {
    private static final long k = -3869795591041535538L;
    private final String l;
    private Map m;
    private String n;
    private String o;
    private String p;
    private Date q;
    private String r;
    private boolean s;
    private int t;

    public c(String string, String string2) {
        org.apache.a.o.a.a((Object)string, "Name");
        this.l = string;
        this.m = new HashMap();
        this.n = string2;
    }

    public String a() {
        return this.l;
    }

    public String b() {
        return this.n;
    }

    public void c(String string) {
        this.n = string;
    }

    public String c() {
        return this.o;
    }

    public void d(String string) {
        this.o = string;
    }

    public String d() {
        return null;
    }

    public Date e() {
        return this.q;
    }

    public void b(Date date) {
        this.q = date;
    }

    public boolean f() {
        return null != this.q;
    }

    public String g() {
        return this.p;
    }

    public void e(String string) {
        this.p = string != null ? string.toLowerCase(Locale.ENGLISH) : null;
    }

    public String h() {
        return this.r;
    }

    public void f(String string) {
        this.r = string;
    }

    public boolean j() {
        return this.s;
    }

    public void a(boolean bl2) {
        this.s = bl2;
    }

    public int[] i() {
        return null;
    }

    public int k() {
        return this.t;
    }

    public void a(int n2) {
        this.t = n2;
    }

    public boolean a(Date date) {
        org.apache.a.o.a.a(date, "Date");
        return this.q != null && this.q.getTime() <= date.getTime();
    }

    public void a(String string, String string2) {
        this.m.put(string, string2);
    }

    public String b_(String string) {
        return (String)this.m.get(string);
    }

    public boolean b(String string) {
        return this.m.get(string) != null;
    }

    public Object clone() {
        c c2 = (c)super.clone();
        c2.m = new HashMap(this.m);
        return c2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[version: ");
        stringBuilder.append(Integer.toString(this.t));
        stringBuilder.append("]");
        stringBuilder.append("[name: ");
        stringBuilder.append(this.l);
        stringBuilder.append("]");
        stringBuilder.append("[value: ");
        stringBuilder.append(this.n);
        stringBuilder.append("]");
        stringBuilder.append("[domain: ");
        stringBuilder.append(this.p);
        stringBuilder.append("]");
        stringBuilder.append("[path: ");
        stringBuilder.append(this.r);
        stringBuilder.append("]");
        stringBuilder.append("[expiry: ");
        stringBuilder.append(this.q);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

