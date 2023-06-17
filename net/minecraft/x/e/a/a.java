/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.e.a;

import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.u.m;
import net.minecraft.x.e.b;
import net.minecraft.x.p;

public class a
implements p {
    private byte[] a = new byte[0];
    private byte[] b = new byte[0];

    public a() {
    }

    public a(SecretKey secretKey, PublicKey publicKey, byte[] arrby) {
        this.a = m.a(publicKey, secretKey.getEncoded());
        this.b = m.a(publicKey, arrby);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.a();
        this.b = a2.a();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.a(this.b);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public SecretKey a(PrivateKey privateKey) {
        return m.a(privateKey, this.a);
    }

    public byte[] b(PrivateKey privateKey) {
        return privateKey == null ? this.b : m.b(privateKey, this.b);
    }
}

