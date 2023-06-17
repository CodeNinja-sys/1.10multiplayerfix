/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.b.g;
import io.netty.b.w;
import io.netty.c.a.c.c;
import io.netty.c.a.c.q;
import io.netty.c.a.c.u;
import io.netty.c.a.c.v;
import io.netty.c.a.d;
import io.netty.channel.bd;
import java.util.Arrays;
import java.util.List;

public class t
extends d {
    private static final byte[] a = new byte[]{115, 78, 97, 80, 112, 89};
    private static final int c = 65540;
    private final q d = new q();
    private final boolean e;
    private boolean f;
    private boolean h;

    public t() {
        this(false);
    }

    public t(boolean bl2) {
        this.e = bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(bd var1_1, g var2_2, List var3_3) {
        if (this.h) {
            var2_2.A(var2_2.r());
            return;
        }
        try {
            var4_4 = var2_2.p();
            var5_6 = var2_2.r();
            if (var5_6 < 4) {
                return;
            }
            var6_7 = var2_2.n(var4_4);
            var7_8 = t.a((byte)var6_7);
            var8_9 = w.a(var2_2.r(var4_4 + 1));
            switch (u.a[var7_8.ordinal()]) {
                case 1: {
                    if (var8_9 != t.a.length) {
                        throw new c("Unexpected length of stream identifier: " + var8_9);
                    }
                    if (var5_6 < 4 + t.a.length) {
                        return;
                    }
                    var9_10 = new byte[var8_9];
                    var2_2.A(4).b(var9_10);
                    if (!Arrays.equals(var9_10, t.a)) {
                        throw new c("Unexpected stream identifier contents. Mismatched snappy protocol version?");
                    }
                    this.f = true;
                    return;
                }
                case 2: {
                    if (!this.f) {
                        throw new c("Received RESERVED_SKIPPABLE tag before STREAM_IDENTIFIER");
                    }
                    if (var5_6 < 4 + var8_9) {
                        return;
                    }
                    var2_2.A(4 + var8_9);
                    return;
                }
                case 3: {
                    throw new c("Found reserved unskippable chunk type: 0x" + Integer.toHexString(var6_7));
                }
                case 4: {
                    if (!this.f) {
                        throw new c("Received UNCOMPRESSED_DATA tag before STREAM_IDENTIFIER");
                    }
                    if (var8_9 > 65540) {
                        throw new c("Received UNCOMPRESSED_DATA larger than 65540 bytes");
                    }
                    if (var5_6 < 4 + var8_9) {
                        return;
                    }
                    var2_2.A(4);
                    if (this.e) {
                        var10_11 = w.b(var2_2.K());
                        q.a(var10_11, var2_2, var2_2.p(), var8_9 - 4);
                    } else {
                        var2_2.A(4);
                    }
                    var3_3.add(var2_2.z(var8_9 - 4).ab());
                    return;
                }
                case 5: {
                    if (!this.f) {
                        throw new c("Received COMPRESSED_DATA tag before STREAM_IDENTIFIER");
                    }
                    if (var5_6 < 4 + var8_9) {
                        return;
                    }
                    var2_2.A(4);
                    var10_12 = w.b(var2_2.K());
                    var11_13 = var1_1.d().a(0);
                    if (!this.e) ** GOTO lbl76
                    var12_14 = var2_2.q();
                    try {
                        var2_2.h(var2_2.p() + var8_9 - 4);
                        this.d.a(var2_2, var11_13);
                    }
                    finally {
                        var2_2.h(var12_14);
                    }
                    q.a(var10_12, var11_13, 0, var11_13.q());
                    ** GOTO lbl77
lbl76:
                    // 1 sources

                    this.d.a(var2_2.z(var8_9 - 4), var11_13);
lbl77:
                    // 2 sources

                    var3_3.add(var11_13);
                    this.d.a();
                    return;
                }
            }
            return;
        }
        catch (Exception var4_5) {
            this.h = true;
            throw var4_5;
        }
    }

    private static v a(byte by2) {
        if (by2 == 0) {
            return v.b;
        }
        if (by2 == 1) {
            return v.c;
        }
        if (by2 == -1) {
            return v.a;
        }
        if ((by2 & 0x80) == 128) {
            return v.e;
        }
        return v.d;
    }
}

