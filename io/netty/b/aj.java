/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.ak;
import io.netty.b.at;
import io.netty.b.au;
import io.netty.b.ay;

final class aj
extends ah {
    aj(au au2, int n2, int n3, int n4, int n5) {
        super(au2, n2, n3, n4, n5);
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    protected ak a(int n2, int n3, int n4, int n5) {
        return new ak(this, new byte[n5], n2, n3, n4, n5);
    }

    @Override
    protected ak g(int n2) {
        return new ak(this, new byte[n2], n2);
    }

    @Override
    protected void a(ak ak2) {
    }

    @Override
    protected at h(int n2) {
        return ay.Q(n2);
    }

    protected void a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        if (n4 == 0) {
            return;
        }
        System.arraycopy(arrby, n2, arrby2, n3, n4);
    }
}

