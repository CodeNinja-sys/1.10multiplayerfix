/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.a;
import com.a.a.g.ae;
import com.a.a.g.bd;
import java.security.MessageDigest;
import java.util.Arrays;

final class be
extends a {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    private be(MessageDigest messageDigest, int n2) {
        this.a = messageDigest;
        this.b = n2;
    }

    @Override
    protected void a(byte by2) {
        this.b();
        this.a.update(by2);
    }

    @Override
    protected void a(byte[] arrby) {
        this.b();
        this.a.update(arrby);
    }

    @Override
    protected void a(byte[] arrby, int n2, int n3) {
        this.b();
        this.a.update(arrby, n2, n3);
    }

    private void b() {
        cl.b(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override
    public ae a() {
        this.b();
        this.c = true;
        return this.b == this.a.getDigestLength() ? ae.b(this.a.digest()) : ae.b(Arrays.copyOf(this.a.digest(), this.b));
    }

    /* synthetic */ be(MessageDigest messageDigest, int n2, bd bd2) {
        this(messageDigest, n2);
    }
}

