/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import java.io.IOException;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class j
implements p {
    private String a;
    private a b;

    public j() {
    }

    public j(String string, a a2) {
        this.a = string;
        this.b = a2;
        if (a2.q() > 32767) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    @Override
    public void a(a a2) {
        this.a = a2.e(20);
        int n2 = a2.r();
        if (n2 < 0 || n2 > 32767) {
            throw new IOException("Payload may not be larger than 32767 bytes");
        }
        this.b = new a(a2.y(n2));
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.b(this.b);
    }

    public void a(b b2) {
        b2.a(this);
        if (this.b != null) {
            this.b.ad();
        }
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }
}

