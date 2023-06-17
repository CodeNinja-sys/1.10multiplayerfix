/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.c.g;
import com.c.a.c.h;
import java.awt.image.BufferedImage;

class cfs
implements civ {
    final /* synthetic */ civ a;
    final /* synthetic */ bbu b;
    final /* synthetic */ h c;
    final /* synthetic */ bpx d;
    final /* synthetic */ g e;
    final /* synthetic */ jm f;

    cfs(jm jm2, civ civ2, bbu bbu2, h h2, bpx bpx2, g g2) {
        this.f = jm2;
        this.a = civ2;
        this.b = bbu2;
        this.c = h2;
        this.d = bpx2;
        this.e = g2;
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        if (this.a != null) {
            bufferedImage = this.a.a(bufferedImage);
        }
        return bufferedImage;
    }

    @Override
    public void a() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a(this.c, this.d, this.e);
        }
    }
}

