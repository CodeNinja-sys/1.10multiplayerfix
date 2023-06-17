/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import java.io.BufferedInputStream;
import java.nio.ByteBuffer;
import net.minecraft.client.e.b;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.client.g.ay;
import net.minecraft.client.m.a;
import net.minecraft.client.m.c;
import net.minecraft.u.bp;
import org.apache.commons.b.t;
import org.apache.commons.c.am;
import org.lwjgl.BufferUtils;

public class j {
    private final a a;
    private final String b;
    private final int c;
    private int d;

    private j(a a2, int n2, String string) {
        this.a = a2;
        this.c = n2;
        this.b = string;
    }

    public void a(c c2) {
        ++this.d;
        ay.b(c2.g(), this.c);
    }

    public void b(c c2) {
        --this.d;
        if (this.d <= 0) {
            ay.a(this.c);
            net.minecraft.client.m.a.a(this.a).remove(this.b);
        }
    }

    public String a() {
        return this.b;
    }

    public static j a(s s2, a a2, String string) {
        j j2 = (j)net.minecraft.client.m.a.a(a2).get(string);
        if (j2 == null) {
            bp bp2 = new bp("shaders/program/" + string + net.minecraft.client.m.a.b(a2));
            an an2 = s2.a(bp2);
            try {
                byte[] arrby = t.c(new BufferedInputStream(an2.b()));
                ByteBuffer byteBuffer = BufferUtils.a(arrby.length);
                byteBuffer.put(arrby);
                byteBuffer.position(0);
                int n2 = ay.b(net.minecraft.client.m.a.c(a2));
                ay.a(n2, byteBuffer);
                ay.c(n2);
                if (ay.c(n2, ay.n) == 0) {
                    String string2 = am.a(ay.d(n2, 32768));
                    b b2 = new b("Couldn't compile " + a2.a() + " program: " + string2);
                    b2.b(bp2.b());
                    throw b2;
                }
                j2 = new j(a2, n2, string);
                net.minecraft.client.m.a.a(a2).put(string, j2);
            }
            finally {
                t.a(an2);
            }
        }
        return j2;
    }
}

