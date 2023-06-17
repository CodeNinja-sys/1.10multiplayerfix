/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import java.util.Queue;
import org.apache.a.b.c;
import org.apache.a.b.d;
import org.apache.a.b.i;
import org.apache.a.b.o;
import org.apache.a.o.a;

public class j {
    private c a = org.apache.a.b.c.a;
    private d b;
    private i c;
    private o d;
    private Queue e;

    public void a() {
        this.a = org.apache.a.b.c.a;
        this.e = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public c b() {
        return this.a;
    }

    public void a(c c2) {
        this.a = c2 != null ? c2 : org.apache.a.b.c.a;
    }

    public d c() {
        return this.b;
    }

    public o d() {
        return this.d;
    }

    public void a(d d2, o o2) {
        org.apache.a.o.a.a(d2, "Auth scheme");
        org.apache.a.o.a.a(o2, "Credentials");
        this.b = d2;
        this.d = o2;
        this.e = null;
    }

    public Queue e() {
        return this.e;
    }

    public boolean f() {
        return this.e != null && !this.e.isEmpty();
    }

    public void a(Queue queue) {
        org.apache.a.o.a.a(queue, "Queue of auth options");
        this.e = queue;
        this.b = null;
        this.d = null;
    }

    public void g() {
        this.a();
    }

    public boolean h() {
        return this.b != null;
    }

    public void a(d d2) {
        if (d2 == null) {
            this.a();
            return;
        }
        this.b = d2;
    }

    public void a(o o2) {
        this.d = o2;
    }

    public i i() {
        return this.c;
    }

    public void a(i i2) {
        this.c = i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state:").append((Object)this.a).append(";");
        if (this.b != null) {
            stringBuilder.append("auth scheme:").append(this.b.a()).append(";");
        }
        if (this.d != null) {
            stringBuilder.append("credentials present");
        }
        return stringBuilder.toString();
    }
}

