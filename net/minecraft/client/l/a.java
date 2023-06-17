/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import io.netty.util.b.ab;
import io.netty.util.b.ad;
import javax.crypto.SecretKey;
import net.minecraft.client.l.q;

class a
implements ad {
    final /* synthetic */ q a;
    private final /* synthetic */ SecretKey b;

    a(q q2, SecretKey secretKey) {
        this.a = q2;
        this.b = secretKey;
    }

    @Override
    public void a(ab ab2) {
        q.a(this.a).a(this.b);
    }
}

