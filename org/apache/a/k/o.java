/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.io.Serializable;
import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.k.k;
import org.apache.a.o.a;

public class o
implements Serializable,
Cloneable,
am {
    private static final long a = 2810581718468737193L;
    private final ak b;
    private final String c;
    private final String d;

    public o(String string, String string2, ak ak2) {
        this.c = (String)org.apache.a.o.a.a((Object)string, "Method");
        this.d = (String)org.apache.a.o.a.a((Object)string2, "URI");
        this.b = (ak)org.apache.a.o.a.a(ak2, "Version");
    }

    public String a() {
        return this.c;
    }

    public ak b() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public String toString() {
        return k.b.a(null, this).toString();
    }

    public Object clone() {
        return super.clone();
    }
}

