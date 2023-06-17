/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.f;
import org.apache.a.n;
import org.apache.a.o.a;

public class j
implements n {
    protected n c;

    public j(n n2) {
        this.c = (n)a.a(n2, "Wrapped entity");
    }

    public boolean a() {
        return this.c.a();
    }

    public boolean b() {
        return this.c.b();
    }

    public long c() {
        return this.c.c();
    }

    public f d() {
        return this.c.d();
    }

    public f e() {
        return this.c.e();
    }

    public InputStream f() {
        return this.c.f();
    }

    public void a(OutputStream outputStream) {
        this.c.a(outputStream);
    }

    public boolean g() {
        return this.c.g();
    }

    public void h() {
        this.c.h();
    }
}

