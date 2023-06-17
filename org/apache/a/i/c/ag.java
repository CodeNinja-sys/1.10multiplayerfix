/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.c;
import org.apache.a.i.c.az;
import org.apache.a.j.g;
import org.apache.a.j.i;
import org.apache.a.o.d;

public class ag
implements i {
    private final i a;
    private final az b;
    private final String c;

    public ag(i i2, az az2, String string) {
        this.a = i2;
        this.b = az2;
        this.c = string != null ? string : org.apache.a.c.f.name();
    }

    public ag(i i2, az az2) {
        this(i2, az2, null);
    }

    public void a(byte[] arrby, int n2, int n3) {
        this.a.a(arrby, n2, n3);
        if (this.b.a()) {
            this.b.a(arrby, n2, n3);
        }
    }

    public void a(int n2) {
        this.a.a(n2);
        if (this.b.a()) {
            this.b.a(n2);
        }
    }

    public void a(byte[] arrby) {
        this.a.a(arrby);
        if (this.b.a()) {
            this.b.a(arrby);
        }
    }

    public void a() {
        this.a.a();
    }

    public void a(d d2) {
        this.a.a(d2);
        if (this.b.a()) {
            String string = new String(d2.c(), 0, d2.e());
            String string2 = string + "\r\n";
            this.b.a(string2.getBytes(this.c));
        }
    }

    public void a(String string) {
        this.a.a(string);
        if (this.b.a()) {
            String string2 = string + "\r\n";
            this.b.a(string2.getBytes(this.c));
        }
    }

    public g b() {
        return this.a.b();
    }
}

