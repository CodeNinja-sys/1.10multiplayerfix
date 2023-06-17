/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.util.b.z;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class c
extends z {
    c() {
    }

    protected MessageDigest a() {
        try {
            return MessageDigest.getInstance("SHA1");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}

