/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.aj;
import com.a.a.g.be;
import com.a.a.g.bf;
import com.a.a.g.h;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class bc
extends h
implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    bc(String string, String string2) {
        this.a = bc.a(string);
        this.b = this.a.getDigestLength();
        this.d = (String)cl.a(string2);
        this.c = this.d();
    }

    bc(String string, int n2, String string2) {
        this.d = (String)cl.a(string2);
        this.a = bc.a(string);
        int n3 = this.a.getDigestLength();
        cl.a(n2 >= 4 && n2 <= n3, "bytes (%s) must be >= 4 and < %s", new Object[]{n2, n3});
        this.b = n2;
        this.c = this.d();
    }

    private boolean d() {
        try {
            this.a.clone();
            return true;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return false;
        }
    }

    @Override
    public int b() {
        return this.b * 8;
    }

    public String toString() {
        return this.d;
    }

    private static MessageDigest a(String string) {
        try {
            return MessageDigest.getInstance(string);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new AssertionError((Object)noSuchAlgorithmException);
        }
    }

    @Override
    public aj a() {
        if (this.c) {
            try {
                return new be((MessageDigest)this.a.clone(), this.b, null);
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                // empty catch block
            }
        }
        return new be(bc.a(this.a.getAlgorithm()), this.b, null);
    }

    Object c() {
        return new bf(this.a.getAlgorithm(), this.b, this.d, null);
    }
}

