/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.e.b;

import java.security.PublicKey;
import net.minecraft.u.m;
import net.minecraft.x.e.a;
import net.minecraft.x.p;

public class e
implements p {
    private String a;
    private PublicKey b;
    private byte[] c;

    public e() {
    }

    public e(String string, PublicKey publicKey, byte[] arrby) {
        this.a = string;
        this.b = publicKey;
        this.c = arrby;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e(20);
        this.b = m.a(a2.a());
        this.c = a2.a();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.a(this.b.getEncoded());
        a2.a(this.c);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public String a() {
        return this.a;
    }

    public PublicKey b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }
}

