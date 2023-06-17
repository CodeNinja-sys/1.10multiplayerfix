/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.c.a.c.g;
import com.c.a.c.h;
import java.awt.image.BufferedImage;
import net.minecraft.client.f.e;
import net.minecraft.client.f.f;
import net.minecraft.client.g.ag;
import net.minecraft.u.bp;

class aa
implements ag {
    final /* synthetic */ e a;
    private final /* synthetic */ ag b;
    private final /* synthetic */ f c;
    private final /* synthetic */ h d;
    private final /* synthetic */ bp e;
    private final /* synthetic */ g f;

    aa(e e2, ag ag2, f f2, h h2, bp bp2, g g2) {
        this.a = e2;
        this.b = ag2;
        this.c = f2;
        this.d = h2;
        this.e = bp2;
        this.f = g2;
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        if (this.b != null) {
            bufferedImage = this.b.a(bufferedImage);
        }
        return bufferedImage;
    }

    @Override
    public void a() {
        if (this.b != null) {
            this.b.a();
        }
        if (this.c != null) {
            this.c.a(this.d, this.e, this.f);
        }
    }
}

